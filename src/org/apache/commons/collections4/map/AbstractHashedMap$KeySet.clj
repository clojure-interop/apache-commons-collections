(ns org.apache.commons.collections4.map.AbstractHashedMap$KeySet
  "KeySet implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractHashedMap$KeySet]))

(defn size
  "returns: `int`"
  (^Integer [^AbstractHashedMap$KeySet this]
    (-> this (.size))))

(defn clear
  ""
  ([^AbstractHashedMap$KeySet this]
    (-> this (.clear))))

(defn contains
  "key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractHashedMap$KeySet this ^java.lang.Object key]
    (-> this (.contains key))))

(defn remove
  "key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractHashedMap$KeySet this ^java.lang.Object key]
    (-> this (.remove key))))

(defn iterator
  "returns: `java.util.Iterator<K>`"
  (^java.util.Iterator [^AbstractHashedMap$KeySet this]
    (-> this (.iterator))))

