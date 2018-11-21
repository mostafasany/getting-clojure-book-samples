
(def books
    [{:title "Deep six" :price 128.29}
       {:title "Deep seven" :price 11}
       {:title "Deep eight" :price 1119}
       {:title "Deep nine" :price 12}])


    
(defn format-top-titles [books]
    (apply
        str
        (interpose
            "//"
            (map :title (take 3 (reverse (sort-by :rating books)))))))

(format-top-titles books)

; OR

(defn fomate-top-titles [books]
    (->>
        books
        (sort-by :rating)
        reverse
        (take 3)
        (map :title)
        (interpose " // ")
        (apply str)))

    
(format-top-titles books)