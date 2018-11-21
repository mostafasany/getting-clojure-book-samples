(defn shipping-charge [prefered-customer amount]
(if prefered-customer 0.0
    (if (< amount 50) 5.0
        (if (< amount 100) 10.0
            (if (< amount 200) 20.0
    )))))

; (shipping-charge true 10)
;  (shipping-charge false 99)

 (defn shipping-charge [prefered-customer amount]
(cond
    prefered-customer 0.0
    (< amount 50) 5.0
        (< amount 100) 10.0
        :else (* amount 0.2)
    ))

    (shipping-charge true 10)
    (shipping-charge false 11)  
         (shipping-charge false 222)