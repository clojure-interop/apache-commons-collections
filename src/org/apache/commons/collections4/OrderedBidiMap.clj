(ns org.apache.commons.collections4.OrderedBidiMap
  "Defines a map that allows bidirectional lookup between key and values
  and retains and provides access to an ordering.

  Implementations should allow a value to be looked up from a key and
  a key to be looked up from a value with equal performance."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 OrderedBidiMap]))

(defn inverse-bidi-map
  "Gets a view of this map where the keys and values are reversed.

   Changes to one map will be visible in the other and vice versa.
   This enables both directions of the map to be accessed equally.

   Implementations should seek to avoid creating a new object every time this
   method is called. See AbstractMap.values() etc. Calling this
   method on the inverse map should return the original.

   Implementations must return an OrderedBidiMap instance,
   usually by forwarding to inverseOrderedBidiMap().

  returns: an inverted bidirectional map - `org.apache.commons.collections4.OrderedBidiMap<V,K>`"
  (^org.apache.commons.collections4.OrderedBidiMap [^OrderedBidiMap this]
    (-> this (.inverseBidiMap))))

