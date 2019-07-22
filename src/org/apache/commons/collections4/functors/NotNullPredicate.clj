(ns org.apache.commons.collections4.functors.NotNullPredicate
  "Predicate implementation that returns true if the input is not null."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors NotNullPredicate]))

(def *-instance
  "Static Constant.

  Singleton predicate instance

  type: org.apache.commons.collections4.Predicate"
  NotNullPredicate/INSTANCE)

(defn *not-null-predicate
  "Factory returning the singleton instance.

  returns: the singleton instance - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([]
    (NotNullPredicate/notNullPredicate )))

(defn evaluate
  "Evaluates the predicate returning true if the object does not equal null.

  object - the object to evaluate - `T`

  returns: true if not null - `boolean`"
  (^Boolean [^NotNullPredicate this object]
    (-> this (.evaluate object))))

