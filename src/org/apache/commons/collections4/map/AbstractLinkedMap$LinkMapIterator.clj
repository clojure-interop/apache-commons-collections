(ns org.apache.commons.collections4.map.AbstractLinkedMap$LinkMapIterator
  "MapIterator implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractLinkedMap$LinkMapIterator]))

(defn next
  "Description copied from interface: MapIterator

  returns: the next key in the iteration - `K`"
  ([^AbstractLinkedMap$LinkMapIterator this]
    (-> this (.next))))

(defn previous
  "Description copied from interface: OrderedMapIterator

  returns: the previous key in the iteration - `K`"
  ([^AbstractLinkedMap$LinkMapIterator this]
    (-> this (.previous))))

(defn get-key
  "Description copied from interface: MapIterator

  returns: the current key - `K`"
  ([^AbstractLinkedMap$LinkMapIterator this]
    (-> this (.getKey))))

(defn get-value
  "Description copied from interface: MapIterator

  returns: the current value - `V`"
  ([^AbstractLinkedMap$LinkMapIterator this]
    (-> this (.getValue))))

(defn set-value
  "Description copied from interface: MapIterator

  value - the new value - `V`

  returns: the previous value - `V`"
  ([^AbstractLinkedMap$LinkMapIterator this value]
    (-> this (.setValue value))))

