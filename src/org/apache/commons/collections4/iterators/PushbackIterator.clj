(ns org.apache.commons.collections4.iterators.PushbackIterator
  "Decorates an iterator to support pushback of elements.

  The decorator stores the pushed back elements in a LIFO manner: the last element
  that has been pushed back, will be returned as the next element in a call to next().

  The decorator does not support the removal operation. Any call to remove() will
  result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators PushbackIterator]))

(defn ->pushback-iterator
  "Constructor.

  Constructor.

  iterator - the iterator to decorate - `java.util.Iterator`"
  (^PushbackIterator [^java.util.Iterator iterator]
    (new PushbackIterator iterator)))

(defn *pushback-iterator
  "Decorates the specified iterator to support one-element lookahead.

   If the iterator is already a PushbackIterator it is returned directly.

  iterator - the iterator to decorate - `java.util.Iterator`

  returns: a new peeking iterator - `<E> org.apache.commons.collections4.iterators.PushbackIterator<E>`

  throws: java.lang.NullPointerException - if the iterator is null"
  ([^java.util.Iterator iterator]
    (PushbackIterator/pushbackIterator iterator)))

(defn pushback
  "Push back the given element to the iterator.

   Calling next() immediately afterwards will return exactly this element.

  item - the element to push back to the iterator - `E`"
  ([^PushbackIterator this item]
    (-> this (.pushback item))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^PushbackIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `E`"
  ([^PushbackIterator this]
    (-> this (.next))))

(defn remove
  "This iterator will always throw an UnsupportedOperationException.

  throws: java.lang.UnsupportedOperationException - always"
  ([^PushbackIterator this]
    (-> this (.remove))))

