(ns org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator
  "Provides a base decorator that allows additional functionality to be
  added to a Map.Entry."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.keyvalue AbstractMapEntryDecorator]))

(defn ->abstract-map-entry-decorator
  "Constructor.

  Constructor that wraps (not copies).

  entry - the Map.Entry to decorate, must not be null - `java.util.Map$Entry`

  throws: java.lang.NullPointerException - if the collection is null"
  (^AbstractMapEntryDecorator [^java.util.Map$Entry entry]
    (new AbstractMapEntryDecorator entry)))

(defn get-key
  "Description copied from interface: KeyValue

  returns: the key - `K`"
  ([^AbstractMapEntryDecorator this]
    (-> this (.getKey))))

(defn get-value
  "Description copied from interface: KeyValue

  returns: the value - `V`"
  ([^AbstractMapEntryDecorator this]
    (-> this (.getValue))))

(defn set-value
  "object - `V`

  returns: `V`"
  ([^AbstractMapEntryDecorator this object]
    (-> this (.setValue object))))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractMapEntryDecorator this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractMapEntryDecorator this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractMapEntryDecorator this]
    (-> this (.toString))))

