(ns org.apache.commons.collections4.multiset.HashMultiSet
  "Implements MultiSet, using a HashMap to provide the
  data storage. This is the standard implementation of a multiset.

  A MultiSet stores each object in the collection together with a
  count of occurrences. Extra methods on the interface allow multiple copies
  of an object to be added or removed at once."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset HashMultiSet]))

(defn ->hash-multi-set
  "Constructor.

  Constructs a multiset containing all the members of the given collection.

  coll - a collection to copy into this multiset - `java.util.Collection`"
  (^HashMultiSet [^java.util.Collection coll]
    (new HashMultiSet coll))
  (^HashMultiSet []
    (new HashMultiSet )))

