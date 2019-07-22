(ns org.apache.commons.collections4.map.AbstractOrderedMapDecorator
  "Provides a base decorator that enables additional functionality to be added
  to an OrderedMap via decoration.

  Methods are forwarded directly to the decorated map.


  This implementation does not perform any special processing with the map views.
  Instead it simply returns the set/collection from the wrapped map. This may be
  undesirable, for example if you are trying to write a validating implementation
  it would provide a loophole around the validation.
  But, you might want that loophole, so this class is kept simple."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractOrderedMapDecorator]))

(defn ->abstract-ordered-map-decorator
  "Constructor.

  Constructor that wraps (not copies).

  map - the map to decorate, must not be null - `org.apache.commons.collections4.OrderedMap`

  throws: java.lang.NullPointerException - if the map is null"
  (^AbstractOrderedMapDecorator [^org.apache.commons.collections4.OrderedMap map]
    (new AbstractOrderedMapDecorator map)))

(defn first-key
  "Description copied from interface: OrderedMap

  returns: the first key currently in this map - `K`"
  ([^AbstractOrderedMapDecorator this]
    (-> this (.firstKey))))

(defn last-key
  "Description copied from interface: OrderedMap

  returns: the last key currently in this map - `K`"
  ([^AbstractOrderedMapDecorator this]
    (-> this (.lastKey))))

(defn next-key
  "Description copied from interface: OrderedMap

  key - the key to search for next from - `K`

  returns: the next key, null if no match or at end - `K`"
  ([^AbstractOrderedMapDecorator this key]
    (-> this (.nextKey key))))

(defn previous-key
  "Description copied from interface: OrderedMap

  key - the key to search for previous from - `K`

  returns: the previous key, null if no match or at start - `K`"
  ([^AbstractOrderedMapDecorator this key]
    (-> this (.previousKey key))))

(defn map-iterator
  "Description copied from class: AbstractIterableMap

  returns: a map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^AbstractOrderedMapDecorator this]
    (-> this (.mapIterator))))

