(def un-sorted ["Emma" "ZOliver twist" "Robinhosn Cruose"])

(sort un-sorted)
(reverse un-sorted)
(partition 3 un-sorted)

(def sorted (sort un-sorted))

(interleave sorted un-sorted)
(interpose "&" un-sorted)

