(ns org.apache.commons.collections4.map.FixedSizeMap
  "Decorates another Map to fix the size, preventing add/remove.

  Any action that would change the size of the map is disallowed.
  The put method is allowed to change the value associated with an existing
  key however.


  If trying to remove or clear the map, an UnsupportedOperationException is
  thrown. If trying to put a new mapping into the map, an
  IllegalArgumentException is thrown. This is because the put method can
  succeed if the mapping's key already exists in the map, so the put method
  is not always unsupported.


  Note that FixedSizeMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  exceptions when accessed by concurrent threads without synchronization.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map FixedSizeMap]))

(defn *fixed-size-map
  "Factory method to create a fixed size map.

  map - the map to decorate, must not be null - `java.util.Map`

  returns: a new fixed size map - `<K,V> org.apache.commons.collections4.map.FixedSizeMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.Map map]
    (FixedSizeMap/fixedSizeMap map)))

(defn values
  "returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^FixedSizeMap this]
    (-> this (.values))))

(defn put-all
  "map-to-copy - mappings to be stored in this map - `java.util.Map`"
  ([^FixedSizeMap this ^java.util.Map map-to-copy]
    (-> this (.putAll map-to-copy))))

(defn put
  "Description copied from interface: Put

  key - key with which the specified value is to be associated - `K`
  value - value to be associated with the specified key - `V`

  returns: the previous value associated with key, or
           null if there was no mapping for key.
           (A null return can also indicate that the map
           previously associated null with key,
           if the implementation supports null values.) - `V`"
  ([^FixedSizeMap this key value]
    (-> this (.put key value))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^FixedSizeMap this]
    (-> this (.entrySet))))

(defn remove
  "key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^FixedSizeMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^FixedSizeMap this]
    (-> this (.keySet))))

(defn full?
  "Description copied from interface: BoundedMap

  returns: true if the map is full - `boolean`"
  (^Boolean [^FixedSizeMap this]
    (-> this (.isFull))))

(defn clear
  ""
  ([^FixedSizeMap this]
    (-> this (.clear))))

(defn max-size
  "Description copied from interface: BoundedMap

  returns: the maximum number of elements the map can hold - `int`"
  (^Integer [^FixedSizeMap this]
    (-> this (.maxSize))))

