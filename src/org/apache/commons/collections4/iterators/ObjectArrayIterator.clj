(ns org.apache.commons.collections4.iterators.ObjectArrayIterator
  "An Iterator over an array of objects.

  This iterator does not support remove(), as the object array cannot be
  structurally modified.

  The iterator implements a reset() method, allowing the reset of the iterator
  back to the start if required."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators ObjectArrayIterator]))

(defn ->object-array-iterator
  "Constructor.

  Construct an ObjectArrayIterator that will iterate over a range of values
   in the specified array.

  array - the array to iterate over - `E[]`
  start - the index to start iterating at - `int`
  end - the index (exclusive) to finish iterating at - `int`

  throws: java.lang.IndexOutOfBoundsException - if the start or end index is out of bounds"
  (^ObjectArrayIterator [array ^Integer start ^Integer end]
    (new ObjectArrayIterator array start end))
  (^ObjectArrayIterator [array ^Integer start]
    (new ObjectArrayIterator array start))
  (^ObjectArrayIterator [array]
    (new ObjectArrayIterator array)))

(defn has-next?
  "Returns true if there are more elements to return from the array.

  returns: true if there is a next element to return - `boolean`"
  (^Boolean [^ObjectArrayIterator this]
    (-> this (.hasNext))))

(defn next
  "Returns the next element in the array.

  returns: the next element in the array - `E`

  throws: java.util.NoSuchElementException - if all the elements in the array have already been returned"
  ([^ObjectArrayIterator this]
    (-> this (.next))))

(defn remove
  "Throws UnsupportedOperationException.

  throws: java.lang.UnsupportedOperationException - always"
  ([^ObjectArrayIterator this]
    (-> this (.remove))))

(defn get-array
  "Gets the array that this iterator is iterating over.

  returns: the array this iterator iterates over - `E[]`"
  ([^ObjectArrayIterator this]
    (-> this (.getArray))))

(defn get-start-index
  "Gets the start index to loop from.

  returns: the start index - `int`"
  (^Integer [^ObjectArrayIterator this]
    (-> this (.getStartIndex))))

(defn get-end-index
  "Gets the end index to loop to.

  returns: the end index - `int`"
  (^Integer [^ObjectArrayIterator this]
    (-> this (.getEndIndex))))

(defn reset
  "Resets the iterator back to the start index."
  ([^ObjectArrayIterator this]
    (-> this (.reset))))

