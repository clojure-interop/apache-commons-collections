(ns org.apache.commons.collections4.bag.HashBag
  "Implements Bag, using a HashMap to provide the
  data storage. This is the standard implementation of a bag.

  A Bag stores each object in the collection together with a
  count of occurrences. Extra methods on the interface allow multiple copies
  of an object to be added or removed at once. It is important to read the
  interface javadoc carefully as several methods violate the
  Collection interface specification."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag HashBag]))

(defn ->hash-bag
  "Constructor.

  Constructs a bag containing all the members of the given collection.

  coll - a collection to copy into this bag - `java.util.Collection`"
  (^HashBag [^java.util.Collection coll]
    (new HashBag coll))
  (^HashBag []
    (new HashBag )))

