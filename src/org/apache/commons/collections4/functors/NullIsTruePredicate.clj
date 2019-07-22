(ns org.apache.commons.collections4.functors.NullIsTruePredicate
  "Predicate implementation that returns true if the input is null."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors NullIsTruePredicate]))

(defn ->null-is-true-predicate
  "Constructor.

  Constructor that performs no validation.
   Use nullIsTruePredicate if you want that.

  predicate - the predicate to call after the null check - `org.apache.commons.collections4.Predicate`"
  (^NullIsTruePredicate [^org.apache.commons.collections4.Predicate predicate]
    (new NullIsTruePredicate predicate)))

(defn *null-is-true-predicate
  "Factory to create the null true predicate.

  predicate - the predicate to decorate, not null - `org.apache.commons.collections4.Predicate`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate]
    (NullIsTruePredicate/nullIsTruePredicate predicate)))

(defn evaluate
  "Evaluates the predicate returning the result of the decorated predicate
   once a null check is performed.

  object - the input object - `T`

  returns: true if decorated predicate returns true or input is null - `boolean`"
  (^Boolean [^NullIsTruePredicate this object]
    (-> this (.evaluate object))))

(defn get-predicates
  "Gets the predicate being decorated.

  returns: the predicate as the only element in an array - `org.apache.commons.collections4.Predicate<? super T>[]`"
  ([^NullIsTruePredicate this]
    (-> this (.getPredicates))))

