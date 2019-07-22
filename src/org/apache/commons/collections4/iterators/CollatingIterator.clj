(ns org.apache.commons.collections4.iterators.CollatingIterator
  "Provides an ordered iteration over the elements contained in a collection of
  ordered Iterators.

  Given two ordered Iterator instances A and
  B, the next() method on this iterator will return the
  lesser of A.next() and B.next()."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators CollatingIterator]))

(defn ->collating-iterator
  "Constructor.

  Constructs a new CollatingIterator that will use the
   specified comparator to provide ordered iteration over the two given
   iterators.

  comp - the comparator to use to sort; must not be null, unless you'll be invoking setComparator(Comparator) later on. - `java.util.Comparator`
  a - the first child ordered iterator - `java.util.Iterator`
  b - the second child ordered iterator - `java.util.Iterator`

  throws: java.lang.NullPointerException - if either iterator is null"
  (^CollatingIterator [^java.util.Comparator comp ^java.util.Iterator a ^java.util.Iterator b]
    (new CollatingIterator comp a b))
  (^CollatingIterator [^java.util.Comparator comp ^Integer init-iter-capacity]
    (new CollatingIterator comp init-iter-capacity))
  (^CollatingIterator [^java.util.Comparator comp]
    (new CollatingIterator comp))
  (^CollatingIterator []
    (new CollatingIterator )))

(defn add-iterator
  "Adds the given Iterator to the iterators being collated.

  iterator - the iterator to add to the collation, must not be null - `java.util.Iterator`

  throws: java.lang.IllegalStateException - if iteration has started"
  ([^CollatingIterator this ^java.util.Iterator iterator]
    (-> this (.addIterator iterator))))

(defn next
  "Returns the next ordered element from a child iterator.

  returns: the next ordered element - `E`

  throws: java.util.NoSuchElementException - if no child iterator has any more elements"
  ([^CollatingIterator this]
    (-> this (.next))))

(defn get-iterator-index
  "Returns the index of the iterator that returned the last element.

  returns: the index of the iterator that returned the last element - `int`

  throws: java.lang.IllegalStateException - if there is no last returned element"
  (^Integer [^CollatingIterator this]
    (-> this (.getIteratorIndex))))

(defn set-comparator
  "Sets the Comparator by which collation occurs. If you
   would like to use the natural sort order (or, in other words,
   if the elements in the iterators are implementing the
   Comparable interface), then use the
   ComparableComparator.

  comp - the Comparator to set - `java.util.Comparator`

  throws: java.lang.IllegalStateException - if iteration has started"
  ([^CollatingIterator this ^java.util.Comparator comp]
    (-> this (.setComparator comp))))

(defn remove
  "Removes the last returned element from the child iterator that produced it.

  throws: java.lang.IllegalStateException - if there is no last returned element, or if the last returned element has already been removed"
  ([^CollatingIterator this]
    (-> this (.remove))))

(defn has-next?
  "Returns true if any child iterator has remaining elements.

  returns: true if this iterator has remaining elements - `boolean`"
  (^Boolean [^CollatingIterator this]
    (-> this (.hasNext))))

(defn get-comparator
  "Gets the Comparator by which collatation occurs.

  returns: the Comparator - `java.util.Comparator<? super E>`"
  ([^CollatingIterator this]
    (-> this (.getComparator))))

(defn set-iterator
  "Sets the iterator at the given index.

  index - index of the Iterator to replace - `int`
  iterator - Iterator to place at the given index - `java.util.Iterator`

  throws: java.lang.IndexOutOfBoundsException - if index < 0 or index > size()"
  ([^CollatingIterator this ^Integer index ^java.util.Iterator iterator]
    (-> this (.setIterator index iterator))))

(defn get-iterators
  "Gets the list of Iterators (unmodifiable).

  returns: the unmodifiable list of iterators added - `java.util.List<java.util.Iterator<? extends E>>`"
  ([^CollatingIterator this]
    (-> this (.getIterators))))

