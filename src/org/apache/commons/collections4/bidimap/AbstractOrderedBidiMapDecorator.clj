(ns org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator
  "Provides a base decorator that enables additional functionality to be added
  to an OrderedBidiMap via decoration.

  Methods are forwarded directly to the decorated map.


  This implementation does not perform any special processing with the map views.
  Instead it simply returns the inverse from the wrapped map. This may be
  undesirable, for example if you are trying to write a validating implementation
  it would provide a loophole around the validation.
  But, you might want that loophole, so this class is kept simple."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractOrderedBidiMapDecorator]))

(defn map-iterator
  "Description copied from class: AbstractIterableMap

  returns: a map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^AbstractOrderedBidiMapDecorator this]
    (-> this (.mapIterator))))

(defn first-key
  "Description copied from interface: OrderedMap

  returns: the first key currently in this map - `K`"
  ([^AbstractOrderedBidiMapDecorator this]
    (-> this (.firstKey))))

(defn last-key
  "Description copied from interface: OrderedMap

  returns: the last key currently in this map - `K`"
  ([^AbstractOrderedBidiMapDecorator this]
    (-> this (.lastKey))))

(defn next-key
  "Description copied from interface: OrderedMap

  key - the key to search for next from - `K`

  returns: the next key, null if no match or at end - `K`"
  ([^AbstractOrderedBidiMapDecorator this key]
    (-> this (.nextKey key))))

(defn previous-key
  "Description copied from interface: OrderedMap

  key - the key to search for previous from - `K`

  returns: the previous key, null if no match or at start - `K`"
  ([^AbstractOrderedBidiMapDecorator this key]
    (-> this (.previousKey key))))

(defn inverse-bidi-map
  "Description copied from interface: BidiMap

  returns: an inverted bidirectional map - `org.apache.commons.collections4.OrderedBidiMap<V,K>`"
  (^org.apache.commons.collections4.OrderedBidiMap [^AbstractOrderedBidiMapDecorator this]
    (-> this (.inverseBidiMap))))

