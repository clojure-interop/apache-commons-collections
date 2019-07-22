(ns org.apache.commons.collections4.OrderedMap
  "Defines a map that maintains order and allows both forward and backward
  iteration through that order."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 OrderedMap]))

(defn map-iterator
  "Obtains an OrderedMapIterator over the map.

   A ordered map iterator is an efficient way of iterating over maps
   in both directions.

  returns: a map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^OrderedMap this]
    (-> this (.mapIterator))))

(defn first-key
  "Gets the first key currently in this map.

  returns: the first key currently in this map - `K`

  throws: java.util.NoSuchElementException - if this map is empty"
  ([^OrderedMap this]
    (-> this (.firstKey))))

(defn last-key
  "Gets the last key currently in this map.

  returns: the last key currently in this map - `K`

  throws: java.util.NoSuchElementException - if this map is empty"
  ([^OrderedMap this]
    (-> this (.lastKey))))

(defn next-key
  "Gets the next key after the one specified.

  key - the key to search for next from - `K`

  returns: the next key, null if no match or at end - `K`"
  ([^OrderedMap this key]
    (-> this (.nextKey key))))

(defn previous-key
  "Gets the previous key before the one specified.

  key - the key to search for previous from - `K`

  returns: the previous key, null if no match or at start - `K`"
  ([^OrderedMap this key]
    (-> this (.previousKey key))))

