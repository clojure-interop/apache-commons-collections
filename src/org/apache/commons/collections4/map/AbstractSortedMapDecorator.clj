(ns org.apache.commons.collections4.map.AbstractSortedMapDecorator
  "Provides a base decorator that enables additional functionality to be added
  to a Map via decoration.

  Methods are forwarded directly to the decorated map.


  This implementation does not perform any special processing with the map views.
  Instead it simply returns the set/collection from the wrapped map. This may be
  undesirable, for example if you are trying to write a validating implementation
  it would provide a loophole around the validation.
  But, you might want that loophole, so this class is kept simple."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractSortedMapDecorator]))

(defn ->abstract-sorted-map-decorator
  "Constructor.

  Constructor that wraps (not copies).

  map - the map to decorate, must not be null - `java.util.SortedMap`

  throws: java.lang.NullPointerException - if the map is null"
  (^AbstractSortedMapDecorator [^java.util.SortedMap map]
    (new AbstractSortedMapDecorator map)))

(defn map-iterator
  "Obtains a MapIterator over the map.

   A map iterator is an efficient way of iterating over maps.
   There is no need to access the entry set or use Map Entry objects.


   IterableMap<String,Integer> map = new HashedMap<String,Integer>();
   MapIterator<String,Integer> it = map.mapIterator();
   while (it.hasNext()) {
     String key = it.next();
     Integer value = it.getValue();
     it.setValue(value  1);
   }

  returns: a map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^AbstractSortedMapDecorator this]
    (-> this (.mapIterator))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^AbstractSortedMapDecorator this to-key]
    (-> this (.headMap to-key))))

(defn first-key
  "Description copied from interface: OrderedMap

  returns: the first key currently in this map - `K`"
  ([^AbstractSortedMapDecorator this]
    (-> this (.firstKey))))

(defn last-key
  "Description copied from interface: OrderedMap

  returns: the last key currently in this map - `K`"
  ([^AbstractSortedMapDecorator this]
    (-> this (.lastKey))))

(defn comparator
  "returns: `java.util.Comparator<? super K>`"
  ([^AbstractSortedMapDecorator this]
    (-> this (.comparator))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^AbstractSortedMapDecorator this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^AbstractSortedMapDecorator this from-key]
    (-> this (.tailMap from-key))))

(defn next-key
  "Description copied from interface: OrderedMap

  key - the key to search for next from - `K`

  returns: the next key, null if no match or at end - `K`"
  ([^AbstractSortedMapDecorator this key]
    (-> this (.nextKey key))))

(defn previous-key
  "Description copied from interface: OrderedMap

  key - the key to search for previous from - `K`

  returns: the previous key, null if no match or at start - `K`"
  ([^AbstractSortedMapDecorator this key]
    (-> this (.previousKey key))))

