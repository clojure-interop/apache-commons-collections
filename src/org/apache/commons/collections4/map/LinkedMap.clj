(ns org.apache.commons.collections4.map.LinkedMap
  "A Map implementation that maintains the order of the entries.
  In this implementation order is maintained by original insertion.

  This implementation improves on the JDK1.4 LinkedHashMap by adding the
  MapIterator
  functionality, additional convenience methods and allowing
  bidirectional iteration. It also implements OrderedMap.
  In addition, non-interface methods are provided to access the map by index.


  The orderedMapIterator() method provides direct access to a
  bidirectional iterator. The iterators from the other views can also be cast
  to OrderedIterator if required.


  All the available iterators can be reset back to the start by casting to
  ResettableIterator and calling reset().


  The implementation is also designed to be subclassed, with lots of useful
  methods exposed.


  Note that LinkedMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  exceptions when accessed by concurrent threads without synchronization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map LinkedMap]))

(defn ->linked-map
  "Constructor.

  Constructs a new, empty map with the specified initial capacity and
   load factor.

  initial-capacity - the initial capacity - `int`
  load-factor - the load factor - `float`

  throws: java.lang.IllegalArgumentException - if the load factor is less than zero"
  (^LinkedMap [^Integer initial-capacity ^Float load-factor]
    (new LinkedMap initial-capacity load-factor))
  (^LinkedMap [^Integer initial-capacity]
    (new LinkedMap initial-capacity))
  (^LinkedMap []
    (new LinkedMap )))

(defn clone
  "Clones the map without cloning the keys or values.

  returns: a shallow clone - `org.apache.commons.collections4.map.LinkedMap<K,V>`"
  (^org.apache.commons.collections4.map.LinkedMap [^LinkedMap this]
    (-> this (.clone))))

(defn get
  "Gets the key at the specified index.

  index - the index to retrieve - `int`

  returns: the key at the specified index - `K`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^LinkedMap this ^Integer index]
    (-> this (.get index))))

(defn get-value
  "Gets the value at the specified index.

  index - the index to retrieve - `int`

  returns: the value at the specified index - `V`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^LinkedMap this ^Integer index]
    (-> this (.getValue index))))

(defn index-of
  "Gets the index of the specified key.

  key - the key to find the index of - `java.lang.Object`

  returns: the index, or -1 if not found - `int`"
  (^Integer [^LinkedMap this ^java.lang.Object key]
    (-> this (.indexOf key))))

(defn remove
  "Removes the element at the specified index.

  index - the index of the object to remove - `int`

  returns: the previous value corresponding the key,
    or null if none existed - `V`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^LinkedMap this ^Integer index]
    (-> this (.remove index))))

(defn as-list
  "Gets an unmodifiable List view of the keys.

   The returned list is unmodifiable because changes to the values of
   the list (using ListIterator.set(Object)) will
   effectively remove the value from the list and reinsert that value at
   the end of the list, which is an unexpected side effect of changing the
   value of a list.  This occurs because changing the key, changes when the
   mapping is added to the map and thus where it appears in the list.

   An alternative to this method is to use AbstractHashedMap.keySet().

  returns: The ordered list of keys. - `java.util.List<K>`"
  (^java.util.List [^LinkedMap this]
    (-> this (.asList))))

