
(def book {:title "Oliver Twist" :author "Dickens" :published 1838})

(assoc book :page-count 362)
; (:page-count book) ;Return nill
(assoc book :title "War title")
(:title book) ;Return old value

(def new-book (assoc book :title "War title" :page-count 362))

 (:page-count new-book)
 (:title new-book)


(dissoc book :published)

(dissoc book :published :title)

(dissoc book :not-key1 :not-key2)