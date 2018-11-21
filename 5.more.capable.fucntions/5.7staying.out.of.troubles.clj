(defn print-any-args[& args]
    (println "My Arguments are: " args))

; (print-any-args 1 2 3 4 5)

(defn print-any-args-2 [&args]
    (println "My Arguments are: " args))

(print-any-args-2 1 2 3 4 5) ;Not compiler 
