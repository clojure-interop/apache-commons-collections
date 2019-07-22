(ns org.apache.commons.collections4.iterators.EmptyOrderedMapIterator
  "Provides an implementation of an empty ordered map iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators EmptyOrderedMapIterator]))

(def *-instance
  "Static Constant.

  Singleton instance of the iterator.

  type: org.apache.commons.collections4.OrderedMapIterator"
  EmptyOrderedMapIterator/INSTANCE)

(defn *empty-ordered-map-iterator
  "Get a typed instance of the iterator.

  returns: OrderedMapIterator<K, V> - `<K,V> org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  ([]
    (EmptyOrderedMapIterator/emptyOrderedMapIterator )))

(defn next
  "returns: `E`"
  ([^EmptyOrderedMapIterator this]
    (-> this (.next))))

(defn reset
  ""
  ([^EmptyOrderedMapIterator this]
    (-> this (.reset))))

(defn has-previous?
  "returns: `boolean`"
  (^Boolean [^EmptyOrderedMapIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "returns: `int`"
  (^Integer [^EmptyOrderedMapIterator this]
    (-> this (.previousIndex))))

(defn previous
  "returns: `E`"
  ([^EmptyOrderedMapIterator this]
    (-> this (.previous))))

(defn remove
  ""
  ([^EmptyOrderedMapIterator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^EmptyOrderedMapIterator this]
    (-> this (.hasNext))))

(defn add
  "obj - `E`"
  ([^EmptyOrderedMapIterator this obj]
    (-> this (.add obj))))

(defn set
  "obj - `E`"
  ([^EmptyOrderedMapIterator this obj]
    (-> this (.set obj))))

(defn next-index
  "returns: `int`"
  (^Integer [^EmptyOrderedMapIterator this]
    (-> this (.nextIndex))))

