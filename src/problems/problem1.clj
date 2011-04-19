(ns problems.problem1)
(def results)
(def i)
(defn solution
	"Find the sum of all the multiples of 3 or 5 below n."
	[n]
	(binding [i 0
	          results 0]
	  (while (< i (+ n 1))
	    ( if (or (= (mod i 3) 0) (= (mod i 5) 0))
	      (set! results (+ results i)))
	    (set! i (inc i)))
	  (println "Total: " results)))
	  