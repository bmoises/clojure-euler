(ns problems.problem4)

(defn is-palindrome?
  "will return true or false if a number is palindrome"
  [number]
  (let [str-number (str number)]
    (= str-number (apply str  (reverse str-number)))))

(defn palidromes
  "will return a sequence of NxN
  examples, 99x99, 100*100
  arguments:
    x - current x value
    startx - stating value of x
    stopx - stopping condition for y
    y - current x value
    starty - stating value of x
    stopy - stopping condition for y    
    list - holds current results
  "
  ([startx, stopx, starty, stopy]
    (palidromes startx startx stopx starty starty stopy ()))
  ([x, startx, stopx, y, starty, stopy, results]
  
  ; (if 
  ;  (is-palindrome? (* x y))
  ;  (println (str x " -- " y " -- " (* x y) " -- " )))
  
  (if 
    (and (= x stopx) (= y stopy)) ; this is our stop condition
    results
    (if 
      (= y stopy)
      (recur (inc x) startx stopx starty starty stopy results) ; loop around
      (if 
        (is-palindrome? (* x y))
        (recur x startx stopx (inc y) starty stopy (conj results (* x y))) ; if its a palindrome add to list
        (recur x startx stopx (inc y) starty stopy results) ; just inc y
      )))))

(defn solution
	"A palindromic number reads the same both ways. 
	The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

  Find the largest palindrome made from the product of two 3-digit numbers."
  []
	(last (sort (palidromes 100 999 100 999)))
	)
