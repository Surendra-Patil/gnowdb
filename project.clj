(defproject gnowdb "0.1.0-SNAPSHOT"
  :description "gnowdb is an implementation of gnowsys specification (
  https://www.gnu.org/software/gnowsys/). The application provides a
  framework for creating, reading, updating, and deleting nodes of a
  network. It provides functions to create nodeTypes, relationTypes, attributeTypes, metaTypes and their instances."
  :url "https://metastudio.org/gnowdb"
  :license {:name "GNU AFFERO GENERAL PUBLIC LICENSE Version 3"
            :url "https://www.gnu.org/licenses/agpl.txt"}
  :dependencies [
                 [org.clojure/clojure "1.9.0"]
                 [org.neo4j.driver/neo4j-java-driver "1.3.0"]
                 [compojure "1.3.4"]
                 [ring-server "0.3.1"]
                 [ring/ring-defaults "0.3.0"]
                 [ring/ring-json "0.4.0"]
                 [liberator "0.13"]
                 [com.cemerick/friend "0.2.3"] ;For Authentication
                 [cheshire "5.2.0"]
                 [async-watch "0.1.1"]
                 [digest "1.4.5"] ;;for hashing
                 [org.clojure/math.combinatorics "0.1.4"] ;;for nth permutation
                 [clj-fuzzy "0.4.0"] ;;for levenshtein distance
                 [com.novemberain/pantomime "2.9.0"];;to extract mime types
                 [progrock "0.1.2"] ;;For progress bars
                ] 

                 
  
  :main ^:skip-aot gnowdb.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :plugins [[lein-codox "0.10.3"] [cider/cider-nrepl "0.15.0-SNAPSHOT"] [lein-ring "0.8.12"]]
  :ring { :handler gnowdb.handler/app
          :init gnowdb.handler/init
          :destroy gnowdb.handler/destroy} )

