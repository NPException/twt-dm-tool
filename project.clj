(defproject twt-dm-tool "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.2"]
                 [org.clojure/data.json "2.4.0"]
                 [org.clojure/core.async "1.2.603"]
                 [com.github.ben-manes.caffeine/caffeine "3.0.3"]
                 [http-kit "2.5.3"]
                 [metosin/reitit "0.5.11"]
                 [ring/ring-core "1.8.2"]
                 [ring/ring-json "0.5.0"]
                 [cljstache "2.0.6"]
                 [org.clojure/clojurescript "1.10.773"]
                 [com.bhauman/figwheel-main "0.2.12"]
                 [com.bhauman/rebel-readline-cljs "0.1.4"]
                 [re-frame "1.1.2"]
                 [cljs-http "0.1.46"]]
  :repl-options {:init-ns user}
  :main ^:skip-aot com.twt-dm-tools.core
  :source-paths ["src"]
  :target-path "target/%s"
  :aliases {"fig" ["trampoline" "run" "-m" "figwheel.main"]
            "fig-dev" ["fig" "-b" "dev" "-r"]
            "fig-build" ["fig" "-bo" "prod"]}
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[criterium "0.4.5"]]
                   :resource-paths ["target"]
                   :clean-targets ^{:protect false} ["target"]}})
