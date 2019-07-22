(ns org.apache.commons.collections4.keyvalue.AbstractKeyValue
  "Abstract pair class to assist with creating KeyValue
  and Map.Entry implementations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.keyvalue AbstractKeyValue]))

(defn get-key
  "Gets the key from the pair.

  returns: the key - `K`"
  ([^AbstractKeyValue this]
    (-> this (.getKey))))

(defn get-value
  "Gets the value from the pair.

  returns: the value - `V`"
  ([^AbstractKeyValue this]
    (-> this (.getValue))))

(defn to-string
  "Gets a debugging String view of the pair.

  returns: a String view of the entry - `java.lang.String`"
  (^java.lang.String [^AbstractKeyValue this]
    (-> this (.toString))))

