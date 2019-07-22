(ns org.apache.commons.collections4.iterators.EmptyIterator
  "Provides an implementation of an empty iterator.

  This class provides an implementation of an empty iterator.
  This class provides for binary compatibility between Commons Collections
  2.1.1 and 3.1 due to issues with IteratorUtils."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators EmptyIterator]))

(def *-resettable-instance
  "Static Constant.

  Singleton instance of the iterator.

  type: org.apache.commons.collections4.ResettableIterator"
  EmptyIterator/RESETTABLE_INSTANCE)

(def *-instance
  "Static Constant.

  Singleton instance of the iterator.

  type: java.util.Iterator"
  EmptyIterator/INSTANCE)

(defn *resettable-empty-iterator
  "Get a typed resettable empty iterator instance.

  returns: ResettableIterator<E> - `<E> org.apache.commons.collections4.ResettableIterator<E>`"
  ([]
    (EmptyIterator/resettableEmptyIterator )))

(defn *empty-iterator
  "Get a typed empty iterator instance.

  returns: Iterator<E> - `<E> java.util.Iterator<E>`"
  ([]
    (EmptyIterator/emptyIterator )))

(defn next
  "returns: `E`"
  ([^EmptyIterator this]
    (-> this (.next))))

(defn reset
  ""
  ([^EmptyIterator this]
    (-> this (.reset))))

(defn has-previous?
  "returns: `boolean`"
  (^Boolean [^EmptyIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "returns: `int`"
  (^Integer [^EmptyIterator this]
    (-> this (.previousIndex))))

(defn previous
  "returns: `E`"
  ([^EmptyIterator this]
    (-> this (.previous))))

(defn remove
  ""
  ([^EmptyIterator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^EmptyIterator this]
    (-> this (.hasNext))))

(defn add
  "obj - `E`"
  ([^EmptyIterator this obj]
    (-> this (.add obj))))

(defn set
  "obj - `E`"
  ([^EmptyIterator this obj]
    (-> this (.set obj))))

(defn next-index
  "returns: `int`"
  (^Integer [^EmptyIterator this]
    (-> this (.nextIndex))))

