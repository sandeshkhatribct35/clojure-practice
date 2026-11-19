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
;; let inside defn
;; Create this function yourself:

;; Function name: calculate-final-fee

;; Parameters:
;; - monthly-fee
;; - months
;; - registration-fee
;; - discount-percent
;; Business rule:
;; - Discount applies only to tuition.
;; - Registration fee is mandatory and receives no discount.
;; Use let to calculate:
;; 1. Original tuition.
;; 2. Discount amount.
;; 3. Discounted tuition.
;; 4. Final payable amount.
(defn calculate-final-fee [monthly-fee months registration-fee discount-percent]
  (let [
        original-tution(* monthly-fee months)
        discount-amount(/ (* discount-percent original-tution) 100)
        discounted-tution(- original-tution discount-amount)
        final-payable(+ discounted-tution registration-fee)
  ]
    final-payable
    
   )
  
)
(calculate-final-fee 3000 8 500 10)

;; conditional statements in closure
;; Write a function named check-result that:
;; 1. Accepts marks as a parameter.
;; 2. Checks whether marks are greater than or equal to 40.
;; 3. Returns "Pass" if true.
;; 4. Returns "Fail" otherwise.

(defn check-result[marks]
(if (> marks 40)
 "Pass"
 "Fail") )
(check-result 20)
(check-result 50)
(check-result 90)
;; cond statement
;; Imagine your tuition management system needs three student statuses:
;; - Marks 80 or above → Excellent
;; - Marks 40–79 → Pass
;; - Marks below 40 → Fail

(defn check-result[marks]
  (cond
    (>= marks 80) "Excellent"
    (and (> marks 40)
         (< marks  80) ) "Pass"
   :else  "Fail"
  ))
(check-result 50)
(check-result 60)
(check-result 90)
(check-result 15)

