(ns org.apache.commons.collections4.functors.TruePredicate
  "Predicate implementation that always returns true."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors TruePredicate]))

(def *-instance
  "Static Constant.

  Singleton predicate instance

  type: org.apache.commons.collections4.Predicate"
  TruePredicate/INSTANCE)

(defn *true-predicate
  "Factory returning the singleton instance.

  returns: the singleton instance - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([]
    (TruePredicate/truePredicate )))

(defn evaluate
  "Evaluates the predicate returning true always.

  object - the input object - `T`

  returns: true always - `boolean`"
  (^Boolean [^TruePredicate this object]
    (-> this (.evaluate object))))

