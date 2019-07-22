(ns org.apache.commons.collections4.comparators.ComparableComparator
  "A Comparator that compares Comparable
  objects.

  This Comparator is useful, for example, for enforcing the natural order in
  custom implementations of SortedSet and
  SortedMap.


  Note: In the 2.0 and 2.1 releases of Commons Collections, this class would
  throw a ClassCastException if either of the arguments to
  compare were null, not
  Comparable, or for which
  compareTo gave inconsistent results.
  This is no longer the case. See compare for
  details."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.comparators ComparableComparator]))

(defn ->comparable-comparator
  "Constructor.

  Constructor whose use should be avoided.

   Please use the comparableComparator() method whenever possible."
  (^ComparableComparator []
    (new ComparableComparator )))

(def *-instance
  "Static Constant.

  The singleton instance.

  type: org.apache.commons.collections4.comparators.ComparableComparator"
  ComparableComparator/INSTANCE)

(defn *comparable-comparator
  "Gets the singleton instance of a ComparableComparator.

   Developers are encouraged to use the comparator returned from this method
   instead of constructing a new instance to reduce allocation and GC overhead
   when multiple comparable comparators may be used in the same VM.

  returns: the singleton ComparableComparator - `<E extends java.lang.Comparable<? super E>> org.apache.commons.collections4.comparators.ComparableComparator<E>`"
  ([]
    (ComparableComparator/comparableComparator )))

(defn compare
  "Compare the two Comparable arguments.
   This method is equivalent to:


  ((Comparable)obj1).compareTo(obj2)

  obj-1 - the first object to compare - `E`
  obj-2 - the second object to compare - `E`

  returns: negative if obj1 is less, positive if greater, zero if equal - `int`

  throws: java.lang.NullPointerException - if obj1 is null, or when ((Comparable)obj1).compareTo(obj2) does"
  (^Integer [^ComparableComparator this obj-1 obj-2]
    (-> this (.compare obj-1 obj-2))))

(defn hash-code
  "Implement a hash code for this comparator that is consistent with
   equals.

  returns: a hash code for this comparator. - `int`"
  (^Integer [^ComparableComparator this]
    (-> this (.hashCode))))

(defn equals
  "Returns true iff that Object is is a Comparator
   whose ordering is known to be equivalent to mine.

   This implementation returns true iff
   object.getClass() equals
   this.getClass(). Subclasses may want to override this behavior to remain
   consistent with the Comparator.equals(Object) contract.

  object - the object to compare with - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^ComparableComparator this ^java.lang.Object object]
    (-> this (.equals object))))

