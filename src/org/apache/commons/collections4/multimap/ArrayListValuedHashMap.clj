(ns org.apache.commons.collections4.multimap.ArrayListValuedHashMap
  "Implements a ListValuedMap, using a HashMap to provide data
  storage and ArrayLists as value collections. This is the standard
  implementation of a ListValuedMap.

  Note that ArrayListValuedHashMap is not synchronized and is not
  thread-safe. If you wish to use this map from multiple threads
  concurrently, you must use appropriate synchronization. This class may throw
  exceptions when accessed by concurrent threads without synchronization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multimap ArrayListValuedHashMap]))

(defn ->array-list-valued-hash-map
  "Constructor.

  Creates an empty ArrayListValuedHashMap with the specified initial
   map and list capacities.

  initial-map-capacity - the initial hashmap capacity - `int`
  initial-list-capacity - the initial capacity used for value collections - `int`"
  (^ArrayListValuedHashMap [^Integer initial-map-capacity ^Integer initial-list-capacity]
    (new ArrayListValuedHashMap initial-map-capacity initial-list-capacity))
  (^ArrayListValuedHashMap [^Integer initial-list-capacity]
    (new ArrayListValuedHashMap initial-list-capacity))
  (^ArrayListValuedHashMap []
    (new ArrayListValuedHashMap )))

(defn trim-to-size
  "Trims the capacity of all value collections to their current size."
  ([^ArrayListValuedHashMap this]
    (-> this (.trimToSize))))

