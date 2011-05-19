(ns problems.problem3)

(defn divisors
  "Returns divisors for a given number"
  [num, divisor, list]
  (println (str num " -- " divisor))
  (if
    (= num divisor) 
    (conj list num)
    (if 
      (zero? (mod num divisor))
      (conj (divisors (/ num divisor) 2 list) divisor)
      (divisors num (+ divisor 1) list))))

(defn solution
	"The prime factors of 13195 are 5, 7, 13 and 29.
	 What is the largest prime factor of the number 600851475143 ?"
	[n]
	(sort (divisors n 2 []))
	)