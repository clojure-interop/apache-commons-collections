(ns org.apache.commons.collections4.bag.TransformedBag
  "Decorates another Bag to transform objects that are added.

  The add methods are affected by this class.
  Thus objects must be removed or searched for using their transformed form.
  For example, if the transformation converts Strings to Integers, you must
  use the Integer form to remove objects.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag TransformedBag]))

(defn *transforming-bag
  "Factory method to create a transforming bag.

   If there are any elements already in the bag being decorated, they
   are NOT transformed. Contrast this with transformedBag(Bag, Transformer).

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.Bag`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed Bag - `<E> org.apache.commons.collections4.Bag<E>`

  throws: java.lang.NullPointerException - if bag or transformer is null"
  ([^org.apache.commons.collections4.Bag bag ^org.apache.commons.collections4.Transformer transformer]
    (TransformedBag/transformingBag bag transformer)))

(defn *transformed-bag
  "Factory method to create a transforming bag that will transform
   existing contents of the specified bag.

   If there are any elements already in the bag being decorated, they
   will be transformed by this method.
   Contrast this with transformingBag(Bag, Transformer).

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.Bag`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed Bag - `<E> org.apache.commons.collections4.Bag<E>`

  throws: java.lang.NullPointerException - if bag or transformer is null"
  ([^org.apache.commons.collections4.Bag bag ^org.apache.commons.collections4.Transformer transformer]
    (TransformedBag/transformedBag bag transformer)))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TransformedBag this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TransformedBag this]
    (-> this (.hashCode))))

(defn get-count
  "Description copied from interface: Bag

  object - the object to search for - `java.lang.Object`

  returns: the number of occurrences of the object, zero if not found - `int`"
  (^Integer [^TransformedBag this ^java.lang.Object object]
    (-> this (.getCount object))))

(defn remove
  "Description copied from interface: Bag

  object - the object to remove - `java.lang.Object`
  n-copies - the number of copies to remove - `int`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^TransformedBag this ^java.lang.Object object ^Integer n-copies]
    (-> this (.remove object n-copies))))

(defn add
  "Description copied from interface: Bag

  object - the object to add - `E`
  n-copies - the number of copies to add - `int`

  returns: true if the object was not already in the uniqueSet - `boolean`"
  (^Boolean [^TransformedBag this object ^Integer n-copies]
    (-> this (.add object n-copies))))

(defn unique-set
  "Description copied from interface: Bag

  returns: the Set of unique Bag elements - `java.util.Set<E>`"
  (^java.util.Set [^TransformedBag this]
    (-> this (.uniqueSet))))

