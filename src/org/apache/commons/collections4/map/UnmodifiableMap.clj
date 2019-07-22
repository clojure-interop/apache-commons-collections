(ns org.apache.commons.collections4.map.UnmodifiableMap
  "Decorates another Map to ensure it can't be altered.

  This class is Serializable from Commons Collections 3.1.


  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map UnmodifiableMap]))

(defn *unmodifiable-map
  "Factory method to create an unmodifiable map.

  map - the map to decorate, must not be null - `java.util.Map`

  returns: a new unmodifiable map - `<K,V> java.util.Map<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.Map map]
    (UnmodifiableMap/unmodifiableMap map)))

(defn clear
  ""
  ([^UnmodifiableMap this]
    (-> this (.clear))))

(defn put
  "Description copied from interface: Put

  key - key with which the specified value is to be associated - `K`
  value - value to be associated with the specified key - `V`

  returns: the previous value associated with key, or
           null if there was no mapping for key.
           (A null return can also indicate that the map
           previously associated null with key,
           if the implementation supports null values.) - `V`"
  ([^UnmodifiableMap this key value]
    (-> this (.put key value))))

(defn put-all
  "map-to-copy - mappings to be stored in this map - `java.util.Map`"
  ([^UnmodifiableMap this ^java.util.Map map-to-copy]
    (-> this (.putAll map-to-copy))))

(defn remove
  "key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^UnmodifiableMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn map-iterator
  "Description copied from class: AbstractIterableMap

  returns: a map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^UnmodifiableMap this]
    (-> this (.mapIterator))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^UnmodifiableMap this]
    (-> this (.entrySet))))

(defn key-set
  "returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^UnmodifiableMap this]
    (-> this (.keySet))))

(defn values
  "returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^UnmodifiableMap this]
    (-> this (.values))))

