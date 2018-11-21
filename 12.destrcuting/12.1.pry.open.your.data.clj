(def artists [:monet :austen])
(let [painter (first artists) 
    novelist (second artists)]
   ( println "The painter is:" painter " and the novelist is:" novelist))


   (def more-artists [:monet :austen :ahmed :said])
; (let [[painter novelist composer poet] more-artists]
;     (println "The Painter is" painter)
;     (println "The novelist is" novelist)
;     (println "The composer is" composer)
;     (println "The poet is" poet)
;     )



;     (let [[painter novelist composer] more-artists]
;         (println "The Painter is" painter)
;         (println "The novelist is" novelist)
;         (println "The composer is" composer)
;         )


        (let [[_ _ composer] more-artists]
            (println "The composer is" composer)
            )