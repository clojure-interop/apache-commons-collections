(ns org.apache.commons.collections4.list.AbstractListDecorator
  "Decorates another List to provide additional behaviour.

  Methods are forwarded directly to the decorated list."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list AbstractListDecorator]))

(defn add-all
  "index - `int`
  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractListDecorator this ^Integer index ^java.util.Collection coll]
    (-> this (.addAll index coll))))

(defn list-iterator
  "index - `int`

  returns: `java.util.ListIterator<E>`"
  (^java.util.ListIterator [^AbstractListDecorator this ^Integer index]
    (-> this (.listIterator index)))
  (^java.util.ListIterator [^AbstractListDecorator this]
    (-> this (.listIterator))))

(defn sub-list
  "from-index - `int`
  to-index - `int`

  returns: `java.util.List<E>`"
  (^java.util.List [^AbstractListDecorator this ^Integer from-index ^Integer to-index]
    (-> this (.subList from-index to-index))))

(defn last-index-of
  "object - `java.lang.Object`

  returns: `int`"
  (^Integer [^AbstractListDecorator this ^java.lang.Object object]
    (-> this (.lastIndexOf object))))

(defn remove
  "index - `int`

  returns: `E`"
  ([^AbstractListDecorator this ^Integer index]
    (-> this (.remove index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractListDecorator this]
    (-> this (.hashCode))))

(defn add
  "index - `int`
  object - `E`"
  ([^AbstractListDecorator this ^Integer index object]
    (-> this (.add index object))))

(defn set
  "index - `int`
  object - `E`

  returns: `E`"
  ([^AbstractListDecorator this ^Integer index object]
    (-> this (.set index object))))

(defn index-of
  "object - `java.lang.Object`

  returns: `int`"
  (^Integer [^AbstractListDecorator this ^java.lang.Object object]
    (-> this (.indexOf object))))

(defn get
  "index - `int`

  returns: `E`"
  ([^AbstractListDecorator this ^Integer index]
    (-> this (.get index))))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractListDecorator this ^java.lang.Object object]
    (-> this (.equals object))))

