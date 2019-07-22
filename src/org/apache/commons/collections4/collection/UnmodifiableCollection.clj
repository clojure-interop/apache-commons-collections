(ns org.apache.commons.collections4.collection.UnmodifiableCollection
  "Decorates another Collection to ensure it can't be altered.

  This class is Serializable from Commons Collections 3.1.


  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.collection UnmodifiableCollection]))

(defn *unmodifiable-collection
  "Factory method to create an unmodifiable collection.

   If the collection passed in is already unmodifiable, it is returned.

  coll - the collection to decorate, must not be null - `java.util.Collection`

  returns: an unmodifiable collection - `<T> java.util.Collection<T>`

  throws: java.lang.NullPointerException - if collection is null"
  ([^java.util.Collection coll]
    (UnmodifiableCollection/unmodifiableCollection coll)))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^UnmodifiableCollection this]
    (-> this (.iterator))))

(defn add
  "object - `E`

  returns: `boolean`"
  (^Boolean [^UnmodifiableCollection this object]
    (-> this (.add object))))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableCollection this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn clear
  ""
  ([^UnmodifiableCollection this]
    (-> this (.clear))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UnmodifiableCollection this ^java.lang.Object object]
    (-> this (.remove object))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^UnmodifiableCollection this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableCollection this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableCollection this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

