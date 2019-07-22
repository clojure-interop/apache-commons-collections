(ns org.apache.commons.collections4.multiset.AbstractMultiSet$EntrySet
  "Inner class EntrySet."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset AbstractMultiSet$EntrySet]))

(defn size
  "returns: `int`"
  (^Integer [^AbstractMultiSet$EntrySet this]
    (-> this (.size))))

(defn iterator
  "returns: `java.util.Iterator<org.apache.commons.collections4.MultiSet$Entry<E>>`"
  (^java.util.Iterator [^AbstractMultiSet$EntrySet this]
    (-> this (.iterator))))

(defn contains
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractMultiSet$EntrySet this ^java.lang.Object obj]
    (-> this (.contains obj))))

(defn remove
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractMultiSet$EntrySet this ^java.lang.Object obj]
    (-> this (.remove obj))))

