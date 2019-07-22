(ns org.apache.commons.collections4.iterators.FilterIterator
  "Decorates another Iterator using a predicate to filter elements.

  This iterator decorates the underlying iterator, only allowing through
  those elements that match the specified Predicate."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators FilterIterator]))

(defn ->filter-iterator
  "Constructor.

  Constructs a new FilterIterator that will use the
   given iterator and predicate.

  iterator - the iterator to use - `java.util.Iterator`
  predicate - the predicate to use - `org.apache.commons.collections4.Predicate`"
  (^FilterIterator [^java.util.Iterator iterator ^org.apache.commons.collections4.Predicate predicate]
    (new FilterIterator iterator predicate))
  (^FilterIterator [^java.util.Iterator iterator]
    (new FilterIterator iterator))
  (^FilterIterator []
    (new FilterIterator )))

(defn has-next?
  "Returns true if the underlying iterator contains an object that
   matches the predicate.

  returns: true if there is another object that matches the predicate - `boolean`

  throws: java.lang.NullPointerException - if either the iterator or predicate are null"
  (^Boolean [^FilterIterator this]
    (-> this (.hasNext))))

(defn next
  "Returns the next object that matches the predicate.

  returns: the next object which matches the given predicate - `E`

  throws: java.lang.NullPointerException - if either the iterator or predicate are null"
  ([^FilterIterator this]
    (-> this (.next))))

(defn remove
  "Removes from the underlying collection of the base iterator the last
   element returned by this iterator.
   This method can only be called
   if next() was called, but not after
   hasNext(), because the hasNext() call
   changes the base iterator.

  throws: java.lang.IllegalStateException - if hasNext() has already been called."
  ([^FilterIterator this]
    (-> this (.remove))))

(defn get-iterator
  "Gets the iterator this iterator is using.

  returns: the iterator - `java.util.Iterator<? extends E>`"
  ([^FilterIterator this]
    (-> this (.getIterator))))

(defn set-iterator
  "Sets the iterator for this iterator to use.
   If iteration has started, this effectively resets the iterator.

  iterator - the iterator to use - `java.util.Iterator`"
  ([^FilterIterator this ^java.util.Iterator iterator]
    (-> this (.setIterator iterator))))

(defn get-predicate
  "Gets the predicate this iterator is using.

  returns: the predicate - `org.apache.commons.collections4.Predicate<? super E>`"
  ([^FilterIterator this]
    (-> this (.getPredicate))))

(defn set-predicate
  "Sets the predicate this the iterator to use.

  predicate - the predicate to use - `org.apache.commons.collections4.Predicate`"
  ([^FilterIterator this ^org.apache.commons.collections4.Predicate predicate]
    (-> this (.setPredicate predicate))))

