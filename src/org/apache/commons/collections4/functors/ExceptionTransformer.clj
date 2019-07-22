(ns org.apache.commons.collections4.functors.ExceptionTransformer
  "Transformer implementation that always throws an exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ExceptionTransformer]))

(def *-instance
  "Static Constant.

  Singleton predicate instance

  type: org.apache.commons.collections4.Transformer"
  ExceptionTransformer/INSTANCE)

(defn *exception-transformer
  "Factory returning the singleton instance.

  returns: the singleton instance - `<I,O> org.apache.commons.collections4.Transformer<I,O>`"
  ([]
    (ExceptionTransformer/exceptionTransformer )))

(defn transform
  "Transforms the input to result by cloning it.

  input - the input object to transform - `I`

  returns: never - `O`

  throws: org.apache.commons.collections4.FunctorException - always"
  ([^ExceptionTransformer this input]
    (-> this (.transform input))))

