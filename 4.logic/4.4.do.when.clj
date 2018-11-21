(defn shipping-charge [prefered-customer amount]
    (
        if prefered-customer
    (do
    (println "Prefered customer,free shipping")
0.0)
(do 
    (println "Regular customer, charge them")
    (* amount 0.1))
        )
        )

    ; (shipping-charge true 10)
    ; (shipping-charge false 100)

(defn shipping-charge-2 [prefered-customer amount]
    (when prefered-customer
        (println "Prefered customer,free shipping")
        0.0
        )
    )
(shipping-charge-2 true 200)