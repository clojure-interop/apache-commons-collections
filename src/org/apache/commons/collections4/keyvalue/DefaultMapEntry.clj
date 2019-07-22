(ns org.apache.commons.collections4.keyvalue.DefaultMapEntry
  "A restricted implementation of Map.Entry that prevents
  the Map.Entry contract from being broken."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.keyvalue DefaultMapEntry]))

(defn ->default-map-entry
  "Constructor.

  Constructs a new entry with the specified key and given value.

  key - the key for the entry, may be null - `K`
  value - the value for the entry, may be null - `V`"
  (^DefaultMapEntry [key value]
    (new DefaultMapEntry key value))
  (^DefaultMapEntry [^org.apache.commons.collections4.KeyValue pair]
    (new DefaultMapEntry pair)))

