(ns org.apache.commons.collections4.bidimap.DualHashBidiMap
  "Implementation of BidiMap that uses two HashMap instances.

  Two HashMap instances are used in this class.
  This provides fast lookups at the expense of storing two sets of map entries.
  Commons Collections would welcome the addition of a direct hash-based
  implementation of the BidiMap interface.


  NOTE: From Commons Collections 3.1, all subclasses will use HashMap
  and the flawed createMap method is ignored."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap DualHashBidiMap]))

(defn ->dual-hash-bidi-map
  "Constructor.

  Constructs a HashBidiMap and copies the mappings from
   specified Map.

  map - the map whose mappings are to be placed in this map - `java.util.Map`"
  (^DualHashBidiMap [^java.util.Map map]
    (new DualHashBidiMap map))
  (^DualHashBidiMap []
    (new DualHashBidiMap )))

