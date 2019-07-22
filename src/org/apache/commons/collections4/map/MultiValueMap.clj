(ns org.apache.commons.collections4.map.MultiValueMap
  "Deprecated.
 since 4.1, use MultiValuedMap instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map MultiValueMap]))

(defn ->multi-value-map
  "Constructor.

  Deprecated."
  (^MultiValueMap []
    (new MultiValueMap )))

(defn *multi-value-map
  "Deprecated.

  map - the map to wrap - `java.util.Map`
  collection-class - the type of the collection class - `java.lang.Class`

  returns: a new multi-value map - `<K,V,C extends java.util.Collection<V>> org.apache.commons.collections4.map.MultiValueMap<K,V>`"
  ([^java.util.Map map ^java.lang.Class collection-class]
    (MultiValueMap/multiValueMap map collection-class))
  ([^java.util.Map map]
    (MultiValueMap/multiValueMap map)))

(defn values
  "Deprecated.

  returns: a collection view of the values contained in this map - `java.util.Collection<java.lang.Object>`"
  (^java.util.Collection [^MultiValueMap this]
    (-> this (.values))))

(defn put-all
  "Deprecated.

  key - the key to store against - `K`
  values - the values to add to the collection at the key, null ignored - `java.util.Collection`

  returns: true if this map changed - `boolean`"
  (^Boolean [^MultiValueMap this key ^java.util.Collection values]
    (-> this (.putAll key values)))
  ([^MultiValueMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Deprecated.

  key - the key to store against - `K`
  value - the value to add to the collection at the key - `java.lang.Object`

  returns: the value added if the map changed and null if the map did not change - `java.lang.Object`"
  (^java.lang.Object [^MultiValueMap this key ^java.lang.Object value]
    (-> this (.put key value))))

(defn entry-set
  "Deprecated.

  returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,java.lang.Object>>`"
  (^java.util.Set [^MultiValueMap this]
    (-> this (.entrySet))))

(defn iterator
  "Deprecated.

  key - the key to get an iterator for - `java.lang.Object`

  returns: the iterator of the collection at the key, empty iterator if key not in map - `java.util.Iterator<V>`"
  (^java.util.Iterator [^MultiValueMap this ^java.lang.Object key]
    (-> this (.iterator key)))
  (^java.util.Iterator [^MultiValueMap this]
    (-> this (.iterator))))

(defn contains-value
  "Deprecated.

  key - the key to search for - `java.lang.Object`
  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the value - `boolean`"
  (^Boolean [^MultiValueMap this ^java.lang.Object key ^java.lang.Object value]
    (-> this (.containsValue key value)))
  (^Boolean [^MultiValueMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn size
  "Deprecated.

  key - the key to get size for - `java.lang.Object`

  returns: the size of the collection at the key, zero if key not in map - `int`"
  (^Integer [^MultiValueMap this ^java.lang.Object key]
    (-> this (.size key))))

(defn clear
  "Deprecated."
  ([^MultiValueMap this]
    (-> this (.clear))))

(defn get-collection
  "Deprecated.

  key - the key to retrieve - `java.lang.Object`

  returns: the collection mapped to the key, null if no mapping - `java.util.Collection<V>`"
  (^java.util.Collection [^MultiValueMap this ^java.lang.Object key]
    (-> this (.getCollection key))))

(defn remove-mapping
  "Deprecated.

  key - the key to remove from - `java.lang.Object`
  value - the value to remove - `java.lang.Object`

  returns: true if the mapping was removed, false otherwise - `boolean`"
  (^Boolean [^MultiValueMap this ^java.lang.Object key ^java.lang.Object value]
    (-> this (.removeMapping key value))))

(defn total-size
  "Deprecated.

  returns: the total size of the map counting all values - `int`"
  (^Integer [^MultiValueMap this]
    (-> this (.totalSize))))

