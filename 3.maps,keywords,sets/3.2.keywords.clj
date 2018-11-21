
(def book (hash-map "title" "Oliver Twist" "author" "Dickens" "published" 1838))

(def book {:title "Oliver Twist" :author "Dickens" :published 1838})

(book :title)
(println (book :author))


(:published book)
