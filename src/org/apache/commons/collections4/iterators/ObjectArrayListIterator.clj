(ns org.apache.commons.collections4.iterators.ObjectArrayListIterator
  "Implements a ListIterator over an array of objects.

  This iterator does not support add(E) or ObjectArrayIterator.remove(), as the object array
  cannot be structurally modified. The set(E) method is supported however.

  The iterator implements a reset() method, allowing the reset of the iterator
  back to the start if required."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators ObjectArrayListIterator]))

(defn ->object-array-list-iterator
  "Constructor.

  Construct an ObjectArrayListIterator that will iterate over a range of values
   in the specified array.

  array - the array to iterate over - `E[]`
  start - the index to start iterating at - `int`
  end - the index (exclusive) to finish iterating at - `int`

  throws: java.lang.IndexOutOfBoundsException - if the start or end index is out of bounds"
  (^ObjectArrayListIterator [array ^Integer start ^Integer end]
    (new ObjectArrayListIterator array start end))
  (^ObjectArrayListIterator [array ^Integer start]
    (new ObjectArrayListIterator array start))
  (^ObjectArrayListIterator [array]
    (new ObjectArrayListIterator array)))

(defn has-previous?
  "Returns true if there are previous elements to return from the array.

  returns: true if there is a previous element to return - `boolean`"
  (^Boolean [^ObjectArrayListIterator this]
    (-> this (.hasPrevious))))

(defn previous
  "Gets the previous element from the array.

  returns: the previous element - `E`

  throws: java.util.NoSuchElementException - if there is no previous element"
  ([^ObjectArrayListIterator this]
    (-> this (.previous))))

(defn next
  "Gets the next element from the array.

  returns: the next element - `E`

  throws: java.util.NoSuchElementException - if there is no next element"
  ([^ObjectArrayListIterator this]
    (-> this (.next))))

(defn next-index
  "Gets the next index to be retrieved.

  returns: the index of the item to be retrieved next - `int`"
  (^Integer [^ObjectArrayListIterator this]
    (-> this (.nextIndex))))

(defn previous-index
  "Gets the index of the item to be retrieved if previous() is called.

  returns: the index of the item to be retrieved next - `int`"
  (^Integer [^ObjectArrayListIterator this]
    (-> this (.previousIndex))))

(defn add
  "This iterator does not support modification of its backing array's size, and so will
   always throw an UnsupportedOperationException when this method is invoked.

  obj - the object to add - `E`

  throws: java.lang.UnsupportedOperationException - always thrown."
  ([^ObjectArrayListIterator this obj]
    (-> this (.add obj))))

(defn set
  "Sets the element under the cursor.

   This method sets the element that was returned by the last call
   to next() of previous().

   Note: ListIterator implementations that support add()
   and remove() only allow set() to be called once per call
   to next() or previous (see the ListIterator
   javadoc for more details). Since this implementation does not support
   add() or remove(), set() may be
   called as often as desired.

  obj - the object to set into the array - `E`

  throws: java.lang.IllegalStateException - if next() has not yet been called."
  ([^ObjectArrayListIterator this obj]
    (-> this (.set obj))))

(defn reset
  "Resets the iterator back to the start index."
  ([^ObjectArrayListIterator this]
    (-> this (.reset))))

