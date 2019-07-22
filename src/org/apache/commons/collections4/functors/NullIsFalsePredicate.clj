(ns org.apache.commons.collections4.functors.NullIsFalsePredicate
  "Predicate implementation that returns false if the input is null."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors NullIsFalsePredicate]))

(defn ->null-is-false-predicate
  "Constructor.

  Constructor that performs no validation.
   Use nullIsFalsePredicate if you want that.

  predicate - the predicate to call after the null check - `org.apache.commons.collections4.Predicate`"
  (^NullIsFalsePredicate [^org.apache.commons.collections4.Predicate predicate]
    (new NullIsFalsePredicate predicate)))

(defn *null-is-false-predicate
  "Factory to create the null false predicate.

  predicate - the predicate to decorate, not null - `org.apache.commons.collections4.Predicate`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate]
    (NullIsFalsePredicate/nullIsFalsePredicate predicate)))

(defn evaluate
  "Evaluates the predicate returning the result of the decorated predicate
   once a null check is performed.

  object - the input object - `T`

  returns: true if decorated predicate returns true, false if input is null - `boolean`"
  (^Boolean [^NullIsFalsePredicate this object]
    (-> this (.evaluate object))))

(defn get-predicates
  "Gets the predicate being decorated.

  returns: the predicate as the only element in an array - `org.apache.commons.collections4.Predicate<? super T>[]`"
  ([^NullIsFalsePredicate this]
    (-> this (.getPredicates))))

