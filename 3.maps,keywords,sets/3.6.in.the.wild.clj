(def db {:dbtype "MySql" :dbname "books" :user "russ" :password "hahaha"})

(def book {:title "Oliver twist" :author "Dickens" :published 1838})
(book :title)
(:title book)

(assoc book :is-new false)
(assoc book "title" "pride and justice")

;Another feature—and it really is a feature—of maps that sometimes trips up the new Clojure programmer is 
;that the language is happy to treat maps like ordinary sequences of values, such as lists or vectors. 
; We’ll talk more about this in Chapter 10, ​Sequences​, but for now remember that functions like first, rest, 
; and count see maps as collections of two-element vectors:
(def book {:title "Oliver twist" :author "Dickens" :published 1838})
; (first book) ​; Might return [:published 1838].​
;(rest book)  ​; Maybe ([:title "Hard Times] [:author "Dickens"]).​
;(count book) ​; Will definitely return 3.​

; Finally, keep in mind that in expressions like (:author book) or (:sci-fi genres), 
; the keywords :author and :sci-fi aren’t just pretending to be functions. They are functions—functions that look themselves up in a map or a set.
;  It is very common, if a bit confusing to beginners, to see a keyword like :title in a context where a function is clearly called for. 
;  In those situations you can bet that there is either a map or a set involved.