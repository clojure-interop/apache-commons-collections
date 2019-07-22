(ns org.apache.commons.collections4.functors.SwitchTransformer
  "Transformer implementation calls the transformer whose predicate returns true,
  like a switch statement."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors SwitchTransformer]))

(defn ->switch-transformer
  "Constructor.

  Constructor that performs no validation.
   Use switchTransformer if you want that.

  predicates - array of predicates, cloned, no nulls - `org.apache.commons.collections4.Predicate[]`
  transformers - matching array of transformers, cloned, no nulls - `org.apache.commons.collections4.Transformer[]`
  default-transformer - the transformer to use if no match, null means return null - `org.apache.commons.collections4.Transformer`"
  (^SwitchTransformer [predicates transformers ^org.apache.commons.collections4.Transformer default-transformer]
    (new SwitchTransformer predicates transformers default-transformer)))

(defn *switch-transformer
  "Factory method that performs validation and copies the parameter arrays.

  predicates - array of predicates, cloned, no nulls - `org.apache.commons.collections4.Predicate[]`
  transformers - matching array of transformers, cloned, no nulls - `org.apache.commons.collections4.Transformer[]`
  default-transformer - the transformer to use if no match, null means return null - `org.apache.commons.collections4.Transformer`

  returns: the chained transformer - `<I,O> org.apache.commons.collections4.Transformer<I,O>`

  throws: java.lang.NullPointerException - if any element in the array is null"
  ([predicates transformers ^org.apache.commons.collections4.Transformer default-transformer]
    (SwitchTransformer/switchTransformer predicates transformers default-transformer))
  ([^java.util.Map map]
    (SwitchTransformer/switchTransformer map)))

(defn transform
  "Transforms the input to result by calling the transformer whose matching
   predicate returns true.

  input - the input object to transform - `I`

  returns: the transformed result - `O`"
  ([^SwitchTransformer this input]
    (-> this (.transform input))))

(defn get-predicates
  "Gets the predicates.

  returns: a copy of the predicates - `org.apache.commons.collections4.Predicate<? super I>[]`"
  ([^SwitchTransformer this]
    (-> this (.getPredicates))))

(defn get-transformers
  "Gets the transformers.

  returns: a copy of the transformers - `org.apache.commons.collections4.Transformer<? super I,? extends O>[]`"
  ([^SwitchTransformer this]
    (-> this (.getTransformers))))

(defn get-default-transformer
  "Gets the default transformer.

  returns: the default transformer - `org.apache.commons.collections4.Transformer<? super I,? extends O>`"
  ([^SwitchTransformer this]
    (-> this (.getDefaultTransformer))))

