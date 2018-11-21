(defn print-any-args [& args]
    (println "My arguments are:" args))

(print-any-args true "Mostafa" "Sany" "Is" "In Berlin Since" 2017)

(defn first-args [& args]
    (first args))

(first-args "Mostafa" "Sany" "Is" "In Berlin Since" 2017)

(defn new-first-argument [x & args] x)

(new-first-argument "Mostafa" "Sany" "Is" "In Berlin Since" 2017)

; Functions that take advantage of the magic of the & are called varargs or variadic functions.
;  Note the key syntactical difference between variadic functions and the multi-arity functions that we looked at earlier: 
;  multi-arity functions devote a separate body to each argument set while variadic functions (the ones with the &) have a single function body.