(ns org.apache.commons.collections4.bag.TransformedSortedBag
  "Decorates another SortedBag to transform objects that are added.

  The add methods are affected by this class.
  Thus objects must be removed or searched for using their transformed form.
  For example, if the transformation converts Strings to Integers, you must
  use the Integer form to remove objects.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag TransformedSortedBag]))

(defn *transforming-sorted-bag
  "Factory method to create a transforming sorted bag.

   If there are any elements already in the bag being decorated, they
   are NOT transformed. Contrast this with transformedSortedBag(SortedBag, Transformer).

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.SortedBag`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed SortedBag - `<E> org.apache.commons.collections4.bag.TransformedSortedBag<E>`

  throws: java.lang.NullPointerException - if bag or transformer is null"
  ([^org.apache.commons.collections4.SortedBag bag ^org.apache.commons.collections4.Transformer transformer]
    (TransformedSortedBag/transformingSortedBag bag transformer)))

(defn *transformed-sorted-bag
  "Factory method to create a transforming sorted bag that will transform
   existing contents of the specified sorted bag.

   If there are any elements already in the bag being decorated, they
   will be transformed by this method.
   Contrast this with transformingSortedBag(SortedBag, Transformer).

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.SortedBag`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed SortedBag - `<E> org.apache.commons.collections4.bag.TransformedSortedBag<E>`

  throws: java.lang.NullPointerException - if bag or transformer is null"
  ([^org.apache.commons.collections4.SortedBag bag ^org.apache.commons.collections4.Transformer transformer]
    (TransformedSortedBag/transformedSortedBag bag transformer)))

(defn first
  "Description copied from interface: SortedBag

  returns: the first element in the sorted bag - `E`"
  ([^TransformedSortedBag this]
    (-> this (.first))))

(defn last
  "Description copied from interface: SortedBag

  returns: the last element in the sorted bag - `E`"
  ([^TransformedSortedBag this]
    (-> this (.last))))

(defn comparator
  "Description copied from interface: SortedBag

  returns: the comparator in use, or null if natural ordering - `java.util.Comparator<? super E>`"
  ([^TransformedSortedBag this]
    (-> this (.comparator))))

