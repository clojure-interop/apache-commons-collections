(ns org.apache.commons.collections4.functors.IfTransformer
  "Transformer implementation that will call one of two closures based on whether a predicate evaluates
  as true or false."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors IfTransformer]))

(defn ->if-transformer
  "Constructor.

  Constructor that performs no validation.
   Use the static factory method ifTransformer if you want that.

  predicate - predicate to switch on, not null - `org.apache.commons.collections4.Predicate`
  true-transformer - transformer used if true, not null - `org.apache.commons.collections4.Transformer`
  false-transformer - transformer used if false, not null - `org.apache.commons.collections4.Transformer`"
  (^IfTransformer [^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Transformer true-transformer ^org.apache.commons.collections4.Transformer false-transformer]
    (new IfTransformer predicate true-transformer false-transformer)))

(defn *if-transformer
  "Factory method that performs validation.

  predicate - predicate to switch on - `org.apache.commons.collections4.Predicate`
  true-transformer - transformer used if true - `org.apache.commons.collections4.Transformer`
  false-transformer - transformer used if false - `org.apache.commons.collections4.Transformer`

  returns: the if transformer - `<I,O> org.apache.commons.collections4.Transformer<I,O>`

  throws: java.lang.NullPointerException - if either argument is null"
  ([^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Transformer true-transformer ^org.apache.commons.collections4.Transformer false-transformer]
    (IfTransformer/ifTransformer predicate true-transformer false-transformer))
  ([^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Transformer true-transformer]
    (IfTransformer/ifTransformer predicate true-transformer)))

(defn transform
  "Transforms the input using the true or false transformer based to the result of the predicate.

  input - the input object to transform - `I`

  returns: the transformed result - `O`"
  ([^IfTransformer this input]
    (-> this (.transform input))))

(defn get-predicate
  "Gets the predicate.

  returns: the predicate - `org.apache.commons.collections4.Predicate<? super I>`"
  ([^IfTransformer this]
    (-> this (.getPredicate))))

(defn get-true-transformer
  "Gets the transformer used when true.

  returns: the transformer - `org.apache.commons.collections4.Transformer<? super I,? extends O>`"
  ([^IfTransformer this]
    (-> this (.getTrueTransformer))))

(defn get-false-transformer
  "Gets the transformer used when false.

  returns: the transformer - `org.apache.commons.collections4.Transformer<? super I,? extends O>`"
  ([^IfTransformer this]
    (-> this (.getFalseTransformer))))

