(ns org.apache.commons.collections4.map.LRUMap
  "A Map implementation with a fixed maximum size which removes
  the least recently used entry if an entry is added when full.

  The least recently used algorithm works on the get and put operations only.
  Iteration of any kind, including setting the value by iteration, does not
  change the order. Queries such as containsKey and containsValue or access
  via views also do not change the order.


  A somewhat subtle ramification of the least recently used
  algorithm is that calls to get(Object) stand a very good chance
  of modifying the map's iteration order and thus invalidating any
  iterators currently in use.  It is therefore suggested that iterations
  over an LRUMap instance access entry values only through a
  MapIterator or AbstractHashedMap.entrySet() iterator.


  The map implements OrderedMap and entries may be queried using
  the bidirectional OrderedMapIterator. The order returned is
  least recently used to most recently used. Iterators from map views can
  also be cast to OrderedIterator if required.


  All the available iterators can be reset back to the start by casting to
  ResettableIterator and calling reset().


  Note that LRUMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  NullPointerException's when accessed by concurrent threads."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map LRUMap]))

(defn ->lru-map
  "Constructor.

  Constructs a new, empty map with the specified max / initial capacity and load factor.

  max-size - the maximum size of the map - `int`
  initial-size - the initial size of the map - `int`
  load-factor - the load factor - `float`
  scan-until-removable - scan until a removeable entry is found, default false - `boolean`

  throws: java.lang.IllegalArgumentException - if the load factor is less than zero"
  (^LRUMap [^Integer max-size ^Integer initial-size ^Float load-factor ^Boolean scan-until-removable]
    (new LRUMap max-size initial-size load-factor scan-until-removable))
  (^LRUMap [^Integer max-size ^Integer initial-size ^Float load-factor]
    (new LRUMap max-size initial-size load-factor))
  (^LRUMap [^Integer max-size ^Integer initial-size]
    (new LRUMap max-size initial-size))
  (^LRUMap [^Integer max-size]
    (new LRUMap max-size))
  (^LRUMap []
    (new LRUMap )))

(defn get
  "Gets the value mapped to the key specified.

   If updateToMRU is true, the position of the key in the map
   is changed to the most recently used position (last), otherwise the iteration
   order is not changed by this operation.

  key - the key - `java.lang.Object`
  update-to-mru - whether the key shall be updated to the most recently used position - `boolean`

  returns: the mapped value, null if no match - `V`"
  ([^LRUMap this ^java.lang.Object key ^Boolean update-to-mru]
    (-> this (.get key update-to-mru)))
  ([^LRUMap this ^java.lang.Object key]
    (-> this (.get key))))

(defn full?
  "Returns true if this map is full and no new mappings can be added.

  returns: true if the map is full - `boolean`"
  (^Boolean [^LRUMap this]
    (-> this (.isFull))))

(defn max-size
  "Gets the maximum size of the map (the bound).

  returns: the maximum number of elements the map can hold - `int`"
  (^Integer [^LRUMap this]
    (-> this (.maxSize))))

(defn scan-until-removable?
  "Whether this LRUMap will scan until a removable entry is found when the
   map is full.

  returns: true if this map scans - `boolean`"
  (^Boolean [^LRUMap this]
    (-> this (.isScanUntilRemovable))))

(defn clone
  "Clones the map without cloning the keys or values.

  returns: a shallow clone - `org.apache.commons.collections4.map.LRUMap<K,V>`"
  (^org.apache.commons.collections4.map.LRUMap [^LRUMap this]
    (-> this (.clone))))

