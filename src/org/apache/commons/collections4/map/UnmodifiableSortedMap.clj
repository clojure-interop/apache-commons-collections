(ns org.apache.commons.collections4.map.UnmodifiableSortedMap
  "Decorates another SortedMap to ensure it can't be altered.

  This class is Serializable from Commons Collections 3.1.


  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map UnmodifiableSortedMap]))

(defn *unmodifiable-sorted-map
  "Factory method to create an unmodifiable sorted map.

  map - the map to decorate, must not be null - `java.util.SortedMap`

  returns: a new unmodifiable sorted map - `<K,V> java.util.SortedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.SortedMap map]
    (UnmodifiableSortedMap/unmodifiableSortedMap map)))

(defn values
  "returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^UnmodifiableSortedMap this]
    (-> this (.values))))

(defn put-all
  "map-to-copy - mappings to be stored in this map - `java.util.Map`"
  ([^UnmodifiableSortedMap this ^java.util.Map map-to-copy]
    (-> this (.putAll map-to-copy))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^UnmodifiableSortedMap this to-key]
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
  ([^UnmodifiableSortedMap this key value]
    (-> this (.put key value))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^UnmodifiableSortedMap this]
    (-> this (.entrySet))))

(defn first-key
  "Description copied from interface: OrderedMap

  returns: the first key currently in this map - `K`"
  ([^UnmodifiableSortedMap this]
    (-> this (.firstKey))))

(defn last-key
  "Description copied from interface: OrderedMap

  returns: the last key currently in this map - `K`"
  ([^UnmodifiableSortedMap this]
    (-> this (.lastKey))))

(defn remove
  "key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^UnmodifiableSortedMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^UnmodifiableSortedMap this]
    (-> this (.keySet))))

(defn comparator
  "returns: `java.util.Comparator<? super K>`"
  ([^UnmodifiableSortedMap this]
    (-> this (.comparator))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^UnmodifiableSortedMap this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^UnmodifiableSortedMap this from-key]
    (-> this (.tailMap from-key))))

(defn clear
  ""
  ([^UnmodifiableSortedMap this]
    (-> this (.clear))))

