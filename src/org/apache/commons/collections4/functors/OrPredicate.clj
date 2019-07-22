(ns org.apache.commons.collections4.functors.OrPredicate
  "Predicate implementation that returns true if either of the predicates return true."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors OrPredicate]))

(defn ->or-predicate
  "Constructor.

  Constructor that performs no validation.
   Use orPredicate if you want that.

  predicate-1 - the first predicate to check, not null - `org.apache.commons.collections4.Predicate`
  predicate-2 - the second predicate to check, not null - `org.apache.commons.collections4.Predicate`"
  (^OrPredicate [^org.apache.commons.collections4.Predicate predicate-1 ^org.apache.commons.collections4.Predicate predicate-2]
    (new OrPredicate predicate-1 predicate-2)))

(defn *or-predicate
  "Factory to create the predicate.

  predicate-1 - the first predicate to check, not null - `org.apache.commons.collections4.Predicate`
  predicate-2 - the second predicate to check, not null - `org.apache.commons.collections4.Predicate`

  returns: the and predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if either predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate-1 ^org.apache.commons.collections4.Predicate predicate-2]
    (OrPredicate/orPredicate predicate-1 predicate-2)))

(defn evaluate
  "Evaluates the predicate returning true if either predicate returns true.

  object - the input object - `T`

  returns: true if either decorated predicate returns true - `boolean`"
  (^Boolean [^OrPredicate this object]
    (-> this (.evaluate object))))

(defn get-predicates
  "Gets the two predicates being decorated as an array.

  returns: the predicates - `org.apache.commons.collections4.Predicate<? super T>[]`"
  ([^OrPredicate this]
    (-> this (.getPredicates))))

