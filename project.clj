(defproject project1 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring "1.8.0"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler project1.core/handlers-route
         :init project1.core/on-init.clj
         :destroy project1.core/on-destroy.clj}
  :repl-options {:init-ns project1.core})
