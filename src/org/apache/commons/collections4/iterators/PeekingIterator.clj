(ns org.apache.commons.collections4.iterators.PeekingIterator
  "Decorates an iterator to support one-element lookahead while iterating.

  The decorator supports the removal operation, but an IllegalStateException
  will be thrown if remove() is called directly after a call to
  peek() or element()."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators PeekingIterator]))

(defn ->peeking-iterator
  "Constructor.

  Constructor.

  iterator - the iterator to decorate - `java.util.Iterator`"
  (^PeekingIterator [^java.util.Iterator iterator]
    (new PeekingIterator iterator)))

(defn *peeking-iterator
  "Decorates the specified iterator to support one-element lookahead.

   If the iterator is already a PeekingIterator it is returned directly.

  iterator - the iterator to decorate - `java.util.Iterator`

  returns: a new peeking iterator - `<E> org.apache.commons.collections4.iterators.PeekingIterator<E>`

  throws: java.lang.NullPointerException - if the iterator is null"
  ([^java.util.Iterator iterator]
    (PeekingIterator/peekingIterator iterator)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^PeekingIterator this]
    (-> this (.hasNext))))

(defn peek
  "Returns the next element in iteration without advancing the underlying iterator.
   If the iterator is already exhausted, null will be returned.

   Note: this method does not throw a NoSuchElementException if the iterator
   is already exhausted. If you want such a behavior, use element() instead.

   The rationale behind this is to follow the Queue interface
   which uses the same terminology.

  returns: the next element from the iterator - `E`"
  ([^PeekingIterator this]
    (-> this (.peek))))

(defn element
  "Returns the next element in iteration without advancing the underlying iterator.
   If the iterator is already exhausted, null will be returned.

  returns: the next element from the iterator - `E`

  throws: java.util.NoSuchElementException - if the iterator is already exhausted according to hasNext()"
  ([^PeekingIterator this]
    (-> this (.element))))

(defn next
  "returns: `E`"
  ([^PeekingIterator this]
    (-> this (.next))))

(defn remove
  "throws: java.lang.IllegalStateException - if peek() or element() has been called prior to the call to remove()"
  ([^PeekingIterator this]
    (-> this (.remove))))

