(ns org.apache.commons.collections4.bidimap.DualTreeBidiMap$ViewMap
  "Internal sorted map view."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap DualTreeBidiMap$ViewMap]))

(defn contains-value
  "value - value whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map maps one or more keys to the
           specified value - `boolean`"
  (^Boolean [^DualTreeBidiMap$ViewMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn clear
  ""
  ([^DualTreeBidiMap$ViewMap this]
    (-> this (.clear))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^DualTreeBidiMap$ViewMap this to-key]
    (-> this (.headMap to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^DualTreeBidiMap$ViewMap this from-key]
    (-> this (.tailMap from-key))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^DualTreeBidiMap$ViewMap this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn previous-key
  "Description copied from interface: OrderedMap

  key - the key to search for previous from - `K`

  returns: the previous key, null if no match or at start - `K`"
  ([^DualTreeBidiMap$ViewMap this key]
    (-> this (.previousKey key))))

(defn next-key
  "Description copied from interface: OrderedMap

  key - the key to search for next from - `K`

  returns: the next key, null if no match or at end - `K`"
  ([^DualTreeBidiMap$ViewMap this key]
    (-> this (.nextKey key))))

