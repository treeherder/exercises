(ns exercises.core)

(defn merge_in
  "Accepts two sequences and a sorting operation. Returns an increasingly sorted list"
  [left right oper]
  (loop [sorted [] L left R right]
    (if (and (seq L) (seq R)) ;; if we have elements in our lists...
      (if (oper (first L) (first R))
        (recur (conj sorted (first L)) (rest L) R)
        (recur (conj sorted (first R)) L  (rest R)))
      (concat sorted L R))))                           ;; else, throw them together

(defn sort_out
  "Accepts a single unsorted list and sorts it according to the operand provided."
  [unsorted_list oper]
  (when-let [i (count unsorted_list)]
    (if (< i 2)
      unsorted_list                                         ;; a single element is sorted
      (when-let [[left_side right_side] (split-at (/ i 2) unsorted_list)] ;;split the list in half and sort ech ahlf
        (merge_in (sort_out left_side oper) (sort_out right_side oper) oper))))
  )