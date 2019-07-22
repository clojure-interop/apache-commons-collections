(ns org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry
  "A Map.Entry that throws
  UnsupportedOperationException when setValue is called."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.keyvalue UnmodifiableMapEntry]))

(defn ->unmodifiable-map-entry
  "Constructor.

  Constructs a new entry with the specified key and given value.

  key - the key for the entry, may be null - `K`
  value - the value for the entry, may be null - `V`"
  (^UnmodifiableMapEntry [key value]
    (new UnmodifiableMapEntry key value))
  (^UnmodifiableMapEntry [^org.apache.commons.collections4.KeyValue pair]
    (new UnmodifiableMapEntry pair)))

(defn set-value
  "Throws UnsupportedOperationException.

  value - the new value - `V`

  returns: the previous value - `V`

  throws: java.lang.UnsupportedOperationException - always"
  ([^UnmodifiableMapEntry this value]
    (-> this (.setValue value))))

