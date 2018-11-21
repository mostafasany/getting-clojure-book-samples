(println (take 20 (take 1000000000 (iterate inc 1))))

(def numbers (take 20 (take 1000000000 (iterate inc 1))))
(def even (map #(* 2 %)(iterate inc 1)))
(take 10 even)


(take 10 (interleave even numbers))