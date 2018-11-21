(def books [
    {:title "Jaws" :copies-sold 2000000}
    {:title "Emma" :copies-sold 3000000}
    {:title "2011" :copies-sold 1000000}
    ])  

(defn sum-copies 
    ([books] (sum-copies books 0))
    ([books total]
    (if(empty? books)
    total
(sum-copies (rest books) 
    (+ total (:copies-sold (first books)))
))))


; (sum-copies books)

(defn advanced-sum-copies 
    ([books] (advanced-sum-copies  books 0))
    ([books total]
    (if(empty? books)
    total
(recur (rest books) 
    (+ total (:copies-sold (first books)))
))))

; (advanced-sum-copies books)


(defn more-advanced-sum-copies [books]
    (loop [books books total 0]
    (if(empty? books)
    total
(recur (rest books)
 (+ total (:copies-sold (first books)))
))))

; (more-advanced-sum-copies books)


(defn more-more-advanced-sum-copies [books]
(apply + (map :copies-sold books)))

 (more-more-advanced-sum-copies books)
