(defn print-greetings [prefered-customer]
    (if prefered-customer
    (println "Welcome back to the new world")
    (println "Hey")
    ))

 ;(print-greetings true)
; (print-greetings false)

(defn print-greetings-with-customer [customer]
   (def prefered-customer "Mostafa")
    (if (= prefered-customer customer)
    (println "Welcome back to the new world")
    (println "Hey")
    ))

;   (print-greetings-with-customer "Mostafa")

(defn shipping-charge [prefered-customer amount]
    (if prefered-customer
        0.0
    (* amount 0.1)
        ))

    ; (shipping-charge true 100)
    (shipping-charge false 100)