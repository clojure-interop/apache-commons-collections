(ns org.apache.commons.collections4.trie.UnmodifiableTrie
  "An unmodifiable Trie."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.trie UnmodifiableTrie]))

(defn ->unmodifiable-trie
  "Constructor.

  Constructor that wraps (not copies).

  trie - the trie to decorate, must not be null - `org.apache.commons.collections4.Trie`

  throws: java.lang.NullPointerException - if trie is null"
  (^UnmodifiableTrie [^org.apache.commons.collections4.Trie trie]
    (new UnmodifiableTrie trie)))

(defn *unmodifiable-trie
  "Factory method to create a unmodifiable trie.

  trie - the trie to decorate, must not be null - `org.apache.commons.collections4.Trie`

  returns: a new unmodifiable trie - `<K,V> org.apache.commons.collections4.Trie<K,V>`

  throws: java.lang.NullPointerException - if trie is null"
  ([^org.apache.commons.collections4.Trie trie]
    (UnmodifiableTrie/unmodifiableTrie trie)))

(defn values
  "returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^UnmodifiableTrie this]
    (-> this (.values))))

(defn map-iterator
  "Description copied from interface: OrderedMap

  returns: a map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^UnmodifiableTrie this]
    (-> this (.mapIterator))))

(defn put-all
  "m - mappings to be stored in this map - `java.util.Map`"
  ([^UnmodifiableTrie this ^java.util.Map m]
    (-> this (.putAll m))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^UnmodifiableTrie this to-key]
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
  ([^UnmodifiableTrie this key value]
    (-> this (.put key value))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^UnmodifiableTrie this]
    (-> this (.entrySet))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UnmodifiableTrie this]
    (-> this (.toString))))

(defn first-key
  "Description copied from interface: OrderedMap

  returns: the first key currently in this map - `K`"
  ([^UnmodifiableTrie this]
    (-> this (.firstKey))))

(defn contains-value
  "value - value whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map maps one or more keys to the
           specified value - `boolean`"
  (^Boolean [^UnmodifiableTrie this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn last-key
  "Description copied from interface: OrderedMap

  returns: the last key currently in this map - `K`"
  ([^UnmodifiableTrie this]
    (-> this (.lastKey))))

(defn remove
  "key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^UnmodifiableTrie this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^UnmodifiableTrie this]
    (-> this (.keySet))))

(defn comparator
  "returns: `java.util.Comparator<? super K>`"
  ([^UnmodifiableTrie this]
    (-> this (.comparator))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^UnmodifiableTrie this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^UnmodifiableTrie this from-key]
    (-> this (.tailMap from-key))))

(defn next-key
  "Description copied from interface: OrderedMap

  key - the key to search for next from - `K`

  returns: the next key, null if no match or at end - `K`"
  ([^UnmodifiableTrie this key]
    (-> this (.nextKey key))))

(defn previous-key
  "Description copied from interface: OrderedMap

  key - the key to search for previous from - `K`

  returns: the previous key, null if no match or at start - `K`"
  ([^UnmodifiableTrie this key]
    (-> this (.previousKey key))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UnmodifiableTrie this]
    (-> this (.hashCode))))

(defn empty?
  "returns: true if this map contains no key-value mappings - `boolean`"
  (^Boolean [^UnmodifiableTrie this]
    (-> this (.isEmpty))))

(defn size
  "returns: the number of key-value mappings in this map - `int`"
  (^Integer [^UnmodifiableTrie this]
    (-> this (.size))))

(defn clear
  ""
  ([^UnmodifiableTrie this]
    (-> this (.clear))))

(defn contains-key
  "key - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified
           key - `boolean`"
  (^Boolean [^UnmodifiableTrie this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn prefix-map
  "Description copied from interface: Trie

  key - the key used in the search - `K`

  returns: a SortedMap view of this Trie with all elements whose
     key is prefixed by the search key - `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^UnmodifiableTrie this key]
    (-> this (.prefixMap key))))

(defn get
  "key - the key whose associated value is to be returned - `java.lang.Object`

  returns: the value to which the specified key is mapped, or
           null if this map contains no mapping for the key - `V`"
  ([^UnmodifiableTrie this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UnmodifiableTrie this ^java.lang.Object obj]
    (-> this (.equals obj))))

