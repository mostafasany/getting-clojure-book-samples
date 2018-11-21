(defn hello-world [] 
    (println "Hello World"))

(hello-world)

(defn hello-world [] 
    (str "Hello " "World"))

(hello-world)



(defn say-welcome [whats-to-say] 
    (println "Welcome to" whats-to-say))
(say-welcome  "Hello World from Vs Code")

(defn average [a b]
    (/ (+ a b) 2.0))
(average 5 2)

(defn chatty-average [a b]
    (println "Calling Chatty average")
    (println "First Argumnt" a)
    (println "Second Argumnt" b)
    (/ (+ a b) 2.0))
(chatty-average 5 19)