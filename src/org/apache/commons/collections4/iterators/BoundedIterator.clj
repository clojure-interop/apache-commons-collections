(ns org.apache.commons.collections4.iterators.BoundedIterator
  "Decorates another iterator to return elements in a specific range.

  The decorated iterator is bounded in the range [offset, offset+max).
  The offset corresponds to the position of the first element to
  be returned from the decorated iterator, and max is the maximum
  number of elements to be returned at most.

  In case an offset parameter other than 0 is provided, the decorated
  iterator is immediately advanced to this position, skipping all elements
  before that position."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators BoundedIterator]))

(defn ->bounded-iterator
  "Constructor.

  Decorates the specified iterator to return at most the given number of elements,
   skipping all elements until the iterator reaches the position at offset.

   The iterator is immediately advanced until it reaches the position at offset,
   incurring O(n) time.

  iterator - the iterator to be decorated - `java.util.Iterator`
  offset - the index of the first element of the decorated iterator to return - `long`
  max - the maximum number of elements of the decorated iterator to return - `long`

  throws: java.lang.NullPointerException - if iterator is null"
  (^BoundedIterator [^java.util.Iterator iterator ^Long offset ^Long max]
    (new BoundedIterator iterator offset max)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^BoundedIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `E`"
  ([^BoundedIterator this]
    (-> this (.next))))

(defn remove
  "In case an offset other than 0 was specified, the underlying iterator will be advanced
   to this position upon creation. A call to remove() will still result in an
   IllegalStateException if no explicit call to next() has been made prior
   to calling remove()."
  ([^BoundedIterator this]
    (-> this (.remove))))

