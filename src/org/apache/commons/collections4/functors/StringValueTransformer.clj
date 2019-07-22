(ns org.apache.commons.collections4.functors.StringValueTransformer
  "Transformer implementation that returns the result of calling
  String.valueOf on the input object."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors StringValueTransformer]))

(defn *string-value-transformer
  "Factory returning the singleton instance.

  returns: the singleton instance - `<T> org.apache.commons.collections4.Transformer<T,java.lang.String>`"
  ([]
    (StringValueTransformer/stringValueTransformer )))

(defn transform
  "Transforms the input to result by calling String.valueOf.

  input - the input object to transform - `T`

  returns: the transformed result - `java.lang.String`"
  (^java.lang.String [^StringValueTransformer this input]
    (-> this (.transform input))))

