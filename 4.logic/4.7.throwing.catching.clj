; (/ 0 0)

; (try 
;     (/  0 0)
;     (catch ArithmeticException e (println "Math Problem"))
; (catch StackOverflowError e (print "Other exception"))
;     )

(defn publish-book [book]
    (
        if (not (:title book))
    (throw 
        (ex-info "Abook needs a title" {:book book})
        )
    (println "Book Published")
    ))
 (publish-book {:title "Getting clojure"})

 (publish-book {:published "Getting clojure"})