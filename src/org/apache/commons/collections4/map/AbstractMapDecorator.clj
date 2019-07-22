(ns org.apache.commons.collections4.map.AbstractMapDecorator
  "Provides a base decorator that enables additional functionality to be added
  to a Map via decoration.

  Methods are forwarded directly to the decorated map.


  This implementation does not perform any special processing with
  entrySet(), keySet() or values(). Instead
  it simply returns the set/collection from the wrapped map. This may be
  undesirable, for example if you are trying to write a validating
  implementation it would provide a loophole around the validation.
  But, you might want that loophole, so this class is kept simple."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractMapDecorator]))

(defn values
  "returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^AbstractMapDecorator this]
    (-> this (.values))))

(defn put-all
  "map-to-copy - mappings to be stored in this map - `java.util.Map`"
  ([^AbstractMapDecorator this ^java.util.Map map-to-copy]
    (-> this (.putAll map-to-copy))))

(defn put
  "Description copied from interface: Put

  key - key with which the specified value is to be associated - `K`
  value - value to be associated with the specified key - `V`

  returns: the previous value associated with key, or
           null if there was no mapping for key.
           (A null return can also indicate that the map
           previously associated null with key,
           if the implementation supports null values.) - `V`"
  ([^AbstractMapDecorator this key value]
    (-> this (.put key value))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^AbstractMapDecorator this]
    (-> this (.entrySet))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractMapDecorator this]
    (-> this (.toString))))

(defn contains-value
  "value - value whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map maps one or more keys to the
           specified value - `boolean`"
  (^Boolean [^AbstractMapDecorator this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^AbstractMapDecorator this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^AbstractMapDecorator this]
    (-> this (.keySet))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractMapDecorator this]
    (-> this (.hashCode))))

(defn empty?
  "returns: true if this map contains no key-value mappings - `boolean`"
  (^Boolean [^AbstractMapDecorator this]
    (-> this (.isEmpty))))

(defn size
  "returns: the number of key-value mappings in this map - `int`"
  (^Integer [^AbstractMapDecorator this]
    (-> this (.size))))

(defn clear
  ""
  ([^AbstractMapDecorator this]
    (-> this (.clear))))

(defn contains-key
  "key - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified
           key - `boolean`"
  (^Boolean [^AbstractMapDecorator this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "key - the key whose associated value is to be returned - `java.lang.Object`

  returns: the value to which the specified key is mapped, or
           null if this map contains no mapping for the key - `V`"
  ([^AbstractMapDecorator this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractMapDecorator this ^java.lang.Object object]
    (-> this (.equals object))))

