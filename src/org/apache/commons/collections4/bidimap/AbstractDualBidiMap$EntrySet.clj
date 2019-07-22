(ns org.apache.commons.collections4.bidimap.AbstractDualBidiMap$EntrySet
  "Inner class EntrySet."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractDualBidiMap$EntrySet]))

(defn iterator
  "returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^AbstractDualBidiMap$EntrySet this]
    (-> this (.iterator))))

(defn remove
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractDualBidiMap$EntrySet this ^java.lang.Object obj]
    (-> this (.remove obj))))

