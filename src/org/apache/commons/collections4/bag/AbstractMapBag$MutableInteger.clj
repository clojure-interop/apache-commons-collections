(ns org.apache.commons.collections4.bag.AbstractMapBag$MutableInteger
  "Mutable integer class for storing the data."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag AbstractMapBag$MutableInteger]))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractMapBag$MutableInteger this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractMapBag$MutableInteger this]
    (-> this (.hashCode))))

