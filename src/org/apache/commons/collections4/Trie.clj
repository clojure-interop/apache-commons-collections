(ns org.apache.commons.collections4.Trie
  "Defines the interface for a prefix tree, an ordered tree data structure. For
  more information, see Tries."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 Trie]))

(defn prefix-map
  "Returns a view of this Trie of all elements that are prefixed
   by the given key.

   In a Trie with fixed size keys, this is essentially a
   Map.get(Object) operation.

   For example, if the Trie contains 'Anna', 'Anael',
   'Analu', 'Andreas', 'Andrea', 'Andres', and 'Anatole', then
   a lookup of 'And' would return 'Andreas', 'Andrea', and 'Andres'.

  key - the key used in the search - `K`

  returns: a SortedMap view of this Trie with all elements whose
     key is prefixed by the search key - `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^Trie this key]
    (-> this (.prefixMap key))))

