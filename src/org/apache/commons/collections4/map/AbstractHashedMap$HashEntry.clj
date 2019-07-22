(ns org.apache.commons.collections4.map.AbstractHashedMap$HashEntry
  "HashEntry used to store the data.

  If you subclass AbstractHashedMap but not HashEntry
  then you will not be able to access the protected fields.
  The entryXxx() methods on AbstractHashedMap exist
  to provide the necessary access."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractHashedMap$HashEntry]))

(defn get-key
  "Description copied from interface: KeyValue

  returns: the key - `K`"
  ([^AbstractHashedMap$HashEntry this]
    (-> this (.getKey))))

(defn get-value
  "Description copied from interface: KeyValue

  returns: the value - `V`"
  ([^AbstractHashedMap$HashEntry this]
    (-> this (.getValue))))

(defn set-value
  "value - `V`

  returns: `V`"
  ([^AbstractHashedMap$HashEntry this value]
    (-> this (.setValue value))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractHashedMap$HashEntry this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractHashedMap$HashEntry this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractHashedMap$HashEntry this]
    (-> this (.toString))))

