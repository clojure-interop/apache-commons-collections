(ns org.apache.commons.collections4.iterators.SingletonListIterator
  "SingletonIterator is an ListIterator over a single
  object instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators SingletonListIterator]))

(defn ->singleton-list-iterator
  "Constructor.

  Constructs a new SingletonListIterator.

  object - the single object to return from the iterator - `E`"
  (^SingletonListIterator [object]
    (new SingletonListIterator object)))

(defn next
  "Get the next object from the iterator.

   This returns the single object if it hasn't been returned yet.

  returns: the single object - `E`

  throws: java.util.NoSuchElementException - if the single object has already been returned"
  ([^SingletonListIterator this]
    (-> this (.next))))

(defn reset
  "Reset the iterator back to the start."
  ([^SingletonListIterator this]
    (-> this (.reset))))

(defn has-previous?
  "Is a previous object available from the iterator?

   This returns true if the single object has been returned.

  returns: true if the single object has been returned - `boolean`"
  (^Boolean [^SingletonListIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "Returns the index of the element that would be returned by a subsequent
   call to previous. A return value of -1 indicates that the iterator is currently at
   the start.

  returns: 0 or -1 depending on current state. - `int`"
  (^Integer [^SingletonListIterator this]
    (-> this (.previousIndex))))

(defn previous
  "Get the previous object from the iterator.

   This returns the single object if it has been returned.

  returns: the single object - `E`

  throws: java.util.NoSuchElementException - if the single object has not already been returned"
  ([^SingletonListIterator this]
    (-> this (.previous))))

(defn remove
  "Remove the object from this iterator.

  throws: java.lang.IllegalStateException - if the next or previous method has not yet been called, or the remove method has already been called after the last call to next or previous."
  ([^SingletonListIterator this]
    (-> this (.remove))))

(defn has-next?
  "Is another object available from the iterator?

   This returns true if the single object hasn't been returned yet.

  returns: true if the single object hasn't been returned yet - `boolean`"
  (^Boolean [^SingletonListIterator this]
    (-> this (.hasNext))))

(defn add
  "Add always throws UnsupportedOperationException.

  obj - the object to add - `E`

  throws: java.lang.UnsupportedOperationException - always"
  ([^SingletonListIterator this obj]
    (-> this (.add obj))))

(defn set
  "Set sets the value of the singleton.

  obj - the object to set - `E`

  throws: java.lang.IllegalStateException - if next has not been called or the object has been removed"
  ([^SingletonListIterator this obj]
    (-> this (.set obj))))

(defn next-index
  "Returns the index of the element that would be returned by a subsequent
   call to next.

  returns: 0 or 1 depending on current state. - `int`"
  (^Integer [^SingletonListIterator this]
    (-> this (.nextIndex))))

