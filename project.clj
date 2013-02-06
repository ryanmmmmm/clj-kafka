(defproject clj-kafka/clj-kafka "0.0.5-0.7-RWM"
  :min-lein-version "2.0.0"
  :repositories {"local" ~(str (.toURI (java.io.File. "maven_repository")))}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [kafka/kafka "2.9.1"
                  :exclusions
                  [javax.mail/mail
                   javax.jms/jms
                   com.sun.jdmk/jmxtools
                   com.sun.jmx/jmxri
                   jline/jline
                   net.sf.jopt-simple/jopt-simple
                   junit/junit]]
                 [org.scala-lang/scala-library "2.9.2"]
                 [zookeeper-clj "0.9.2"]]
  :description "Clojure wrapper for Kafka's Java API")
