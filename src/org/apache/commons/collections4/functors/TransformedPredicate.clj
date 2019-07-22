(ns org.apache.commons.collections4.functors.TransformedPredicate
  "Predicate implementation that transforms the given object before invoking
  another Predicate."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors TransformedPredicate]))

(defn ->transformed-predicate
  "Constructor.

  Constructor that performs no validation.
   Use transformedPredicate if you want that.

  transformer - the transformer to use - `org.apache.commons.collections4.Transformer`
  predicate - the predicate to decorate - `org.apache.commons.collections4.Predicate`"
  (^TransformedPredicate [^org.apache.commons.collections4.Transformer transformer ^org.apache.commons.collections4.Predicate predicate]
    (new TransformedPredicate transformer predicate)))

(defn *transformed-predicate
  "Factory to create the predicate.

  transformer - the transformer to call - `org.apache.commons.collections4.Transformer`
  predicate - the predicate to call with the result of the transform - `org.apache.commons.collections4.Predicate`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the transformer or the predicate is null"
  ([^org.apache.commons.collections4.Transformer transformer ^org.apache.commons.collections4.Predicate predicate]
    (TransformedPredicate/transformedPredicate transformer predicate)))

(defn evaluate
  "Evaluates the predicate returning the result of the decorated predicate
   once the input has been transformed

  object - the input object which will be transformed - `T`

  returns: true if decorated predicate returns true - `boolean`"
  (^Boolean [^TransformedPredicate this object]
    (-> this (.evaluate object))))

(defn get-predicates
  "Gets the predicate being decorated.

  returns: the predicate as the only element in an array - `org.apache.commons.collections4.Predicate<? super T>[]`"
  ([^TransformedPredicate this]
    (-> this (.getPredicates))))

(defn get-transformer
  "Gets the transformer in use.

  returns: the transformer - `org.apache.commons.collections4.Transformer<? super T,? extends T>`"
  ([^TransformedPredicate this]
    (-> this (.getTransformer))))

