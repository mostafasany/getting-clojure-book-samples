
(def repeated-text (repeat "Jack"))
(first repeated-text)
(nth repeated-text 10)
(nth repeated-text 1211210)


; That brings us to the mind-blowing part: the sequence returned by repeat does not end.
;  No matter how many items you ask for, they are always there. Fortunately, the sequences returned by repeat are also lazy: 
;  they wait until they are asked before they generate anything. 
;  They can get away with this because sequences are defined in terms of what functions like rest and next return.

(take 20 repeated-text)