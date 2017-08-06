(ns exercises.core-test
  (:require [clojure.test :refer :all]
            [exercises.core :refer :all]))

(deftest sorter
  (testing "accepts unsorted list and divides into sublists, each containing 1 element. \n
  \t returns a list of sublists where each element is sorted by size to the elements next to it. \n
   Start by finding the midway point between [a:g] - divide by two and round down [a:b],[b+1:c]. \n
   Next, recursively sort the sublists created by the division. \n
   Merge the sorted arrays back into [a:c] \n
   If the list contains more than 1 element, split it again. \n
   If the list contains 1 element, merge it into two elements. \n
   In the case of 2 elements:  if a>=c, conider the list sorted. \n
   If a<c, sort the list again.\n\n"
    (is (= 0 1))))

(deftest outline
  (testing "Conceptually, a merge sort works as follows:\n\n
    Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).\n
    Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining. \n
    This will be the sorted list.\n"
    (is (= nil true))))
