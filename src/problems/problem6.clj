(ns problems.problem6)

(defn solution
	"The sum of the squares of the first ten natural numbers is,
    1^2 + 2^2 + ... + 10^2 = 385

   The square of the sum of the first ten natural numbers is,
    (1 + 2 + ... + 10)^2 = 55^2 = 3025

   Hence the difference between the sum of the squares of the first 
   ten natural numbers and the square of the sum is 3025 − 385 = 2640.

   Find the difference between the sum of the squares of the first 
   one hundred natural numbers and the square of the sum."
	[start end]
  (-
    ; Calcualte the square of sums
    (let [sum_squares (apply +(range start (+ end 1)))]
      (* sum_squares sum_squares))
    ; Calculate the sum of squares
    (apply + (map #(* %1 %1) (range start (inc end))))
    )
)

;; Solution for first 100 numbers -> 25164150