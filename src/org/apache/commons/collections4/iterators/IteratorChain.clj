(ns org.apache.commons.collections4.iterators.IteratorChain
  "An IteratorChain is an Iterator that wraps a number of Iterators.

  This class makes multiple iterators look like one to the caller. When any
  method from the Iterator interface is called, the IteratorChain will delegate
  to a single underlying Iterator. The IteratorChain will invoke the Iterators
  in sequence until all Iterators are exhausted.

  Under many circumstances, linking Iterators together in this manner is more
  efficient (and convenient) than reading out the contents of each Iterator
  into a List and creating a new Iterator.

  Calling a method that adds new Iterator after a method in the Iterator
  interface has been called will result in an UnsupportedOperationException.

  NOTE: As from version 3.0, the IteratorChain may contain no iterators. In
  this case the class will function as an empty iterator.

  NOTE: As from version 4.0, the IteratorChain stores the iterators in a queue
  and removes any reference to them as soon as they are not used anymore. Thus
  the methods setIterator(Iterator) and getIterators() have been
  removed and size() will return the number of remaining iterators in
  the queue."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators IteratorChain]))

(defn ->iterator-chain
  "Constructor.

  Constructs a new IteratorChain over the two given iterators.

   This method takes two iterators. The newly constructed iterator will
   iterate through each one of the input iterators in turn.

  first - the first child iterator in the IteratorChain, not null - `java.util.Iterator`
  second - the second child iterator in the IteratorChain, not null - `java.util.Iterator`

  throws: java.lang.NullPointerException - if either iterator is null"
  (^IteratorChain [^java.util.Iterator first ^java.util.Iterator second]
    (new IteratorChain first second))
  (^IteratorChain [^java.util.Iterator iterator]
    (new IteratorChain iterator))
  (^IteratorChain []
    (new IteratorChain )))

(defn add-iterator
  "Add an Iterator to the end of the chain

  iterator - Iterator to add - `java.util.Iterator`

  throws: java.lang.IllegalStateException - if I've already started iterating"
  ([^IteratorChain this ^java.util.Iterator iterator]
    (-> this (.addIterator iterator))))

(defn size
  "Returns the remaining number of Iterators in the current IteratorChain.

  returns: Iterator count - `int`"
  (^Integer [^IteratorChain this]
    (-> this (.size))))

(defn locked?
  "Determine if modifications can still be made to the IteratorChain.
   IteratorChains cannot be modified once they have executed a method from
   the Iterator interface.

  returns: true if IteratorChain cannot be modified, false if it can - `boolean`"
  (^Boolean [^IteratorChain this]
    (-> this (.isLocked))))

(defn has-next?
  "Return true if any Iterator in the IteratorChain has a remaining element.

  returns: true if elements remain - `boolean`"
  (^Boolean [^IteratorChain this]
    (-> this (.hasNext))))

(defn next
  "Returns the next Object of the current Iterator

  returns: Object from the current Iterator - `E`

  throws: java.util.NoSuchElementException - if all the Iterators are exhausted"
  ([^IteratorChain this]
    (-> this (.next))))

(defn remove
  "Removes from the underlying collection the last element returned by the
   Iterator. As with next() and hasNext(), this method calls remove() on the
   underlying Iterator. Therefore, this method may throw an
   UnsupportedOperationException if the underlying Iterator does not support
   this method.

  throws: java.lang.UnsupportedOperationException - if the remove operator is not supported by the underlying Iterator"
  ([^IteratorChain this]
    (-> this (.remove))))

