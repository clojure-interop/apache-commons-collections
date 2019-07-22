(ns org.apache.commons.collections4.comparators.ReverseComparator
  "Reverses the order of another comparator by reversing the arguments
  to its compare method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.comparators ReverseComparator]))

(defn ->reverse-comparator
  "Constructor.

  Creates a comparator that inverts the comparison
   of the given comparator.  If you pass in null,
   the ReverseComparator defaults to reversing the
   natural order, as per Collections.reverseOrder().

  comparator - Comparator to reverse - `java.util.Comparator`"
  (^ReverseComparator [^java.util.Comparator comparator]
    (new ReverseComparator comparator))
  (^ReverseComparator []
    (new ReverseComparator )))

(defn compare
  "Compares two objects in reverse order.

  obj-1 - the first object to compare - `E`
  obj-2 - the second object to compare - `E`

  returns: negative if obj1 is less, positive if greater, zero if equal - `int`"
  (^Integer [^ReverseComparator this obj-1 obj-2]
    (-> this (.compare obj-1 obj-2))))

(defn hash-code
  "Implement a hash code for this comparator that is consistent with
   equals.

  returns: a suitable hash code - `int`"
  (^Integer [^ReverseComparator this]
    (-> this (.hashCode))))

(defn equals
  "Returns true iff that Object is
   is a Comparator whose ordering is known to be
   equivalent to mine.

   This implementation returns true
   iff object.getClass()
   equals this.getClass(), and the underlying
   comparators are equal.
   Subclasses may want to override this behavior to remain consistent
   with the equals contract.

  object - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^ReverseComparator this ^java.lang.Object object]
    (-> this (.equals object))))

