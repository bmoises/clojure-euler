(ns problems.problem2)

; Taken from programming clojure introduction example
(def fibs (lazy-cat [1 2] (map + fibs (rest fibs))))

(defn solution
  "Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with           
   1 and 2, the first 10 terms will be:
     -- 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
   By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the 
   sum of the even-valued terms."
  [nthless]
  (apply + (filter (fn [n] (even? n)) (filter (fn [n] (< n nthless)) (take 40 fibs))))
  )