(ns org.apache.commons.collections4.iterators.UnmodifiableMapIterator
  "Decorates a map iterator such that it cannot be modified.

  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators UnmodifiableMapIterator]))

(defn *unmodifiable-map-iterator
  "Decorates the specified iterator such that it cannot be modified.

  iterator - the iterator to decorate - `org.apache.commons.collections4.MapIterator`

  returns: a new unmodifiable map iterator - `<K,V> org.apache.commons.collections4.MapIterator<K,V>`

  throws: java.lang.NullPointerException - if the iterator is null"
  ([^org.apache.commons.collections4.MapIterator iterator]
    (UnmodifiableMapIterator/unmodifiableMapIterator iterator)))

(defn has-next?
  "Description copied from interface: MapIterator

  returns: true if the iterator has more elements - `boolean`"
  (^Boolean [^UnmodifiableMapIterator this]
    (-> this (.hasNext))))

(defn next
  "Description copied from interface: MapIterator

  returns: the next key in the iteration - `K`"
  ([^UnmodifiableMapIterator this]
    (-> this (.next))))

(defn get-key
  "Description copied from interface: MapIterator

  returns: the current key - `K`"
  ([^UnmodifiableMapIterator this]
    (-> this (.getKey))))

(defn get-value
  "Description copied from interface: MapIterator

  returns: the current value - `V`"
  ([^UnmodifiableMapIterator this]
    (-> this (.getValue))))

(defn set-value
  "Description copied from interface: MapIterator

  value - the new value - `V`

  returns: the previous value - `V`"
  ([^UnmodifiableMapIterator this value]
    (-> this (.setValue value))))

(defn remove
  "Description copied from interface: MapIterator"
  ([^UnmodifiableMapIterator this]
    (-> this (.remove))))

