(defproject reagent-template "0.0.1"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]
                 [reagent "0.8.0"]]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-figwheel "0.5.15"]]

  :cljsbuild
  {:builds
   {:dev {:source-paths ["src"]
          :figwheel true
          :compiler {:output-to "resources/public/js/main.js"
                     :output-dir "resources/public/js/out/"}}}})