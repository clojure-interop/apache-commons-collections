(ns org.apache.commons.collections4.SortedBag
  "Defines a type of Bag that maintains a sorted order among
  its unique representative members."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 SortedBag]))

(defn comparator
  "Returns the comparator associated with this sorted set, or null
   if it uses its elements' natural ordering.

  returns: the comparator in use, or null if natural ordering - `java.util.Comparator<? super E>`"
  ([^SortedBag this]
    (-> this (.comparator))))

(defn first
  "Returns the first (lowest) member.

  returns: the first element in the sorted bag - `E`"
  ([^SortedBag this]
    (-> this (.first))))

(defn last
  "Returns the last (highest) member.

  returns: the last element in the sorted bag - `E`"
  ([^SortedBag this]
    (-> this (.last))))

