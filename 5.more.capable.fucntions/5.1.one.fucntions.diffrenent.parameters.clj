; (defn greet 
;     ([to-whom] (println "Welcome" to-whom))
;     ([message to-whom] (println message  to-whom)))

;  (greet "mostafa")

;  (greet  "Hello" "mostafa") 


    (defn greet_2 
        ([to-whom] (greet "Welcome" to-whom))
        ([message to-whom] (println message  to-whom)))
    
     (greet_2 "mostafa")
    
     (greet_2  "Hello" "mostafa") 
    
    