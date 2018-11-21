'(1 2 3)

'(1 2 3 4)
'(1 "two" 3 "four")
'(1 true false "five")
'(1 2 3 [3.1 3.2 3.2] ["four" "five"])

'(1 2 3 (3.1 3.2 3.2) ("four" "five"))  ;Only one quote needed to prevent execution 

(list 1 2 3 4)

(def poems '("LLiad" "Odyssey" "Now we are six"))
(count poems)
(first poems)
(last poems)
(nth poems 1)
(rest poems)