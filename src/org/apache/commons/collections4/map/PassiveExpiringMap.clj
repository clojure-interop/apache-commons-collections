(ns org.apache.commons.collections4.map.PassiveExpiringMap
  "Decorates a Map to evict expired entries once their expiration
  time has been reached.

  When putting a key-value pair in the map this decorator uses a
  PassiveExpiringMap.ExpirationPolicy to determine how long the entry should remain alive
  as defined by an expiration time value.


  When accessing the mapped value for a key, its expiration time is checked,
  and if it is a negative value or if it is greater than the current time, the
  mapped value is returned. Otherwise, the key is removed from the decorated
  map, and null is returned.


  When invoking methods that involve accessing the entire map contents (i.e
  containsKey(Object), entrySet(), etc.) this decorator
  removes all expired entries prior to actually completing the invocation.


  Note that PassiveExpiringMap is not synchronized and is not
  thread-safe. If you wish to use this map from multiple threads
  concurrently, you must use appropriate synchronization. The simplest approach
  is to wrap this map using Collections.synchronizedMap(Map).
  This class may throw exceptions when accessed by concurrent threads without
  synchronization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map PassiveExpiringMap]))

(defn ->passive-expiring-map
  "Constructor.

  Construct a map decorator that decorates the given map using the given
   time-to-live value measured in the given time units of measure to create
   PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy expiration policy. This policy
   is used to determine expiration times. If there are any elements already
   in the map being decorated, they will NEVER expire unless they are
   replaced.

  time-to-live - the constant amount of time an entry is available before it expires. A negative value results in entries that NEVER expire. A zero value results in entries that ALWAYS expire. - `long`
  time-unit - the unit of time for the timeToLive parameter, must not be null. - `java.util.concurrent.TimeUnit`
  map - the map to decorate, must not be null. - `java.util.Map`

  throws: java.lang.NullPointerException - if the map or time unit is null."
  (^PassiveExpiringMap [^Long time-to-live ^java.util.concurrent.TimeUnit time-unit ^java.util.Map map]
    (new PassiveExpiringMap time-to-live time-unit map))
  (^PassiveExpiringMap [^org.apache.commons.collections4.map.PassiveExpiringMap$ExpirationPolicy expiring-policy ^java.util.Map map]
    (new PassiveExpiringMap expiring-policy map))
  (^PassiveExpiringMap [^org.apache.commons.collections4.map.PassiveExpiringMap$ExpirationPolicy expiring-policy]
    (new PassiveExpiringMap expiring-policy))
  (^PassiveExpiringMap []
    (new PassiveExpiringMap )))

(defn values
  "All expired entries are removed from the map prior to returning the value collection.

  returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^PassiveExpiringMap this]
    (-> this (.values))))

(defn put-all
  "map-to-copy - mappings to be stored in this map - `java.util.Map`"
  ([^PassiveExpiringMap this ^java.util.Map map-to-copy]
    (-> this (.putAll map-to-copy))))

(defn put
  "Add the given key-value pair to this map as well as recording the entry's expiration time based on
   the current time in milliseconds and this map's expiringPolicy.

   Note that the return type is Object, rather than V as in the Map interface.
   See the class Javadoc for further info.

  key - key with which the specified value is to be associated - `K`
  value - value to be associated with the specified key - `V`

  returns: the previous value associated with key, or
           null if there was no mapping for key.
           (A null return can also indicate that the map
           previously associated null with key,
           if the implementation supports null values.) - `V`"
  ([^PassiveExpiringMap this key value]
    (-> this (.put key value))))

(defn entry-set
  "All expired entries are removed from the map prior to returning the entry set.

  returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^PassiveExpiringMap this]
    (-> this (.entrySet))))

(defn contains-value
  "All expired entries are removed from the map prior to determining the
   contains result.

  value - value whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map maps one or more keys to the
           specified value - `boolean`"
  (^Boolean [^PassiveExpiringMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "Normal Map.remove(Object) behavior with the addition of removing
   any expiration entry as well.

  key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^PassiveExpiringMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "All expired entries are removed from the map prior to returning the key set.

  returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^PassiveExpiringMap this]
    (-> this (.keySet))))

(defn empty?
  "All expired entries are removed from the map prior to determining if it is empty.

  returns: true if this map contains no key-value mappings - `boolean`"
  (^Boolean [^PassiveExpiringMap this]
    (-> this (.isEmpty))))

(defn size
  "All expired entries are removed from the map prior to returning the size.

  returns: the number of key-value mappings in this map - `int`"
  (^Integer [^PassiveExpiringMap this]
    (-> this (.size))))

(defn clear
  "Normal Map.clear() behavior with the addition of clearing all
   expiration entries as well."
  ([^PassiveExpiringMap this]
    (-> this (.clear))))

(defn contains-key
  "All expired entries are removed from the map prior to determining the
   contains result.

  key - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified
           key - `boolean`"
  (^Boolean [^PassiveExpiringMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "All expired entries are removed from the map prior to returning the entry value.

  key - the key whose associated value is to be returned - `java.lang.Object`

  returns: the value to which the specified key is mapped, or
           null if this map contains no mapping for the key - `V`"
  ([^PassiveExpiringMap this ^java.lang.Object key]
    (-> this (.get key))))

