(ns org.apache.commons.collections4.map.DefaultedMap
  "Decorates another Map returning a default value if the map
  does not contain the requested key.

  When the get(Object) method is called with a key that does not
  exist in the map, this map will return the default value specified in
  the constructor/factory. Only the get method is altered, so the
  Map.containsKey(Object) can be used to determine if a key really
  is in the map or not.


  The defaulted value is not added to the map.
  Compare this behaviour with LazyMap, which does add the value
  to the map (via a Transformer).


  For instance:



  Map map = new DefaultedMap(\"NULL\");
  Object obj = map.get(\"Surname\");
  // obj == \"NULL\"

  After the above code is executed the map is still empty.


  Note that DefaultedMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  exceptions when accessed by concurrent threads without synchronization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map DefaultedMap]))

(defn ->defaulted-map
  "Constructor.

  Constructs a new empty DefaultedMap that decorates
   a HashMap.

   The object passed in will be returned by the map whenever an
   unknown key is requested.

  default-value - the default value to return when the key is not found - `V`"
  (^DefaultedMap [default-value]
    (new DefaultedMap default-value)))

(defn *defaulted-map
  "Factory method to create a defaulting map.

   The value specified is returned when a missing key is found.

  map - the map to decorate, must not be null - `java.util.Map`
  default-value - the default value to return when the key is not found - `V`

  returns: a new defaulting map - `<K,V> org.apache.commons.collections4.map.DefaultedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.Map map default-value]
    (DefaultedMap/defaultedMap map default-value)))

(defn get
  "key - the key whose associated value is to be returned - `java.lang.Object`

  returns: the value to which the specified key is mapped, or
           null if this map contains no mapping for the key - `V`"
  ([^DefaultedMap this ^java.lang.Object key]
    (-> this (.get key))))

