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

(defn check-pass-result [marks]
  (if (>= marks 40)
    "Pass"
    "Fail"))
(check-pass-result 20)
(check-pass-result 50)
(check-pass-result 90)
;; cond statement
;; Imagine your tuition management system needs three student statuses:
;; - Marks 80 or above → Excellent
;; - Marks 40–79 → Pass
;; - Marks below 40 → Fail

(defn check-result [marks]
  (cond
    (>= marks 80) "Excellent"
    (>= marks 40) "Pass"
    :else "Fail"))
(check-result 50)
(check-result 60)
(check-result 90)
(check-result 15)

;;when in clojure
;; Create a function:

;; notify-fee-due

;; Requirements:
;; - Accept fee-due as a parameter.
;; - If fee due is greater than 0, print "Payment is pending".
;; - Also print "Please clear your dues.".
;; - If fee due is 0, print nothing.


(defn notify-fee-due [fee-due]
  (when (> fee-due 0)
    (println "Payment is pending")
    (println "Please clear your dues"))
  (when (= fee-due 0)
    (println "Nothing to pay")))

(notify-fee-due 100000)
(notify-fee-due -50)

;;do in clojure
;; Create a function named process-payment:
;; - Accept amount as a parameter.
;; - If amount is greater than 0:
;;   - Print "Payment received".
;;   - Print "Updating student account".
;;   - Return "Payment successful".
;; - Otherwise, return "Invalid payment amount".

(defn process-payment[amount]
  (if  (> amount 0)
    (do 
      (println "Payment received")
      (println "Updating student account")
      "Payment successful")
    "Invalid payment amount"))

(process-payment 3000)
;;case in clojure 
;; Use case to return:
;; - "admin" → "Full Access"
;; - "teacher" → "Teaching Access"
;; - "student" → "Student Access"
;; - Anything else → "Invalid Role"
(defn student-role[role]
  (case role
    "admin" "Full Access"
    "teacher" "Teaching Access"
    "student" "Student Access"
    "Invalid role"
  ))
(student-role "admin")
(student-role "principal")

;; list and vectors in clojure
;; Create a vector named student-names containing Ram, Shyam, Hari and Sita.

;; Then:
;; 1. Display the first student.
;; 2. Display the third student.
;; 3. Count the students.
;; 4. Add "Gita" using conj.
;; 5. Display the original vector again.
(def students [ "Ram" "Shyam" "Hari" "Sita"])
(first students)
(get students 2)
(count students)
(conj students "Gita")

;; Exercise for lists
;; Create a list named student-rolls containing 101, 102, 103 and 104.
;; Then:
;; 1. Display the first roll number.
;; 2. Display the third roll number using nth.
;; 3. Count the roll numbers.
;; 4. Add 105 using conj.
;; 5. Display the original list again.
(def student-rolls '(101 102 103 104))
(first student-rolls)
(nth student-rolls 2)
(count student-rolls)
(conj student-rolls 105)
student-rolls
;;Maps in clojure
;; Create a map called student with:
;; - Name: "Sandesh"
;; - Age: 20
;; - Course: "BCT"
;; - Monthly fee: 3000
;; Then write expressions to:
;; 1. Display the student's name.
;; 2. Display the monthly fee.
;; 3. Change the monthly fee to 3500 using assoc.
;; 4. Add a new key :college with value "IOE".
;; 5. Display the original map again.
(def student
  {
   :name "Sandesh"
   :age 20
   :course "BCT"
   :monthly-fee 3000
   })
(:name student)
(:monthly-fee student)
(assoc student :monthly-fee 3500)
(assoc student :college "IOE")
student
;;Update in clojure
;; Create updated-student using update to increase the fee by 1000.

;; Then display:
;; 1. Original fee.
;; 2. Updated fee.
(def student {
   :fee 3000
              })
(get student :fee)
(def updated-student
  (update student :fee + 1000))

(get updated-student :fee)


;;dissoc in clojure
;; Using the same student map:
;; 1. Remove :fee using dissoc.
;; 2. Store the result in updated-student.
;; 3. Display both the original and updated maps
(def student
  {:name "Sandesh"
   :age 20
   :course "BCT"
   :monthly-fee 3000})
(def updated-student 
  (dissoc student :monthly-fee))
student
updated-student
;;nested maps
;; Create a nested map named student containing:
;; - Name: Ram
;; - Age: 20
;; - Payment details:
;;   - Monthly fee: 3000
;;   - Status: Pending
;; Then:
;; 1. Display the student's age using get-in.
;; 2. Display the monthly fee using get-in.
;; 3. Change the monthly fee to 3500 using assoc-in.
;; 4. Display the original and updated maps.
(def student
  {:name "Ram"
   :age 20
   :payment-details {:monthly-fee 3000
                     :status "Pending"}})
(get-in student [:age])
(get-in student [:payment-details :monthly-fee])
student
(def updated-student
  (assoc-in student [:payment-details :monthly-fee] 3500))
updated-student
;; sets in clojure

;; Create a set named registered-students containing:
;; #{101 102 103 104}


;; Then write expressions to:
;; 1. Add student ID 105.
;; 2. Remove student ID 102.
;; 3. Check whether student ID 103 exists.
;; 4. Check whether student ID 110 exists.
;; 5. Count the number of students in the original set.

(def registered-students #{101 102 103 104})
(conj registered-students 105)
(disj registered-students 102)
(contains? registered-students 103)
(contains? registered-students 110)
(count registered-students)

;;collection operations in clojure
;; Your exercise
;; You have the following student marks:
;; (def marks [20 35 40 50 60]) 
;; Task: Use map and inc to increase every student's marks by 1.

;; Then use map again to multiply every student's marks by 2.

(def marks [20 35 40 50 60])
(map inc marks)
(map #(* % 2) marks)

;;filter in clojure
;; Imagine these are monthly tuition fees:
;; (def fees [1500 2000 2500 3000 3500 4000 4500])


;; Write expressions to:
;; 1. Select fees greater than or equal to 3000 using filter and fn.
;; 2. Select fees strictly less than 3000 using filter and short anonymous function syntax (#()).

(def fees [1500 2000 2500 3000 3500 4000 4500])
(filter (fn [x]
          (>= x 3000))
fees)
(filter #(< % 3000) fees)
;;reduce in clojure
;; You are managing tuition payments:
;; (def payments [3000 2500 4000 3500 2000])


;; Write expressions to:
;; 1. Calculate the total payments using reduce and +.
;; 2. Calculate the total payments using reduce, fn, and an initial value of 0.
;; 3. Calculate the highest payment using reduce and max.

(def payments [3000 2500 4000 3500 2000])
(reduce + payments)
(reduce (fn [total payments]
          (+ total payments))
 0  [3000 2500 4000 3500 2000])
(reduce max payments)
;; Use this student data:
;; (def students
;;   [{:name "Ram" :fee 3000 :status "Paid"}
;;    {:name "Shyam" :fee 2500 :status "Pending"}
;;    {:name "Hari" :fee 4000 :status "Paid"}
;;    {:name "Sita" :fee 3500 :status "Pending"}])


;; Write these four expressions:
;; 1. Use filter to find all students with "Pending" status.
;; 2. Use map to extract the names of all students.
;; 3. Use reduce to calculate the total fees.
;; 4. Use filter to find students whose fee is greater than 3000.
(def students
  [{:name "Ram" :fee 3000 :status "Paid"}
   {:name "Shyam" :fee 2500 :status "Pending"}
   {:name "Hari" :fee 4000 :status "Paid"}
   {:name "Sita" :fee 3500 :status "Pending"}])

(filter #(= (:status %) "Pending") students)

(map :name students)

(reduce (fn [total student]
          (+ total (:fee student)))
  0
  students)

(filter #(> (:fee %) 3000) students)


