(ns pricing)

; Just feed ns the name of your new namespace, no quoting required. Conveniently
; , ns not only creates the new namespace, but also makes it the current namespace. Thus this:

(def discount-rate 0.15)


(defn discount-price [book]
    (* (- 1.0 discount-rate) (:price book) ))
;;Now 

(discount-price {:price 129})

 (ns user)

(discount-price {:price 129})
