(ns org.apache.commons.collections4.multiset.AbstractMultiSet$UniqueSet
  "Inner class UniqueSet."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset AbstractMultiSet$UniqueSet]))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^AbstractMultiSet$UniqueSet this]
    (-> this (.iterator))))

(defn contains
  "key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractMultiSet$UniqueSet this ^java.lang.Object key]
    (-> this (.contains key))))

(defn contains-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractMultiSet$UniqueSet this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

(defn remove
  "key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractMultiSet$UniqueSet this ^java.lang.Object key]
    (-> this (.remove key))))

(defn size
  "returns: `int`"
  (^Integer [^AbstractMultiSet$UniqueSet this]
    (-> this (.size))))

(defn clear
  ""
  ([^AbstractMultiSet$UniqueSet this]
    (-> this (.clear))))

