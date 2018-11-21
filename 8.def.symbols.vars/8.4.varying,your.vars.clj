; (def debug-enabled false)

(defn debug [msg]
    (if debug-enabled
    (println msg)))
(defn some-troublesome-function-that-needs-logging
    (println "Hey " "Mostafa"))

(def ^:dynamic *debug-enabled* false)
(binding [*debug-enabled* true]
    (debug "Calling fn")
    (some-troublesome-function-that-needs-logging)
    (debug "Back from fn"))