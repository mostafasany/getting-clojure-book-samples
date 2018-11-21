[1 2 3 4]
[1 "two" 3 "four"]
[1 true false "five"]
[1 2 3 [3.1 3.2 3.2] ["four" "five"]]
; You can, in fact, embed any Clojure value in a vector.

(vector true 1 2 false "five")
(vector)
(count (vector 1 2 3 4 6))
(def novels ["Emma" "commma" "war and peace"])
(count novels)
(first novels)
(last novels)
(rest novels)

(rest  (rest novels))
(rest (rest (rest novels)))
(nth novels 1)
(novels 0)

;Keep in mind none of these operations change the original vector in any way.
;While first and nth both return a value from the vector, that value stays firmly in place in the original vector.
;Similarly, rest returns a new (shorter) vector without changing the original. 
;This is our first glimpse of something very fundamental to Clojure: with a few exceptions, Clojure is built on a mountain of immutability. 
;Generally, once you create a Clojure data structure such as a vector, there is no way to modify it. 
;The closest you can come is to use a function like rest to make a new data structure, one that is a only a little different from the original.

(conj novels "Carrie")
(count novels)
(cons "caire" novels) ;Put ar first