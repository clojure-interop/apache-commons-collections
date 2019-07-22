(ns org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator
  "IterableGet that uses a Map<K, V> for the
  Get<K, V> implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.splitmap AbstractIterableGetMapDecorator]))

(defn ->abstract-iterable-get-map-decorator
  "Constructor.

  Create a new AbstractSplitMapDecorator.

  map - the map to decorate, must not be null - `java.util.Map`

  throws: java.lang.NullPointerException - if map is null"
  (^AbstractIterableGetMapDecorator [^java.util.Map map]
    (new AbstractIterableGetMapDecorator map)))

(defn values
  "returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^AbstractIterableGetMapDecorator this]
    (-> this (.values))))

(defn map-iterator
  "Get a MapIterator over this Get.

  returns: MapIterator<K, V> - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^AbstractIterableGetMapDecorator this]
    (-> this (.mapIterator))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^AbstractIterableGetMapDecorator this]
    (-> this (.entrySet))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractIterableGetMapDecorator this]
    (-> this (.toString))))

(defn contains-value
  "value - value whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map maps one or more keys to the
           specified value - `boolean`"
  (^Boolean [^AbstractIterableGetMapDecorator this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^AbstractIterableGetMapDecorator this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^AbstractIterableGetMapDecorator this]
    (-> this (.keySet))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractIterableGetMapDecorator this]
    (-> this (.hashCode))))

(defn empty?
  "returns: true if this map contains no key-value mappings - `boolean`"
  (^Boolean [^AbstractIterableGetMapDecorator this]
    (-> this (.isEmpty))))

(defn size
  "returns: the number of key-value mappings in this map - `int`"
  (^Integer [^AbstractIterableGetMapDecorator this]
    (-> this (.size))))

(defn contains-key
  "key - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified
           key - `boolean`"
  (^Boolean [^AbstractIterableGetMapDecorator this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "key - the key whose associated value is to be returned - `java.lang.Object`

  returns: the value to which the specified key is mapped, or
           null if this map contains no mapping for the key - `V`"
  ([^AbstractIterableGetMapDecorator this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractIterableGetMapDecorator this ^java.lang.Object object]
    (-> this (.equals object))))

