(ns org.apache.commons.collections4.multiset.AbstractMapMultiSet$MutableInteger
  "Mutable integer class for storing the data."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset AbstractMapMultiSet$MutableInteger]))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractMapMultiSet$MutableInteger this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractMapMultiSet$MutableInteger this]
    (-> this (.hashCode))))

