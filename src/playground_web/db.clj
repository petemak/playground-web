(ns playground-web.db
  (:require [datomic.api :as d]
            [clojure.java.io :as io]))

;; Load schemam and data from files
(def schema (read-string (slurp (io/resource "db/schema.edn"))))
(def data (read-string  (slurp (io/resource "db/data.edn"))))

;; Next, create the URI that allows to create and connect to a database.
;;The URI for a memory storage has 3 parts:
;;
;; - "datomic", identifying it as a Datomic URI
;; - "mem", the mem storage protocol instead of a persistent store
;; - "hello", the name of the database
(def db-uri "datomic:mem://movies")


;; To interact with a datomic database
;; we need a connection to the peer. Connections are
;; created using the database URI
;;
;; conn  --> peer ---> Query endinge
;;               |
;;                ---> Transactor
;; 
(defn connect
  "Creates an in memory databse and connect to
   the peer library to the database. Returns a
   connection if successful"
  [uri]
  (if (d/create-database uri)
    (d/connect uri)))


;; Now we can transact the schema
(defn transact-schema
  "Write schema to db"
  [conn]
  (d/transact conn schema))


(defn transact-data
  "Write test data to dab"
  [conn]
  (d/transact conn data))


(defn init-db
  "Connects to the db transacts schema and data
  and returns the current databse value"
  []
  (let [conn (connect db-uri)]
    (transact-schema conn)
    (transact-data conn)))



(def all-movies
  '[:find ?e ?title
    :where
    [?e :movie/title ?title]])

;; (d/q all-movies (d/db conn)


(def movies-of-year
  '[:find ?title
    :where
    [?e :movie/year 1985]
    [?e :movie/title ?title]])

;;(d/q movies-of-year (d/db conn))


;; Parameters
(def movies-of-actor
  '[:find ?title
    :in $ ?name
    [?p :person/name ?name]
    [?m :movie/cast ?p]
    [?m :movie/title ?title]])

;; (d/q movies-of-actor (d/db conn) "Arnold Schwazenegger")

(def who-directed-actor
  '[:find ?director-name
    :in $ ?actor-name
    :where
    [?p :person/name ?actor-name]
    [?m :movie/cast ?p]
    [?m :movie/director ?d]
    [?d :person/name ?director-name]])

;; (d/q who-directed-actor (d/db conn) "Arnold Schwazenegger")


;; Relations
(def earnings
  ["Die Hard" 14030000]
  ["Alien" 104931801]
  ["Commando" 54791000])

(def earnings-of-director
  [:find ?title ?earnings
   :in $ ?director
   [?p :person/name ?director]
   [?m :movie/direcor ?p]
   [?m :movie/title ?title]])




(defn run-query
  [query conn]
  (d/q query (d/db conn)))


 
