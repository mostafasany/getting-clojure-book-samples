(defn compute-discount-amount [amount discount-percent min-charge]
    (if (> (* amount (- 1 discount-percent)) min-charge)
(* amount (-1 discount-percent))
min-charge))


(defn advanced-compute-discount-amount [amount discount-percent min-charge]
(let [
    discount (* amount discount-percent)
    discounted-amount (- amount discount)
    ]
(println "Discount " discount)
(println "Discounted amount " discounted-amount)
    (if (> discounted-amount min-charge)
    discounted-amount
min-charge)))


; Keep in mind that while all the expressions in the body of a let get evaluated,
;  only the last expression has anything to say about the value returned by the let.
