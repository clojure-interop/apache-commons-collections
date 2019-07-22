(ns org.apache.commons.collections4.comparators.BooleanComparator
  "A Comparator for Boolean objects that can sort either
  true or false first."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.comparators BooleanComparator]))

(defn ->boolean-comparator
  "Constructor.

  Creates a BooleanComparator that sorts
   trueFirst values before
   !trueFirst values.

   Please use the static factories instead whenever possible.

  true-first - when true, sort true boolean values before false - `boolean`"
  (^BooleanComparator [^Boolean true-first]
    (new BooleanComparator true-first))
  (^BooleanComparator []
    (new BooleanComparator )))

(defn *get-true-first-comparator
  "Returns a BooleanComparator instance that sorts
   true values before false values.

   Clients are encouraged to use the value returned from
   this method instead of constructing a new instance
   to reduce allocation and garbage collection overhead when
   multiple BooleanComparators may be used in the same
   virtual machine.

  returns: the true first singleton BooleanComparator - `org.apache.commons.collections4.comparators.BooleanComparator`"
  (^org.apache.commons.collections4.comparators.BooleanComparator []
    (BooleanComparator/getTrueFirstComparator )))

(defn *get-false-first-comparator
  "Returns a BooleanComparator instance that sorts
   false values before true values.

   Clients are encouraged to use the value returned from
   this method instead of constructing a new instance
   to reduce allocation and garbage collection overhead when
   multiple BooleanComparators may be used in the same
   virtual machine.

  returns: the false first singleton BooleanComparator - `org.apache.commons.collections4.comparators.BooleanComparator`"
  (^org.apache.commons.collections4.comparators.BooleanComparator []
    (BooleanComparator/getFalseFirstComparator )))

(defn *boolean-comparator
  "Returns a BooleanComparator instance that sorts
   trueFirst values before
   !trueFirst values.

   Clients are encouraged to use the value returned from
   this method instead of constructing a new instance
   to reduce allocation and garbage collection overhead when
   multiple BooleanComparators may be used in the same
   virtual machine.

  true-first - when true, sort true Booleans before false - `boolean`

  returns: a singleton BooleanComparator instance - `org.apache.commons.collections4.comparators.BooleanComparator`"
  (^org.apache.commons.collections4.comparators.BooleanComparator [^Boolean true-first]
    (BooleanComparator/booleanComparator true-first)))

(defn compare
  "Compares two non-null Boolean objects
   according to the value of sortsTrueFirst().

  b-1 - the first boolean to compare - `java.lang.Boolean`
  b-2 - the second boolean to compare - `java.lang.Boolean`

  returns: negative if obj1 is less, positive if greater, zero if equal - `int`

  throws: java.lang.NullPointerException - when either argument null"
  (^Integer [^BooleanComparator this ^java.lang.Boolean b-1 ^java.lang.Boolean b-2]
    (-> this (.compare b-1 b-2))))

(defn hash-code
  "Implement a hash code for this comparator that is consistent with
   equals.

  returns: a hash code for this comparator. - `int`"
  (^Integer [^BooleanComparator this]
    (-> this (.hashCode))))

(defn equals
  "Returns true iff that Object is
   is a Comparator whose ordering is known to be
   equivalent to mine.

   This implementation returns true
   iff that is a BooleanComparator
   whose value of sortsTrueFirst() is equal to mine.

  object - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^BooleanComparator this ^java.lang.Object object]
    (-> this (.equals object))))

(defn sorts-true-first
  "Returns true iff
   I sort true values before
   false values.  In other words,
   returns true iff
   compare(Boolean.FALSE,Boolean.TRUE)
   returns a positive value.

  returns: the trueFirst flag - `boolean`"
  (^Boolean [^BooleanComparator this]
    (-> this (.sortsTrueFirst))))

