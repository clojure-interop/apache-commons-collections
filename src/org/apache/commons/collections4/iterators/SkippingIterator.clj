(ns org.apache.commons.collections4.iterators.SkippingIterator
  "Decorates another iterator to skip the first N elements.

  In case an offset parameter other than 0 is provided, the decorated
  iterator is immediately advanced to this position, skipping all elements
  before that position."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators SkippingIterator]))

(defn ->skipping-iterator
  "Constructor.

  Decorates the specified iterator to skip all elements until the iterator
   reaches the position at offset.

   The iterator is immediately advanced until it reaches the position at offset,
   incurring O(n) time.

  iterator - the iterator to be decorated - `java.util.Iterator`
  offset - the index of the first element of the decorated iterator to return - `long`

  throws: java.lang.NullPointerException - if iterator is null"
  (^SkippingIterator [^java.util.Iterator iterator ^Long offset]
    (new SkippingIterator iterator offset)))

(defn next
  "Description copied from class: AbstractIteratorDecorator

  returns: `E`"
  ([^SkippingIterator this]
    (-> this (.next))))

(defn remove
  "In case an offset other than 0 was specified, the underlying iterator will be advanced
   to this position upon creation. A call to remove() will still result in an
   IllegalStateException if no explicit call to next() has been made prior
   to calling remove()."
  ([^SkippingIterator this]
    (-> this (.remove))))

