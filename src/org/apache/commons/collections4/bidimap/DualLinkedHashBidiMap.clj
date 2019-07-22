(ns org.apache.commons.collections4.bidimap.DualLinkedHashBidiMap
  "Implementation of BidiMap that uses two LinkedHashMap instances.

  Two LinkedHashMap instances are used in this class.
  This provides fast lookups at the expense of storing two sets of map entries and two linked lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap DualLinkedHashBidiMap]))

(defn ->dual-linked-hash-bidi-map
  "Constructor.

  Constructs a LinkedHashBidiMap and copies the mappings from
   specified Map.

  map - the map whose mappings are to be placed in this map - `java.util.Map`"
  (^DualLinkedHashBidiMap [^java.util.Map map]
    (new DualLinkedHashBidiMap map))
  (^DualLinkedHashBidiMap []
    (new DualLinkedHashBidiMap )))

