(ns org.apache.commons.collections4.iterators.FilterListIterator
  "Decorates another ListIterator using a predicate to filter elements.

  This iterator decorates the underlying iterator, only allowing through
  those elements that match the specified Predicate."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators FilterListIterator]))

(defn ->filter-list-iterator
  "Constructor.

  Constructs a new FilterListIterator.

  iterator - the iterator to use - `java.util.ListIterator`
  predicate - the predicate to use - `org.apache.commons.collections4.Predicate`"
  (^FilterListIterator [^java.util.ListIterator iterator ^org.apache.commons.collections4.Predicate predicate]
    (new FilterListIterator iterator predicate))
  (^FilterListIterator [^java.util.ListIterator iterator]
    (new FilterListIterator iterator))
  (^FilterListIterator []
    (new FilterListIterator )))

(defn next
  "returns: `E`"
  ([^FilterListIterator this]
    (-> this (.next))))

(defn get-list-iterator
  "Gets the iterator this iterator is using.

  returns: the iterator. - `java.util.ListIterator<? extends E>`"
  ([^FilterListIterator this]
    (-> this (.getListIterator))))

(defn has-previous?
  "returns: `boolean`"
  (^Boolean [^FilterListIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "returns: `int`"
  (^Integer [^FilterListIterator this]
    (-> this (.previousIndex))))

(defn previous
  "returns: `E`"
  ([^FilterListIterator this]
    (-> this (.previous))))

(defn remove
  "Not supported."
  ([^FilterListIterator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^FilterListIterator this]
    (-> this (.hasNext))))

(defn set-predicate
  "Sets the predicate this the iterator to use.

  predicate - the transformer to use - `org.apache.commons.collections4.Predicate`"
  ([^FilterListIterator this ^org.apache.commons.collections4.Predicate predicate]
    (-> this (.setPredicate predicate))))

(defn add
  "Not supported.

  o - the element to insert - `E`"
  ([^FilterListIterator this o]
    (-> this (.add o))))

(defn set
  "Not supported.

  o - the element with which to replace the last element returned by next or previous - `E`"
  ([^FilterListIterator this o]
    (-> this (.set o))))

(defn next-index
  "returns: `int`"
  (^Integer [^FilterListIterator this]
    (-> this (.nextIndex))))

(defn get-predicate
  "Gets the predicate this iterator is using.

  returns: the predicate. - `org.apache.commons.collections4.Predicate<? super E>`"
  ([^FilterListIterator this]
    (-> this (.getPredicate))))

(defn set-list-iterator
  "Sets the iterator for this iterator to use.
   If iteration has started, this effectively resets the iterator.

  iterator - the iterator to use - `java.util.ListIterator`"
  ([^FilterListIterator this ^java.util.ListIterator iterator]
    (-> this (.setListIterator iterator))))

