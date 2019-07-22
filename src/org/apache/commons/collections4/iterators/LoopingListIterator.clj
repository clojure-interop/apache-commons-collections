(ns org.apache.commons.collections4.iterators.LoopingListIterator
  "A ListIterator that restarts when it reaches the end or when it
  reaches the beginning.

  The iterator will loop continuously around the provided list,
  unless there are no elements in the collection to begin with, or
  all of the elements have been removed.

  Concurrent modifications are not directly supported, and for most
  collection implementations will throw a
  ConcurrentModificationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators LoopingListIterator]))

(defn ->looping-list-iterator
  "Constructor.

  Constructor that wraps a list.

   There is no way to reset a ListIterator instance without
   recreating it from the original source, so the List must be
   passed in and a reference to it held.

  list - the list to wrap - `java.util.List`

  throws: java.lang.NullPointerException - if the list it null"
  (^LoopingListIterator [^java.util.List list]
    (new LoopingListIterator list)))

(defn next
  "Returns the next object in the list.

   If at the end of the list, returns the first element.

  returns: the object after the last element returned - `E`

  throws: java.util.NoSuchElementException - if there are no elements in the list"
  ([^LoopingListIterator this]
    (-> this (.next))))

(defn reset
  "Resets the iterator back to the start of the list."
  ([^LoopingListIterator this]
    (-> this (.reset))))

(defn has-previous?
  "Returns whether this iterator has any more previous elements.

   Returns false only if the list originally had zero elements, or
   all elements have been removed.

  returns: true if there are more elements - `boolean`"
  (^Boolean [^LoopingListIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "Returns the index of the element that would be returned by a
   subsequent call to previous().

   As would be expected, if at the iterator is at the physical
   beginning of the underlying list, the list's size minus one is
   returned, signifying the end of the list.

  returns: the index of the element that would be returned if previous() were called - `int`

  throws: java.util.NoSuchElementException - if there are no elements in the list"
  (^Integer [^LoopingListIterator this]
    (-> this (.previousIndex))))

(defn previous
  "Returns the previous object in the list.

   If at the beginning of the list, return the last element. Note
   that in this case, traversal to find that element takes linear time.

  returns: the object before the last element returned - `E`

  throws: java.util.NoSuchElementException - if there are no elements in the list"
  ([^LoopingListIterator this]
    (-> this (.previous))))

(defn remove
  "Removes the previously retrieved item from the underlying list.

   This feature is only supported if the underlying list's
   iterator method returns an implementation
   that supports it.

   This method can only be called after at least one next()
   or previous() method call. After a removal, the remove
   method may not be called again until another next() or
   previous() has been performed. If the reset() is
   called, then remove may not be called until next() or
   previous() is called again.

  throws: java.lang.UnsupportedOperationException - if the remove method is not supported by the iterator implementation of the underlying list"
  ([^LoopingListIterator this]
    (-> this (.remove))))

(defn has-next?
  "Returns whether this iterator has any more elements.

   Returns false only if the list originally had zero elements, or
   all elements have been removed.

  returns: true if there are more elements - `boolean`"
  (^Boolean [^LoopingListIterator this]
    (-> this (.hasNext))))

(defn add
  "Inserts the specified element into the underlying list.

   The element is inserted before the next element that would be
   returned by next(), if any, and after the next element
   that would be returned by previous(), if any.

   This feature is only supported if the underlying list's
   List.listIterator() method returns an implementation
   that supports it.

  obj - the element to insert - `E`

  throws: java.lang.UnsupportedOperationException - if the add method is not supported by the iterator implementation of the underlying list"
  ([^LoopingListIterator this obj]
    (-> this (.add obj))))

(defn set
  "Replaces the last element that was returned by next() or
   previous().

   This feature is only supported if the underlying list's
   List.listIterator() method returns an implementation
   that supports it.

  obj - the element with which to replace the last element returned - `E`

  throws: java.lang.UnsupportedOperationException - if the set method is not supported by the iterator implementation of the underlying list"
  ([^LoopingListIterator this obj]
    (-> this (.set obj))))

(defn size
  "Gets the size of the list underlying the iterator.

  returns: the current list size - `int`"
  (^Integer [^LoopingListIterator this]
    (-> this (.size))))

(defn next-index
  "Returns the index of the element that would be returned by a
   subsequent call to next().

   As would be expected, if the iterator is at the physical end of
   the underlying list, 0 is returned, signifying the beginning of
   the list.

  returns: the index of the element that would be returned if next() were called - `int`

  throws: java.util.NoSuchElementException - if there are no elements in the list"
  (^Integer [^LoopingListIterator this]
    (-> this (.nextIndex))))

