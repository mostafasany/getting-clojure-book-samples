(def title-seq (seq ["Emma" "Oliver twist" "Robinhosn Cruose"]))
(println title-seq)

; And now for the big reveal: Clojure opts for the wrapper method. Clojure calls its generic collection wrappers sequences. 
; Under the hood there are as many flavors of sequences as there are collection types, 
; but to the outside world all sequences provide a very uniform interface: no matter if it’s a vector or a map or a list or a set behind a sequence,
;  one sequence looks exactly like another.

(seq '("Emma" "Oliver twist" "Robinhosn Cruose"))
(seq {:title "Emma",:author "Oliver twist", :published "3231"})

(seq [])

