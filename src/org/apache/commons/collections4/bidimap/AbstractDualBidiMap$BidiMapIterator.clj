(ns org.apache.commons.collections4.bidimap.AbstractDualBidiMap$BidiMapIterator
  "Inner class MapIterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractDualBidiMap$BidiMapIterator]))

(defn has-next?
  "Description copied from interface: MapIterator

  returns: true if the iterator has more elements - `boolean`"
  (^Boolean [^AbstractDualBidiMap$BidiMapIterator this]
    (-> this (.hasNext))))

(defn next
  "Description copied from interface: MapIterator

  returns: the next key in the iteration - `K`"
  ([^AbstractDualBidiMap$BidiMapIterator this]
    (-> this (.next))))

(defn remove
  "Description copied from interface: MapIterator"
  ([^AbstractDualBidiMap$BidiMapIterator this]
    (-> this (.remove))))

(defn get-key
  "Description copied from interface: MapIterator

  returns: the current key - `K`"
  ([^AbstractDualBidiMap$BidiMapIterator this]
    (-> this (.getKey))))

(defn get-value
  "Description copied from interface: MapIterator

  returns: the current value - `V`"
  ([^AbstractDualBidiMap$BidiMapIterator this]
    (-> this (.getValue))))

(defn set-value
  "Description copied from interface: MapIterator

  value - the new value - `V`

  returns: the previous value - `V`"
  ([^AbstractDualBidiMap$BidiMapIterator this value]
    (-> this (.setValue value))))

(defn reset
  "Description copied from interface: ResettableIterator"
  ([^AbstractDualBidiMap$BidiMapIterator this]
    (-> this (.reset))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractDualBidiMap$BidiMapIterator this]
    (-> this (.toString))))

