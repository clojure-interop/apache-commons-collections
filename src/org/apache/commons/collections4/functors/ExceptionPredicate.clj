(ns org.apache.commons.collections4.functors.ExceptionPredicate
  "Predicate implementation that always throws an exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ExceptionPredicate]))

(def *-instance
  "Static Constant.

  Singleton predicate instance

  type: org.apache.commons.collections4.Predicate"
  ExceptionPredicate/INSTANCE)

(defn *exception-predicate
  "Factory returning the singleton instance.

  returns: the singleton instance - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([]
    (ExceptionPredicate/exceptionPredicate )))

(defn evaluate
  "Evaluates the predicate always throwing an exception.

  object - the input object - `T`

  returns: never - `boolean`

  throws: org.apache.commons.collections4.FunctorException - always"
  (^Boolean [^ExceptionPredicate this object]
    (-> this (.evaluate object))))

