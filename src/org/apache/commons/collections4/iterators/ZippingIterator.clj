(ns org.apache.commons.collections4.iterators.ZippingIterator
  "Provides an interleaved iteration over the elements contained in a
  collection of Iterators.

  Given two Iterator instances A and B, the
  next() method on this iterator will switch between A.next()
  and B.next() until both iterators are exhausted."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators ZippingIterator]))

(defn ->zipping-iterator
  "Constructor.

  Constructs a new ZippingIterator that will provide
   interleaved iteration over the three given iterators.

  a - the first child iterator - `java.util.Iterator`
  b - the second child iterator - `java.util.Iterator`
  c - the third child iterator - `java.util.Iterator`

  throws: java.lang.NullPointerException - if either iterator is null"
  (^ZippingIterator [^java.util.Iterator a ^java.util.Iterator b ^java.util.Iterator c]
    (new ZippingIterator a b c))
  (^ZippingIterator [^java.util.Iterator a ^java.util.Iterator b]
    (new ZippingIterator a b))
  (^ZippingIterator [^java.util.Iterator iterators]
    (new ZippingIterator iterators)))

(defn has-next?
  "Returns true if any child iterator has remaining elements.

  returns: true if this iterator has remaining elements - `boolean`"
  (^Boolean [^ZippingIterator this]
    (-> this (.hasNext))))

(defn next
  "Returns the next element from a child iterator.

  returns: the next interleaved element - `E`

  throws: java.util.NoSuchElementException - if no child iterator has any more elements"
  ([^ZippingIterator this]
    (-> this (.next))))

(defn remove
  "Removes the last returned element from the child iterator that produced it.

  throws: java.lang.IllegalStateException - if there is no last returned element, or if the last returned element has already been removed"
  ([^ZippingIterator this]
    (-> this (.remove))))

