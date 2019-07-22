(ns org.apache.commons.collections4.SortedBidiMap
  "Defines a map that allows bidirectional lookup between key and values
  and retains both keys and values in sorted order.

  Implementations should allow a value to be looked up from a key and
  a key to be looked up from a value with equal performance."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 SortedBidiMap]))

(defn inverse-bidi-map
  "Gets a view of this map where the keys and values are reversed.

   Changes to one map will be visible in the other and vice versa.
   This enables both directions of the map to be accessed equally.

   Implementations should seek to avoid creating a new object every time this
   method is called. See AbstractMap.values() etc. Calling this
   method on the inverse map should return the original.

   Implementations must return a SortedBidiMap instance,
   usually by forwarding to inverseSortedBidiMap().

  returns: an inverted bidirectional map - `org.apache.commons.collections4.SortedBidiMap<V,K>`"
  (^org.apache.commons.collections4.SortedBidiMap [^SortedBidiMap this]
    (-> this (.inverseBidiMap))))

(defn value-comparator
  "Get the comparator used for the values in the value-to-key map aspect.

  returns: Comparator<? super V> - `java.util.Comparator<? super V>`"
  ([^SortedBidiMap this]
    (-> this (.valueComparator))))

