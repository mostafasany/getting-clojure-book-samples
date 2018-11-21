(take 10 (cycle [1 2 3]))

(def numbers (iterate inc 1))
(first numbers)
(take 5 numbers)