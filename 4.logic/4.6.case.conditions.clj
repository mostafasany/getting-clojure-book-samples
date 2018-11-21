(defn customer-greetings [status]
    (case status
    :gold "Welcomeeeeeeeeeeeeeee Backkk my dearrr"
:regular "Welcome back"
"Welcome to our book"
    ))

(customer-greetings :gold)
(customer-greetings :regular)
(customer-greetings :un-known)