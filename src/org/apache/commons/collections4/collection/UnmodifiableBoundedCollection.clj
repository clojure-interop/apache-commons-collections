(ns org.apache.commons.collections4.collection.UnmodifiableBoundedCollection
  "UnmodifiableBoundedCollection decorates another
  BoundedCollection to ensure it can't be altered.

  If a BoundedCollection is first wrapped in some other collection decorator,
  such as synchronized or predicated, the BoundedCollection methods are no
  longer accessible.
  The factory on this class will attempt to retrieve the bounded nature by
  examining the package scope variables.


  This class is Serializable from Commons Collections 3.1.


  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.collection UnmodifiableBoundedCollection]))

(defn *unmodifiable-bounded-collection
  "Factory method to create an unmodifiable bounded collection.

  coll - the BoundedCollection to decorate, must not be null - `org.apache.commons.collections4.BoundedCollection`

  returns: a new unmodifiable bounded collection - `<E> org.apache.commons.collections4.BoundedCollection<E>`

  throws: java.lang.NullPointerException - if coll is null"
  ([^org.apache.commons.collections4.BoundedCollection coll]
    (UnmodifiableBoundedCollection/unmodifiableBoundedCollection coll)))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableBoundedCollection this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^UnmodifiableBoundedCollection this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^UnmodifiableBoundedCollection this]
    (-> this (.iterator))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UnmodifiableBoundedCollection this ^java.lang.Object object]
    (-> this (.remove object))))

(defn full?
  "Description copied from interface: BoundedCollection

  returns: true if the collection is full. - `boolean`"
  (^Boolean [^UnmodifiableBoundedCollection this]
    (-> this (.isFull))))

(defn add
  "object - `E`

  returns: `boolean`"
  (^Boolean [^UnmodifiableBoundedCollection this object]
    (-> this (.add object))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableBoundedCollection this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^UnmodifiableBoundedCollection this]
    (-> this (.clear))))

(defn max-size
  "Description copied from interface: BoundedCollection

  returns: the maximum number of elements the collection can hold. - `int`"
  (^Integer [^UnmodifiableBoundedCollection this]
    (-> this (.maxSize))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableBoundedCollection this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

