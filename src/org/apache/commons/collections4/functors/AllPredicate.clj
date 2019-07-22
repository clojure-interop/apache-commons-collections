(ns org.apache.commons.collections4.functors.AllPredicate
  "Predicate implementation that returns true if all the
  predicates return true.
  If the array of predicates is empty, then this predicate returns true.

  NOTE: In versions prior to 3.2 an array size of zero or one
  threw an exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors AllPredicate]))

(defn ->all-predicate
  "Constructor.

  Constructor that performs no validation.
   Use allPredicate if you want that.

  predicates - the predicates to check, not cloned, not null - `org.apache.commons.collections4.Predicate`"
  (^AllPredicate [^org.apache.commons.collections4.Predicate predicates]
    (new AllPredicate predicates)))

(defn *all-predicate
  "Factory to create the predicate.

   If the array is size zero, the predicate always returns true.
   If the array is size one, then that predicate is returned.

  predicates - the predicates to check, cloned, not null - `org.apache.commons.collections4.Predicate`

  returns: the all predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if any predicate in the array is null"
  ([^org.apache.commons.collections4.Predicate predicates]
    (AllPredicate/allPredicate predicates)))

(defn evaluate
  "Evaluates the predicate returning true if all predicates return true.

  object - the input object - `T`

  returns: true if all decorated predicates return true - `boolean`"
  (^Boolean [^AllPredicate this object]
    (-> this (.evaluate object))))

