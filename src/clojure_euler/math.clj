(ns clojure-euler.math)
(defn fac
  "Returns the factorial of n, which must be a positive integer"
  [n]
  (if (= n 1)
    1
    (* n (fac (- n 1)))))
    

; Taken from programming clojure introduction example
(def fibs (lazy-cat [1 2] (map + fibs (rest fibs))))