(defproject clojure-proj "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins      [[lein-ring "0.12.3"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [hiccup "1.0.5"]
                 [org.clojure/java.jdbc "0.6.0"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [proto-repl "0.3.1"]
                 [com.h2database/h2 "1.4.193"]]
  :main ^:skip-aot clojure-proj.core
  :main clojure-proj.handler
  :ring {:handler clojure-proj.core/handler}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
