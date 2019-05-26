
(defproject playground-web "0.1.0-SNAPSHOT"
  :description "Play ground web for exploration and building ideas."
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.trace "0.7.10"]
                 [compojure "1.6.1"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-defaults "0.3.2"]
                 [com.hypirion/clj-xchart "0.2.0"]
                 [com.datomic/datomic-free "0.9.5697"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler playground-web.handler/app}
  :profiles {:dev {:dependencies [[clj-http "3.10.0"]
                                  [ring/ring-mock "0.3.2"]
                                  [javax.servlet/servlet-api "2.5"]]}})
