(ns kundel.core
  (:require
    [reagent.core :as r]))

(defn my-app []
  [:div
    [:h1 "Hello Reagent"]
    [:p "ClojureScript + React + Atoms + Hiccup"]])

(r/render
  [my-app]
  (js/document.getElementById "appdiv"))