; (def test-books 
;     [{:author "Mostafa",:title "Wheel "}
;     {:author "Mostafa",:title "Wheel "}
;     {:author "Mostafa",:title "Wheel "}
;     {:author "Mostafa",:title "Wheel "}
;     {:author "Mostafa",:title "Wheel "}])

(def numbers [1 2 3])
(def trialogy (map #(str "The wheel of time,Book " %) numbers))
(first trialogy)
(nth trialogy 1)
(nth trialogy 2)
; (nth trialogy 3)


(def more-numbers (iterate inc 1))
(def more-trialogy (map #(str "The wheel of time,Book " %) more-numbers ))
(first more-trialogy)
(nth more-trialogy 1)
(nth more-trialogy 2)
(nth more-trialogy 3)
(nth more-trialogy 100)