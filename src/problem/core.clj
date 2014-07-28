(ns problem.core
  (:require [problem.config :as config]
            [compojure.core :refer [defroutes]]
            [compojure.route :refer [not-found]]
            [compojure.handler :refer [site]]))

(defroutes app-routes
  (not-found "Page not found"))

(defn init []
  (println "Starting in" (if config/production "production" "development") "mode"))

(def handler (site app-routes))
