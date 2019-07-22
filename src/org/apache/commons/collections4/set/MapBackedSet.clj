(ns org.apache.commons.collections4.set.MapBackedSet
  "Decorates a Map to obtain Set behaviour.

  This class is used to create a Set with the same properties as
  the key set of any map. Thus, a ReferenceSet can be created by wrapping a
  ReferenceMap in an instance of this class.


  Most map implementation can be used to create a set by passing in dummy values.
  Exceptions include BidiMap implementations, as they require unique values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set MapBackedSet]))

(defn *map-backed-set
  "Factory method to create a set from a map.

  map - the map to decorate, must not be null - `java.util.Map`
  dummy-value - the dummy value to use - `V`

  returns: a new map backed set - `<E,V> org.apache.commons.collections4.set.MapBackedSet<E,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.Map map dummy-value]
    (MapBackedSet/mapBackedSet map dummy-value))
  ([^java.util.Map map]
    (MapBackedSet/mapBackedSet map)))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^MapBackedSet this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^MapBackedSet this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn contains
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MapBackedSet this ^java.lang.Object obj]
    (-> this (.contains obj))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^MapBackedSet this]
    (-> this (.iterator))))

(defn remove
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MapBackedSet this ^java.lang.Object obj]
    (-> this (.remove obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MapBackedSet this]
    (-> this (.hashCode))))

(defn add
  "obj - `E`

  returns: `boolean`"
  (^Boolean [^MapBackedSet this obj]
    (-> this (.add obj))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^MapBackedSet this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^MapBackedSet this]
    (-> this (.size))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^MapBackedSet this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^MapBackedSet this]
    (-> this (.clear))))

(defn to-array
  "array - `T[]`

  returns: `<T> T[]`"
  ([^MapBackedSet this array]
    (-> this (.toArray array)))
  ([^MapBackedSet this]
    (-> this (.toArray))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^MapBackedSet this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MapBackedSet this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn contains-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^MapBackedSet this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

