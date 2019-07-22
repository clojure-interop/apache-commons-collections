(ns org.apache.commons.collections4.bidimap.AbstractDualBidiMap$EntrySetIterator
  "Inner class EntrySetIterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractDualBidiMap$EntrySetIterator]))

(defn next
  "Description copied from class: AbstractIteratorDecorator

  returns: `java.util.Map$Entry<K,V>`"
  (^java.util.Map$Entry [^AbstractDualBidiMap$EntrySetIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^AbstractDualBidiMap$EntrySetIterator this]
    (-> this (.remove))))

