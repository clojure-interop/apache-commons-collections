(ns org.apache.commons.collections4.functors.NullIsExceptionPredicate
  "Predicate implementation that throws an exception if the input is null."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors NullIsExceptionPredicate]))

(defn ->null-is-exception-predicate
  "Constructor.

  Constructor that performs no validation.
   Use nullIsExceptionPredicate if you want that.

  predicate - the predicate to call after the null check - `org.apache.commons.collections4.Predicate`"
  (^NullIsExceptionPredicate [^org.apache.commons.collections4.Predicate predicate]
    (new NullIsExceptionPredicate predicate)))

(defn *null-is-exception-predicate
  "Factory to create the null exception predicate.

  predicate - the predicate to decorate, not null - `org.apache.commons.collections4.Predicate`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate]
    (NullIsExceptionPredicate/nullIsExceptionPredicate predicate)))

(defn evaluate
  "Evaluates the predicate returning the result of the decorated predicate
   once a null check is performed.

  object - the input object - `T`

  returns: true if decorated predicate returns true - `boolean`

  throws: org.apache.commons.collections4.FunctorException - if input is null"
  (^Boolean [^NullIsExceptionPredicate this object]
    (-> this (.evaluate object))))

(defn get-predicates
  "Gets the predicate being decorated.

  returns: the predicate as the only element in an array - `org.apache.commons.collections4.Predicate<? super T>[]`"
  ([^NullIsExceptionPredicate this]
    (-> this (.getPredicates))))

