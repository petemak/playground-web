(ns playground-web.db
  (:require [clojure.java.io :as io]
            [clojure.pprint :refer [pprint]]
            [datomic.api :as d]))

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
  [uri]
  (if (d/create-database uri)
    ;; connect peer to database
    (d/connect uri)))


;; Now we can transact the schema
(defn transact-schema
  [conn]
  (d/transact conn schema))


