(ns org.apache.commons.collections4.map.LazyMap
  "Decorates another Map to create objects in the map on demand.

  When the get(Object) method is called with a key that does not
  exist in the map, the factory is used to create the object. The created
  object will be added to the map using the requested key.


  For instance:



  Factory<Date> factory = new Factory<Date>() {
      public Date create() {
          return new Date();
      }
  }
  Map<String, Date> lazy = LazyMap.lazyMap(new HashMap<String, Date>(), factory);
  Date date = lazy.get(\"NOW\");


  After the above code is executed, date will refer to
  a new Date instance. Furthermore, that Date
  instance is mapped to the \"NOW\" key in the map.


  Note that LazyMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  exceptions when accessed by concurrent threads without synchronization.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map LazyMap]))

(defn *lazy-map
  "Factory method to create a lazily instantiated map.

  map - the map to decorate, must not be null - `java.util.Map`
  factory - the factory to use, must not be null - `org.apache.commons.collections4.Factory`

  returns: a new lazy map - `<K,V> org.apache.commons.collections4.map.LazyMap<K,V>`

  throws: java.lang.NullPointerException - if map or factory is null"
  ([^java.util.Map map ^org.apache.commons.collections4.Factory factory]
    (LazyMap/lazyMap map factory)))

(defn get
  "key - the key whose associated value is to be returned - `java.lang.Object`

  returns: the value to which the specified key is mapped, or
           null if this map contains no mapping for the key - `V`"
  ([^LazyMap this ^java.lang.Object key]
    (-> this (.get key))))

