(fn [n] (* 2 n))
(def double-it (fn [n] (* 2 n)))
(double-it 10)
; (println "Functions is " (double-it 10))


(def drcula {:title "Dracula" :author "Stoker" :price 1.99 :genre :horror})
(defn cheaper-f [max-price]
    (fn [book] 
        (when (<= (:price book) max-price)
        book)))
        
; Armed with fn, we can write functions that produce functions:
  
(def real-cheap? (cheaper-f 1.00))        
(def kind-of-cheap? (cheaper-f 1.99))        
(def marginally-cheap? (cheaper-f 6.00))    
        
(real-cheap? drcula)
(kind-of-cheap? drcula)
(marginally-cheap? drcula)