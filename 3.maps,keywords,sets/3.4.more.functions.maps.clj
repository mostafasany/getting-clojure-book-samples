
(def book {:title "Oliver Twist" :author "Dickens" :published 1838})

(keys book)

(def sorted-book (sorted-map "title" "Oliver Twist" "author" "Dickens" "published" 1838))

(keys sorted-book)


(vals book)
(vals sorted-book)