(ns org.apache.commons.collections4.bidimap.AbstractDualBidiMap
  "Abstract BidiMap implemented using two maps.

  An implementation can be written simply by implementing the
  createBidiMap(Map, Map, BidiMap) method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractDualBidiMap]))

(defn values
  "Gets a values view of the map.
   Changes made on the view are reflected in the map.
   The set supports remove and clear but not add.

  returns: the values view - `java.util.Set<V>`"
  (^java.util.Set [^AbstractDualBidiMap this]
    (-> this (.values))))

(defn map-iterator
  "Obtains a MapIterator over the map.
   The iterator implements ResetableMapIterator.
   This implementation relies on the entrySet iterator.

   The setValue() methods only allow a new value to be set.
   If the value being set is already in the map, an IllegalArgumentException
   is thrown (as setValue cannot change the size of the map).

  returns: a map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^AbstractDualBidiMap this]
    (-> this (.mapIterator))))

(defn put-all
  "map - mappings to be stored in this map - `java.util.Map`"
  ([^AbstractDualBidiMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Description copied from interface: BidiMap

  key - the key to store - `K`
  value - the value to store - `V`

  returns: the previous value mapped to this key - `V`"
  ([^AbstractDualBidiMap this key value]
    (-> this (.put key value))))

(defn inverse-bidi-map
  "Description copied from interface: BidiMap

  returns: an inverted bidirectional map - `org.apache.commons.collections4.BidiMap<V,K>`"
  (^org.apache.commons.collections4.BidiMap [^AbstractDualBidiMap this]
    (-> this (.inverseBidiMap))))

(defn entry-set
  "Gets an entrySet view of the map.
   Changes made on the set are reflected in the map.
   The set supports remove and clear but not add.

   The Map Entry setValue() method only allow a new value to be set.
   If the value being set is already in the map, an IllegalArgumentException
   is thrown (as setValue cannot change the size of the map).

  returns: the entrySet view - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^AbstractDualBidiMap this]
    (-> this (.entrySet))))

(defn get-key
  "Description copied from interface: BidiMap

  value - the value to find the key for - `java.lang.Object`

  returns: the mapped key, or null if not found - `K`"
  ([^AbstractDualBidiMap this ^java.lang.Object value]
    (-> this (.getKey value))))

(defn remove-value
  "Description copied from interface: BidiMap

  value - the value to find the key-value pair for - `java.lang.Object`

  returns: the key that was removed, null if nothing removed - `K`"
  ([^AbstractDualBidiMap this ^java.lang.Object value]
    (-> this (.removeValue value))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractDualBidiMap this]
    (-> this (.toString))))

(defn contains-value
  "value - value whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map maps one or more keys to the
           specified value - `boolean`"
  (^Boolean [^AbstractDualBidiMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^AbstractDualBidiMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Gets a keySet view of the map.
   Changes made on the view are reflected in the map.
   The set supports remove and clear but not add.

  returns: the keySet view - `java.util.Set<K>`"
  (^java.util.Set [^AbstractDualBidiMap this]
    (-> this (.keySet))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractDualBidiMap this]
    (-> this (.hashCode))))

(defn empty?
  "returns: true if this map contains no key-value mappings - `boolean`"
  (^Boolean [^AbstractDualBidiMap this]
    (-> this (.isEmpty))))

(defn size
  "returns: the number of key-value mappings in this map - `int`"
  (^Integer [^AbstractDualBidiMap this]
    (-> this (.size))))

(defn clear
  ""
  ([^AbstractDualBidiMap this]
    (-> this (.clear))))

(defn contains-key
  "key - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified
           key - `boolean`"
  (^Boolean [^AbstractDualBidiMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "key - the key whose associated value is to be returned - `java.lang.Object`

  returns: the value to which the specified key is mapped, or
           null if this map contains no mapping for the key - `V`"
  ([^AbstractDualBidiMap this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractDualBidiMap this ^java.lang.Object obj]
    (-> this (.equals obj))))

