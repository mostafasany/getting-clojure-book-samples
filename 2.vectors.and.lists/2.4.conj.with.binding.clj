(def novels ["LLiad" "Odyssey" "Now we are six"])
(def more-novels (conj novels "new Novel"))
(println "Old Count" (count novels) "New Count" (count more-novels))
