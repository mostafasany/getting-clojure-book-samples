
(def books
    [
    {:title "Deep six" :price 128.29}
       {:title "Deep seven" :price 11}
       {:title "Deep eight" :price 1119}
       {:title "Deep nine" :price 12}
       ])


(defn total-price [books]
    (loop [books books total 0]
        (if (empty? book)
        total
    (recur (next books)
     (+ total (:price (first books)))))))


; OR

(defn total-price [book]
    (apply + (map :price books)))

 (total-price books)


(def maze-runner {:title "the Maze Runner" :author "Dashner"})
(:title maze-runner)

(:author (seq maze-runner))
​ 	​; But this give you a nil - a seq is not a map!​
(:author (rest maze-runner))
