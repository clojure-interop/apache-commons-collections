(ns org.apache.commons.collections4.functors.OnePredicate
  "Predicate implementation that returns true if only one of the
  predicates return true.
  If the array of predicates is empty, then this predicate returns false.

  NOTE: In versions prior to 3.2 an array size of zero or one
  threw an exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors OnePredicate]))

(defn ->one-predicate
  "Constructor.

  Constructor that performs no validation.
   Use onePredicate if you want that.

  predicates - the predicates to check, not cloned, not null - `org.apache.commons.collections4.Predicate`"
  (^OnePredicate [^org.apache.commons.collections4.Predicate predicates]
    (new OnePredicate predicates)))

(defn *one-predicate
  "Factory to create the predicate.

   If the array is size zero, the predicate always returns false.
   If the array is size one, then that predicate is returned.

  predicates - the predicates to check, cloned, not null - `org.apache.commons.collections4.Predicate`

  returns: the any predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if any predicate in the array is null"
  ([^org.apache.commons.collections4.Predicate predicates]
    (OnePredicate/onePredicate predicates)))

(defn evaluate
  "Evaluates the predicate returning true if only one decorated predicate
   returns true.

  object - the input object - `T`

  returns: true if only one decorated predicate returns true - `boolean`"
  (^Boolean [^OnePredicate this object]
    (-> this (.evaluate object))))

