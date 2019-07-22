(ns org.apache.commons.collections4.MultiValuedMap
  "Defines a map that holds a collection of values against each key.

  A MultiValuedMap is a Map with slightly different semantics:


    Putting a value into the map will add the value to a Collection at that key.
    Getting a value will return a Collection, holding all the values put to that key.


  For example:



  MultiValuedMap<K, String> map = new MultiValuedHashMap<K, String>();
  map.put(key, \"A\");
  map.put(key, \"B\");
  map.put(key, \"C\");
  Collection<String> coll = map.get(key);

  coll will be a collection containing \"A\", \"B\", \"C\"."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 MultiValuedMap]))

(defn values
  "Gets a Collection view of all values contained in this multi-valued map.

   Implementations typically return a collection containing the combination
   of values from all keys.

  returns: a collection view of the values contained in this multi-valued map - `java.util.Collection<V>`"
  (^java.util.Collection [^MultiValuedMap this]
    (-> this (.values))))

(defn keys
  "Returns a MultiSet view of the keys contained in this multi-valued map.

   The MultiSet.getCount(Object) method of the returned multiset will give
   the same result a calling get(Object).size() for the same key.

   This multiset is backed by the map, so any changes in the map are reflected in
   the multiset.

  returns: a multiset view of the keys contained in this map - `org.apache.commons.collections4.MultiSet<K>`"
  (^org.apache.commons.collections4.MultiSet [^MultiValuedMap this]
    (-> this (.keys))))

(defn map-iterator
  "Obtains a MapIterator over this multi-valued map.

   A map iterator is an efficient way of iterating over maps. There is no
   need to access the entries collection or use Map.Entry objects.

  returns: a map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^MultiValuedMap this]
    (-> this (.mapIterator))))

(defn put-all
  "Adds a mapping to the specified key for all values contained in the given Iterable.

  key - the key to store against - `K`
  values - the values to add to the collection at the key, may not be null - `java.lang.Iterable`

  returns: true if the map changed as a result of this operation - `boolean`

  throws: java.lang.NullPointerException - if the specified iterable is null, or if this map does not permit null keys or values, and the specified key or values contain null (optional)"
  (^Boolean [^MultiValuedMap this key ^java.lang.Iterable values]
    (-> this (.putAll key values)))
  (^Boolean [^MultiValuedMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Adds a key-value mapping to this multi-valued map.

   Unlike a normal Map the previous value is not replaced.
   Instead the new value is added to the collection stored against the key.
   Depending on the collection type used, duplicate key-value mappings may
   be allowed.

   The method will return true if the size of the multi-valued map
   has been increased because of this operation.

  key - the key to store against - `K`
  value - the value to add to the collection at the key - `V`

  returns: true if the map changed as a result of this put operation, or false
     if the map already contained the key-value mapping and the collection
     type does not allow duplicate values, e.g. when using a Set - `boolean`

  throws: java.lang.UnsupportedOperationException - if the put operation is not supported by this multi-valued map, e.g. if it is unmodifiable"
  (^Boolean [^MultiValuedMap this key value]
    (-> this (.put key value))))

(defn contains-mapping
  "Checks whether the map contains a mapping for the specified key and value.

  key - the key to search for - `java.lang.Object`
  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the value - `boolean`"
  (^Boolean [^MultiValuedMap this ^java.lang.Object key ^java.lang.Object value]
    (-> this (.containsMapping key value))))

(defn contains-value
  "Checks whether the map contains at least one mapping for the specified value.

  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the value - `boolean`

  throws: java.lang.NullPointerException - if the value is null and null values are not supported by the used collection types (optional)"
  (^Boolean [^MultiValuedMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "Removes all values associated with the specified key.

   The returned collection may be modifiable, but updates will not be propagated
   to this multi-valued map. In case no mapping was stored for the specified
   key, an empty, unmodifiable collection will be returned.

  key - the key to remove values from - `java.lang.Object`

  returns: the values that were removed - `java.util.Collection<V>`

  throws: java.lang.UnsupportedOperationException - if the map is unmodifiable"
  (^java.util.Collection [^MultiValuedMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Returns a Set view of the keys contained in this multi-valued map.

   The set is backed by the map, so changes to the map are reflected
   in the set, and vice-versa.

   If the map is modified while an iteration over the set is in
   progress (except through the iterator's own remove operation),
   the result of the iteration is undefined. The set supports element
   removal, which removes the corresponding mapping from the map, via the
   Iterator.remove, Set.remove, removeAll,
   retainAll, and clear operations. It does not support
   the add or addAll operations.

  returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^MultiValuedMap this]
    (-> this (.keySet))))

(defn entries
  "Returns a Collection view of the mappings contained in this multi-valued map.

   The collection is backed by the map, so changes to the map are reflected
   in the collection, and vice-versa.

  returns: a set view of the mappings contained in this map - `java.util.Collection<java.util.Map$Entry<K,V>>`"
  (^java.util.Collection [^MultiValuedMap this]
    (-> this (.entries))))

(defn empty?
  "Returns true if this map contains no key-value mappings.

  returns: true if this map contains no key-value mappings - `boolean`"
  (^Boolean [^MultiValuedMap this]
    (-> this (.isEmpty))))

(defn size
  "Gets the total size of the map.

   Implementations would return the total size of the map which is the count
   of the values from all keys.

  returns: the total size of the map - `int`"
  (^Integer [^MultiValuedMap this]
    (-> this (.size))))

(defn clear
  "Removes all of the mappings from this map (optional operation).

   The map will be empty after this call returns.

  throws: java.lang.UnsupportedOperationException - if the map is unmodifiable"
  ([^MultiValuedMap this]
    (-> this (.clear))))

(defn contains-key
  "Returns true if this map contains a mapping for the specified
   key. More formally, returns true if and only if this map contains
   a mapping for a key k such that (key==null ? k==null : key.equals(k)).
   (There can be at most one such mapping.)

  key - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified key - `boolean`

  throws: java.lang.NullPointerException - if the specified key is null and this map does not permit null keys (optional)"
  (^Boolean [^MultiValuedMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn as-map
  "Returns a view of this multi-valued map as a Map from each distinct
   key to the non-empty collection of that key's associated values.

   Note that this.asMap().get(k) is equivalent to this.get(k)
   only when k is a key contained in the multi-valued map; otherwise it
   returns null as opposed to an empty collection.

   Changes to the returned map or the collections that serve as its values
   will update the underlying multi-valued map, and vice versa. The map does
   not support put or putAll, nor do its entries support
   setValue.

  returns: a map view of the mappings in this multi-valued map - `java.util.Map<K,java.util.Collection<V>>`"
  (^java.util.Map [^MultiValuedMap this]
    (-> this (.asMap))))

(defn get
  "Returns a view collection of the values associated with the specified key.

   This method will return an empty collection if containsKey(Object)
   returns false. Changes to the returned collection will update the underlying
   MultiValuedMap and vice-versa.

  key - the key to retrieve - `K`

  returns: the Collection of values, implementations should
     return an empty collection for no mapping - `java.util.Collection<V>`

  throws: java.lang.NullPointerException - if the key is null and null keys are invalid (optional)"
  (^java.util.Collection [^MultiValuedMap this key]
    (-> this (.get key))))

(defn remove-mapping
  "Removes a key-value mapping from the map.

   The item is removed from the collection mapped to the specified key.
   Other values attached to that key are unaffected.

   If the last value for a key is removed, implementations typically return
   an empty collection from a subsequent get(Object).

  key - the key to remove from - `java.lang.Object`
  item - the item to remove - `java.lang.Object`

  returns: true if the mapping was removed, false otherwise - `boolean`

  throws: java.lang.UnsupportedOperationException - if the map is unmodifiable"
  (^Boolean [^MultiValuedMap this ^java.lang.Object key ^java.lang.Object item]
    (-> this (.removeMapping key item))))

