(ns org.apache.commons.collections4.map.Flat3Map
  "A Map implementation that stores data in simple fields until
  the size is greater than 3.

  This map is designed for performance and can outstrip HashMap.
  It also has good garbage collection characteristics.


  Optimised for operation at size 3 or less.
  Still works well once size 3 exceeded.
  Gets at size 3 or less are about 0-10% faster than HashMap,
  Puts at size 3 or less are over 4 times faster than HashMap.
  Performance 5% slower than HashMap once size 3 exceeded once.


  The design uses two distinct modes of operation - flat and delegate.
  While the map is size 3 or less, operations map straight onto fields using
  switch statements. Once size 4 is reached, the map switches to delegate mode
  and only switches back when cleared. In delegate mode, all operations are
  forwarded straight to a HashMap resulting in the 5% performance loss.


  The performance gains on puts are due to not needing to create a Map Entry
  object. This is a large saving not only in performance but in garbage collection.


  Whilst in flat mode this map is also easy for the garbage collector to dispatch.
  This is because it contains no complex objects or arrays which slow the progress.


  Do not use Flat3Map if the size is likely to grow beyond 3.


  Note that Flat3Map is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  exceptions when accessed by concurrent threads without synchronization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map Flat3Map]))

(defn ->flat-3-map
  "Constructor.

  Constructor copying elements from another map.

  map - the map to copy - `java.util.Map`

  throws: java.lang.NullPointerException - if the map is null"
  (^Flat3Map [^java.util.Map map]
    (new Flat3Map map))
  (^Flat3Map []
    (new Flat3Map )))

(defn values
  "Gets the values view of the map.
   Changes made to the view affect this map.
   To simply iterate through the values, use mapIterator().

  returns: the values view - `java.util.Collection<V>`"
  (^java.util.Collection [^Flat3Map this]
    (-> this (.values))))

(defn map-iterator
  "Gets an iterator over the map.
   Changes made to the iterator affect this map.

   A MapIterator returns the keys in the map. It also provides convenient
   methods to get the key and value, and set the value.
   It avoids the need to create an entrySet/keySet/values object.
   It also avoids creating the Map Entry object.

  returns: the map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^Flat3Map this]
    (-> this (.mapIterator))))

(defn put-all
  "Puts all the values from the specified map into this map.

  map - the map to add - `java.util.Map`

  throws: java.lang.NullPointerException - if the map is null"
  ([^Flat3Map this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Puts a key-value mapping into this map.

  key - the key to add - `K`
  value - the value to add - `V`

  returns: the value previously mapped to this key, null if none - `V`"
  ([^Flat3Map this key value]
    (-> this (.put key value))))

(defn entry-set
  "Gets the entrySet view of the map.
   Changes made to the view affect this map.

   NOTE: from 4.0, the returned Map Entry will be an independent object and will
   not change anymore as the iterator progresses. To avoid this additional object
   creation and simply iterate through the entries, use mapIterator().

  returns: the entrySet view - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^Flat3Map this]
    (-> this (.entrySet))))

(defn to-string
  "Gets the map as a String.

  returns: a string version of the map - `java.lang.String`"
  (^java.lang.String [^Flat3Map this]
    (-> this (.toString))))

(defn contains-value
  "Checks whether the map contains the specified value.

  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the key - `boolean`"
  (^Boolean [^Flat3Map this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "Removes the specified mapping from this map.

  key - the mapping to remove - `java.lang.Object`

  returns: the value mapped to the removed key, null if key not in map - `V`"
  ([^Flat3Map this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Gets the keySet view of the map.
   Changes made to the view affect this map.
   To simply iterate through the keys, use mapIterator().

  returns: the keySet view - `java.util.Set<K>`"
  (^java.util.Set [^Flat3Map this]
    (-> this (.keySet))))

(defn clone
  "Clones the map without cloning the keys or values.

  returns: a shallow clone - `org.apache.commons.collections4.map.Flat3Map<K,V>`"
  (^org.apache.commons.collections4.map.Flat3Map [^Flat3Map this]
    (-> this (.clone))))

(defn hash-code
  "Gets the standard Map hashCode.

  returns: the hash code defined in the Map interface - `int`"
  (^Integer [^Flat3Map this]
    (-> this (.hashCode))))

(defn empty?
  "Checks whether the map is currently empty.

  returns: true if the map is currently size zero - `boolean`"
  (^Boolean [^Flat3Map this]
    (-> this (.isEmpty))))

(defn size
  "Gets the size of the map.

  returns: the size - `int`"
  (^Integer [^Flat3Map this]
    (-> this (.size))))

(defn clear
  "Clears the map, resetting the size to zero and nullifying references
   to avoid garbage collection issues."
  ([^Flat3Map this]
    (-> this (.clear))))

(defn contains-key
  "Checks whether the map contains the specified key.

  key - the key to search for - `java.lang.Object`

  returns: true if the map contains the key - `boolean`"
  (^Boolean [^Flat3Map this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "Gets the value mapped to the key specified.

  key - the key - `java.lang.Object`

  returns: the mapped value, null if no match - `V`"
  ([^Flat3Map this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "Compares this map with another.

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^Flat3Map this ^java.lang.Object obj]
    (-> this (.equals obj))))

