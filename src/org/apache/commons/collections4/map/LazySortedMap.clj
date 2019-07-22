(ns org.apache.commons.collections4.map.LazySortedMap
  "Decorates another SortedMap to create objects in the map on demand.

  When the LazyMap.get(Object) method is called with a key that does not
  exist in the map, the factory is used to create the object. The created
  object will be added to the map using the requested key.


  For instance:



  Factory<Date> factory = new Factory<Date>() {
      public Date create() {
          return new Date();
      }
  }
  SortedMap<String, Date> lazy =
      LazySortedMap.lazySortedMap(new HashMap<String, Date>(), factory);
  Date date = lazy.get(\"NOW\");


  After the above code is executed, date will refer to
  a new Date instance. Furthermore, that Date
  instance is mapped to the \"NOW\" key in the map.


  Note that LazySortedMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedSortedMap(java.util.SortedMap<K, V>). This class may throw
  exceptions when accessed by concurrent threads without synchronization.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map LazySortedMap]))

(defn *lazy-sorted-map
  "Factory method to create a lazily instantiated sorted map.

  map - the map to decorate, must not be null - `java.util.SortedMap`
  factory - the factory to use, must not be null - `org.apache.commons.collections4.Factory`

  returns: a new lazy sorted map - `<K,V> org.apache.commons.collections4.map.LazySortedMap<K,V>`

  throws: java.lang.NullPointerException - if map or factory is null"
  ([^java.util.SortedMap map ^org.apache.commons.collections4.Factory factory]
    (LazySortedMap/lazySortedMap map factory)))

(defn first-key
  "returns: `K`"
  ([^LazySortedMap this]
    (-> this (.firstKey))))

(defn last-key
  "returns: `K`"
  ([^LazySortedMap this]
    (-> this (.lastKey))))

(defn comparator
  "returns: `java.util.Comparator<? super K>`"
  ([^LazySortedMap this]
    (-> this (.comparator))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^LazySortedMap this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^LazySortedMap this to-key]
    (-> this (.headMap to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^LazySortedMap this from-key]
    (-> this (.tailMap from-key))))

