(defproject thor "1.0.0-SNAPSHOT"
  :description "FIXME: write"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [incanter "1.2.3"]]
  :dev-dependencies [[swank-clojure "1.2.1"]]
  ; sets the 'java.library.path' property to load ZeroMQ library
  :native-path "/usr/local/lib"
  :main thor.main)