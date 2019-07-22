(ns org.apache.commons.collections4.list.AbstractLinkedList$LinkedSubList
  "The sublist implementation for AbstractLinkedList."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list AbstractLinkedList$LinkedSubList]))

(defn add-all
  "index - `int`
  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractLinkedList$LinkedSubList this ^Integer index ^java.util.Collection coll]
    (-> this (.addAll index coll)))
  (^Boolean [^AbstractLinkedList$LinkedSubList this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn list-iterator
  "index - `int`

  returns: `java.util.ListIterator<E>`"
  (^java.util.ListIterator [^AbstractLinkedList$LinkedSubList this ^Integer index]
    (-> this (.listIterator index))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^AbstractLinkedList$LinkedSubList this]
    (-> this (.iterator))))

(defn sub-list
  "from-index-inclusive - `int`
  to-index-exclusive - `int`

  returns: `java.util.List<E>`"
  (^java.util.List [^AbstractLinkedList$LinkedSubList this ^Integer from-index-inclusive ^Integer to-index-exclusive]
    (-> this (.subList from-index-inclusive to-index-exclusive))))

(defn remove
  "index - `int`

  returns: `E`"
  ([^AbstractLinkedList$LinkedSubList this ^Integer index]
    (-> this (.remove index))))

(defn add
  "index - `int`
  obj - `E`"
  ([^AbstractLinkedList$LinkedSubList this ^Integer index obj]
    (-> this (.add index obj))))

(defn set
  "index - `int`
  obj - `E`

  returns: `E`"
  ([^AbstractLinkedList$LinkedSubList this ^Integer index obj]
    (-> this (.set index obj))))

(defn size
  "returns: `int`"
  (^Integer [^AbstractLinkedList$LinkedSubList this]
    (-> this (.size))))

(defn clear
  ""
  ([^AbstractLinkedList$LinkedSubList this]
    (-> this (.clear))))

(defn get
  "index - `int`

  returns: `E`"
  ([^AbstractLinkedList$LinkedSubList this ^Integer index]
    (-> this (.get index))))

