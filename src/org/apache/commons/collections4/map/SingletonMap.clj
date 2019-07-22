(ns org.apache.commons.collections4.map.SingletonMap
  "A Map implementation that holds a single item and is fixed size.

  The single key/value pair is specified at creation.
  The map is fixed size so any action that would change the size is disallowed.
  However, the put or setValue methods can change
  the value associated with the key.


  If trying to remove or clear the map, an UnsupportedOperationException is thrown.
  If trying to put a new mapping into the map, an  IllegalArgumentException is thrown.
  The put method will only succeed if the key specified is the same as the
  singleton key.


  The key and value can be obtained by:


  normal Map methods and views
  the MapIterator, see mapIterator()
  the KeyValue interface (just cast - no object creation)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map SingletonMap]))

(defn ->singleton-map
  "Constructor.

  Constructor specifying the key and value.

  key - the key to use - `K`
  value - the value to use - `V`"
  (^SingletonMap [key value]
    (new SingletonMap key value))
  (^SingletonMap [^org.apache.commons.collections4.KeyValue key-value]
    (new SingletonMap key-value))
  (^SingletonMap []
    (new SingletonMap )))

(defn values
  "Gets the unmodifiable values view of the map.
   Changes made to the view affect this map.
   To simply iterate through the values, use mapIterator().

  returns: the values view - `java.util.Collection<V>`"
  (^java.util.Collection [^SingletonMap this]
    (-> this (.values))))

(defn map-iterator
  "Obtains an OrderedMapIterator over the map.

   A ordered map iterator is an efficient way of iterating over maps
   in both directions.

  returns: a map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^SingletonMap this]
    (-> this (.mapIterator))))

(defn put-all
  "Puts the values from the specified map into this map.

   The map must be of size 0 or size 1.
   If it is size 1, the key must match the key of this map otherwise an
   IllegalArgumentException is thrown.

  map - the map to add, must be size 0 or 1, and the key must match - `java.util.Map`

  throws: java.lang.NullPointerException - if the map is null"
  ([^SingletonMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Puts a key-value mapping into this map where the key must match the existing key.

   An IllegalArgumentException is thrown if the key does not match as the map
   is fixed size.

  key - the key to set, must be the key of the map - `K`
  value - the value to set - `V`

  returns: the value previously mapped to this key, null if none - `V`

  throws: java.lang.IllegalArgumentException - if the key does not match"
  ([^SingletonMap this key value]
    (-> this (.put key value))))

(defn entry-set
  "Gets the entrySet view of the map.
   Changes made via setValue affect this map.
   To simply iterate through the entries, use mapIterator().

  returns: the entrySet view - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^SingletonMap this]
    (-> this (.entrySet))))

(defn get-key
  "Gets the key.

  returns: the key - `K`"
  ([^SingletonMap this]
    (-> this (.getKey))))

(defn to-string
  "Gets the map as a String.

  returns: a string version of the map - `java.lang.String`"
  (^java.lang.String [^SingletonMap this]
    (-> this (.toString))))

(defn first-key
  "Gets the first (and only) key in the map.

  returns: the key - `K`"
  ([^SingletonMap this]
    (-> this (.firstKey))))

(defn get-value
  "Gets the value.

  returns: the value - `V`"
  ([^SingletonMap this]
    (-> this (.getValue))))

(defn contains-value
  "Checks whether the map contains the specified value.

  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the key - `boolean`"
  (^Boolean [^SingletonMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn last-key
  "Gets the last (and only) key in the map.

  returns: the key - `K`"
  ([^SingletonMap this]
    (-> this (.lastKey))))

(defn remove
  "Unsupported operation.

  key - the mapping to remove - `java.lang.Object`

  returns: the value mapped to the removed key, null if key not in map - `V`

  throws: java.lang.UnsupportedOperationException - always"
  ([^SingletonMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Gets the unmodifiable keySet view of the map.
   Changes made to the view affect this map.
   To simply iterate through the keys, use mapIterator().

  returns: the keySet view - `java.util.Set<K>`"
  (^java.util.Set [^SingletonMap this]
    (-> this (.keySet))))

(defn next-key
  "Gets the next key after the key specified, always null.

  key - the next key - `K`

  returns: null always - `K`"
  ([^SingletonMap this key]
    (-> this (.nextKey key))))

(defn previous-key
  "Gets the previous key before the key specified, always null.

  key - the next key - `K`

  returns: null always - `K`"
  ([^SingletonMap this key]
    (-> this (.previousKey key))))

(defn set-value
  "Sets the value.

  value - the new value to set - `V`

  returns: the old value - `V`"
  ([^SingletonMap this value]
    (-> this (.setValue value))))

(defn full?
  "Is the map currently full, always true.

  returns: true always - `boolean`"
  (^Boolean [^SingletonMap this]
    (-> this (.isFull))))

(defn clone
  "Clones the map without cloning the key or value.

  returns: a shallow clone - `org.apache.commons.collections4.map.SingletonMap<K,V>`"
  (^org.apache.commons.collections4.map.SingletonMap [^SingletonMap this]
    (-> this (.clone))))

(defn hash-code
  "Gets the standard Map hashCode.

  returns: the hash code defined in the Map interface - `int`"
  (^Integer [^SingletonMap this]
    (-> this (.hashCode))))

(defn empty?
  "Checks whether the map is currently empty, which it never is.

  returns: false always - `boolean`"
  (^Boolean [^SingletonMap this]
    (-> this (.isEmpty))))

(defn size
  "Gets the size of the map, always 1.

  returns: the size of 1 - `int`"
  (^Integer [^SingletonMap this]
    (-> this (.size))))

(defn clear
  "Unsupported operation."
  ([^SingletonMap this]
    (-> this (.clear))))

(defn max-size
  "Gets the maximum size of the map, always 1.

  returns: 1 always - `int`"
  (^Integer [^SingletonMap this]
    (-> this (.maxSize))))

(defn contains-key
  "Checks whether the map contains the specified key.

  key - the key to search for - `java.lang.Object`

  returns: true if the map contains the key - `boolean`"
  (^Boolean [^SingletonMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "Gets the value mapped to the key specified.

  key - the key - `java.lang.Object`

  returns: the mapped value, null if no match - `V`"
  ([^SingletonMap this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "Compares this map with another.

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^SingletonMap this ^java.lang.Object obj]
    (-> this (.equals obj))))

