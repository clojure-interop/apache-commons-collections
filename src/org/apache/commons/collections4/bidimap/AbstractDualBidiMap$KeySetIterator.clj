(ns org.apache.commons.collections4.bidimap.AbstractDualBidiMap$KeySetIterator
  "Inner class KeySetIterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractDualBidiMap$KeySetIterator]))

(defn next
  "Description copied from class: AbstractIteratorDecorator

  returns: `K`"
  ([^AbstractDualBidiMap$KeySetIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^AbstractDualBidiMap$KeySetIterator this]
    (-> this (.remove))))

