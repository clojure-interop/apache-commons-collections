(ns org.apache.commons.collections4.iterators.SingletonIterator
  "SingletonIterator is an Iterator over a single
  object instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators SingletonIterator]))

(defn ->singleton-iterator
  "Constructor.

  Constructs a new SingletonIterator optionally choosing if
   remove is a permitted operation.

  object - the single object to return from the iterator - `E`
  remove-allowed - true if remove is allowed - `boolean`"
  (^SingletonIterator [object ^Boolean remove-allowed]
    (new SingletonIterator object remove-allowed))
  (^SingletonIterator [object]
    (new SingletonIterator object)))

(defn has-next?
  "Is another object available from the iterator?

   This returns true if the single object hasn't been returned yet.

  returns: true if the single object hasn't been returned yet - `boolean`"
  (^Boolean [^SingletonIterator this]
    (-> this (.hasNext))))

(defn next
  "Get the next object from the iterator.

   This returns the single object if it hasn't been returned yet.

  returns: the single object - `E`

  throws: java.util.NoSuchElementException - if the single object has already been returned"
  ([^SingletonIterator this]
    (-> this (.next))))

(defn remove
  "Remove the object from this iterator.

  throws: java.lang.IllegalStateException - if the next method has not yet been called, or the remove method has already been called after the last call to the next method."
  ([^SingletonIterator this]
    (-> this (.remove))))

(defn reset
  "Reset the iterator to the start."
  ([^SingletonIterator this]
    (-> this (.reset))))

