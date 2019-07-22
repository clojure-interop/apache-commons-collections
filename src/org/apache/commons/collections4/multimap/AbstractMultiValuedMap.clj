(ns org.apache.commons.collections4.multimap.AbstractMultiValuedMap
  "Abstract implementation of the MultiValuedMap interface to simplify
  the creation of subclass implementations.

  Subclasses specify a Map implementation to use as the internal storage."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multimap AbstractMultiValuedMap]))

(defn values
  "Gets a collection containing all the values in the map.

   Returns a collection containing all the values from all keys.

  returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^AbstractMultiValuedMap this]
    (-> this (.values))))

(defn keys
  "Returns a MultiSet view of the key mapping contained in this map.

   Returns a MultiSet of keys with its values count as the count of the MultiSet.
   This multiset is backed by the map, so any changes in the map is reflected here.
   Any method which modifies this multiset like add, remove,
   Iterator.remove() etc throws UnsupportedOperationException.

  returns: a bag view of the key mapping contained in this map - `org.apache.commons.collections4.MultiSet<K>`"
  (^org.apache.commons.collections4.MultiSet [^AbstractMultiValuedMap this]
    (-> this (.keys))))

(defn map-iterator
  "Description copied from interface: MultiValuedMap

  returns: a map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^AbstractMultiValuedMap this]
    (-> this (.mapIterator))))

(defn put-all
  "Adds Iterable values to the collection associated with the specified key.

  key - the key to store against - `K`
  values - the values to add to the collection at the key, may not be null - `java.lang.Iterable`

  returns: true if this map changed - `boolean`

  throws: java.lang.NullPointerException - if values is null"
  (^Boolean [^AbstractMultiValuedMap this key ^java.lang.Iterable values]
    (-> this (.putAll key values)))
  (^Boolean [^AbstractMultiValuedMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Adds the value to the collection associated with the specified key.

   Unlike a normal Map the previous value is not replaced.
   Instead the new value is added to the collection stored against the key.

  key - the key to store against - `K`
  value - the value to add to the collection at the key - `V`

  returns: the value added if the map changed and null if the map did not change - `boolean`"
  (^Boolean [^AbstractMultiValuedMap this key value]
    (-> this (.put key value))))

(defn contains-mapping
  "Description copied from interface: MultiValuedMap

  key - the key to search for - `java.lang.Object`
  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the value - `boolean`"
  (^Boolean [^AbstractMultiValuedMap this ^java.lang.Object key ^java.lang.Object value]
    (-> this (.containsMapping key value))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractMultiValuedMap this]
    (-> this (.toString))))

(defn contains-value
  "Description copied from interface: MultiValuedMap

  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the value - `boolean`"
  (^Boolean [^AbstractMultiValuedMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "Removes all values associated with the specified key.

   A subsequent get(Object) would return an empty collection.

  key - the key to remove values from - `java.lang.Object`

  returns: the Collection of values removed, will return an
     empty, unmodifiable collection for no mapping found - `java.util.Collection<V>`"
  (^java.util.Collection [^AbstractMultiValuedMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Description copied from interface: MultiValuedMap

  returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^AbstractMultiValuedMap this]
    (-> this (.keySet))))

(defn entries
  "Description copied from interface: MultiValuedMap

  returns: a set view of the mappings contained in this map - `java.util.Collection<java.util.Map$Entry<K,V>>`"
  (^java.util.Collection [^AbstractMultiValuedMap this]
    (-> this (.entries))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractMultiValuedMap this]
    (-> this (.hashCode))))

(defn empty?
  "Description copied from interface: MultiValuedMap

  returns: true if this map contains no key-value mappings - `boolean`"
  (^Boolean [^AbstractMultiValuedMap this]
    (-> this (.isEmpty))))

(defn size
  "Gets the total size of the map.

   Implementations would return the total size of the map which is the count
   of the values from all keys.

   This implementation does not cache the total size
   of the multi-valued map, but rather calculates it by iterating
   over the entries of the underlying map.

  returns: the total size of the map - `int`"
  (^Integer [^AbstractMultiValuedMap this]
    (-> this (.size))))

(defn clear
  "Description copied from interface: MultiValuedMap"
  ([^AbstractMultiValuedMap this]
    (-> this (.clear))))

(defn contains-key
  "Description copied from interface: MultiValuedMap

  key - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified key - `boolean`"
  (^Boolean [^AbstractMultiValuedMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn as-map
  "Description copied from interface: MultiValuedMap

  returns: a map view of the mappings in this multi-valued map - `java.util.Map<K,java.util.Collection<V>>`"
  (^java.util.Map [^AbstractMultiValuedMap this]
    (-> this (.asMap))))

(defn get
  "Gets the collection of values associated with the specified key. This
   would return an empty collection in case the mapping is not present

  key - the key to retrieve - `K`

  returns: the Collection of values, will return an empty Collection for no mapping - `java.util.Collection<V>`"
  (^java.util.Collection [^AbstractMultiValuedMap this key]
    (-> this (.get key))))

(defn remove-mapping
  "Removes a specific key/value mapping from the multi-valued map.

   The value is removed from the collection mapped to the specified key.
   Other values attached to that key are unaffected.

   If the last value for a key is removed, an empty collection would be
   returned from a subsequent get(Object).

  key - the key to remove from - `java.lang.Object`
  value - the value to remove - `java.lang.Object`

  returns: true if the mapping was removed, false otherwise - `boolean`"
  (^Boolean [^AbstractMultiValuedMap this ^java.lang.Object key ^java.lang.Object value]
    (-> this (.removeMapping key value))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractMultiValuedMap this ^java.lang.Object obj]
    (-> this (.equals obj))))

