(ns org.apache.commons.collections4.bidimap.AbstractBidiMapDecorator
  "Provides a base decorator that enables additional functionality to be added
  to a BidiMap via decoration.

  Methods are forwarded directly to the decorated map.


  This implementation does not perform any special processing with the map views.
  Instead it simply returns the set/collection from the wrapped map. This may be
  undesirable, for example if you are trying to write a validating implementation
  it would provide a loophole around the validation.
  But, you might want that loophole, so this class is kept simple."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractBidiMapDecorator]))

(defn map-iterator
  "Description copied from class: AbstractIterableMap

  returns: a map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^AbstractBidiMapDecorator this]
    (-> this (.mapIterator))))

(defn get-key
  "Description copied from interface: BidiMap

  value - the value to find the key for - `java.lang.Object`

  returns: the mapped key, or null if not found - `K`"
  ([^AbstractBidiMapDecorator this ^java.lang.Object value]
    (-> this (.getKey value))))

(defn remove-value
  "Description copied from interface: BidiMap

  value - the value to find the key-value pair for - `java.lang.Object`

  returns: the key that was removed, null if nothing removed - `K`"
  ([^AbstractBidiMapDecorator this ^java.lang.Object value]
    (-> this (.removeValue value))))

(defn inverse-bidi-map
  "Description copied from interface: BidiMap

  returns: an inverted bidirectional map - `org.apache.commons.collections4.BidiMap<V,K>`"
  (^org.apache.commons.collections4.BidiMap [^AbstractBidiMapDecorator this]
    (-> this (.inverseBidiMap))))

(defn values
  "Description copied from interface: BidiMap

  returns: a collection view of the values contained in this map - `java.util.Set<V>`"
  (^java.util.Set [^AbstractBidiMapDecorator this]
    (-> this (.values))))

