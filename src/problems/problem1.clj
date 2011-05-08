(ns problems.problem1)
(defn solution
	"Find the sum of all the multiples of 3 or 5 below n."
	[n]
	(apply + 
	  (filter 
	    (fn [w] (or (= (mod w 3) 0) (= (mod w 5) 0))) (range n))))