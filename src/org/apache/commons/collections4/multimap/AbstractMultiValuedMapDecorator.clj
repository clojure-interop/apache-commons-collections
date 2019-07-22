(ns org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator
  "Decorates another MultiValuedMap to provide additional behaviour.

  Each method call made on this MultiValuedMap is forwarded to the
  decorated MultiValuedMap. This class is used as a framework to build
  to extensions such as synchronized and unmodifiable behaviour."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multimap AbstractMultiValuedMapDecorator]))

(defn values
  "Description copied from interface: MultiValuedMap

  returns: a collection view of the values contained in this multi-valued map - `java.util.Collection<V>`"
  (^java.util.Collection [^AbstractMultiValuedMapDecorator this]
    (-> this (.values))))

(defn keys
  "Description copied from interface: MultiValuedMap

  returns: a multiset view of the keys contained in this map - `org.apache.commons.collections4.MultiSet<K>`"
  (^org.apache.commons.collections4.MultiSet [^AbstractMultiValuedMapDecorator this]
    (-> this (.keys))))

(defn map-iterator
  "Description copied from interface: MultiValuedMap

  returns: a map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^AbstractMultiValuedMapDecorator this]
    (-> this (.mapIterator))))

(defn put-all
  "Description copied from interface: MultiValuedMap

  key - the key to store against - `K`
  values - the values to add to the collection at the key, may not be null - `java.lang.Iterable`

  returns: true if the map changed as a result of this operation - `boolean`"
  (^Boolean [^AbstractMultiValuedMapDecorator this key ^java.lang.Iterable values]
    (-> this (.putAll key values)))
  (^Boolean [^AbstractMultiValuedMapDecorator this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Description copied from interface: MultiValuedMap

  key - the key to store against - `K`
  value - the value to add to the collection at the key - `V`

  returns: true if the map changed as a result of this put operation, or false
     if the map already contained the key-value mapping and the collection
     type does not allow duplicate values, e.g. when using a Set - `boolean`"
  (^Boolean [^AbstractMultiValuedMapDecorator this key value]
    (-> this (.put key value))))

(defn contains-mapping
  "Description copied from interface: MultiValuedMap

  key - the key to search for - `java.lang.Object`
  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the value - `boolean`"
  (^Boolean [^AbstractMultiValuedMapDecorator this ^java.lang.Object key ^java.lang.Object value]
    (-> this (.containsMapping key value))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractMultiValuedMapDecorator this]
    (-> this (.toString))))

(defn contains-value
  "Description copied from interface: MultiValuedMap

  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the value - `boolean`"
  (^Boolean [^AbstractMultiValuedMapDecorator this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "Description copied from interface: MultiValuedMap

  key - the key to remove values from - `java.lang.Object`

  returns: the values that were removed - `java.util.Collection<V>`"
  (^java.util.Collection [^AbstractMultiValuedMapDecorator this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Description copied from interface: MultiValuedMap

  returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^AbstractMultiValuedMapDecorator this]
    (-> this (.keySet))))

(defn entries
  "Description copied from interface: MultiValuedMap

  returns: a set view of the mappings contained in this map - `java.util.Collection<java.util.Map$Entry<K,V>>`"
  (^java.util.Collection [^AbstractMultiValuedMapDecorator this]
    (-> this (.entries))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractMultiValuedMapDecorator this]
    (-> this (.hashCode))))

(defn empty?
  "Description copied from interface: MultiValuedMap

  returns: true if this map contains no key-value mappings - `boolean`"
  (^Boolean [^AbstractMultiValuedMapDecorator this]
    (-> this (.isEmpty))))

(defn size
  "Description copied from interface: MultiValuedMap

  returns: the total size of the map - `int`"
  (^Integer [^AbstractMultiValuedMapDecorator this]
    (-> this (.size))))

(defn clear
  "Description copied from interface: MultiValuedMap"
  ([^AbstractMultiValuedMapDecorator this]
    (-> this (.clear))))

(defn contains-key
  "Description copied from interface: MultiValuedMap

  key - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified key - `boolean`"
  (^Boolean [^AbstractMultiValuedMapDecorator this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn as-map
  "Description copied from interface: MultiValuedMap

  returns: a map view of the mappings in this multi-valued map - `java.util.Map<K,java.util.Collection<V>>`"
  (^java.util.Map [^AbstractMultiValuedMapDecorator this]
    (-> this (.asMap))))

(defn get
  "Description copied from interface: MultiValuedMap

  key - the key to retrieve - `K`

  returns: the Collection of values, implementations should
     return an empty collection for no mapping - `java.util.Collection<V>`"
  (^java.util.Collection [^AbstractMultiValuedMapDecorator this key]
    (-> this (.get key))))

(defn remove-mapping
  "Description copied from interface: MultiValuedMap

  key - the key to remove from - `java.lang.Object`
  item - the item to remove - `java.lang.Object`

  returns: true if the mapping was removed, false otherwise - `boolean`"
  (^Boolean [^AbstractMultiValuedMapDecorator this ^java.lang.Object key ^java.lang.Object item]
    (-> this (.removeMapping key item))))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractMultiValuedMapDecorator this ^java.lang.Object object]
    (-> this (.equals object))))

