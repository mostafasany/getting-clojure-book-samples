(def title-seq (seq ["Emma" "Oliver twist" "Robinhosn Cruose"]))
(first title-seq)
 (rest title-seq)
 (next title-seq)
(cons "Mostafa" title-seq)

(count title-seq)
; Aside from the thrill of understanding how count works, there is a very practical reason for diving into all of this sequence talk. 
; While functions like count and first can manage to keep their involvement with sequences quiet, the same is not true of functions like rest, next, and cons.
;  These three functions always (aside from the occasional nil) return sequences:

(defn my-count [col]
    (let [the-seq (seq col)]
        ( loop [n 0 s the-seq]
            (if (seq s)
                (recur (inc n) (rest s))
                n))))

(my-count [1 2 3 4 9 10])

