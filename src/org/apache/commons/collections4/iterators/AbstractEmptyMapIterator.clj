(ns org.apache.commons.collections4.iterators.AbstractEmptyMapIterator
  "Provides an implementation of an empty map iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators AbstractEmptyMapIterator]))

(defn ->abstract-empty-map-iterator
  "Constructor.

  Create a new AbstractEmptyMapIterator."
  (^AbstractEmptyMapIterator []
    (new AbstractEmptyMapIterator )))

(defn next
  "returns: `E`"
  ([^AbstractEmptyMapIterator this]
    (-> this (.next))))

(defn get-key
  "returns: `K`"
  ([^AbstractEmptyMapIterator this]
    (-> this (.getKey))))

(defn reset
  ""
  ([^AbstractEmptyMapIterator this]
    (-> this (.reset))))

(defn has-previous?
  "returns: `boolean`"
  (^Boolean [^AbstractEmptyMapIterator this]
    (-> this (.hasPrevious))))

(defn get-value
  "returns: `V`"
  ([^AbstractEmptyMapIterator this]
    (-> this (.getValue))))

(defn previous-index
  "returns: `int`"
  (^Integer [^AbstractEmptyMapIterator this]
    (-> this (.previousIndex))))

(defn previous
  "returns: `E`"
  ([^AbstractEmptyMapIterator this]
    (-> this (.previous))))

(defn remove
  ""
  ([^AbstractEmptyMapIterator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^AbstractEmptyMapIterator this]
    (-> this (.hasNext))))

(defn set-value
  "value - `V`

  returns: `V`"
  ([^AbstractEmptyMapIterator this value]
    (-> this (.setValue value))))

(defn add
  "obj - `E`"
  ([^AbstractEmptyMapIterator this obj]
    (-> this (.add obj))))

(defn set
  "obj - `E`"
  ([^AbstractEmptyMapIterator this obj]
    (-> this (.set obj))))

(defn next-index
  "returns: `int`"
  (^Integer [^AbstractEmptyMapIterator this]
    (-> this (.nextIndex))))

