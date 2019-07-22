(ns org.apache.commons.collections4.map.ListOrderedMap
  "Decorates a Map to ensure that the order of addition is retained
  using a List to maintain order.

  The order will be used via the iterators and toArray methods on the views.
  The order is also returned by the MapIterator.
  The orderedMapIterator() method accesses an iterator that can
  iterate both forwards and backwards through the map.
  In addition, non-interface methods are provided to access the map by index.


  If an object is added to the Map for a second time, it will remain in the
  original position in the iteration.


  Note that ListOrderedMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  exceptions when accessed by concurrent threads without synchronization.


  Note that ListOrderedMap doesn't work with
  IdentityHashMap, CaseInsensitiveMap,
  or similar maps that violate the general contract of Map.
  The ListOrderedMap (or, more precisely, the underlying List)
  is relying on equals(). This is fine, as long as the
  decorated Map is also based on equals(),
  and hashCode(), which
  IdentityHashMap, and
  CaseInsensitiveMap don't: The former uses ==, and
  the latter uses equals() on a lower-cased
  key.


  This class is Serializable starting with Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map ListOrderedMap]))

(defn ->list-ordered-map
  "Constructor.

  Constructs a new empty ListOrderedMap that decorates
   a HashMap."
  (^ListOrderedMap []
    (new ListOrderedMap )))

(defn *list-ordered-map
  "Factory method to create an ordered map.

   An ArrayList is used to retain order.

  map - the map to decorate, must not be null - `java.util.Map`

  returns: a new list ordered map - `<K,V> org.apache.commons.collections4.map.ListOrderedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.Map map]
    (ListOrderedMap/listOrderedMap map)))

(defn values
  "Gets a view over the values in the map.

   The Collection will be ordered by object insertion into the map.

   From Commons Collections 3.2, this Collection can be cast
   to a list, see valueList()

  returns: the fully modifiable collection view over the values - `java.util.Collection<V>`"
  (^java.util.Collection [^ListOrderedMap this]
    (-> this (.values))))

(defn map-iterator
  "Description copied from class: AbstractIterableMap

  returns: a map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^ListOrderedMap this]
    (-> this (.mapIterator))))

(defn put-all
  "Puts the values contained in a supplied Map into the Map starting at
   the specified index.

  index - the index in the Map to start at. - `int`
  map - the Map containing the entries to be added. - `java.util.Map`

  throws: java.lang.IndexOutOfBoundsException - if the index is out of range [0, size]"
  ([^ListOrderedMap this ^Integer index ^java.util.Map map]
    (-> this (.putAll index map)))
  ([^ListOrderedMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Puts a key-value mapping into the map at the specified index.

   If the map already contains the key, then the original mapping
   is removed and the new mapping added at the specified index.
   The remove may change the effect of the index. The index is
   always calculated relative to the original state of the map.

   Thus the steps are: (1) remove the existing key-value mapping,
   then (2) insert the new key-value mapping at the position it
   would have been inserted had the remove not occurred.

  index - the index at which the mapping should be inserted - `int`
  key - the key - `K`
  value - the value - `V`

  returns: the value previously mapped to the key - `V`

  throws: java.lang.IndexOutOfBoundsException - if the index is out of range [0, size]"
  ([^ListOrderedMap this ^Integer index key value]
    (-> this (.put index key value)))
  ([^ListOrderedMap this key value]
    (-> this (.put key value))))

(defn as-list
  "Gets an unmodifiable List view of the keys which changes as the map changes.

   The returned list is unmodifiable because changes to the values of
   the list (using ListIterator.set(Object)) will
   effectively remove the value from the list and reinsert that value at
   the end of the list, which is an unexpected side effect of changing the
   value of a list.  This occurs because changing the key, changes when the
   mapping is added to the map and thus where it appears in the list.

   An alternative to this method is to use the better named
   keyList() or keySet().

  returns: The ordered list of keys. - `java.util.List<K>`"
  (^java.util.List [^ListOrderedMap this]
    (-> this (.asList))))

(defn entry-set
  "Gets a view over the entries in the map.

   The Set will be ordered by object insertion into the map.

  returns: the fully modifiable set view over the entries - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^ListOrderedMap this]
    (-> this (.entrySet))))

(defn value-list
  "Gets a view over the values in the map as a List.

   The List will be ordered by object insertion into the map.
   The List supports remove and set, but does not support add.

  returns: the partially modifiable list view over the values - `java.util.List<V>`"
  (^java.util.List [^ListOrderedMap this]
    (-> this (.valueList))))

(defn key-list
  "Gets a view over the keys in the map as a List.

   The List will be ordered by object insertion into the map.
   The List is unmodifiable.

  returns: the unmodifiable list view over the keys - `java.util.List<K>`"
  (^java.util.List [^ListOrderedMap this]
    (-> this (.keyList))))

(defn to-string
  "Returns the Map as a string.

  returns: the Map as a String - `java.lang.String`"
  (^java.lang.String [^ListOrderedMap this]
    (-> this (.toString))))

(defn first-key
  "Gets the first key in this map by insert order.

  returns: the first key currently in this map - `K`

  throws: java.util.NoSuchElementException - if this map is empty"
  ([^ListOrderedMap this]
    (-> this (.firstKey))))

(defn get-value
  "Gets the value at the specified index.

  index - the index to retrieve - `int`

  returns: the key at the specified index - `V`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^ListOrderedMap this ^Integer index]
    (-> this (.getValue index))))

(defn last-key
  "Gets the last key in this map by insert order.

  returns: the last key currently in this map - `K`

  throws: java.util.NoSuchElementException - if this map is empty"
  ([^ListOrderedMap this]
    (-> this (.lastKey))))

(defn remove
  "Removes the element at the specified index.

  index - the index of the object to remove - `int`

  returns: the removed value, or null if none existed - `V`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^ListOrderedMap this ^Integer index]
    (-> this (.remove index))))

(defn key-set
  "Gets a view over the keys in the map.

   The Collection will be ordered by object insertion into the map.

  returns: the fully modifiable collection view over the keys - `java.util.Set<K>`"
  (^java.util.Set [^ListOrderedMap this]
    (-> this (.keySet))))

(defn next-key
  "Gets the next key to the one specified using insert order.
   This method performs a list search to find the key and is O(n).

  key - the key to find previous for - `java.lang.Object`

  returns: the next key, null if no match or at start - `K`"
  ([^ListOrderedMap this ^java.lang.Object key]
    (-> this (.nextKey key))))

(defn previous-key
  "Gets the previous key to the one specified using insert order.
   This method performs a list search to find the key and is O(n).

  key - the key to find previous for - `java.lang.Object`

  returns: the previous key, null if no match or at start - `K`"
  ([^ListOrderedMap this ^java.lang.Object key]
    (-> this (.previousKey key))))

(defn set-value
  "Sets the value at the specified index.

  index - the index of the value to set - `int`
  value - the new value to set - `V`

  returns: the previous value at that index - `V`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^ListOrderedMap this ^Integer index value]
    (-> this (.setValue index value))))

(defn clear
  ""
  ([^ListOrderedMap this]
    (-> this (.clear))))

(defn index-of
  "Gets the index of the specified key.

  key - the key to find the index of - `java.lang.Object`

  returns: the index, or -1 if not found - `int`"
  (^Integer [^ListOrderedMap this ^java.lang.Object key]
    (-> this (.indexOf key))))

(defn get
  "Gets the key at the specified index.

  index - the index to retrieve - `int`

  returns: the key at the specified index - `K`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^ListOrderedMap this ^Integer index]
    (-> this (.get index))))

