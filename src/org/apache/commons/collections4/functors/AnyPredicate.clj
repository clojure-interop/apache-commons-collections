(ns org.apache.commons.collections4.functors.AnyPredicate
  "Predicate implementation that returns true if any of the
  predicates return true.
  If the array of predicates is empty, then this predicate returns false.

  NOTE: In versions prior to 3.2 an array size of zero or one
  threw an exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors AnyPredicate]))

(defn ->any-predicate
  "Constructor.

  Constructor that performs no validation.
   Use anyPredicate if you want that.

  predicates - the predicates to check, not cloned, not null - `org.apache.commons.collections4.Predicate`"
  (^AnyPredicate [^org.apache.commons.collections4.Predicate predicates]
    (new AnyPredicate predicates)))

(defn *any-predicate
  "Factory to create the predicate.

   If the array is size zero, the predicate always returns false.
   If the array is size one, then that predicate is returned.

  predicates - the predicates to check, cloned, not null - `org.apache.commons.collections4.Predicate`

  returns: the any predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if any predicate in the array is null"
  ([^org.apache.commons.collections4.Predicate predicates]
    (AnyPredicate/anyPredicate predicates)))

(defn evaluate
  "Evaluates the predicate returning true if any predicate returns true.

  object - the input object - `T`

  returns: true if any decorated predicate return true - `boolean`"
  (^Boolean [^AnyPredicate this object]
    (-> this (.evaluate object))))

