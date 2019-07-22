(ns org.apache.commons.collections4.map.PredicatedMap
  "Decorates another Map to validate that additions
  match a specified predicate.

  This map exists to provide validation for the decorated map.
  It is normally created to decorate an empty map.
  If an object cannot be added to the map, an IllegalArgumentException is thrown.


  One usage would be to ensure that no null keys are added to the map.



 Map map = PredicatedSet.decorate(new HashMap(), NotNullPredicate.INSTANCE, null);

  Note that PredicatedMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  exceptions when accessed by concurrent threads without synchronization.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map PredicatedMap]))

(defn *predicated-map
  "Factory method to create a predicated (validating) map.

   If there are any elements already in the list being decorated, they
   are validated.

  map - the map to decorate, must not be null - `java.util.Map`
  key-predicate - the predicate to validate the keys, null means no check - `org.apache.commons.collections4.Predicate`
  value-predicate - the predicate to validate to values, null means no check - `org.apache.commons.collections4.Predicate`

  returns: a new predicated map - `<K,V> org.apache.commons.collections4.map.PredicatedMap<K,V>`

  throws: java.lang.NullPointerException - if the map is null"
  ([^java.util.Map map ^org.apache.commons.collections4.Predicate key-predicate ^org.apache.commons.collections4.Predicate value-predicate]
    (PredicatedMap/predicatedMap map key-predicate value-predicate)))

(defn put
  "Description copied from interface: Put

  key - key with which the specified value is to be associated - `K`
  value - value to be associated with the specified key - `V`

  returns: the previous value associated with key, or
           null if there was no mapping for key.
           (A null return can also indicate that the map
           previously associated null with key,
           if the implementation supports null values.) - `V`"
  ([^PredicatedMap this key value]
    (-> this (.put key value))))

(defn put-all
  "map-to-copy - mappings to be stored in this map - `java.util.Map`"
  ([^PredicatedMap this ^java.util.Map map-to-copy]
    (-> this (.putAll map-to-copy))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^PredicatedMap this]
    (-> this (.entrySet))))

