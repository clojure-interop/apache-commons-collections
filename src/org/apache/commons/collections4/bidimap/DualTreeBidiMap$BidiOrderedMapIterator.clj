(ns org.apache.commons.collections4.bidimap.DualTreeBidiMap$BidiOrderedMapIterator
  "Inner class MapIterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap DualTreeBidiMap$BidiOrderedMapIterator]))

(defn next
  "Description copied from interface: MapIterator

  returns: the next key in the iteration - `K`"
  ([^DualTreeBidiMap$BidiOrderedMapIterator this]
    (-> this (.next))))

(defn get-key
  "Description copied from interface: MapIterator

  returns: the current key - `K`"
  ([^DualTreeBidiMap$BidiOrderedMapIterator this]
    (-> this (.getKey))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DualTreeBidiMap$BidiOrderedMapIterator this]
    (-> this (.toString))))

(defn reset
  "Description copied from interface: ResettableIterator"
  ([^DualTreeBidiMap$BidiOrderedMapIterator this]
    (-> this (.reset))))

(defn has-previous?
  "Description copied from interface: OrderedMapIterator

  returns: true if the iterator has a previous element - `boolean`"
  (^Boolean [^DualTreeBidiMap$BidiOrderedMapIterator this]
    (-> this (.hasPrevious))))

(defn get-value
  "Description copied from interface: MapIterator

  returns: the current value - `V`"
  ([^DualTreeBidiMap$BidiOrderedMapIterator this]
    (-> this (.getValue))))

(defn previous
  "Description copied from interface: OrderedMapIterator

  returns: the previous key in the iteration - `K`"
  ([^DualTreeBidiMap$BidiOrderedMapIterator this]
    (-> this (.previous))))

(defn remove
  "Description copied from interface: MapIterator"
  ([^DualTreeBidiMap$BidiOrderedMapIterator this]
    (-> this (.remove))))

(defn has-next?
  "Description copied from interface: MapIterator

  returns: true if the iterator has more elements - `boolean`"
  (^Boolean [^DualTreeBidiMap$BidiOrderedMapIterator this]
    (-> this (.hasNext))))

(defn set-value
  "Description copied from interface: MapIterator

  value - the new value - `V`

  returns: the previous value - `V`"
  ([^DualTreeBidiMap$BidiOrderedMapIterator this value]
    (-> this (.setValue value))))

