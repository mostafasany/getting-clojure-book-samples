
(def books
    [{:title "Deep six" :price 128.29}
       {:title "Deep seven" :price 11}
       {:title "Deep eight" :price 1119}
       {:title "Deep nine" :price 12}])

(sort-by :price books)
(reverse     (sort-by :price books))
(take 2 (reverse     (sort-by :price books)))
(map :title (reverse     (sort-by :price books)))
(interpose "&" (map :title (reverse     (sort-by :price books))))
