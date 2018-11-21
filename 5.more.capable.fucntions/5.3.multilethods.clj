; (defn normalize-book [book]
;     (if (vector? book) 
;         {:title (first book) :author (second book)}
;         (if (contains? book :title)
;             book
;         {:title (:book book) :author (:by book)}  )  ))

    ; or

(defn dispatach-book-format [book]
(cond
    (vector? book) :vector-book
    (contains? book :title) :standard-map
    (contains? book :book) :alternative-map
    ))

(dispatach-book-format {:title "Getting Clojure"})

(dispatach-book-format {:book "Getting Clojure"})

(dispatach-book-format ["Getting Clojure" 1929])


(defmulti normalize-book dispatach-book-format)

(defmethod normalize-book :vector-book [book]
    {:title (first book) :author (second book)})

(defmethod normalize-book :standard-map [book]
    book
    )

(defmethod normalize-book :alternative-map [book]
    {:title (:book book) :author (:by book)}
    )

 (normalize-book  {:title "Getting Clojure" :author "Mostafa"})
 (normalize-book  ["Getting Clojure" "Mostafa"])
 (normalize-book   {:book "Getting Clojure" :by "Mostafa"})

