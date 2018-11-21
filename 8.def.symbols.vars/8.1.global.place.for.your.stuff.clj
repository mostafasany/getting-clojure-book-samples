(def title "Emma")
(def PI 3.14)

(def new-book {:title "Getting Clojure" :author "Mostafa Khodeir"})
(defn book-description [book]
    (str (:title book) " Written by " (:author book)))


(book-description new-book)


;ANother way of writing Function
(def another-book-description 
    (fn [book] 
        (str (:title book) " Written by " (:author book))))

(another-book-description new-book)
