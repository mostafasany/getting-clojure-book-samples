
(defn print-book [book]
    (println "Book Printed"))

    (defn ship-book [book]   (println "Book Printed"))

(defn publish-book [book]
    (when-not (contains? book :title)
    (throw (ex-info "Books must contains :title")))
    (print-book book)
    (ship-book book))
 (publish-book {:title "Getting Clojure" :published "1838"})
; (publish-book { :published "1838"})
    (defn publish-book-1 [book]

       {:pre [(:title book)(:published book)]
       :post [(boolean? %)]}
        (print-book book)
        (ship-book book))
    
     (publish-book-1 {:title "Getting Clojure" :published "1838"})