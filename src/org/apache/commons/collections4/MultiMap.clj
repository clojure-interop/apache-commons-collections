(ns org.apache.commons.collections4.MultiMap
  "Deprecated.
 since 4.1, use MultiValuedMap instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 MultiMap]))

(defn remove-mapping
  "Deprecated.

  key - the key to remove from - `K`
  item - the item to remove - `V`

  returns: true if the mapping was removed, false otherwise - `boolean`

  throws: java.lang.UnsupportedOperationException - if the map is unmodifiable"
  (^Boolean [^MultiMap this key item]
    (-> this (.removeMapping key item))))

(defn size
  "Deprecated.

  returns: the number of key-collection mappings in this map - `int`"
  (^Integer [^MultiMap this]
    (-> this (.size))))

(defn get
  "Deprecated.

  key - the key to retrieve - `java.lang.Object`

  returns: the Collection of values, implementations should
    return null for no mapping, but may return an empty collection - `java.lang.Object`

  throws: java.lang.ClassCastException - if the key is of an invalid type"
  (^java.lang.Object [^MultiMap this ^java.lang.Object key]
    (-> this (.get key))))

(defn contains-value
  "Deprecated.

  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the value - `boolean`

  throws: java.lang.ClassCastException - if the value is of an invalid type"
  (^Boolean [^MultiMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn put
  "Deprecated.

  key - the key to store against - `K`
  value - the value to add to the collection at the key - `java.lang.Object`

  returns: typically the value added if the map changed and null if the map did not change - `java.lang.Object`

  throws: java.lang.UnsupportedOperationException - if the map is unmodifiable"
  (^java.lang.Object [^MultiMap this key ^java.lang.Object value]
    (-> this (.put key value))))

(defn remove
  "Deprecated.

  key - the key to remove values from - `java.lang.Object`

  returns: the Collection of values removed, implementations should
    return null for no mapping found, but may return an empty collection - `java.lang.Object`

  throws: java.lang.UnsupportedOperationException - if the map is unmodifiable"
  (^java.lang.Object [^MultiMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn values
  "Deprecated.

  returns: a collection view of the values contained in this map - `java.util.Collection<java.lang.Object>`"
  (^java.util.Collection [^MultiMap this]
    (-> this (.values))))

