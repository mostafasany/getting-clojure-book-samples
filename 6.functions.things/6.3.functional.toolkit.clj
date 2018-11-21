(def the-function +)
(def args [1 2 3 4])
(apply the-function args)

; The apply function is particularly useful for converting from one kind of value to another. Thus, if you have a vector like this:

(def v ["The number " 2 " Best Selling " "Book"])
(apply str v)
(apply list v)
(apply vector (apply list v))


(defn inc [n] (+ n 1))
(inc 1)

; (defn part-inc (partial + 1)) ;Not Working

(defn adventure? [book]
    (when (= (:gener book) :adventure)
    book))

(defn not-adventure? [book] (complement adventure?))

(defn cheap-horror? (every-pred cheap? horror?))
(def cheap-horror-possessions? (every-pred cheap? horror? (fn [book] (=title book))))