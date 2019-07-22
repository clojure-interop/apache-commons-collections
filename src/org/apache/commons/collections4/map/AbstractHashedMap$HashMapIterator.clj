(ns org.apache.commons.collections4.map.AbstractHashedMap$HashMapIterator
  "MapIterator implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractHashedMap$HashMapIterator]))

(defn next
  "Description copied from interface: MapIterator

  returns: the next key in the iteration - `K`"
  ([^AbstractHashedMap$HashMapIterator this]
    (-> this (.next))))

(defn get-key
  "Description copied from interface: MapIterator

  returns: the current key - `K`"
  ([^AbstractHashedMap$HashMapIterator this]
    (-> this (.getKey))))

(defn get-value
  "Description copied from interface: MapIterator

  returns: the current value - `V`"
  ([^AbstractHashedMap$HashMapIterator this]
    (-> this (.getValue))))

(defn set-value
  "Description copied from interface: MapIterator

  value - the new value - `V`

  returns: the previous value - `V`"
  ([^AbstractHashedMap$HashMapIterator this value]
    (-> this (.setValue value))))

