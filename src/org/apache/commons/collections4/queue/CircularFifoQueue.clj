(ns org.apache.commons.collections4.queue.CircularFifoQueue
  "CircularFifoQueue is a first-in first-out queue with a fixed size that
  replaces its oldest element if full.

  The removal order of a CircularFifoQueue is based on the
  insertion order; elements are removed in the same order in which they
  were added.  The iteration order is the same as the removal order.


  The add(Object), remove(), peek(), poll(),
  offer(Object) operations all perform in constant time.
  All other operations perform in linear time or worse.


  This queue prevents null objects from being added."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.queue CircularFifoQueue]))

(defn ->circular-fifo-queue
  "Constructor.

  Constructor that creates a queue with the specified size.

  size - the size of the queue (cannot be changed) - `int`

  throws: java.lang.IllegalArgumentException - if the size is < 1"
  (^CircularFifoQueue [^Integer size]
    (new CircularFifoQueue size))
  (^CircularFifoQueue []
    (new CircularFifoQueue )))

(defn peek
  "returns: `E`"
  ([^CircularFifoQueue this]
    (-> this (.peek))))

(defn at-full-capacity?
  "Returns true if the capacity limit of this queue has been reached,
   i.e. the number of elements stored in the queue equals its maximum size.

  returns: true if the capacity limit has been reached, false otherwise - `boolean`"
  (^Boolean [^CircularFifoQueue this]
    (-> this (.isAtFullCapacity))))

(defn offer
  "Adds the given element to this queue. If the queue is full, the least recently added
   element is discarded so that a new element can be inserted.

  element - the element to add - `E`

  returns: true, always - `boolean`

  throws: java.lang.NullPointerException - if the given element is null"
  (^Boolean [^CircularFifoQueue this element]
    (-> this (.offer element))))

(defn iterator
  "Returns an iterator over this queue's elements.

  returns: an iterator over this queue's elements - `java.util.Iterator<E>`"
  (^java.util.Iterator [^CircularFifoQueue this]
    (-> this (.iterator))))

(defn element
  "returns: `E`"
  ([^CircularFifoQueue this]
    (-> this (.element))))

(defn remove
  "returns: `E`"
  ([^CircularFifoQueue this]
    (-> this (.remove))))

(defn poll
  "returns: `E`"
  ([^CircularFifoQueue this]
    (-> this (.poll))))

(defn full?
  "Returns true if this collection is full and no new elements can be added.

   A CircularFifoQueue can never be full, thus this returns always
   false.

  returns: always returns false - `boolean`"
  (^Boolean [^CircularFifoQueue this]
    (-> this (.isFull))))

(defn add
  "Adds the given element to this queue. If the queue is full, the least recently added
   element is discarded so that a new element can be inserted.

  element - the element to add - `E`

  returns: true, always - `boolean`

  throws: java.lang.NullPointerException - if the given element is null"
  (^Boolean [^CircularFifoQueue this element]
    (-> this (.add element))))

(defn empty?
  "Returns true if this queue is empty; false otherwise.

  returns: true if this queue is empty - `boolean`"
  (^Boolean [^CircularFifoQueue this]
    (-> this (.isEmpty))))

(defn size
  "Returns the number of elements stored in the queue.

  returns: this queue's size - `int`"
  (^Integer [^CircularFifoQueue this]
    (-> this (.size))))

(defn clear
  "Clears this queue."
  ([^CircularFifoQueue this]
    (-> this (.clear))))

(defn max-size
  "Gets the maximum size of the collection (the bound).

  returns: the maximum number of elements the collection can hold - `int`"
  (^Integer [^CircularFifoQueue this]
    (-> this (.maxSize))))

(defn get
  "Returns the element at the specified position in this queue.

  index - the position of the element in the queue - `int`

  returns: the element at position index - `E`

  throws: java.util.NoSuchElementException - if the requested position is outside the range [0, size)"
  ([^CircularFifoQueue this ^Integer index]
    (-> this (.get index))))

