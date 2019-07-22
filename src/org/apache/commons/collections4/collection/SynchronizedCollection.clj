(ns org.apache.commons.collections4.collection.SynchronizedCollection
  "Decorates another Collection to synchronize its behaviour
  for a multi-threaded environment.

  Iterators must be manually synchronized:



  synchronized (coll) {
    Iterator it = coll.iterator();
    // do stuff with iterator
  }

  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.collection SynchronizedCollection]))

(defn *synchronized-collection
  "Factory method to create a synchronized collection.

  coll - the collection to decorate, must not be null - `java.util.Collection`

  returns: a new synchronized collection - `<T> org.apache.commons.collections4.collection.SynchronizedCollection<T>`

  throws: java.lang.NullPointerException - if collection is null"
  ([^java.util.Collection coll]
    (SynchronizedCollection/synchronizedCollection coll)))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^SynchronizedCollection this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^SynchronizedCollection this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn contains
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SynchronizedCollection this ^java.lang.Object object]
    (-> this (.contains object))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SynchronizedCollection this]
    (-> this (.toString))))

(defn iterator
  "Iterators must be manually synchronized.


   synchronized (coll) {
     Iterator it = coll.iterator();
     // do stuff with iterator
   }

  returns: an iterator that must be manually synchronized on the collection - `java.util.Iterator<E>`"
  (^java.util.Iterator [^SynchronizedCollection this]
    (-> this (.iterator))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SynchronizedCollection this ^java.lang.Object object]
    (-> this (.remove object))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SynchronizedCollection this]
    (-> this (.hashCode))))

(defn add
  "object - `E`

  returns: `boolean`"
  (^Boolean [^SynchronizedCollection this object]
    (-> this (.add object))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^SynchronizedCollection this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^SynchronizedCollection this]
    (-> this (.size))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^SynchronizedCollection this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^SynchronizedCollection this]
    (-> this (.clear))))

(defn to-array
  "object - `T[]`

  returns: `<T> T[]`"
  ([^SynchronizedCollection this object]
    (-> this (.toArray object)))
  ([^SynchronizedCollection this]
    (-> this (.toArray))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^SynchronizedCollection this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SynchronizedCollection this ^java.lang.Object object]
    (-> this (.equals object))))

(defn contains-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^SynchronizedCollection this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

