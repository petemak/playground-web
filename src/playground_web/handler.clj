(ns playground-web.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults api-defaults]]
            [ring.middleware.keyword-params :refer [wrap-keyword-params]]
            [ring.middleware.json :refer [wrap-json-response]]))



(def id (atom 0))

(defn next-id
  "Get next id by increasing
  increasing the current number"
  []
  (swap! id inc ))


(def tasks (atom {}))


(defn get-tasks
  "Retunr the list of all known tasks"
  []
  (vals @tasks))


(defn add-task
  "Add task where n is the name
   and d the description"
  [n d]
  (let [id (next-id)]
    (swap! tasks assoc id {:id id
                           :name n
                           :description d})))

(defn remove-task
  "Remove task with specified id"
  [id]
  (swap! tasks dissoc id))


(defroutes app-routes
  (GET "/api/tasks" []
       {:body (get-tasks)})
  (POST "/api/tasks" {{n :name d :description} :params}
        {:body (add-task n d)})
  (DELETE "/api/tasks/:task-id" [task-id]
          {:body (remove-task (Integer/parseInt task-id))})
  (route/not-found "Not Found"))

(def app
  (-> app-routes
      (wrap-defaults api-defaults)
      wrap-json-response))
