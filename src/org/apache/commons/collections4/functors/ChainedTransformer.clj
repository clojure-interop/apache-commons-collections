(ns org.apache.commons.collections4.functors.ChainedTransformer
  "Transformer implementation that chains the specified transformers together.

  The input object is passed to the first transformer. The transformed result
  is passed to the second transformer and so on."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ChainedTransformer]))

(defn ->chained-transformer
  "Constructor.

  Constructor that performs no validation.
   Use chainedTransformer if you want that.

  transformers - the transformers to chain, copied, no nulls - `org.apache.commons.collections4.Transformer`"
  (^ChainedTransformer [^org.apache.commons.collections4.Transformer transformers]
    (new ChainedTransformer transformers)))

(defn *chained-transformer
  "Factory method that performs validation and copies the parameter array.

  transformers - the transformers to chain, copied, no nulls - `org.apache.commons.collections4.Transformer`

  returns: the chained transformer - `<T> org.apache.commons.collections4.Transformer<T,T>`

  throws: java.lang.NullPointerException - if any transformer in the array is null"
  ([^org.apache.commons.collections4.Transformer transformers]
    (ChainedTransformer/chainedTransformer transformers)))

(defn transform
  "Transforms the input to result via each decorated transformer

  object - the input object passed to the first transformer - `T`

  returns: the transformed result - `T`"
  ([^ChainedTransformer this object]
    (-> this (.transform object))))

(defn get-transformers
  "Gets the transformers.

  returns: a copy of the transformers - `org.apache.commons.collections4.Transformer<? super T,? extends T>[]`"
  ([^ChainedTransformer this]
    (-> this (.getTransformers))))

