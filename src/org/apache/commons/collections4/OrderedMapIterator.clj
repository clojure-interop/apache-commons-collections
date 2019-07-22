(ns org.apache.commons.collections4.OrderedMapIterator
  "Defines an iterator that operates over an ordered Map.

  This iterator allows both forward and reverse iteration through the map."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 OrderedMapIterator]))

(defn has-previous?
  "Checks to see if there is a previous entry that can be iterated to.

  returns: true if the iterator has a previous element - `boolean`"
  (^Boolean [^OrderedMapIterator this]
    (-> this (.hasPrevious))))

(defn previous
  "Gets the previous key from the Map.

  returns: the previous key in the iteration - `K`

  throws: java.util.NoSuchElementException - if the iteration is finished"
  ([^OrderedMapIterator this]
    (-> this (.previous))))

