(ns org.apache.commons.collections4.map.MultiKeyMap
  "A Map implementation that uses multiple keys to map the value.

  This class is the most efficient way to uses multiple keys to map to a value.
  The best way to use this class is via the additional map-style methods.
  These provide get, containsKey, put and
  remove for individual keys which operate without extra object creation.


  The additional methods are the main interface of this map.
  As such, you will not normally hold this map in a variable of type Map.


  The normal map methods take in and return a MultiKey.
  If you try to use put() with any other object type a
  ClassCastException is thrown. If you try to use null as
  the key in put() a NullPointerException is thrown.


  This map is implemented as a decorator of a AbstractHashedMap which
  enables extra behaviour to be added easily.


  MultiKeyMap.decorate(new LinkedMap()) creates an ordered map.
  MultiKeyMap.decorate(new LRUMap()) creates an least recently used map.
  MultiKeyMap.decorate(new ReferenceMap()) creates a garbage collector sensitive map.


  Note that IdentityMap and ReferenceIdentityMap are unsuitable
  for use as the key comparison would work on the whole MultiKey, not the elements within.


  As an example, consider a least recently used cache that uses a String airline code
  and a Locale to lookup the airline's name:



  private MultiKeyMap cache = MultiKeyMap.multiKeyMap(new LRUMap(50));

  public String getAirlineName(String code, String locale) {
    String name = (String) cache.get(code, locale);
    if (name == null) {
      name = getAirlineNameFromDB(code, locale);
      cache.put(code, locale, name);
    }
    return name;
  }

  Note that MultiKeyMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. This class may throw exceptions when accessed
  by concurrent threads without synchronization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map MultiKeyMap]))

(defn ->multi-key-map
  "Constructor.

  Constructs a new MultiKeyMap that decorates a HashedMap."
  (^MultiKeyMap []
    (new MultiKeyMap )))

(defn *multi-key-map
  "Decorates the specified map to add the MultiKeyMap API and fast query.
   The map must not be null and must be empty.

  map - the map to decorate, not null - `org.apache.commons.collections4.map.AbstractHashedMap`

  returns: a new multi key map - `<K,V> org.apache.commons.collections4.map.MultiKeyMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^org.apache.commons.collections4.map.AbstractHashedMap map]
    (MultiKeyMap/multiKeyMap map)))

(defn get
  "Gets the value mapped to the specified multi-key.

  key-1 - the first key - `java.lang.Object`
  key-2 - the second key - `java.lang.Object`
  key-3 - the third key - `java.lang.Object`
  key-4 - the fourth key - `java.lang.Object`
  key-5 - the fifth key - `java.lang.Object`

  returns: the mapped value, null if no match - `V`"
  ([^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2 ^java.lang.Object key-3 ^java.lang.Object key-4 ^java.lang.Object key-5]
    (-> this (.get key-1 key-2 key-3 key-4 key-5)))
  ([^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2 ^java.lang.Object key-3 ^java.lang.Object key-4]
    (-> this (.get key-1 key-2 key-3 key-4)))
  ([^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2 ^java.lang.Object key-3]
    (-> this (.get key-1 key-2 key-3)))
  ([^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2]
    (-> this (.get key-1 key-2))))

(defn contains-key
  "Checks whether the map contains the specified multi-key.

  key-1 - the first key - `java.lang.Object`
  key-2 - the second key - `java.lang.Object`
  key-3 - the third key - `java.lang.Object`
  key-4 - the fourth key - `java.lang.Object`
  key-5 - the fifth key - `java.lang.Object`

  returns: true if the map contains the key - `boolean`"
  (^Boolean [^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2 ^java.lang.Object key-3 ^java.lang.Object key-4 ^java.lang.Object key-5]
    (-> this (.containsKey key-1 key-2 key-3 key-4 key-5)))
  (^Boolean [^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2 ^java.lang.Object key-3 ^java.lang.Object key-4]
    (-> this (.containsKey key-1 key-2 key-3 key-4)))
  (^Boolean [^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2 ^java.lang.Object key-3]
    (-> this (.containsKey key-1 key-2 key-3)))
  (^Boolean [^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2]
    (-> this (.containsKey key-1 key-2))))

(defn put
  "Stores the value against the specified multi-key.

  key-1 - the first key - `K`
  key-2 - the second key - `K`
  key-3 - the third key - `K`
  key-4 - the fourth key - `K`
  key-5 - the fifth key - `K`
  value - the value to store - `V`

  returns: the value previously mapped to this combined key, null if none - `V`"
  ([^MultiKeyMap this key-1 key-2 key-3 key-4 key-5 value]
    (-> this (.put key-1 key-2 key-3 key-4 key-5 value)))
  ([^MultiKeyMap this key-1 key-2 key-3 key-4 value]
    (-> this (.put key-1 key-2 key-3 key-4 value)))
  ([^MultiKeyMap this key-1 key-2 key-3 value]
    (-> this (.put key-1 key-2 key-3 value)))
  ([^MultiKeyMap this key-1 key-2 value]
    (-> this (.put key-1 key-2 value)))
  ([^MultiKeyMap this ^org.apache.commons.collections4.keyvalue.MultiKey key value]
    (-> this (.put key value))))

(defn remove-multi-key
  "Removes the specified multi-key from this map.

  key-1 - the first key - `java.lang.Object`
  key-2 - the second key - `java.lang.Object`
  key-3 - the third key - `java.lang.Object`
  key-4 - the fourth key - `java.lang.Object`
  key-5 - the fifth key - `java.lang.Object`

  returns: the value mapped to the removed key, null if key not in map - `V`"
  ([^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2 ^java.lang.Object key-3 ^java.lang.Object key-4 ^java.lang.Object key-5]
    (-> this (.removeMultiKey key-1 key-2 key-3 key-4 key-5)))
  ([^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2 ^java.lang.Object key-3 ^java.lang.Object key-4]
    (-> this (.removeMultiKey key-1 key-2 key-3 key-4)))
  ([^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2 ^java.lang.Object key-3]
    (-> this (.removeMultiKey key-1 key-2 key-3)))
  ([^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2]
    (-> this (.removeMultiKey key-1 key-2))))

(defn remove-all
  "Removes all mappings where the first four keys are those specified.

   This method removes all the mappings where the MultiKey
   has four or more keys, and the first four match those specified.

  key-1 - the first key - `java.lang.Object`
  key-2 - the second key - `java.lang.Object`
  key-3 - the third key - `java.lang.Object`
  key-4 - the fourth key - `java.lang.Object`

  returns: true if any elements were removed - `boolean`"
  (^Boolean [^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2 ^java.lang.Object key-3 ^java.lang.Object key-4]
    (-> this (.removeAll key-1 key-2 key-3 key-4)))
  (^Boolean [^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2 ^java.lang.Object key-3]
    (-> this (.removeAll key-1 key-2 key-3)))
  (^Boolean [^MultiKeyMap this ^java.lang.Object key-1 ^java.lang.Object key-2]
    (-> this (.removeAll key-1 key-2)))
  (^Boolean [^MultiKeyMap this ^java.lang.Object key-1]
    (-> this (.removeAll key-1))))

(defn clone
  "Clones the map without cloning the keys or values.

  returns: a shallow clone - `org.apache.commons.collections4.map.MultiKeyMap<K,V>`"
  (^org.apache.commons.collections4.map.MultiKeyMap [^MultiKeyMap this]
    (-> this (.clone))))

(defn put-all
  "Copies all of the keys and values from the specified map to this map.
   Each key must be non-null and a MultiKey object.

  map-to-copy - to this map - `java.util.Map`

  throws: java.lang.NullPointerException - if the mapToCopy or any key within is null"
  ([^MultiKeyMap this ^java.util.Map map-to-copy]
    (-> this (.putAll map-to-copy))))

(defn map-iterator
  "Description copied from class: AbstractIterableMap

  returns: a map iterator - `org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.keyvalue.MultiKey<? extends K>,V>`"
  ([^MultiKeyMap this]
    (-> this (.mapIterator))))

