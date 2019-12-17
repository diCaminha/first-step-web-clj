(ns project1.core
  (:require [project1.handlers :as handlers]))

(defn project-handler [request]
  {:body "Just a sample response"})

(defn on-init []
  (println "Initializing sample webapp! "))

(defn on-destroy []
  (println "Destroying sample webapp"))

(defn handler-1 [request]
  {:body "this is handler 1"})

(defn handler-2 [request]
  {:body "this is handler 2"})

(defn handlers-route [request]
  (condp = (:uri request)
    "/handler-um" (handler-1 request)
    "/handler-dois" (handler-2 request)
    "/handler-tres" (handlers/handler-3 request)))