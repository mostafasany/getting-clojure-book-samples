(filter neg? '(1 -22 3 -99 2 4 5 -10))


(def books
 [{:title "Deep six" :price 128.29}
    {:title "Deep seven" :price 11}
    {:title "Deep eight" :price 1119}
    {:title "Deep nine" :price 12}])

(defn cheap? [book]
    (when (< (:price book) 15)
    book))

(filter cheap? books)
(some cheap? books)

(defn has-sale [book]
    (if (some cheap? books)
        (println "We habe cheap book for sale" )))

(has-sale books)