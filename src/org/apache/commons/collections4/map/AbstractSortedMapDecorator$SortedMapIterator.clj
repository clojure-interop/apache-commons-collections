(ns org.apache.commons.collections4.map.AbstractSortedMapDecorator$SortedMapIterator
  "OrderedMapIterator implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractSortedMapDecorator$SortedMapIterator]))

(defn reset
  "Resets the iterator back to the position at which the iterator
   was created."
  ([^AbstractSortedMapDecorator$SortedMapIterator this]
    (-> this (.reset))))

(defn has-previous?
  "Checks to see if there is a previous entry that can be iterated to.

  returns: true if the iterator has a previous element - `boolean`"
  (^Boolean [^AbstractSortedMapDecorator$SortedMapIterator this]
    (-> this (.hasPrevious))))

(defn previous
  "Gets the previous key from the Map.

  returns: the previous key in the iteration - `K`"
  ([^AbstractSortedMapDecorator$SortedMapIterator this]
    (-> this (.previous))))

