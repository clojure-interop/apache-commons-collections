(ns org.apache.commons.collections4.iterators.LazyIteratorChain
  "An LazyIteratorChain is an Iterator that wraps a number of Iterators in a lazy manner.

  This class makes multiple iterators look like one to the caller. When any
  method from the Iterator interface is called, the LazyIteratorChain will delegate
  to a single underlying Iterator. The LazyIteratorChain will invoke the Iterators
  in sequence until all Iterators are exhausted.

  The Iterators are provided by nextIterator(int) which has to be overridden by
  sub-classes and allows to lazily create the Iterators as they are accessed:


  return new LazyIteratorChain<String>() {
      protected Iterator<String> nextIterator(int count) {
          return count == 1 ? Arrays.asList(\"foo\", \"bar\").iterator() : null;
      }
  };

  Once the inner Iterator's Iterator.hasNext() method returns false,
  nextIterator(int) will be called to obtain another iterator, and so on
  until nextIterator(int) returns null, indicating that the chain is exhausted.

  NOTE: The LazyIteratorChain may contain no iterators. In this case the class will
  function as an empty iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators LazyIteratorChain]))

(defn ->lazy-iterator-chain
  "Constructor."
  (^LazyIteratorChain []
    (new LazyIteratorChain )))

(defn has-next?
  "Return true if any Iterator in the chain has a remaining element.

  returns: true if elements remain - `boolean`"
  (^Boolean [^LazyIteratorChain this]
    (-> this (.hasNext))))

(defn next
  "Returns the next element of the current Iterator

  returns: element from the current Iterator - `E`

  throws: java.util.NoSuchElementException - if all the Iterators are exhausted"
  ([^LazyIteratorChain this]
    (-> this (.next))))

(defn remove
  "Removes from the underlying collection the last element returned by the Iterator.

   As with next() and hasNext(), this method calls remove() on the underlying Iterator.
   Therefore, this method may throw an UnsupportedOperationException if the underlying
   Iterator does not support this method.

  throws: java.lang.UnsupportedOperationException - if the remove operator is not supported by the underlying Iterator"
  ([^LazyIteratorChain this]
    (-> this (.remove))))

