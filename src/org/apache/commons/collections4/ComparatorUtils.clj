(ns org.apache.commons.collections4.ComparatorUtils
  "Provides convenient static utility methods for Comparator
  objects.

  Most of the functionality in this class can also be found in the
  comparators package. This class merely provides a
  convenient central place if you have use for more than one class
  in the comparators subpackage."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 ComparatorUtils]))

(def *-natural-comparator
  "Static Constant.

  Comparator for natural sort order.

  type: java.util.Comparator"
  ComparatorUtils/NATURAL_COMPARATOR)

(defn *min
  "Returns the smaller of the given objects according to the given
   comparator, returning the second object if the comparator
   returns equal.

  o-1 - the first object to compare - `E`
  o-2 - the second object to compare - `E`
  comparator - the sort order to use - `java.util.Comparator`

  returns: the smaller of the two objects - `<E> E`"
  ([o-1 o-2 ^java.util.Comparator comparator]
    (ComparatorUtils/min o-1 o-2 comparator)))

(defn *reversed-comparator
  "Gets a comparator that reverses the order of the given comparator.

  comparator - the comparator to reverse - `java.util.Comparator`

  returns: a comparator that reverses the order of the input comparator - `<E> java.util.Comparator<E>`"
  ([^java.util.Comparator comparator]
    (ComparatorUtils/reversedComparator comparator)))

(defn *max
  "Returns the larger of the given objects according to the given
   comparator, returning the second object if the comparator
   returns equal.

  o-1 - the first object to compare - `E`
  o-2 - the second object to compare - `E`
  comparator - the sort order to use - `java.util.Comparator`

  returns: the larger of the two objects - `<E> E`"
  ([o-1 o-2 ^java.util.Comparator comparator]
    (ComparatorUtils/max o-1 o-2 comparator)))

(defn *transformed-comparator
  "Gets a Comparator that passes transformed objects to the given comparator.

   Objects passed to the returned comparator will first be transformed
   by the given transformer before they are compared by the given
   comparator.

  comparator - the sort order to use - `java.util.Comparator`
  transformer - the transformer to use - `org.apache.commons.collections4.Transformer`

  returns: a comparator that transforms its input objects before comparing them - `<I,O> java.util.Comparator<I>`"
  ([^java.util.Comparator comparator ^org.apache.commons.collections4.Transformer transformer]
    (ComparatorUtils/transformedComparator comparator transformer)))

(defn *boolean-comparator
  "Gets a Comparator that can sort Boolean objects.

   The parameter specifies whether true or false is sorted first.


   The comparator throws NullPointerException if a null value is compared.

  true-first - when true, sort true Booleans before false Booleans. - `boolean`

  returns: a comparator that sorts booleans - `java.util.Comparator<java.lang.Boolean>`"
  (^java.util.Comparator [^Boolean true-first]
    (ComparatorUtils/booleanComparator true-first)))

(defn *null-high-comparator
  "Gets a Comparator that controls the comparison of null values.

   The returned comparator will consider a null value to be greater than
   any nonnull value, and equal to any other null value.  Two nonnull
   values will be evaluated with the given comparator.

  comparator - the comparator that wants to allow nulls - `java.util.Comparator`

  returns: a version of that comparator that allows nulls - `<E> java.util.Comparator<E>`"
  ([^java.util.Comparator comparator]
    (ComparatorUtils/nullHighComparator comparator)))

(defn *natural-comparator
  "Gets a comparator that uses the natural order of the objects.

  returns: a comparator which uses natural order - `<E extends java.lang.Comparable<? super E>> java.util.Comparator<E>`"
  ([]
    (ComparatorUtils/naturalComparator )))

(defn *null-low-comparator
  "Gets a Comparator that controls the comparison of null values.

   The returned comparator will consider a null value to be less than
   any nonnull value, and equal to any other null value.  Two nonnull
   values will be evaluated with the given comparator.

  comparator - the comparator that wants to allow nulls - `java.util.Comparator`

  returns: a version of that comparator that allows nulls - `<E> java.util.Comparator<E>`"
  ([^java.util.Comparator comparator]
    (ComparatorUtils/nullLowComparator comparator)))

(defn *chained-comparator
  "Gets a comparator that compares using an array of Comparators, applied
   in sequence until one returns not equal or the array is exhausted.

  comparators - the comparators to use, not null or empty or containing nulls - `java.util.Comparator`

  returns: a ComparatorChain formed from the input comparators - `<E> java.util.Comparator<E>`

  throws: java.lang.NullPointerException - if comparators array is null or contains a null"
  ([^java.util.Comparator comparators]
    (ComparatorUtils/chainedComparator comparators)))

