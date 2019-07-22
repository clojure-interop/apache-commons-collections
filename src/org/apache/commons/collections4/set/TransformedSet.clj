(ns org.apache.commons.collections4.set.TransformedSet
  "Decorates another Set to transform objects that are added.

  The add methods are affected by this class.
  Thus objects must be removed or searched for using their transformed form.
  For example, if the transformation converts Strings to Integers, you must
  use the Integer form to remove objects.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set TransformedSet]))

(defn *transforming-set
  "Factory method to create a transforming set.

   If there are any elements already in the set being decorated, they
   are NOT transformed.
   Contrast this with transformedSet(Set, Transformer).

  set - the set to decorate, must not be null - `java.util.Set`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed set - `<E> org.apache.commons.collections4.set.TransformedSet<E>`

  throws: java.lang.NullPointerException - if set or transformer is null"
  ([^java.util.Set set ^org.apache.commons.collections4.Transformer transformer]
    (TransformedSet/transformingSet set transformer)))

(defn *transformed-set
  "Factory method to create a transforming set that will transform
   existing contents of the specified set.

   If there are any elements already in the set being decorated, they
   will be transformed by this method.
   Contrast this with transformingSet(Set, Transformer).

  set - the set to decorate, must not be null - `java.util.Set`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed set - `<E> java.util.Set<E>`

  throws: java.lang.NullPointerException - if set or transformer is null"
  ([^java.util.Set set ^org.apache.commons.collections4.Transformer transformer]
    (TransformedSet/transformedSet set transformer)))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TransformedSet this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TransformedSet this]
    (-> this (.hashCode))))

