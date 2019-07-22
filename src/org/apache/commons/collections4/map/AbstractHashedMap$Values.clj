(ns org.apache.commons.collections4.map.AbstractHashedMap$Values
  "Values implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractHashedMap$Values]))

(defn size
  "returns: `int`"
  (^Integer [^AbstractHashedMap$Values this]
    (-> this (.size))))

(defn clear
  ""
  ([^AbstractHashedMap$Values this]
    (-> this (.clear))))

(defn contains
  "value - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractHashedMap$Values this ^java.lang.Object value]
    (-> this (.contains value))))

(defn iterator
  "returns: `java.util.Iterator<V>`"
  (^java.util.Iterator [^AbstractHashedMap$Values this]
    (-> this (.iterator))))

