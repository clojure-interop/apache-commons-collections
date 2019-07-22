(ns org.apache.commons.collections4.bidimap.AbstractDualBidiMap$KeySet
  "Inner class KeySet."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractDualBidiMap$KeySet]))

(defn iterator
  "returns: `java.util.Iterator<K>`"
  (^java.util.Iterator [^AbstractDualBidiMap$KeySet this]
    (-> this (.iterator))))

(defn contains
  "key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractDualBidiMap$KeySet this ^java.lang.Object key]
    (-> this (.contains key))))

(defn remove
  "key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractDualBidiMap$KeySet this ^java.lang.Object key]
    (-> this (.remove key))))

