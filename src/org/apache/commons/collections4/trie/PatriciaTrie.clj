(ns org.apache.commons.collections4.trie.PatriciaTrie
  "Implementation of a PATRICIA Trie (Practical Algorithm to Retrieve Information
  Coded in Alphanumeric).

  A PATRICIA Trie is a compressed
  Trie. Instead of storing
  all data at the edges of the Trie
  (and having empty internal nodes), PATRICIA stores data in every node.
  This allows for very efficient traversal, insert, delete, predecessor,
  successor, prefix, range, and select(Object)
  operations. All operations are performed at worst in O(K) time, where K
  is the number of bits in the largest item in the tree. In practice,
  operations actually take O(A(K)) time, where A(K) is the average number of
  bits of all items in the tree.


  Most importantly, PATRICIA requires very few comparisons to keys while
  doing any operation. While performing a lookup, each comparison (at most
  K of them, described above) will perform a single bit comparison against
  the given key, instead of comparing the entire key to another key.


  The Trie can return operations in
  lexicographical order using the 'prefixMap', 'submap', or 'iterator' methods.
  The Trie can also
  scan for items that are 'bitwise' (using an XOR metric) by the 'select' method.
  Bitwise closeness is determined by the KeyAnalyzer returning true or
  false for a bit being set or not in a given key.


  This PATRICIA Trie supports both variable
  length & fixed length keys. Some methods, such as prefixMap(Object)
  are suited only to variable length keys."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.trie PatriciaTrie]))

(defn ->patricia-trie
  "Constructor.

  m - `java.util.Map`"
  (^PatriciaTrie [^java.util.Map m]
    (new PatriciaTrie m))
  (^PatriciaTrie []
    (new PatriciaTrie )))

(defn values
  "returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^PatriciaTrie this]
    (-> this (.values))))

(defn map-iterator
  "Description copied from interface: IterableGet

  returns: a map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^PatriciaTrie this]
    (-> this (.mapIterator))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^PatriciaTrie this to-key]
    (-> this (.headMap to-key))))

(defn put
  "Description copied from interface: Put

  key - key with which the specified value is to be associated - `K`
  value - value to be associated with the specified key - `V`

  returns: the previous value associated with key, or
           null if there was no mapping for key.
           (A null return can also indicate that the map
           previously associated null with key,
           if the implementation supports null values.) - `V`"
  ([^PatriciaTrie this key value]
    (-> this (.put key value))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^PatriciaTrie this]
    (-> this (.entrySet))))

(defn first-key
  "Description copied from interface: OrderedMap

  returns: the first key currently in this map - `K`"
  ([^PatriciaTrie this]
    (-> this (.firstKey))))

(defn select-value
  "Returns the value whose key is closest in a bitwise XOR metric to
   the provided key. This is NOT lexicographic closeness!

   For example, given the keys:


   D = 1000100
   H = 1001000
   L = 1001100


   If the Trie contained 'H' and 'L', a lookup of 'D' would
   return 'L', because the XOR distance between D & L is smaller
   than the XOR distance between D & H.

  key - the key to use in the search - `K`

  returns: the value whose key is closest in a bitwise XOR metric
   to the provided key - `V`"
  ([^PatriciaTrie this key]
    (-> this (.selectValue key))))

(defn last-key
  "Description copied from interface: OrderedMap

  returns: the last key currently in this map - `K`"
  ([^PatriciaTrie this]
    (-> this (.lastKey))))

(defn select
  "Returns the Map.Entry whose key is closest in a bitwise XOR
   metric to the given key. This is NOT lexicographic closeness.
   For example, given the keys:


   D = 1000100
   H = 1001000
   L = 1001100


   If the Trie contained 'H' and 'L', a lookup of 'D' would
   return 'L', because the XOR distance between D & L is smaller
   than the XOR distance between D & H.

  key - the key to use in the search - `K`

  returns: the Map.Entry whose key is closest in a bitwise XOR metric
     to the provided key - `java.util.Map$Entry<K,V>`"
  (^java.util.Map$Entry [^PatriciaTrie this key]
    (-> this (.select key))))

(defn remove
  "k - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`

  throws: java.lang.ClassCastException - if provided key is of an incompatible type"
  ([^PatriciaTrie this ^java.lang.Object k]
    (-> this (.remove k))))

(defn key-set
  "returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^PatriciaTrie this]
    (-> this (.keySet))))

(defn comparator
  "returns: `java.util.Comparator<? super K>`"
  ([^PatriciaTrie this]
    (-> this (.comparator))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^PatriciaTrie this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^PatriciaTrie this from-key]
    (-> this (.tailMap from-key))))

(defn next-key
  "Description copied from interface: OrderedMap

  key - the key to search for next from - `K`

  returns: the next key, null if no match or at end - `K`"
  ([^PatriciaTrie this key]
    (-> this (.nextKey key))))

(defn previous-key
  "Description copied from interface: OrderedMap

  key - the key to search for previous from - `K`

  returns: the previous key, null if no match or at start - `K`"
  ([^PatriciaTrie this key]
    (-> this (.previousKey key))))

(defn size
  "returns: the number of key-value mappings in this map - `int`"
  (^Integer [^PatriciaTrie this]
    (-> this (.size))))

(defn clear
  ""
  ([^PatriciaTrie this]
    (-> this (.clear))))

(defn contains-key
  "k - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified
           key - `boolean`"
  (^Boolean [^PatriciaTrie this ^java.lang.Object k]
    (-> this (.containsKey k))))

(defn prefix-map
  "Description copied from interface: Trie

  key - the key used in the search - `K`

  returns: a SortedMap view of this Trie with all elements whose
     key is prefixed by the search key - `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^PatriciaTrie this key]
    (-> this (.prefixMap key))))

(defn get
  "k - the key whose associated value is to be returned - `java.lang.Object`

  returns: the value to which the specified key is mapped, or
           null if this map contains no mapping for the key - `V`"
  ([^PatriciaTrie this ^java.lang.Object k]
    (-> this (.get k))))

(defn select-key
  "Returns the key that is closest in a bitwise XOR metric to the
   provided key. This is NOT lexicographic closeness!

   For example, given the keys:


   D = 1000100
   H = 1001000
   L = 1001100


   If the Trie contained 'H' and 'L', a lookup of 'D' would
   return 'L', because the XOR distance between D & L is smaller
   than the XOR distance between D & H.

  key - the key to use in the search - `K`

  returns: the key that is closest in a bitwise XOR metric to the provided key - `K`"
  ([^PatriciaTrie this key]
    (-> this (.selectKey key))))

