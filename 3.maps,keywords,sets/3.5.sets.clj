; #{ "Dickens" "Austen" "Dickens"}
; Error Duplicate Keys

#{:sci-fi :romance :mystery}

(def authors #{ "Dickens" "Austen" "Mostafa"} )

(contains? authors "Mostafa")

(contains? authors "Sany")

(authors "Mostafa")

(authors "Ahmed")

(def geners #{:sci-fi :romance :mystery})

(:sci-fi geners)

(geners :sci-fi )

(def more-authors (conj authors "Clarke"))
(disj more-authors "King")
(disj more-authors "Austen")