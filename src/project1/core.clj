(ns project1.core)

(defn project-handler [request]
  {:body "Just a sample response"})

(defn on-init []
  (println "Initializing sample webapp! "))

(defn on-destroy []
  (println "Destroying sample webapp"))
