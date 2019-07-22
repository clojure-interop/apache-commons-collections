(ns org.apache.commons.collections4.set.UnmodifiableSet
  "Decorates another Set to ensure it can't be altered.

  This class is Serializable from Commons Collections 3.1.


  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set UnmodifiableSet]))

(defn *unmodifiable-set
  "Factory method to create an unmodifiable set.

  set - the set to decorate, must not be null - `java.util.Set`

  returns: a new unmodifiable set - `<E> java.util.Set<E>`

  throws: java.lang.NullPointerException - if set is null"
  ([^java.util.Set set]
    (UnmodifiableSet/unmodifiableSet set)))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^UnmodifiableSet this]
    (-> this (.iterator))))

(defn add
  "object - `E`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSet this object]
    (-> this (.add object))))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSet this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn clear
  ""
  ([^UnmodifiableSet this]
    (-> this (.clear))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSet this ^java.lang.Object object]
    (-> this (.remove object))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSet this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSet this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSet this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

