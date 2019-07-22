(ns org.apache.commons.collections4.keyvalue.AbstractMapEntry
  "Abstract Pair class to assist with creating correct
  Map.Entry implementations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.keyvalue AbstractMapEntry]))

(defn set-value
  "Sets the value stored in this Map.Entry.

   This Map.Entry is not connected to a Map, so only the
   local data is changed.

  value - the new value - `V`

  returns: the previous value - `V`"
  ([^AbstractMapEntry this value]
    (-> this (.setValue value))))

(defn equals
  "Compares this Map.Entry with another Map.Entry.

   Implemented per API documentation of Map.Entry.equals(Object)

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal key and value - `boolean`"
  (^Boolean [^AbstractMapEntry this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Gets a hashCode compatible with the equals method.

   Implemented per API documentation of Map.Entry.hashCode()

  returns: a suitable hash code - `int`"
  (^Integer [^AbstractMapEntry this]
    (-> this (.hashCode))))

