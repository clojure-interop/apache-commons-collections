(ns org.apache.commons.collections4.comparators.NullComparator
  "A Comparator that will compare nulls to be either lower or higher than
  other objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.comparators NullComparator]))

(defn ->null-comparator
  "Constructor.

  Construct an instance that sorts null higher or lower than
    any non-null object it is compared with.  When comparing
    two non-null objects, the specified Comparator is
    used.

  non-null-comparator - the comparator to use when comparing two non-null objects. This argument cannot be null - `java.util.Comparator`
  nulls-are-high - a true value indicates that null should be compared as higher than a non-null object. A false value indicates that null should be compared as lower than a non-null object. - `boolean`

  throws: java.lang.NullPointerException - if nonNullComparator is null"
  (^NullComparator [^java.util.Comparator non-null-comparator ^Boolean nulls-are-high]
    (new NullComparator non-null-comparator nulls-are-high))
  (^NullComparator [^java.util.Comparator non-null-comparator]
    (new NullComparator non-null-comparator))
  (^NullComparator []
    (new NullComparator )))

(defn compare
  "Perform a comparison between two objects.  If both objects are
    null, a 0 value is returned.  If one object
    is null and the other is not, the result is determined on
    whether the Comparator was constructed to have nulls as higher or lower
    than other objects.  If neither object is null, an
    underlying comparator specified in the constructor (or the default) is
    used to compare the non-null objects.

  o-1 - the first object to compare - `E`
  o-2 - the object to compare it to. - `E`

  returns: -1 if o1 is \"lower\" than (less than,
    before, etc.) o2; 1 if o1 is
    \"higher\" than (greater than, after, etc.) o2; or
    0 if o1 and o2 are equal. - `int`"
  (^Integer [^NullComparator this o-1 o-2]
    (-> this (.compare o-1 o-2))))

(defn hash-code
  "Implement a hash code for this comparator that is consistent with
    equals(Object).

  returns: a hash code for this comparator. - `int`"
  (^Integer [^NullComparator this]
    (-> this (.hashCode))))

(defn equals
  "Determines whether the specified object represents a comparator that is
    equal to this comparator.

  obj - the object to compare this comparator with. - `java.lang.Object`

  returns: true if the specified object is a NullComparator
    with equivalent null comparison behavior
    (i.e. null high or low) and with equivalent underlying
    non-null object comparators. - `boolean`"
  (^Boolean [^NullComparator this ^java.lang.Object obj]
    (-> this (.equals obj))))

