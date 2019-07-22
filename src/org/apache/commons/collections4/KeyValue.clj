(ns org.apache.commons.collections4.KeyValue
  "Defines a simple key value pair.

  A Map Entry has considerable additional semantics over and above a simple
  key-value pair. This interface defines the minimum key value, with just the
  two get methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 KeyValue]))

(defn get-key
  "Gets the key from the pair.

  returns: the key - `K`"
  ([^KeyValue this]
    (-> this (.getKey))))

(defn get-value
  "Gets the value from the pair.

  returns: the value - `V`"
  ([^KeyValue this]
    (-> this (.getValue))))

