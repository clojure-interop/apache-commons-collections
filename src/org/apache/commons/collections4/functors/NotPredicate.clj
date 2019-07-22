(ns org.apache.commons.collections4.functors.NotPredicate
  "Predicate implementation that returns the opposite of the decorated predicate."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors NotPredicate]))

(defn ->not-predicate
  "Constructor.

  Constructor that performs no validation.
   Use notPredicate if you want that.

  predicate - the predicate to call after the null check - `org.apache.commons.collections4.Predicate`"
  (^NotPredicate [^org.apache.commons.collections4.Predicate predicate]
    (new NotPredicate predicate)))

(defn *not-predicate
  "Factory to create the not predicate.

  predicate - the predicate to decorate, not null - `org.apache.commons.collections4.Predicate`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate]
    (NotPredicate/notPredicate predicate)))

(defn evaluate
  "Evaluates the predicate returning the opposite to the stored predicate.

  object - the input object - `T`

  returns: true if predicate returns false - `boolean`"
  (^Boolean [^NotPredicate this object]
    (-> this (.evaluate object))))

(defn get-predicates
  "Gets the predicate being decorated.

  returns: the predicate as the only element in an array - `org.apache.commons.collections4.Predicate<? super T>[]`"
  ([^NotPredicate this]
    (-> this (.getPredicates))))

