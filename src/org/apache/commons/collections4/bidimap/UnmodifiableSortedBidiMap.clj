(ns org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap
  "Decorates another SortedBidiMap to ensure it can't be altered.

  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap UnmodifiableSortedBidiMap]))

(defn *unmodifiable-sorted-bidi-map
  "Factory method to create an unmodifiable map.

   If the map passed in is already unmodifiable, it is returned.

  map - the map to decorate, must not be null - `org.apache.commons.collections4.SortedBidiMap`

  returns: an unmodifiable SortedBidiMap - `<K,V> org.apache.commons.collections4.SortedBidiMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^org.apache.commons.collections4.SortedBidiMap map]
    (UnmodifiableSortedBidiMap/unmodifiableSortedBidiMap map)))

(defn values
  "Description copied from interface: BidiMap

  returns: a collection view of the values contained in this map - `java.util.Set<V>`"
  (^java.util.Set [^UnmodifiableSortedBidiMap this]
    (-> this (.values))))

(defn map-iterator
  "Description copied from class: AbstractIterableMap

  returns: a map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^UnmodifiableSortedBidiMap this]
    (-> this (.mapIterator))))

(defn put-all
  "map-to-copy - mappings to be stored in this map - `java.util.Map`"
  ([^UnmodifiableSortedBidiMap this ^java.util.Map map-to-copy]
    (-> this (.putAll map-to-copy))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^UnmodifiableSortedBidiMap this to-key]
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
  ([^UnmodifiableSortedBidiMap this key value]
    (-> this (.put key value))))

(defn inverse-bidi-map
  "Description copied from interface: BidiMap

  returns: an inverted bidirectional map - `org.apache.commons.collections4.SortedBidiMap<V,K>`"
  (^org.apache.commons.collections4.SortedBidiMap [^UnmodifiableSortedBidiMap this]
    (-> this (.inverseBidiMap))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^UnmodifiableSortedBidiMap this]
    (-> this (.entrySet))))

(defn remove-value
  "Description copied from interface: BidiMap

  value - the value to find the key-value pair for - `java.lang.Object`

  returns: the key that was removed, null if nothing removed - `K`"
  ([^UnmodifiableSortedBidiMap this ^java.lang.Object value]
    (-> this (.removeValue value))))

(defn remove
  "key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^UnmodifiableSortedBidiMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^UnmodifiableSortedBidiMap this]
    (-> this (.keySet))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^UnmodifiableSortedBidiMap this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^UnmodifiableSortedBidiMap this from-key]
    (-> this (.tailMap from-key))))

(defn clear
  ""
  ([^UnmodifiableSortedBidiMap this]
    (-> this (.clear))))

