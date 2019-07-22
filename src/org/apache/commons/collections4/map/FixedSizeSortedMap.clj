(ns org.apache.commons.collections4.map.FixedSizeSortedMap
  "Decorates another SortedMap to fix the size blocking add/remove.

  Any action that would change the size of the map is disallowed.
  The put method is allowed to change the value associated with an existing
  key however.


  If trying to remove or clear the map, an UnsupportedOperationException is
  thrown. If trying to put a new mapping into the map, an
  IllegalArgumentException is thrown. This is because the put method can
  succeed if the mapping's key already exists in the map, so the put method
  is not always unsupported.


  Note that FixedSizeSortedMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedSortedMap(java.util.SortedMap<K, V>). This class may throw
  exceptions when accessed by concurrent threads without synchronization.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map FixedSizeSortedMap]))

(defn *fixed-size-sorted-map
  "Factory method to create a fixed size sorted map.

  map - the map to decorate, must not be null - `java.util.SortedMap`

  returns: a new fixed size sorted map - `<K,V> org.apache.commons.collections4.map.FixedSizeSortedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.SortedMap map]
    (FixedSizeSortedMap/fixedSizeSortedMap map)))

(defn values
  "returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^FixedSizeSortedMap this]
    (-> this (.values))))

(defn put-all
  "map-to-copy - mappings to be stored in this map - `java.util.Map`"
  ([^FixedSizeSortedMap this ^java.util.Map map-to-copy]
    (-> this (.putAll map-to-copy))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^FixedSizeSortedMap this to-key]
    (-> this (.headMap to-key))))

(defn put
  "Description copied from interface: Put

  key - key with which the specified value is to be associated - `K`
  value - value to be associated with the specified key - `V`

  returns: the previous value associated with key, or
           null if there was no mapping for key.
           (A null return can also indicate that the map
           previously associated null with key,
           if the implementation supports null values.) - `V`"
  ([^FixedSizeSortedMap this key value]
    (-> this (.put key value))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^FixedSizeSortedMap this]
    (-> this (.entrySet))))

(defn remove
  "key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^FixedSizeSortedMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^FixedSizeSortedMap this]
    (-> this (.keySet))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^FixedSizeSortedMap this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^FixedSizeSortedMap this from-key]
    (-> this (.tailMap from-key))))

(defn full?
  "Description copied from interface: BoundedMap

  returns: true if the map is full - `boolean`"
  (^Boolean [^FixedSizeSortedMap this]
    (-> this (.isFull))))

(defn clear
  ""
  ([^FixedSizeSortedMap this]
    (-> this (.clear))))

(defn max-size
  "Description copied from interface: BoundedMap

  returns: the maximum number of elements the map can hold - `int`"
  (^Integer [^FixedSizeSortedMap this]
    (-> this (.maxSize))))

