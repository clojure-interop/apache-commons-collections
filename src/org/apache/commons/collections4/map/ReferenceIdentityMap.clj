(ns org.apache.commons.collections4.map.ReferenceIdentityMap
  "A Map implementation that allows mappings to be
  removed by the garbage collector and matches keys and values based
  on == not equals().

  When you construct a ReferenceIdentityMap, you can specify what kind
  of references are used to store the map's keys and values.
  If non-hard references are used, then the garbage collector can remove
  mappings if a key or value becomes unreachable, or if the JVM's memory is
  running low. For information on how the different reference types behave,
  see Reference.


  Different types of references can be specified for keys and values.
  The default constructor uses hard keys and soft values, providing a
  memory-sensitive cache.


  This map is similar to
  ReferenceMap.
  It differs in that keys and values in this class are compared using ==.


  This map will violate the detail of various Map and map view contracts.
  As a general rule, don't compare this map to other maps.


  This Map implementation does not allow null elements.
  Attempting to add a null key or value to the map will raise a NullPointerException.


  This implementation is not synchronized.
  You can use Collections.synchronizedMap(java.util.Map<K, V>) to
  provide synchronized access to a ReferenceIdentityMap.
  Remember that synchronization will not stop the garbage collector removing entries.


  All the available iterators can be reset back to the start by casting to
  ResettableIterator and calling reset().


  Note that ReferenceIdentityMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(java.util.Map<K, V>). This class may throw
  exceptions when accessed by concurrent threads without synchronization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map ReferenceIdentityMap]))

(defn ->reference-identity-map
  "Constructor.

  Constructs a new ReferenceIdentityMap with the
   specified reference types, load factor and initial capacity.

  key-type - the type of reference to use for keys; must be HARD, SOFT, WEAK - `org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength`
  value-type - the type of reference to use for values; must be HARD, SOFT, WEAK - `org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength`
  capacity - the initial capacity for the map - `int`
  load-factor - the load factor for the map - `float`
  purge-values - should the value be automatically purged when the key is garbage collected - `boolean`"
  (^ReferenceIdentityMap [^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength key-type ^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength value-type ^Integer capacity ^Float load-factor ^Boolean purge-values]
    (new ReferenceIdentityMap key-type value-type capacity load-factor purge-values))
  (^ReferenceIdentityMap [^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength key-type ^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength value-type ^Integer capacity ^Float load-factor]
    (new ReferenceIdentityMap key-type value-type capacity load-factor))
  (^ReferenceIdentityMap [^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength key-type ^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength value-type ^Boolean purge-values]
    (new ReferenceIdentityMap key-type value-type purge-values))
  (^ReferenceIdentityMap [^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength key-type ^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength value-type]
    (new ReferenceIdentityMap key-type value-type))
  (^ReferenceIdentityMap []
    (new ReferenceIdentityMap )))

