(ns org.apache.commons.collections4.map.ReferenceMap
  "A Map implementation that allows mappings to be
  removed by the garbage collector.

  When you construct a ReferenceMap, you can specify what kind
  of references are used to store the map's keys and values.
  If non-hard references are used, then the garbage collector can remove
  mappings if a key or value becomes unreachable, or if the JVM's memory is
  running low. For information on how the different reference types behave,
  see Reference.


  Different types of references can be specified for keys and values.
  The keys can be configured to be weak but the values hard,
  in which case this class will behave like a

  WeakHashMap. However, you can also specify hard keys and
  weak values, or any other combination. The default constructor uses
  hard keys and soft values, providing a memory-sensitive cache.


  This map is similar to
  ReferenceIdentityMap.
  It differs in that keys and values in this class are compared using equals().


  This Map implementation does not allow null elements.
  Attempting to add a null key or value to the map will raise a NullPointerException.


  This implementation is not synchronized.
  You can use Collections.synchronizedMap(java.util.Map<K, V>) to
  provide synchronized access to a ReferenceMap.
  Remember that synchronization will not stop the garbage collector removing entries.


  All the available iterators can be reset back to the start by casting to
  ResettableIterator and calling reset().


  Note that ReferenceMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(java.util.Map<K, V>). This class may throw
  exceptions when accessed by concurrent threads without synchronization.


  NOTE: As from Commons Collections 3.1 this map extends AbstractReferenceMap
  (previously it extended AbstractMap). As a result, the implementation is now
  extensible and provides a MapIterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map ReferenceMap]))

(defn ->reference-map
  "Constructor.

  Constructs a new ReferenceMap with the
   specified reference types, load factor and initial
   capacity.

  key-type - the type of reference to use for keys; must be HARD, SOFT, WEAK - `org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength`
  value-type - the type of reference to use for values; must be HARD, SOFT, WEAK - `org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength`
  capacity - the initial capacity for the map - `int`
  load-factor - the load factor for the map - `float`
  purge-values - should the value be automatically purged when the key is garbage collected - `boolean`"
  (^ReferenceMap [^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength key-type ^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength value-type ^Integer capacity ^Float load-factor ^Boolean purge-values]
    (new ReferenceMap key-type value-type capacity load-factor purge-values))
  (^ReferenceMap [^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength key-type ^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength value-type ^Integer capacity ^Float load-factor]
    (new ReferenceMap key-type value-type capacity load-factor))
  (^ReferenceMap [^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength key-type ^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength value-type ^Boolean purge-values]
    (new ReferenceMap key-type value-type purge-values))
  (^ReferenceMap [^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength key-type ^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength value-type]
    (new ReferenceMap key-type value-type))
  (^ReferenceMap []
    (new ReferenceMap )))

