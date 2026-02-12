(defproject com.circleci/lein-protoc "0.7.0"
  :description "Leiningen plugin for compiling Protocol Buffers"
  :url "https://github.com/LiaisonTechnologies/lein-protoc"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :eval-in-leiningen true
  :dependencies [[org.clojure/clojure "1.12.4"]]
  :profiles {:dev {:dependencies [[com.google.protobuf/protobuf-java "3.25.8"]
                                  [lambdaisland/kaocha "1.91.1392"]
                                  [lambdaisland/kaocha-junit-xml "1.17.101"]]}}
  :plugins [[lein-codox "0.10.8"]]
  :aliases {"test"    ["run" "-m" "kaocha.runner"]
            "test-ci" ["test"
                       "--plugin" "kaocha.plugin/profiling"
                       "--plugin" "kaocha.plugin/junit-xml"
                       "--junit-xml-file" "target/test-results/results.xml"]}
  :repositories [["releases" {:url "https://clojars.org/repo"
                              :username :env/clojars_username
                              :password :env/clojars_token
                              :sign-releases false}]
                 ["snapshots" {:url "https://clojars.org/repo"
                               :username :env/clojars_username
                               :password :env/clojars_token
                               :sign-releases false}]]
  )
