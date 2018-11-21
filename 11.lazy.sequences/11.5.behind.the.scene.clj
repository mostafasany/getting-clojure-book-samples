(lazy-seq [1 2 3])
(defn chatty-vector[]
(println "Here we go")
    [1 2 3])

(def not-lazy (chatty-vector))

(def lazy (lazy-seq (chatty-vector)))

(first lazy)



(defn not-lazy-repeat [x]
    (cons x(lazy-seq (not-lazy-repeat x))))

; (not-lazy-repeat 10)   /Hang eror

(defn lazy-repeat [f x]
    (cons x(lazy-seq (lazy-repeat f (f x)))))


(lazy-repeat (first 10)) 