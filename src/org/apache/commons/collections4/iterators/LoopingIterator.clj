(ns org.apache.commons.collections4.iterators.LoopingIterator
  "An Iterator that restarts when it reaches the end.

  The iterator will loop continuously around the provided elements, unless
  there are no elements in the collection to begin with, or all the elements
  have been removed.

  Concurrent modifications are not directly supported, and for most collection
  implementations will throw a ConcurrentModificationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators LoopingIterator]))

(defn ->looping-iterator
  "Constructor.

  Constructor that wraps a collection.

   There is no way to reset an Iterator instance without recreating it from
   the original source, so the Collection must be passed in.

  coll - the collection to wrap - `java.util.Collection`

  throws: java.lang.NullPointerException - if the collection is null"
  (^LoopingIterator [^java.util.Collection coll]
    (new LoopingIterator coll)))

(defn has-next?
  "Has the iterator any more elements.

   Returns false only if the collection originally had zero elements, or
   all the elements have been removed.

  returns: true if there are more elements - `boolean`"
  (^Boolean [^LoopingIterator this]
    (-> this (.hasNext))))

(defn next
  "Returns the next object in the collection.

   If at the end of the collection, return the first element.

  returns: the next object - `E`

  throws: java.util.NoSuchElementException - if there are no elements at all. Use hasNext() to avoid this error."
  ([^LoopingIterator this]
    (-> this (.next))))

(defn remove
  "Removes the previously retrieved item from the underlying collection.

   This feature is only supported if the underlying collection's
   iterator method returns an implementation
   that supports it.

   This method can only be called after at least one next() method call.
   After a removal, the remove method may not be called again until another
   next has been performed. If the reset() is called, then remove may
   not be called until next() is called again."
  ([^LoopingIterator this]
    (-> this (.remove))))

(defn reset
  "Resets the iterator back to the start of the collection."
  ([^LoopingIterator this]
    (-> this (.reset))))

(defn size
  "Gets the size of the collection underlying the iterator.

  returns: the current collection size - `int`"
  (^Integer [^LoopingIterator this]
    (-> this (.size))))

