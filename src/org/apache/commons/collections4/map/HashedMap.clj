(ns org.apache.commons.collections4.map.HashedMap
  "A Map implementation that is a general purpose alternative
  to HashMap.

  This implementation improves on the JDK1.4 HashMap by adding the
  MapIterator
  functionality and many methods for subclassing.


  Note that HashedMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  exceptions when accessed by concurrent threads without synchronization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map HashedMap]))

(defn ->hashed-map
  "Constructor.

  Constructs a new, empty map with the specified initial capacity and
   load factor.

  initial-capacity - the initial capacity - `int`
  load-factor - the load factor - `float`

  throws: java.lang.IllegalArgumentException - if the load factor is less than zero"
  (^HashedMap [^Integer initial-capacity ^Float load-factor]
    (new HashedMap initial-capacity load-factor))
  (^HashedMap [^Integer initial-capacity]
    (new HashedMap initial-capacity))
  (^HashedMap []
    (new HashedMap )))

(defn clone
  "Clones the map without cloning the keys or values.

  returns: a shallow clone - `org.apache.commons.collections4.map.HashedMap<K,V>`"
  (^org.apache.commons.collections4.map.HashedMap [^HashedMap this]
    (-> this (.clone))))

