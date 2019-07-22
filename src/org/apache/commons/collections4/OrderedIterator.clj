(ns org.apache.commons.collections4.OrderedIterator
  "Defines an iterator that operates over an ordered container. Subset of ListIterator.

  This iterator allows both forward and reverse iteration through the container."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 OrderedIterator]))

(defn has-previous?
  "Checks to see if there is a previous element that can be iterated to.

  returns: true if the iterator has a previous element - `boolean`"
  (^Boolean [^OrderedIterator this]
    (-> this (.hasPrevious))))

(defn previous
  "Gets the previous element from the container.

  returns: the previous element in the iteration - `E`

  throws: java.util.NoSuchElementException - if the iteration is finished"
  ([^OrderedIterator this]
    (-> this (.previous))))

