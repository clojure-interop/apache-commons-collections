(ns org.apache.commons.collections4.map.AbstractHashedMap$EntrySet
  "EntrySet implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractHashedMap$EntrySet]))

(defn size
  "returns: `int`"
  (^Integer [^AbstractHashedMap$EntrySet this]
    (-> this (.size))))

(defn clear
  ""
  ([^AbstractHashedMap$EntrySet this]
    (-> this (.clear))))

(defn contains
  "entry - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractHashedMap$EntrySet this ^java.lang.Object entry]
    (-> this (.contains entry))))

(defn remove
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractHashedMap$EntrySet this ^java.lang.Object obj]
    (-> this (.remove obj))))

(defn iterator
  "returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^AbstractHashedMap$EntrySet this]
    (-> this (.iterator))))

