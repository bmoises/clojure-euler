(ns problems.problem5)

(defn find_all 
  "Recursively call itself to find the solution"
  [my_range num]
    ; (println (str "Processing: " num))
    ; We check to see if the sum of the following is > 0, if so, 
    ; we inc num and do it all over again
    ; If not, we stop
    (if (> (apply + (map #(mod num %) my_range)) 0)
      (recur my_range (inc num))
      num))

(defn solution
	"2520 is the smallest number that can be divided by 
	 each of the numbers from 1 to 10 without any remainder.
   
   What is the smallest positive number that is evenly 
   divisible by all of the numbers from 1 to 20?"
	[start end]
	; Define my_range only once
	(let [my_range (range start (+ end 1))]
	
	  (find_all my_range 1)
	)
)