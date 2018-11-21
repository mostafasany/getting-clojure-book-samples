#(when (= (:gener %1) :adventure) %1)

#(* 2 %1)
#(+ %1 %2 %3)

#(* % 2)

; The choice between fn and function literals centers on complexity and number of arguments.
;  Lean toward function literals for really short, simple functions. If, for example, you need a function to double a number, 
;  then by all means write #(* % 2). Conversely, lean toward fn if you have a longer function, 
;  and especially one that takes more than a very few arguments. Examples aside, no one really writes function literals that have a %11.