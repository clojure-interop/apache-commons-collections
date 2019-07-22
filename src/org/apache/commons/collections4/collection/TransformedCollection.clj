(ns org.apache.commons.collections4.collection.TransformedCollection
  "Decorates another Collection to transform objects that are added.

  The add methods are affected by this class.
  Thus objects must be removed or searched for using their transformed form.
  For example, if the transformation converts Strings to Integers, you must
  use the Integer form to remove objects.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.collection TransformedCollection]))

(defn *transforming-collection
  "Factory method to create a transforming collection.

   If there are any elements already in the collection being decorated, they
   are NOT transformed.
   Contrast this with transformedCollection(Collection, Transformer).

  coll - the collection to decorate, must not be null - `java.util.Collection`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed collection - `<E> org.apache.commons.collections4.collection.TransformedCollection<E>`

  throws: java.lang.NullPointerException - if collection or transformer is null"
  ([^java.util.Collection coll ^org.apache.commons.collections4.Transformer transformer]
    (TransformedCollection/transformingCollection coll transformer)))

(defn *transformed-collection
  "Factory method to create a transforming collection that will transform
   existing contents of the specified collection.

   If there are any elements already in the collection being decorated, they
   will be transformed by this method.
   Contrast this with transformingCollection(Collection, Transformer).

  collection - the collection to decorate, must not be null - `java.util.Collection`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed Collection - `<E> org.apache.commons.collections4.collection.TransformedCollection<E>`

  throws: java.lang.NullPointerException - if collection or transformer is null"
  ([^java.util.Collection collection ^org.apache.commons.collections4.Transformer transformer]
    (TransformedCollection/transformedCollection collection transformer)))

(defn add
  "object - `E`

  returns: `boolean`"
  (^Boolean [^TransformedCollection this object]
    (-> this (.add object))))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^TransformedCollection this ^java.util.Collection coll]
    (-> this (.addAll coll))))

