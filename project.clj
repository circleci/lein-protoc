(defproject com.circleci/lein-protoc "0.6.0"
  :description "Leiningen plugin for compiling Protocol Buffers"
  :url "https://github.com/LiaisonTechnologies/lein-protoc"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :eval-in-leiningen true
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :profiles {:dev {:dependencies [[com.google.protobuf/protobuf-java "3.3.1"]
                                  [org.clojure/core.specs.alpha "0.3.218"]
                                  [lambdaisland/kaocha "0.0-601"]
                                  [lambdaisland/kaocha-junit-xml "0.0-70"]]}}
  :plugins [[lein-codox "0.10.3"]]
  :aliases {"test"    ["run" "-m" "kaocha.runner"]
            "test-ci" ["test"
                       "--plugin" "kaocha.plugin/profiling"
                       "--plugin" "kaocha.plugin/junit-xml"
                       "--junit-xml-file" "target/test-results/results.xml"]}
  :repositories [["releases" {:url           "https://clojars.org/repo"
                              :username      :env/clojars_username
                              :password      :env/clojars_token
                              :sign-releases false}]
                 ["snapshots" {:url           "https://clojars.org/repo"
                               :username      :env/clojars_username
                               :password      :env/clojars_token
                               :sign-releases false}]])

