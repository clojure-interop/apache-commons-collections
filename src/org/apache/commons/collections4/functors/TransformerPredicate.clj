(ns org.apache.commons.collections4.functors.TransformerPredicate
  "Predicate implementation that returns the result of a transformer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors TransformerPredicate]))

(defn ->transformer-predicate
  "Constructor.

  Constructor that performs no validation.
   Use transformerPredicate if you want that.

  transformer - the transformer to decorate - `org.apache.commons.collections4.Transformer`"
  (^TransformerPredicate [^org.apache.commons.collections4.Transformer transformer]
    (new TransformerPredicate transformer)))

(defn *transformer-predicate
  "Factory to create the predicate.

  transformer - the transformer to decorate - `org.apache.commons.collections4.Transformer`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the transformer is null"
  ([^org.apache.commons.collections4.Transformer transformer]
    (TransformerPredicate/transformerPredicate transformer)))

(defn evaluate
  "Evaluates the predicate returning the result of the decorated transformer.

  object - the input object - `T`

  returns: true if decorated transformer returns Boolean.TRUE - `boolean`

  throws: org.apache.commons.collections4.FunctorException - if the transformer returns an invalid type"
  (^Boolean [^TransformerPredicate this object]
    (-> this (.evaluate object))))

(defn get-transformer
  "Gets the transformer.

  returns: the transformer - `org.apache.commons.collections4.Transformer<? super T,java.lang.Boolean>`"
  ([^TransformerPredicate this]
    (-> this (.getTransformer))))

