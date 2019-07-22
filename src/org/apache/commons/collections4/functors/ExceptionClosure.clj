(ns org.apache.commons.collections4.functors.ExceptionClosure
  "Closure implementation that always throws an exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ExceptionClosure]))

(def *-instance
  "Static Constant.

  Singleton predicate instance

  type: org.apache.commons.collections4.Closure"
  ExceptionClosure/INSTANCE)

(defn *exception-closure
  "Factory returning the singleton instance.

  returns: the singleton instance - `<E> org.apache.commons.collections4.Closure<E>`"
  ([]
    (ExceptionClosure/exceptionClosure )))

(defn execute
  "Always throw an exception.

  input - the input object - `E`

  throws: org.apache.commons.collections4.FunctorException - always"
  ([^ExceptionClosure this input]
    (-> this (.execute input))))

