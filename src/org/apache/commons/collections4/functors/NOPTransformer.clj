(ns org.apache.commons.collections4.functors.NOPTransformer
  "Transformer implementation that does nothing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors NOPTransformer]))

(def *-instance
  "Static Constant.

  Singleton predicate instance

  type: org.apache.commons.collections4.Transformer"
  NOPTransformer/INSTANCE)

(defn *nop-transformer
  "Factory returning the singleton instance.

  returns: the singleton instance - `<T> org.apache.commons.collections4.Transformer<T,T>`"
  ([]
    (NOPTransformer/nopTransformer )))

(defn transform
  "Transforms the input to result by doing nothing.

  input - the input object to transform - `T`

  returns: the transformed result which is the input - `T`"
  ([^NOPTransformer this input]
    (-> this (.transform input))))

