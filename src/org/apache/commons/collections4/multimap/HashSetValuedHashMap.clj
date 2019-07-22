(ns org.apache.commons.collections4.multimap.HashSetValuedHashMap
  "Implements a SetValuedMap, using a HashMap to provide data
  storage and HashSets as value collections. This is the standard
  implementation of a SetValuedMap.

  Note that HashSetValuedHashMap is not synchronized and is not
  thread-safe. If you wish to use this map from multiple threads
  concurrently, you must use appropriate synchronization. This class may throw
  exceptions when accessed by concurrent threads without synchronization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multimap HashSetValuedHashMap]))

(defn ->hash-set-valued-hash-map
  "Constructor.

  Creates an empty HashSetValuedHashMap with the specified initial
   map and list capacities.

  initial-map-capacity - the initial hashmap capacity - `int`
  initial-set-capacity - the initial capacity used for value collections - `int`"
  (^HashSetValuedHashMap [^Integer initial-map-capacity ^Integer initial-set-capacity]
    (new HashSetValuedHashMap initial-map-capacity initial-set-capacity))
  (^HashSetValuedHashMap [^Integer initial-set-capacity]
    (new HashSetValuedHashMap initial-set-capacity))
  (^HashSetValuedHashMap []
    (new HashSetValuedHashMap )))

