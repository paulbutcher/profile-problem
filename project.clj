(defproject problem "0.1"
  :source-paths ["src-clj"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.3.0"]
                 [compojure "1.1.8"]]
  :plugins [[lein-ring "0.8.11"]]
  :profiles {:production {:resource-paths ["target/production"]
                          :source-paths ["production/src-clj"]}
             :dev {:resource-paths ["target/dev"]
                   :source-paths ["dev/src-clj"]}
             :uberjar [:production {:aot :all}]}
  :ring {:init problem.core/init
         :handler problem.core/handler})
