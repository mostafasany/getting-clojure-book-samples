(defn mk-discount-price-f [user-name user-discounts min-charge]
(let [
    
    discount-percent (user-discounts user-name)
    ]
(println "Discount " discount-percent)))

(mk-discount-price-f  "mostafa" )
