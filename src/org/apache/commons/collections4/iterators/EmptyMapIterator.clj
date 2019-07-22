(ns org.apache.commons.collections4.iterators.EmptyMapIterator
  "Provides an implementation of an empty map iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators EmptyMapIterator]))

(def *-instance
  "Static Constant.

  Singleton instance of the iterator.

  type: org.apache.commons.collections4.MapIterator"
  EmptyMapIterator/INSTANCE)

(defn *empty-map-iterator
  "Get a typed instance of the iterator.

  returns: MapIterator<K, V> - `<K,V> org.apache.commons.collections4.MapIterator<K,V>`"
  ([]
    (EmptyMapIterator/emptyMapIterator )))

(defn next
  "returns: `E`"
  ([^EmptyMapIterator this]
    (-> this (.next))))

(defn reset
  ""
  ([^EmptyMapIterator this]
    (-> this (.reset))))

(defn has-previous?
  "returns: `boolean`"
  (^Boolean [^EmptyMapIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "returns: `int`"
  (^Integer [^EmptyMapIterator this]
    (-> this (.previousIndex))))

(defn previous
  "returns: `E`"
  ([^EmptyMapIterator this]
    (-> this (.previous))))

(defn remove
  ""
  ([^EmptyMapIterator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^EmptyMapIterator this]
    (-> this (.hasNext))))

(defn add
  "obj - `E`"
  ([^EmptyMapIterator this obj]
    (-> this (.add obj))))

(defn set
  "obj - `E`"
  ([^EmptyMapIterator this obj]
    (-> this (.set obj))))

(defn next-index
  "returns: `int`"
  (^Integer [^EmptyMapIterator this]
    (-> this (.nextIndex))))

