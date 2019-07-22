(ns org.apache.commons.collections4.keyvalue.TiedMapEntry
  "A Map.Entry tied to a map underneath.

  This can be used to enable a map entry to make changes on the underlying
  map, however this will probably mess up any iterators."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.keyvalue TiedMapEntry]))

(defn ->tied-map-entry
  "Constructor.

  Constructs a new entry with the given Map and key.

  map - the map - `java.util.Map`
  key - the key - `K`"
  (^TiedMapEntry [^java.util.Map map key]
    (new TiedMapEntry map key)))

(defn get-key
  "Gets the key of this entry

  returns: the key - `K`"
  ([^TiedMapEntry this]
    (-> this (.getKey))))

(defn get-value
  "Gets the value of this entry direct from the map.

  returns: the value - `V`"
  ([^TiedMapEntry this]
    (-> this (.getValue))))

(defn set-value
  "Sets the value associated with the key direct onto the map.

  value - the new value - `V`

  returns: the old value - `V`

  throws: java.lang.IllegalArgumentException - if the value is set to this map entry"
  ([^TiedMapEntry this value]
    (-> this (.setValue value))))

(defn equals
  "Compares this Map.Entry with another Map.Entry.

   Implemented per API documentation of Map.Entry.equals(Object)

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal key and value - `boolean`"
  (^Boolean [^TiedMapEntry this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Gets a hashCode compatible with the equals method.

   Implemented per API documentation of Map.Entry.hashCode()

  returns: a suitable hash code - `int`"
  (^Integer [^TiedMapEntry this]
    (-> this (.hashCode))))

(defn to-string
  "Gets a string version of the entry.

  returns: entry as a string - `java.lang.String`"
  (^java.lang.String [^TiedMapEntry this]
    (-> this (.toString))))

