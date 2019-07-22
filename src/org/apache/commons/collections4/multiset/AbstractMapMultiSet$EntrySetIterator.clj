(ns org.apache.commons.collections4.multiset.AbstractMapMultiSet$EntrySetIterator
  "Inner class EntrySetIterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset AbstractMapMultiSet$EntrySetIterator]))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^AbstractMapMultiSet$EntrySetIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.apache.commons.collections4.MultiSet$Entry<E>`"
  (^org.apache.commons.collections4.MultiSet$Entry [^AbstractMapMultiSet$EntrySetIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^AbstractMapMultiSet$EntrySetIterator this]
    (-> this (.remove))))

