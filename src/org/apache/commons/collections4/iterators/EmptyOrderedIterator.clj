(ns org.apache.commons.collections4.iterators.EmptyOrderedIterator
  "Provides an implementation of an empty ordered iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators EmptyOrderedIterator]))

(def *-instance
  "Static Constant.

  Singleton instance of the iterator.

  type: org.apache.commons.collections4.OrderedIterator"
  EmptyOrderedIterator/INSTANCE)

(defn *empty-ordered-iterator
  "Typed instance of the iterator.

  returns: OrderedIterator<E> - `<E> org.apache.commons.collections4.OrderedIterator<E>`"
  ([]
    (EmptyOrderedIterator/emptyOrderedIterator )))

(defn next
  "returns: `E`"
  ([^EmptyOrderedIterator this]
    (-> this (.next))))

(defn reset
  ""
  ([^EmptyOrderedIterator this]
    (-> this (.reset))))

(defn has-previous?
  "returns: `boolean`"
  (^Boolean [^EmptyOrderedIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "returns: `int`"
  (^Integer [^EmptyOrderedIterator this]
    (-> this (.previousIndex))))

(defn previous
  "returns: `E`"
  ([^EmptyOrderedIterator this]
    (-> this (.previous))))

(defn remove
  ""
  ([^EmptyOrderedIterator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^EmptyOrderedIterator this]
    (-> this (.hasNext))))

(defn add
  "obj - `E`"
  ([^EmptyOrderedIterator this obj]
    (-> this (.add obj))))

(defn set
  "obj - `E`"
  ([^EmptyOrderedIterator this obj]
    (-> this (.set obj))))

(defn next-index
  "returns: `int`"
  (^Integer [^EmptyOrderedIterator this]
    (-> this (.nextIndex))))

