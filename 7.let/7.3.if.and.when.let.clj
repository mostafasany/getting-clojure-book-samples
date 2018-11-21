
(def anynomous-book {:title "Getting Clojure"})

(def with-author-book {:title "Getting Clojureeeee" :author "Mostafa"})

(defn uppercase-author [book]
    (let [author (:author book)]
        (if author
            (.toUpperCase author))))

(uppercase-author with-author-book)

(uppercase-author anynomous-book)


(defn advanced-uppercase-author [book]
   (if-let [author (:author book)]
        (.toUpperCase author)
        "ANONYMOUS"))

(advanced-uppercase-author with-author-book)
(advanced-uppercase-author anynomous-book)


(defn advanced-uppercase-author-2 [book]
    (when-let [author (:author book)]
         (.toUpperCase author)))

         (advanced-uppercase-author-2 with-author-book)
          (advanced-uppercase-author-2 anynomous-book)
         