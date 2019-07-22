(ns org.apache.commons.collections4.functors.ExceptionFactory
  "Factory implementation that always throws an exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ExceptionFactory]))

(def *-instance
  "Static Constant.

  Singleton predicate instance

  type: org.apache.commons.collections4.Factory"
  ExceptionFactory/INSTANCE)

(defn *exception-factory
  "Factory returning the singleton instance.

  returns: the singleton instance - `<T> org.apache.commons.collections4.Factory<T>`"
  ([]
    (ExceptionFactory/exceptionFactory )))

(defn create
  "Always throws an exception.

  returns: never - `T`

  throws: org.apache.commons.collections4.FunctorException - always"
  ([^ExceptionFactory this]
    (-> this (.create))))

