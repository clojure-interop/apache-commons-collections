(ns org.apache.commons.collections4.map.PredicatedSortedMap
  "Decorates another SortedMap to validate that additions
  match a specified predicate.

  This map exists to provide validation for the decorated map.
  It is normally created to decorate an empty map.
  If an object cannot be added to the map, an IllegalArgumentException is thrown.


  One usage would be to ensure that no null keys are added to the map.



    SortedMap map =
      PredicatedSortedMap.predicatedSortedMap(new TreeMap(),
                                              NotNullPredicate.notNullPredicate(),
                                              null);

  Note that PredicatedSortedMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedSortedMap(java.util.SortedMap<K, V>). This class may throw
  exceptions when accessed by concurrent threads without synchronization.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map PredicatedSortedMap]))

(defn *predicated-sorted-map
  "Factory method to create a predicated (validating) sorted map.

   If there are any elements already in the list being decorated, they
   are validated.

  map - the map to decorate, must not be null - `java.util.SortedMap`
  key-predicate - the predicate to validate the keys, null means no check - `org.apache.commons.collections4.Predicate`
  value-predicate - the predicate to validate to values, null means no check - `org.apache.commons.collections4.Predicate`

  returns: a new predicated sorted map - `<K,V> org.apache.commons.collections4.map.PredicatedSortedMap<K,V>`

  throws: java.lang.NullPointerException - if the map is null"
  ([^java.util.SortedMap map ^org.apache.commons.collections4.Predicate key-predicate ^org.apache.commons.collections4.Predicate value-predicate]
    (PredicatedSortedMap/predicatedSortedMap map key-predicate value-predicate)))

(defn first-key
  "returns: `K`"
  ([^PredicatedSortedMap this]
    (-> this (.firstKey))))

(defn last-key
  "returns: `K`"
  ([^PredicatedSortedMap this]
    (-> this (.lastKey))))

(defn comparator
  "returns: `java.util.Comparator<? super K>`"
  ([^PredicatedSortedMap this]
    (-> this (.comparator))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^PredicatedSortedMap this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^PredicatedSortedMap this to-key]
    (-> this (.headMap to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^PredicatedSortedMap this from-key]
    (-> this (.tailMap from-key))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^PredicatedSortedMap this]
    (-> this (.entrySet))))

