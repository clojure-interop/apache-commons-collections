(ns org.apache.commons.collections4.iterators.EmptyListIterator
  "Provides an implementation of an empty list iterator.

  This class provides an implementation of an empty list iterator. This class
  provides for binary compatibility between Commons Collections 2.1.1 and 3.1
  due to issues with IteratorUtils."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators EmptyListIterator]))

(def *-resettable-instance
  "Static Constant.

  Singleton instance of the iterator.

  type: org.apache.commons.collections4.ResettableListIterator"
  EmptyListIterator/RESETTABLE_INSTANCE)

(def *-instance
  "Static Constant.

  Singleton instance of the iterator.

  type: java.util.ListIterator"
  EmptyListIterator/INSTANCE)

(defn *resettable-empty-list-iterator
  "Get a typed instance of the iterator.

  returns: ResettableListIterator<E> - `<E> org.apache.commons.collections4.ResettableListIterator<E>`"
  ([]
    (EmptyListIterator/resettableEmptyListIterator )))

(defn *empty-list-iterator
  "Get a typed instance of the iterator.

  returns: ListIterator<E> - `<E> java.util.ListIterator<E>`"
  ([]
    (EmptyListIterator/emptyListIterator )))

(defn next
  "returns: `E`"
  ([^EmptyListIterator this]
    (-> this (.next))))

(defn reset
  ""
  ([^EmptyListIterator this]
    (-> this (.reset))))

(defn has-previous?
  "returns: `boolean`"
  (^Boolean [^EmptyListIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "returns: `int`"
  (^Integer [^EmptyListIterator this]
    (-> this (.previousIndex))))

(defn previous
  "returns: `E`"
  ([^EmptyListIterator this]
    (-> this (.previous))))

(defn remove
  ""
  ([^EmptyListIterator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^EmptyListIterator this]
    (-> this (.hasNext))))

(defn add
  "obj - `E`"
  ([^EmptyListIterator this obj]
    (-> this (.add obj))))

(defn set
  "obj - `E`"
  ([^EmptyListIterator this obj]
    (-> this (.set obj))))

(defn next-index
  "returns: `int`"
  (^Integer [^EmptyListIterator this]
    (-> this (.nextIndex))))

