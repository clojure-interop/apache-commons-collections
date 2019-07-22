(ns org.apache.commons.collections4.Get
  "The \"read\" subset of the Map interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 Get]))

(defn values
  "returns: a collection view of the values contained in this map - `java.util.Collection<V>`"
  (^java.util.Collection [^Get this]
    (-> this (.values))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^Get this]
    (-> this (.entrySet))))

(defn contains-value
  "value - value whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map maps one or more keys to the
           specified value - `boolean`"
  (^Boolean [^Get this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "key - key whose mapping is to be removed from the map - `java.lang.Object`

  returns: the previous value associated with key, or
           null if there was no mapping for key. - `V`"
  ([^Get this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: a set view of the keys contained in this map - `java.util.Set<K>`"
  (^java.util.Set [^Get this]
    (-> this (.keySet))))

(defn empty?
  "returns: true if this map contains no key-value mappings - `boolean`"
  (^Boolean [^Get this]
    (-> this (.isEmpty))))

(defn size
  "returns: the number of key-value mappings in this map - `int`"
  (^Integer [^Get this]
    (-> this (.size))))

(defn contains-key
  "key - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified
           key - `boolean`"
  (^Boolean [^Get this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "key - the key whose associated value is to be returned - `java.lang.Object`

  returns: the value to which the specified key is mapped, or
           null if this map contains no mapping for the key - `V`"
  ([^Get this ^java.lang.Object key]
    (-> this (.get key))))

