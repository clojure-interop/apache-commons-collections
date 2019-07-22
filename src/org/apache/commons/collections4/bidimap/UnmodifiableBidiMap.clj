(ns org.apache.commons.collections4.bidimap.UnmodifiableBidiMap
  "Decorates another BidiMap to ensure it can't be altered.

  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap UnmodifiableBidiMap]))

(defn *unmodifiable-bidi-map
  "Factory method to create an unmodifiable map.

   If the map passed in is already unmodifiable, it is returned.

  map - the map to decorate, must not be null - `org.apache.commons.collections4.BidiMap`

  returns: an unmodifiable BidiMap - `<K,V> org.apache.commons.collections4.BidiMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^org.apache.commons.collections4.BidiMap map]
    (UnmodifiableBidiMap/unmodifiableBidiMap map)))

(defn values
  "Description copied from interface: BidiMap

  returns: a collection view of the values contained in this map - `java.util.Set<V>`"
  (^java.util.Set [^UnmodifiableBidiMap this]
    (-> this (.values))))

(defn map-iterator
  "Description copied from class: AbstractIterableMap

  returns: a map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^UnmodifiableBidiMap this]
    (-> this (.mapIterator))))

(defn put-all
  "map-to-copy - mappings to be stored in this map - `java.util.Map`"
  ([^UnmodifiableBidiMap this ^java.util.Map map-to-copy]
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
  ([^UnmodifiableBidiMap this key value]
    (-> this (.put key value))))

(defn inverse-bidi-map
  "Description copied from interface: BidiMap

  returns: an inverted bidirectional map - `org.apache.commons.collections4.BidiMap<V,K>`"
  (^org.apache.commons.collections4.BidiMap [^UnmodifiableBidiMap this]
    (-> this (.inverseBidiMap))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^UnmodifiableBidiMap this]
    (-> this (.entrySet))))

(defn remove-value
  "Description copied from interface: BidiMap

  value - the value to find the key-value pair for - `java.lang.Object`

  returns: the key that was removed, null if nothing removed - `K`"
  ([^UnmodifiableBidiMap this ^java.lang.Object value]
    (-> this (.removeValue value))))

(defn remove
  "key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^UnmodifiableBidiMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^UnmodifiableBidiMap this]
    (-> this (.keySet))))

(defn clear
  ""
  ([^UnmodifiableBidiMap this]
    (-> this (.clear))))

