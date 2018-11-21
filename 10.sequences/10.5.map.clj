(def some-numbers [1 2 3 4])
(def doubled (map #(* 2 %) some-numbers))
(def get-titles
    (map (fn [book] (:title book)) books))

;  Actually, we can take a shortcut here. Remember that when it comes to looking themselves up in maps, keywords are functions.
;  That means that in the last example we don’t need the fn; we can just use :title as the function that we feed into map:

(def get-titles-2
    (map :title books))


(def get-title-counts
    (map (fn [book] (count (:title book))) books))


    (def get-title-counts-2
        (for [b books]
            (count (:title b))))
    
