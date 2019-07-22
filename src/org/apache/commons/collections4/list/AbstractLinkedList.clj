(ns org.apache.commons.collections4.list.AbstractLinkedList
  "An abstract implementation of a linked list which provides numerous points for
  subclasses to override.

  Overridable methods are provided to change the storage node and to change how
  nodes are added to and removed. Hopefully, all you need for unusual subclasses
  is here."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list AbstractLinkedList]))

(defn add-all
  "index - `int`
  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractLinkedList this ^Integer index ^java.util.Collection coll]
    (-> this (.addAll index coll)))
  (^Boolean [^AbstractLinkedList this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn get-first
  "returns: `E`"
  ([^AbstractLinkedList this]
    (-> this (.getFirst))))

(defn contains
  "value - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractLinkedList this ^java.lang.Object value]
    (-> this (.contains value))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractLinkedList this]
    (-> this (.toString))))

(defn get-last
  "returns: `E`"
  ([^AbstractLinkedList this]
    (-> this (.getLast))))

(defn list-iterator
  "from-index - `int`

  returns: `java.util.ListIterator<E>`"
  (^java.util.ListIterator [^AbstractLinkedList this ^Integer from-index]
    (-> this (.listIterator from-index)))
  (^java.util.ListIterator [^AbstractLinkedList this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^AbstractLinkedList this]
    (-> this (.iterator))))

(defn sub-list
  "Gets a sublist of the main list.

  from-index-inclusive - the index to start from - `int`
  to-index-exclusive - the index to end at - `int`

  returns: the new sublist - `java.util.List<E>`"
  (^java.util.List [^AbstractLinkedList this ^Integer from-index-inclusive ^Integer to-index-exclusive]
    (-> this (.subList from-index-inclusive to-index-exclusive))))

(defn remove-first
  "returns: `E`"
  ([^AbstractLinkedList this]
    (-> this (.removeFirst))))

(defn last-index-of
  "value - `java.lang.Object`

  returns: `int`"
  (^Integer [^AbstractLinkedList this ^java.lang.Object value]
    (-> this (.lastIndexOf value))))

(defn remove
  "index - `int`

  returns: `E`"
  ([^AbstractLinkedList this ^Integer index]
    (-> this (.remove index))))

(defn add-last
  "o - `E`

  returns: `boolean`"
  (^Boolean [^AbstractLinkedList this o]
    (-> this (.addLast o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractLinkedList this]
    (-> this (.hashCode))))

(defn add
  "index - `int`
  value - `E`"
  ([^AbstractLinkedList this ^Integer index value]
    (-> this (.add index value)))
  (^Boolean [^AbstractLinkedList this value]
    (-> this (.add value))))

(defn set
  "index - `int`
  value - `E`

  returns: `E`"
  ([^AbstractLinkedList this ^Integer index value]
    (-> this (.set index value))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^AbstractLinkedList this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^AbstractLinkedList this]
    (-> this (.size))))

(defn retain-all
  "This implementation iterates over the elements of this list, checking each element in
   turn to see if it's contained in coll. If it's not contained, it's removed
   from this list. As a consequence, it is advised to use a collection type for
   coll that provides a fast (e.g. O(1)) implementation of
   Collection.contains(Object).

  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractLinkedList this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^AbstractLinkedList this]
    (-> this (.clear))))

(defn remove-last
  "returns: `E`"
  ([^AbstractLinkedList this]
    (-> this (.removeLast))))

(defn add-first
  "o - `E`

  returns: `boolean`"
  (^Boolean [^AbstractLinkedList this o]
    (-> this (.addFirst o))))

(defn index-of
  "value - `java.lang.Object`

  returns: `int`"
  (^Integer [^AbstractLinkedList this ^java.lang.Object value]
    (-> this (.indexOf value))))

(defn to-array
  "array - `T[]`

  returns: `<T> T[]`"
  ([^AbstractLinkedList this array]
    (-> this (.toArray array)))
  ([^AbstractLinkedList this]
    (-> this (.toArray))))

(defn remove-all
  "This implementation iterates over the elements of this list, checking each element in
   turn to see if it's contained in coll. If it's contained, it's removed
   from this list. As a consequence, it is advised to use a collection type for
   coll that provides a fast (e.g. O(1)) implementation of
   Collection.contains(Object).

  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractLinkedList this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn get
  "index - `int`

  returns: `E`"
  ([^AbstractLinkedList this ^Integer index]
    (-> this (.get index))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractLinkedList this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn contains-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractLinkedList this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

