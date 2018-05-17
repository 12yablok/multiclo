(ns clart.server
    (:require 
        [immutant.web :as web]))

(def app
    (fn [req]
    {  :status 200
        :body 
            (:uri req)
    }))

(defn -main [& args]
    (web/run #'app { :port 8080})
)

(+ 1 2)
(-main)