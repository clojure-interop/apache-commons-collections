(ns org.apache.commons.collections4.iterators.ArrayIterator
  "Implements an Iterator over any array.

  The array can be either an array of object or of primitives. If you know
  that you have an object array, the
  ObjectArrayIterator
  class is a better choice, as it will perform better.

  The iterator implements a reset() method, allowing the reset of
  the iterator back to the start if required."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators ArrayIterator]))

(defn ->array-iterator
  "Constructor.

  Construct an ArrayIterator that will iterate over a range of values
   in the specified array.

  array - the array to iterate over. - `java.lang.Object`
  start-index - the index to start iterating at. - `int`
  end-index - the index to finish iterating at. - `int`

  throws: java.lang.IllegalArgumentException - if array is not an array."
  (^ArrayIterator [^java.lang.Object array ^Integer start-index ^Integer end-index]
    (new ArrayIterator array start-index end-index))
  (^ArrayIterator [^java.lang.Object array ^Integer start-index]
    (new ArrayIterator array start-index))
  (^ArrayIterator [^java.lang.Object array]
    (new ArrayIterator array)))

(defn has-next?
  "Returns true if there are more elements to return from the array.

  returns: true if there is a next element to return - `boolean`"
  (^Boolean [^ArrayIterator this]
    (-> this (.hasNext))))

(defn next
  "Returns the next element in the array.

  returns: the next element in the array - `E`

  throws: java.util.NoSuchElementException - if all the elements in the array have already been returned"
  ([^ArrayIterator this]
    (-> this (.next))))

(defn remove
  "Throws UnsupportedOperationException.

  throws: java.lang.UnsupportedOperationException - always"
  ([^ArrayIterator this]
    (-> this (.remove))))

(defn get-array
  "Gets the array that this iterator is iterating over.

  returns: the array this iterator iterates over. - `java.lang.Object`"
  (^java.lang.Object [^ArrayIterator this]
    (-> this (.getArray))))

(defn get-start-index
  "Gets the start index to loop from.

  returns: the start index - `int`"
  (^Integer [^ArrayIterator this]
    (-> this (.getStartIndex))))

(defn get-end-index
  "Gets the end index to loop to.

  returns: the end index - `int`"
  (^Integer [^ArrayIterator this]
    (-> this (.getEndIndex))))

(defn reset
  "Resets the iterator back to the start index."
  ([^ArrayIterator this]
    (-> this (.reset))))

