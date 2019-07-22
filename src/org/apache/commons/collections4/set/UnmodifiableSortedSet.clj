(ns org.apache.commons.collections4.set.UnmodifiableSortedSet
  "Decorates another SortedSet to ensure it can't be altered.

  This class is Serializable from Commons Collections 3.1.


  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set UnmodifiableSortedSet]))

(defn *unmodifiable-sorted-set
  "Factory method to create an unmodifiable set.

  set - the set to decorate, must not be null - `java.util.SortedSet`

  returns: a new unmodifiable SortedSet - `<E> java.util.SortedSet<E>`

  throws: java.lang.NullPointerException - if set is null"
  ([^java.util.SortedSet set]
    (UnmodifiableSortedSet/unmodifiableSortedSet set)))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSortedSet this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn tail-set
  "from-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^UnmodifiableSortedSet this from-element]
    (-> this (.tailSet from-element))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSortedSet this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^UnmodifiableSortedSet this]
    (-> this (.iterator))))

(defn sub-set
  "from-element - `E`
  to-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^UnmodifiableSortedSet this from-element to-element]
    (-> this (.subSet from-element to-element))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSortedSet this ^java.lang.Object object]
    (-> this (.remove object))))

(defn add
  "object - `E`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSortedSet this object]
    (-> this (.add object))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSortedSet this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn head-set
  "to-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^UnmodifiableSortedSet this to-element]
    (-> this (.headSet to-element))))

(defn clear
  ""
  ([^UnmodifiableSortedSet this]
    (-> this (.clear))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSortedSet this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

