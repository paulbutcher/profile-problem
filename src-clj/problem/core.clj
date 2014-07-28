(ns problem.core
  (:require [problem.config :as config]
            [compojure.core :refer [defroutes GET]]
            [compojure.route :refer [resources not-found]]
            [compojure.handler :refer [site]]
            [ring.util.response :refer [redirect]]))

(defroutes app-routes
  (GET "/" [] (redirect "/index.html"))
  (resources "/")
  (not-found "Page not found"))

(defn init []
  (println "Starting in" (if config/production "production" "development") "mode"))

(def handler (site app-routes))
