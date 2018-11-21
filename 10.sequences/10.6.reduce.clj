(def some-numbers [1 2 3 4])

(defn add [a b]
    (+ a b))

(reduce add 0 some-numbers)

; OR

(reduce + 0 some-numbers)

; OR'

(reduce +  some-numbers)
