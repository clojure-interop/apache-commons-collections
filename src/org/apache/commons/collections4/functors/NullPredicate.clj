(ns org.apache.commons.collections4.functors.NullPredicate
  "Predicate implementation that returns true if the input is null."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors NullPredicate]))

(def *-instance
  "Static Constant.

  Singleton predicate instance

  type: org.apache.commons.collections4.Predicate"
  NullPredicate/INSTANCE)

(defn *null-predicate
  "Factory returning the singleton instance.

  returns: the singleton instance - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([]
    (NullPredicate/nullPredicate )))

(defn evaluate
  "Evaluates the predicate returning true if the input is null.

  object - the input object - `T`

  returns: true if input is null - `boolean`"
  (^Boolean [^NullPredicate this object]
    (-> this (.evaluate object))))

