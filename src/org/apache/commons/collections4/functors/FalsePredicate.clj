(ns org.apache.commons.collections4.functors.FalsePredicate
  "Predicate implementation that always returns false."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors FalsePredicate]))

(def *-instance
  "Static Constant.

  Singleton predicate instance

  type: org.apache.commons.collections4.Predicate"
  FalsePredicate/INSTANCE)

(defn *false-predicate
  "Get a typed instance.

  returns: the singleton instance - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([]
    (FalsePredicate/falsePredicate )))

(defn evaluate
  "Evaluates the predicate returning false always.

  object - the input object - `T`

  returns: false always - `boolean`"
  (^Boolean [^FalsePredicate this object]
    (-> this (.evaluate object))))

