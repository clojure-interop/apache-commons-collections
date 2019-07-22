(ns org.apache.commons.collections4.bidimap.DualTreeBidiMap
  "Implementation of BidiMap that uses two TreeMap instances.

  The setValue() method on iterators will succeed only if the new value being set is
  not already in the bidimap.


  When considering whether to use this class, the TreeBidiMap class should
  also be considered. It implements the interface using a dedicated design, and does
  not store each object twice, which can save on memory use.


  NOTE: From Commons Collections 3.1, all subclasses will use TreeMap
  and the flawed createMap method is ignored."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap DualTreeBidiMap]))

(defn ->dual-tree-bidi-map
  "Constructor.

  Constructs a DualTreeBidiMap using the specified Comparator.

  key-comparator - the comparator - `java.util.Comparator`
  value-comparator - the values comparator to use - `java.util.Comparator`"
  (^DualTreeBidiMap [^java.util.Comparator key-comparator ^java.util.Comparator value-comparator]
    (new DualTreeBidiMap key-comparator value-comparator))
  (^DualTreeBidiMap [^java.util.Map map]
    (new DualTreeBidiMap map))
  (^DualTreeBidiMap []
    (new DualTreeBidiMap )))

(defn value-comparator
  "Description copied from interface: SortedBidiMap

  returns: Comparator<? super V> - `java.util.Comparator<? super V>`"
  ([^DualTreeBidiMap this]
    (-> this (.valueComparator))))

(defn map-iterator
  "Obtains an ordered map iterator.

   This implementation copies the elements to an ArrayList in order to
   provide the forward/backward behaviour.

  returns: a new ordered map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^DualTreeBidiMap this]
    (-> this (.mapIterator))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^DualTreeBidiMap this to-key]
    (-> this (.headMap to-key))))

(defn inverse-bidi-map
  "Description copied from interface: BidiMap

  returns: an inverted bidirectional map - `org.apache.commons.collections4.SortedBidiMap<V,K>`"
  (^org.apache.commons.collections4.SortedBidiMap [^DualTreeBidiMap this]
    (-> this (.inverseBidiMap))))

(defn inverse-ordered-bidi-map
  "returns: `org.apache.commons.collections4.OrderedBidiMap<V,K>`"
  (^org.apache.commons.collections4.OrderedBidiMap [^DualTreeBidiMap this]
    (-> this (.inverseOrderedBidiMap))))

(defn first-key
  "Description copied from interface: OrderedMap

  returns: the first key currently in this map - `K`"
  ([^DualTreeBidiMap this]
    (-> this (.firstKey))))

(defn last-key
  "Description copied from interface: OrderedMap

  returns: the last key currently in this map - `K`"
  ([^DualTreeBidiMap this]
    (-> this (.lastKey))))

(defn comparator
  "returns: `java.util.Comparator<? super K>`"
  ([^DualTreeBidiMap this]
    (-> this (.comparator))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^DualTreeBidiMap this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^DualTreeBidiMap this from-key]
    (-> this (.tailMap from-key))))

(defn next-key
  "Description copied from interface: OrderedMap

  key - the key to search for next from - `K`

  returns: the next key, null if no match or at end - `K`"
  ([^DualTreeBidiMap this key]
    (-> this (.nextKey key))))

(defn previous-key
  "Description copied from interface: OrderedMap

  key - the key to search for previous from - `K`

  returns: the previous key, null if no match or at start - `K`"
  ([^DualTreeBidiMap this key]
    (-> this (.previousKey key))))

(defn inverse-sorted-bidi-map
  "returns: `org.apache.commons.collections4.SortedBidiMap<V,K>`"
  (^org.apache.commons.collections4.SortedBidiMap [^DualTreeBidiMap this]
    (-> this (.inverseSortedBidiMap))))

