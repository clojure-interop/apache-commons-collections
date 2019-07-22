(ns org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap
  "Decorates another MultiValuedMap to ensure it can't be altered.

  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multimap UnmodifiableMultiValuedMap]))

(defn *unmodifiable-multi-valued-map
  "Factory method to create an unmodifiable MultiValuedMap.

   If the map passed in is already unmodifiable, it is returned.

  map - the map to decorate, may not be null - `org.apache.commons.collections4.MultiValuedMap`

  returns: an unmodifiable MultiValuedMap - `<K,V> org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^org.apache.commons.collections4.MultiValuedMap map]
    (UnmodifiableMultiValuedMap/unmodifiableMultiValuedMap map)))

(defn values
  "Description copied from interface: MultiValuedMap

  returns: a collection view of the values contained in this multi-valued map - `java.util.Collection<V>`"
  (^java.util.Collection [^UnmodifiableMultiValuedMap this]
    (-> this (.values))))

(defn keys
  "Description copied from interface: MultiValuedMap

  returns: a multiset view of the keys contained in this map - `org.apache.commons.collections4.MultiSet<K>`"
  (^org.apache.commons.collections4.MultiSet [^UnmodifiableMultiValuedMap this]
    (-> this (.keys))))

(defn map-iterator
  "Description copied from interface: MultiValuedMap

  returns: a map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^UnmodifiableMultiValuedMap this]
    (-> this (.mapIterator))))

(defn put-all
  "Description copied from interface: MultiValuedMap

  key - the key to store against - `K`
  values - the values to add to the collection at the key, may not be null - `java.lang.Iterable`

  returns: true if the map changed as a result of this operation - `boolean`"
  (^Boolean [^UnmodifiableMultiValuedMap this key ^java.lang.Iterable values]
    (-> this (.putAll key values)))
  (^Boolean [^UnmodifiableMultiValuedMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Description copied from interface: MultiValuedMap

  key - the key to store against - `K`
  value - the value to add to the collection at the key - `V`

  returns: true if the map changed as a result of this put operation, or false
     if the map already contained the key-value mapping and the collection
     type does not allow duplicate values, e.g. when using a Set - `boolean`"
  (^Boolean [^UnmodifiableMultiValuedMap this key value]
    (-> this (.put key value))))

(defn remove
  "Description copied from interface: MultiValuedMap

  key - the key to remove values from - `java.lang.Object`

  returns: the values that were removed - `java.util.Collection<V>`"
  (^java.util.Collection [^UnmodifiableMultiValuedMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Description copied from interface: MultiValuedMap

  returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^UnmodifiableMultiValuedMap this]
    (-> this (.keySet))))

(defn entries
  "Description copied from interface: MultiValuedMap

  returns: a set view of the mappings contained in this map - `java.util.Collection<java.util.Map$Entry<K,V>>`"
  (^java.util.Collection [^UnmodifiableMultiValuedMap this]
    (-> this (.entries))))

(defn clear
  "Description copied from interface: MultiValuedMap"
  ([^UnmodifiableMultiValuedMap this]
    (-> this (.clear))))

(defn as-map
  "Description copied from interface: MultiValuedMap

  returns: a map view of the mappings in this multi-valued map - `java.util.Map<K,java.util.Collection<V>>`"
  (^java.util.Map [^UnmodifiableMultiValuedMap this]
    (-> this (.asMap))))

(defn get
  "Description copied from interface: MultiValuedMap

  key - the key to retrieve - `K`

  returns: the Collection of values, implementations should
     return an empty collection for no mapping - `java.util.Collection<V>`"
  (^java.util.Collection [^UnmodifiableMultiValuedMap this key]
    (-> this (.get key))))

(defn remove-mapping
  "Description copied from interface: MultiValuedMap

  key - the key to remove from - `java.lang.Object`
  item - the item to remove - `java.lang.Object`

  returns: true if the mapping was removed, false otherwise - `boolean`"
  (^Boolean [^UnmodifiableMultiValuedMap this ^java.lang.Object key ^java.lang.Object item]
    (-> this (.removeMapping key item))))

