(ns org.apache.commons.collections4.map.UnmodifiableEntrySet
  "Decorates a map entry Set to ensure it can't be altered.

  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map UnmodifiableEntrySet]))

(defn *unmodifiable-entry-set
  "Factory method to create an unmodifiable set of Map Entry objects.

  set - the set to decorate, must not be null - `java.util.Set`

  returns: a new unmodifiable entry set - `<K,V> java.util.Set<java.util.Map$Entry<K,V>>`

  throws: java.lang.NullPointerException - if set is null"
  ([^java.util.Set set]
    (UnmodifiableEntrySet/unmodifiableEntrySet set)))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableEntrySet this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^UnmodifiableEntrySet this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn iterator
  "returns: `java.util.Iterator<java.util.Map$Entry<K,V>>`"
  (^java.util.Iterator [^UnmodifiableEntrySet this]
    (-> this (.iterator))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UnmodifiableEntrySet this ^java.lang.Object object]
    (-> this (.remove object))))

(defn add
  "object - `java.util.Map$Entry`

  returns: `boolean`"
  (^Boolean [^UnmodifiableEntrySet this ^java.util.Map$Entry object]
    (-> this (.add object))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableEntrySet this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^UnmodifiableEntrySet this]
    (-> this (.clear))))

(defn to-array
  "array - `T[]`

  returns: `<T> T[]`"
  ([^UnmodifiableEntrySet this array]
    (-> this (.toArray array)))
  ([^UnmodifiableEntrySet this]
    (-> this (.toArray))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableEntrySet this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

