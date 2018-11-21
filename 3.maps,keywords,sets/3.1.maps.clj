{"title" "Oliver Twist" "author" "Dickens" "published" 1382}
(hash-map "title" "Oliver Twist" "author" "Dickens" "published" 1382)

(def book (hash-map "title" "Oliver Twist" "author" "Dickens" "published" 1382))

(get book "published")
(get book "title")
(book "author")
(book "not existing property")