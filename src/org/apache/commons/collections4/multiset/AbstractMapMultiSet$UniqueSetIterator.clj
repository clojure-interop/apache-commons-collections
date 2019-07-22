(ns org.apache.commons.collections4.multiset.AbstractMapMultiSet$UniqueSetIterator
  "Inner class UniqueSetIterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset AbstractMapMultiSet$UniqueSetIterator]))

(defn next
  "Description copied from class: AbstractIteratorDecorator

  returns: `E`"
  ([^AbstractMapMultiSet$UniqueSetIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^AbstractMapMultiSet$UniqueSetIterator this]
    (-> this (.remove))))

