(ns org.apache.commons.collections4.bidimap.AbstractDualBidiMap$ValuesIterator
  "Inner class ValuesIterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractDualBidiMap$ValuesIterator]))

(defn next
  "Description copied from class: AbstractIteratorDecorator

  returns: `V`"
  ([^AbstractDualBidiMap$ValuesIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^AbstractDualBidiMap$ValuesIterator this]
    (-> this (.remove))))

