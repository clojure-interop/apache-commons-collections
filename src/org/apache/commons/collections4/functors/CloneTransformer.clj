(ns org.apache.commons.collections4.functors.CloneTransformer
  "Transformer implementation that returns a clone of the input object.

  Clone is performed using PrototypeFactory.prototypeFactory(input).create().


  WARNING: from v4.1 onwards this class will not be serializable anymore
  in order to prevent potential remote code execution exploits. Please refer to
  COLLECTIONS-580
  for more details."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors CloneTransformer]))

(def *-instance
  "Static Constant.

  Singleton predicate instance

  type: org.apache.commons.collections4.Transformer"
  CloneTransformer/INSTANCE)

(defn *clone-transformer
  "Factory returning the singleton instance.

  returns: the singleton instance - `<T> org.apache.commons.collections4.Transformer<T,T>`"
  ([]
    (CloneTransformer/cloneTransformer )))

(defn transform
  "Transforms the input to result by cloning it.

  input - the input object to transform - `T`

  returns: the transformed result - `T`"
  ([^CloneTransformer this input]
    (-> this (.transform input))))

