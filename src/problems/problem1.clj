(ns problems.problem1)
(defn solution
	"Find the sum of all the multiples of 3 or 5 below n."
	[n]
	(let [results 0]
    (loop [i 0]
      (when (< i (+ n 1)) 
      
        ( if (or (= (mod i 3) 0) (= (mod i 5) 0))
          (let [results (+ results i)]
            (println i)))
        (recur (inc i))))
    (println results)    
  ))
