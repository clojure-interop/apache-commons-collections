(ns org.apache.commons.collections4.iterators.UnmodifiableIterator
  "Decorates an iterator such that it cannot be modified.

  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators UnmodifiableIterator]))

(defn *unmodifiable-iterator
  "Decorates the specified iterator such that it cannot be modified.

   If the iterator is already unmodifiable it is returned directly.

  iterator - the iterator to decorate - `java.util.Iterator`

  returns: a new unmodifiable iterator - `<E> java.util.Iterator<E>`

  throws: java.lang.NullPointerException - if the iterator is null"
  ([^java.util.Iterator iterator]
    (UnmodifiableIterator/unmodifiableIterator iterator)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UnmodifiableIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `E`"
  ([^UnmodifiableIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^UnmodifiableIterator this]
    (-> this (.remove))))

