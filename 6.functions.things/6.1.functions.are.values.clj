(def drcula {:title "Dracula" :author "Stoker" :price 1.99 :genre :horror})
(defn cheap? [book]
    (when (< (:price book) 9.99)
    book))

    (defn pricy? [book]
        (when (> (:price book) 9.99)
        book))

        
(cheap? drcula)
(pricy? drcula)

(defn horror? [book]
    (when (= (:genre book) :horror)
    book))

    (defn adventure? [book]
        (when (= (:genre book) :adventure)
        book))

(horror? drcula)
(adventure? drcula)


(defn cheap-horror? [book]
    (when (and (cheap? book)(horror? book))
    book))

    (defn pricy-horror? [book]
        (when (and (pricy? book)(horror? book))
        book))

(cheap-horror? drcula)
(pricy-horror? drcula)

(def reasonably-priced? cheap?)
(reasonably-priced? drcula)

(defn both? [first-predicate-f second-predicate-f book]
    (when (and (first-predicate-f book) (second-predicate-f book))
book))

(both? cheap? horror? drcula)
(both? cheap? adventure? drcula)