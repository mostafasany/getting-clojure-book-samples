(defn say-welcome [what]
    (println "Welcome to " what))
; (say-welcome "mostafa" )

(def say-welcome-2
    (fn [what] (println "Welcome to " what)))

; (say-welcome-2 "Mostafa is here")

(def book {:title "Emma" :copies 1000})

(def new-book (update book :copies inc))

(get new-book :copies)

(def by-author {:name "Mostafa" :book{:title "Emma" :copies 1000}})

(def new-by-author (update-in by-author [:book :copies] inc))

(get new-by-author :book)