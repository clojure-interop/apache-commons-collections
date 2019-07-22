(ns org.apache.commons.collections4.list.UnmodifiableList
  "Decorates another List to ensure it can't be altered.

  This class is Serializable from Commons Collections 3.1.


  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list UnmodifiableList]))

(defn ->unmodifiable-list
  "Constructor.

  Constructor that wraps (not copies).

  list - the list to decorate, must not be null - `java.util.List`

  throws: java.lang.NullPointerException - if list is null"
  (^UnmodifiableList [^java.util.List list]
    (new UnmodifiableList list)))

(defn *unmodifiable-list
  "Factory method to create an unmodifiable list.

  list - the list to decorate, must not be null - `java.util.List`

  returns: a new unmodifiable list - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if list is null"
  ([^java.util.List list]
    (UnmodifiableList/unmodifiableList list)))

(defn add-all
  "index - `int`
  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableList this ^Integer index ^java.util.Collection coll]
    (-> this (.addAll index coll)))
  (^Boolean [^UnmodifiableList this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^UnmodifiableList this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn list-iterator
  "index - `int`

  returns: `java.util.ListIterator<E>`"
  (^java.util.ListIterator [^UnmodifiableList this ^Integer index]
    (-> this (.listIterator index)))
  (^java.util.ListIterator [^UnmodifiableList this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^UnmodifiableList this]
    (-> this (.iterator))))

(defn sub-list
  "from-index - `int`
  to-index - `int`

  returns: `java.util.List<E>`"
  (^java.util.List [^UnmodifiableList this ^Integer from-index ^Integer to-index]
    (-> this (.subList from-index to-index))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UnmodifiableList this ^java.lang.Object object]
    (-> this (.remove object))))

(defn add
  "index - `int`
  object - `E`"
  ([^UnmodifiableList this ^Integer index object]
    (-> this (.add index object)))
  (^Boolean [^UnmodifiableList this ^java.lang.Object object]
    (-> this (.add object))))

(defn set
  "index - `int`
  object - `E`

  returns: `E`"
  ([^UnmodifiableList this ^Integer index object]
    (-> this (.set index object))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableList this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^UnmodifiableList this]
    (-> this (.clear))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableList this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

