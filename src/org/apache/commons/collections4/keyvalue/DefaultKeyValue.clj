(ns org.apache.commons.collections4.keyvalue.DefaultKeyValue
  "A mutable KeyValue pair that does not implement
  Map.Entry.

  Note that a DefaultKeyValue instance may not contain
  itself as a key or value."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.keyvalue DefaultKeyValue]))

(defn ->default-key-value
  "Constructor.

  Constructs a new pair with the specified key and given value.

  key - the key for the entry, may be null - `K`
  value - the value for the entry, may be null - `V`"
  (^DefaultKeyValue [key value]
    (new DefaultKeyValue key value))
  (^DefaultKeyValue [^org.apache.commons.collections4.KeyValue pair]
    (new DefaultKeyValue pair))
  (^DefaultKeyValue []
    (new DefaultKeyValue )))

(defn set-key
  "Sets the key.

  key - the new key - `K`

  returns: the old key - `K`

  throws: java.lang.IllegalArgumentException - if key is this object"
  ([^DefaultKeyValue this key]
    (-> this (.setKey key))))

(defn set-value
  "Sets the value.

  value - the new value - `V`

  returns: the old value of the value - `V`

  throws: java.lang.IllegalArgumentException - if value is this object"
  ([^DefaultKeyValue this value]
    (-> this (.setValue value))))

(defn to-map-entry
  "Returns a new Map.Entry object with key and value from this pair.

  returns: a MapEntry instance - `java.util.Map$Entry<K,V>`"
  (^java.util.Map$Entry [^DefaultKeyValue this]
    (-> this (.toMapEntry))))

(defn equals
  "Compares this Map.Entry with another Map.Entry.

   Returns true if the compared object is also a DefaultKeyValue,
   and its key and value are equal to this object's key and value.

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal key and value - `boolean`"
  (^Boolean [^DefaultKeyValue this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Gets a hashCode compatible with the equals method.

   Implemented per API documentation of Map.Entry.hashCode(),
   however subclasses may override this.

  returns: a suitable hash code - `int`"
  (^Integer [^DefaultKeyValue this]
    (-> this (.hashCode))))

