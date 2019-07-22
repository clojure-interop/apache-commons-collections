(ns org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator
  "Decorates an ordered map iterator such that it cannot be modified.

  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators UnmodifiableOrderedMapIterator]))

(defn *unmodifiable-ordered-map-iterator
  "Decorates the specified iterator such that it cannot be modified.

  iterator - the iterator to decorate - `org.apache.commons.collections4.OrderedMapIterator`

  returns: a new unmodifiable ordered map iterator - `<K,V> org.apache.commons.collections4.OrderedMapIterator<K,V>`

  throws: java.lang.NullPointerException - if the iterator is null"
  ([^org.apache.commons.collections4.OrderedMapIterator iterator]
    (UnmodifiableOrderedMapIterator/unmodifiableOrderedMapIterator iterator)))

(defn has-next?
  "Description copied from interface: MapIterator

  returns: true if the iterator has more elements - `boolean`"
  (^Boolean [^UnmodifiableOrderedMapIterator this]
    (-> this (.hasNext))))

(defn next
  "Description copied from interface: MapIterator

  returns: the next key in the iteration - `K`"
  ([^UnmodifiableOrderedMapIterator this]
    (-> this (.next))))

(defn has-previous?
  "Description copied from interface: OrderedMapIterator

  returns: true if the iterator has a previous element - `boolean`"
  (^Boolean [^UnmodifiableOrderedMapIterator this]
    (-> this (.hasPrevious))))

(defn previous
  "Description copied from interface: OrderedMapIterator

  returns: the previous key in the iteration - `K`"
  ([^UnmodifiableOrderedMapIterator this]
    (-> this (.previous))))

(defn get-key
  "Description copied from interface: MapIterator

  returns: the current key - `K`"
  ([^UnmodifiableOrderedMapIterator this]
    (-> this (.getKey))))

(defn get-value
  "Description copied from interface: MapIterator

  returns: the current value - `V`"
  ([^UnmodifiableOrderedMapIterator this]
    (-> this (.getValue))))

(defn set-value
  "Description copied from interface: MapIterator

  value - the new value - `V`

  returns: the previous value - `V`"
  ([^UnmodifiableOrderedMapIterator this value]
    (-> this (.setValue value))))

(defn remove
  "Description copied from interface: MapIterator"
  ([^UnmodifiableOrderedMapIterator this]
    (-> this (.remove))))

