(ns org.apache.commons.collections4.iterators.ArrayListIterator
  "Implements a ListIterator over an array.

  The array can be either an array of object or of primitives. If you know
  that you have an object array, the ObjectArrayListIterator
  class is a better choice, as it will perform better.


  This iterator does not support add(Object) or ArrayIterator.remove(), as the array
  cannot be changed in size. The set(Object) method is supported however."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators ArrayListIterator]))

(defn ->array-list-iterator
  "Constructor.

  Construct an ArrayListIterator that will iterate over a range of values
   in the specified array.

  array - the array to iterate over - `java.lang.Object`
  start-index - the index to start iterating at - `int`
  end-index - the index (exclusive) to finish iterating at - `int`

  throws: java.lang.IllegalArgumentException - if end index is before the start"
  (^ArrayListIterator [^java.lang.Object array ^Integer start-index ^Integer end-index]
    (new ArrayListIterator array start-index end-index))
  (^ArrayListIterator [^java.lang.Object array ^Integer start-index]
    (new ArrayListIterator array start-index))
  (^ArrayListIterator [^java.lang.Object array]
    (new ArrayListIterator array)))

(defn has-previous?
  "Returns true if there are previous elements to return from the array.

  returns: true if there is a previous element to return - `boolean`"
  (^Boolean [^ArrayListIterator this]
    (-> this (.hasPrevious))))

(defn previous
  "Gets the previous element from the array.

  returns: the previous element - `E`

  throws: java.util.NoSuchElementException - if there is no previous element"
  ([^ArrayListIterator this]
    (-> this (.previous))))

(defn next
  "Gets the next element from the array.

  returns: the next element - `E`

  throws: java.util.NoSuchElementException - if there is no next element"
  ([^ArrayListIterator this]
    (-> this (.next))))

(defn next-index
  "Gets the next index to be retrieved.

  returns: the index of the item to be retrieved next - `int`"
  (^Integer [^ArrayListIterator this]
    (-> this (.nextIndex))))

(defn previous-index
  "Gets the index of the item to be retrieved if previous() is called.

  returns: the index of the item to be retrieved next - `int`"
  (^Integer [^ArrayListIterator this]
    (-> this (.previousIndex))))

(defn add
  "This iterator does not support modification of its backing collection, and so will
   always throw an UnsupportedOperationException when this method is invoked.

  o - the element to add - `java.lang.Object`

  throws: java.lang.UnsupportedOperationException - always thrown."
  ([^ArrayListIterator this ^java.lang.Object o]
    (-> this (.add o))))

(defn set
  "Sets the element under the cursor.

   This method sets the element that was returned by the last call
   to next() of previous().

   Note: ListIterator implementations that support
   add() and remove() only allow set() to be called
   once per call to next() or previous (see the ListIterator
   javadoc for more details). Since this implementation does
   not support add() or remove(), set() may be
   called as often as desired.

  o - the element to set - `java.lang.Object`

  throws: java.lang.IllegalStateException - if next() or previous() has not been called before set(Object)"
  ([^ArrayListIterator this ^java.lang.Object o]
    (-> this (.set o))))

(defn reset
  "Resets the iterator back to the start index."
  ([^ArrayListIterator this]
    (-> this (.reset))))

