(let [title "Let talk today urgent"]
    (println "The title is " title)
  )



(defn print-the-title []
    (println "The title is " title)) ;Boom

 (print-the-title )


(let [title "Pride and Prejudice"
  title (str title " and Zombies")]
  (println title))