(ns org.apache.commons.collections4.iterators.ListIteratorWrapper
  "Converts an Iterator into a ResettableListIterator.
  For plain Iterators this is accomplished by caching the returned
  elements.  This class can also be used to simply add
  ResettableIterator
  functionality to a given ListIterator.

  The ListIterator interface has additional useful methods
  for navigation - previous() and the index methods.
  This class allows a regular Iterator to behave as a
  ListIterator. It achieves this by building a list internally
  of as the underlying iterator is traversed.

  The optional operations of ListIterator are not supported for plain Iterators.

  This class implements ResettableListIterator from Commons Collections 3.2."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators ListIteratorWrapper]))

(defn ->list-iterator-wrapper
  "Constructor.

  Constructs a new ListIteratorWrapper that will wrap
   the given iterator.

  iterator - the iterator to wrap - `java.util.Iterator`

  throws: java.lang.NullPointerException - if the iterator is null"
  (^ListIteratorWrapper [^java.util.Iterator iterator]
    (new ListIteratorWrapper iterator)))

(defn next
  "Returns the next element from the iterator.

  returns: the next element from the iterator - `E`

  throws: java.util.NoSuchElementException - if there are no more elements"
  ([^ListIteratorWrapper this]
    (-> this (.next))))

(defn reset
  "Resets this iterator back to the position at which the iterator
   was created."
  ([^ListIteratorWrapper this]
    (-> this (.reset))))

(defn has-previous?
  "Returns true if there are previous elements in the iterator.

  returns: true if there are previous elements - `boolean`"
  (^Boolean [^ListIteratorWrapper this]
    (-> this (.hasPrevious))))

(defn previous-index
  "Returns the index of the previous element.

  returns: the index of the previous element - `int`"
  (^Integer [^ListIteratorWrapper this]
    (-> this (.previousIndex))))

(defn previous
  "Returns the previous element.

  returns: the previous element - `E`

  throws: java.util.NoSuchElementException - if there are no previous elements"
  ([^ListIteratorWrapper this]
    (-> this (.previous))))

(defn remove
  "Throws UnsupportedOperationException if previous() has ever been called.

  throws: java.lang.UnsupportedOperationException - always"
  ([^ListIteratorWrapper this]
    (-> this (.remove))))

(defn has-next?
  "Returns true if there are more elements in the iterator.

  returns: true if there are more elements - `boolean`"
  (^Boolean [^ListIteratorWrapper this]
    (-> this (.hasNext))))

(defn add
  "Throws UnsupportedOperationException
   unless the underlying Iterator is a ListIterator.

  obj - the object to add - `E`

  throws: java.lang.UnsupportedOperationException - if the underlying iterator is not of type ListIterator"
  ([^ListIteratorWrapper this obj]
    (-> this (.add obj))))

(defn set
  "Throws UnsupportedOperationException
   unless the underlying Iterator is a ListIterator.

  obj - the object to set - `E`

  throws: java.lang.UnsupportedOperationException - if the underlying iterator is not of type ListIterator"
  ([^ListIteratorWrapper this obj]
    (-> this (.set obj))))

(defn next-index
  "Returns the index of the next element.

  returns: the index of the next element - `int`"
  (^Integer [^ListIteratorWrapper this]
    (-> this (.nextIndex))))

