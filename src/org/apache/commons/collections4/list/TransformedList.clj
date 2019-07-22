(ns org.apache.commons.collections4.list.TransformedList
  "Decorates another List to transform objects that are added.

  The add and set methods are affected by this class.
  Thus objects must be removed or searched for using their transformed form.
  For example, if the transformation converts Strings to Integers, you must
  use the Integer form to remove objects.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list TransformedList]))

(defn *transforming-list
  "Factory method to create a transforming list.

   If there are any elements already in the list being decorated, they
   are NOT transformed.
   Contrast this with transformedList(List, Transformer).

  list - the list to decorate, must not be null - `java.util.List`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed list - `<E> org.apache.commons.collections4.list.TransformedList<E>`

  throws: java.lang.NullPointerException - if list or transformer is null"
  ([^java.util.List list ^org.apache.commons.collections4.Transformer transformer]
    (TransformedList/transformingList list transformer)))

(defn *transformed-list
  "Factory method to create a transforming list that will transform
   existing contents of the specified list.

   If there are any elements already in the list being decorated, they
   will be transformed by this method.
   Contrast this with transformingList(List, Transformer).

  list - the list to decorate, must not be null - `java.util.List`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed List - `<E> org.apache.commons.collections4.list.TransformedList<E>`

  throws: java.lang.NullPointerException - if list or transformer is null"
  ([^java.util.List list ^org.apache.commons.collections4.Transformer transformer]
    (TransformedList/transformedList list transformer)))

(defn add-all
  "index - `int`
  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^TransformedList this ^Integer index ^java.util.Collection coll]
    (-> this (.addAll index coll))))

(defn list-iterator
  "i - `int`

  returns: `java.util.ListIterator<E>`"
  (^java.util.ListIterator [^TransformedList this ^Integer i]
    (-> this (.listIterator i)))
  (^java.util.ListIterator [^TransformedList this]
    (-> this (.listIterator))))

(defn sub-list
  "from-index - `int`
  to-index - `int`

  returns: `java.util.List<E>`"
  (^java.util.List [^TransformedList this ^Integer from-index ^Integer to-index]
    (-> this (.subList from-index to-index))))

(defn last-index-of
  "object - `java.lang.Object`

  returns: `int`"
  (^Integer [^TransformedList this ^java.lang.Object object]
    (-> this (.lastIndexOf object))))

(defn remove
  "index - `int`

  returns: `E`"
  ([^TransformedList this ^Integer index]
    (-> this (.remove index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TransformedList this]
    (-> this (.hashCode))))

(defn add
  "index - `int`
  object - `E`"
  ([^TransformedList this ^Integer index object]
    (-> this (.add index object))))

(defn set
  "index - `int`
  object - `E`

  returns: `E`"
  ([^TransformedList this ^Integer index object]
    (-> this (.set index object))))

(defn index-of
  "object - `java.lang.Object`

  returns: `int`"
  (^Integer [^TransformedList this ^java.lang.Object object]
    (-> this (.indexOf object))))

(defn get
  "index - `int`

  returns: `E`"
  ([^TransformedList this ^Integer index]
    (-> this (.get index))))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TransformedList this ^java.lang.Object object]
    (-> this (.equals object))))

