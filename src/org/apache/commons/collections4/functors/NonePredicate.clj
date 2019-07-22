(ns org.apache.commons.collections4.functors.NonePredicate
  "Predicate implementation that returns true if none of the
  predicates return true.
  If the array of predicates is empty, then this predicate returns true.

  NOTE: In versions prior to 3.2 an array size of zero or one
  threw an exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors NonePredicate]))

(defn ->none-predicate
  "Constructor.

  Constructor that performs no validation.
   Use nonePredicate if you want that.

  predicates - the predicates to check, not cloned, not null - `org.apache.commons.collections4.Predicate`"
  (^NonePredicate [^org.apache.commons.collections4.Predicate predicates]
    (new NonePredicate predicates)))

(defn *none-predicate
  "Factory to create the predicate.

   If the array is size zero, the predicate always returns true.

  predicates - the predicates to check, cloned, not null - `org.apache.commons.collections4.Predicate`

  returns: the any predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if any predicate in the array is null"
  ([^org.apache.commons.collections4.Predicate predicates]
    (NonePredicate/nonePredicate predicates)))

(defn evaluate
  "Evaluates the predicate returning false if any stored predicate returns false.

  object - the input object - `T`

  returns: true if none of decorated predicates return true - `boolean`"
  (^Boolean [^NonePredicate this object]
    (-> this (.evaluate object))))

