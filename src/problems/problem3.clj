(ns problems.problem3)

(defn divisors
  "Returns divisors for a given number
  Arguments:
    num - Number you want to find factors for
    num_sqrt - Square root of num
    divisor - starting divisor
    list - holds results"
  [num, num_sqrt, divisor, list]
  ; (println (str num " -- " divisor))
  (if
    (> divisor num_sqrt) ; This is our stop condition
    (conj list num)
    (if 
      (zero? (mod num divisor)) ; If it divides the number add it to the list
      (recur (/ num divisor) (Math/sqrt (/ num divisor)) 2 (conj list divisor))
      (recur num num_sqrt (+ divisor 1) list))))

(defn solution
	"The prime factors of 13195 are 5, 7, 13 and 29.
	 What is the largest prime factor of the number 600851475143 ?"
	[n]
	(sort (divisors n (Math/sqrt n) 2 [])))