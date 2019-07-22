(ns org.apache.commons.collections4.list.FixedSizeList
  "Decorates another List to fix the size preventing add/remove.

  The add, remove, clear and retain operations are unsupported.
  The set method is allowed (as it doesn't change the list size).


  NOTE:
  Modifying the decorated list directly would results in influencing the outcome
  of method calls on this object. For example, the bounds of this list would reflect
  a newly added object to the underlying list.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list FixedSizeList]))

(defn *fixed-size-list
  "Factory method to create a fixed size list.

  list - the list to decorate, must not be null - `java.util.List`

  returns: a new fixed size list - `<E> org.apache.commons.collections4.list.FixedSizeList<E>`

  throws: java.lang.NullPointerException - if list is null"
  ([^java.util.List list]
    (FixedSizeList/fixedSizeList list)))

(defn add-all
  "index - `int`
  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^FixedSizeList this ^Integer index ^java.util.Collection coll]
    (-> this (.addAll index coll)))
  (^Boolean [^FixedSizeList this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^FixedSizeList this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn list-iterator
  "index - `int`

  returns: `java.util.ListIterator<E>`"
  (^java.util.ListIterator [^FixedSizeList this ^Integer index]
    (-> this (.listIterator index)))
  (^java.util.ListIterator [^FixedSizeList this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^FixedSizeList this]
    (-> this (.iterator))))

(defn sub-list
  "from-index - `int`
  to-index - `int`

  returns: `java.util.List<E>`"
  (^java.util.List [^FixedSizeList this ^Integer from-index ^Integer to-index]
    (-> this (.subList from-index to-index))))

(defn last-index-of
  "object - `java.lang.Object`

  returns: `int`"
  (^Integer [^FixedSizeList this ^java.lang.Object object]
    (-> this (.lastIndexOf object))))

(defn remove
  "index - `int`

  returns: `E`"
  ([^FixedSizeList this ^Integer index]
    (-> this (.remove index))))

(defn full?
  "Description copied from interface: BoundedCollection

  returns: true if the collection is full. - `boolean`"
  (^Boolean [^FixedSizeList this]
    (-> this (.isFull))))

(defn add
  "index - `int`
  object - `E`"
  ([^FixedSizeList this ^Integer index object]
    (-> this (.add index object)))
  (^Boolean [^FixedSizeList this object]
    (-> this (.add object))))

(defn set
  "index - `int`
  object - `E`

  returns: `E`"
  ([^FixedSizeList this ^Integer index object]
    (-> this (.set index object))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^FixedSizeList this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^FixedSizeList this]
    (-> this (.clear))))

(defn max-size
  "Description copied from interface: BoundedCollection

  returns: the maximum number of elements the collection can hold. - `int`"
  (^Integer [^FixedSizeList this]
    (-> this (.maxSize))))

(defn index-of
  "object - `java.lang.Object`

  returns: `int`"
  (^Integer [^FixedSizeList this ^java.lang.Object object]
    (-> this (.indexOf object))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^FixedSizeList this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn get
  "index - `int`

  returns: `E`"
  ([^FixedSizeList this ^Integer index]
    (-> this (.get index))))

