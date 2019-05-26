(ns playground-web.repl
  (:require [clojure.pprint :as pp]
            [clojure.inspector :as insp]
            [clojure.java.javadoc :as jdoc]
            [com.hypirion.clj-xchart :as xc]))


(defn foo
  [n]
  (cond (> n 30) (+ n 20)
        (> n 20) (- (first n) 20)
        :else 0))

(defn number-summary
  "Computes a summary of the arithmetic properties of a number,
   as a data structure."
  [n]
  (let [proper-divisors (into (sorted-set)
                          (filter
                            (fn [d]
                              (zero? (rem n d)))
                            (range 1 n)))
        divisors-sum (apply + proper-divisors)]
    {:n n
     :proper-divisors proper-divisors
     :even? (even? n)
     :prime? (= proper-divisors #{1})
     :perfect-number? (= divisors-sum n)}))

(comment 
  ;; text-based visualisation with pprint
  (pp/pprint [{:name "Vivs" :age 7 :likes "Cake"}
              {:name "Rex"  :age 2 :likes "Milk"}])


  ;;Graphic visualisation using clojure.inspector
  (insp/inspect-table (mapv number-summary (range 1 20))))


(defn fib
  "Generates a lazy sequence of the
   Fibonacci numbers"
  []
  (map first
       (iterate (fn [[a b]]
                  [b (+ a b)])
                [0 1])))



