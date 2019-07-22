(ns org.apache.commons.collections4.multiset.AbstractMapMultiSet$MultiSetEntry
  "Inner class MultiSetEntry."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset AbstractMapMultiSet$MultiSetEntry]))

(defn get-element
  "Description copied from interface: MultiSet.Entry

  returns: the element corresponding to this entry - `E`"
  ([^AbstractMapMultiSet$MultiSetEntry this]
    (-> this (.getElement))))

(defn get-count
  "Description copied from interface: MultiSet.Entry

  returns: the number of occurrences of the element - `int`"
  (^Integer [^AbstractMapMultiSet$MultiSetEntry this]
    (-> this (.getCount))))

