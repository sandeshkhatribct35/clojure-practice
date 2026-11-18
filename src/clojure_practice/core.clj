(ns clojure-practice.core)
;; =========================
;;Day 1 Closure Basics
;;=========================
(println "My first Clojure program!")
(println (+ 100 200))

(println (* 25 4))

(println (- 500 150))

(println (/ 100 5))

;;===================================
;; Day 2: Variable Based Calculations
;;===================================
;; Monthly fee = 3000
;; 
;; 
;; 
;;  Number of months = 8
;; 
;; 
;; 
;; Registration fee = 500
;; 
;; 
;; 
;; Calculate the total fee using the variables.
;; 
;; 
;; Print the result.
;; 

;; (def monthly-fee 3000)
;; (def number-of-months 8)
;; (def registration-fee 500)
;; (def Discount-percent 10)

;; (def total-fee (+ (*  monthly-fee number-of-months) registration-fee))
;; (println "Total fee :"  total-fee)

;;Functions in clojure ;; Nested functions
(defn calculate-fee [monthly-fee number-of-months registration-fee]
  (+ (*  monthly-fee number-of-months) registration-fee))
;;Now suppose a student receives a 10% discount on the total tuition fee.
(defn calculate-discount [Discount-percent  total-fee]
  (/ (* Discount-percent  total-fee) 100))
(defn final-fee [monthly-fee number-of-months registration-fee Discount-percent]
   ( - (calculate-fee monthly-fee number-of-months registration-fee)
    (calculate-discount Discount-percent (calculate-fee monthly-fee number-of-months registration-fee))))
(final-fee 3000 8 500 10)
;; USing local bindings
;; Given:
;; - Monthly fee = 3000
;; - Months = 8
;; - Registration fee = 500
;; - Discount = 10%
;; Create a function called final-fee that uses let.
(let [ monthly-fee 3000
      months 8
      registration-fee 500
      Discount-percent 10
      total-fee(* monthly-fee months)
      Discount (/ (* Discount-percent total-fee) 100)
      final-fee(- (+ total-fee registration-fee) Discount) ]
 final-fee) 