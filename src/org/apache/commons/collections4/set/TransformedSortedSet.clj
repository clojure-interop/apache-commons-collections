(ns org.apache.commons.collections4.set.TransformedSortedSet
  "Decorates another SortedSet to transform objects that are added.

  The add methods are affected by this class.
  Thus objects must be removed or searched for using their transformed form.
  For example, if the transformation converts Strings to Integers, you must
  use the Integer form to remove objects.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set TransformedSortedSet]))

(defn *transforming-sorted-set
  "Factory method to create a transforming sorted set.

   If there are any elements already in the set being decorated, they
   are NOT transformed.
   Contrast this with transformedSortedSet(SortedSet, Transformer).

  set - the set to decorate, must not be null - `java.util.SortedSet`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed SortedSet - `<E> org.apache.commons.collections4.set.TransformedSortedSet<E>`

  throws: java.lang.NullPointerException - if set or transformer is null"
  ([^java.util.SortedSet set ^org.apache.commons.collections4.Transformer transformer]
    (TransformedSortedSet/transformingSortedSet set transformer)))

(defn *transformed-sorted-set
  "Factory method to create a transforming sorted set that will transform
   existing contents of the specified sorted set.

   If there are any elements already in the set being decorated, they
   will be transformed by this method.
   Contrast this with transformingSortedSet(SortedSet, Transformer).

  set - the set to decorate, must not be null - `java.util.SortedSet`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed SortedSet - `<E> org.apache.commons.collections4.set.TransformedSortedSet<E>`

  throws: java.lang.NullPointerException - if set or transformer is null"
  ([^java.util.SortedSet set ^org.apache.commons.collections4.Transformer transformer]
    (TransformedSortedSet/transformedSortedSet set transformer)))

(defn first
  "returns: `E`"
  ([^TransformedSortedSet this]
    (-> this (.first))))

(defn last
  "returns: `E`"
  ([^TransformedSortedSet this]
    (-> this (.last))))

(defn comparator
  "returns: `java.util.Comparator<? super E>`"
  ([^TransformedSortedSet this]
    (-> this (.comparator))))

(defn sub-set
  "from-element - `E`
  to-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^TransformedSortedSet this from-element to-element]
    (-> this (.subSet from-element to-element))))

(defn head-set
  "to-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^TransformedSortedSet this to-element]
    (-> this (.headSet to-element))))

(defn tail-set
  "from-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^TransformedSortedSet this from-element]
    (-> this (.tailSet from-element))))

