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

(def monthly-fee 3000)
(def number-of-months 8)
(def registration-fee 500)

(def total-fee (+ (*  monthly-fee number-of-months) registration-fee))
(println "Total fee :"  total-fee)

