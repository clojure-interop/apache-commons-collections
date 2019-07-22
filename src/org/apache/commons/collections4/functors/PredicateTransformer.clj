(ns org.apache.commons.collections4.functors.PredicateTransformer
  "Transformer implementation that calls a Predicate using the input object
  and then returns the result."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors PredicateTransformer]))

(defn ->predicate-transformer
  "Constructor.

  Constructor that performs no validation.
   Use predicateTransformer if you want that.

  predicate - the predicate to call, not null - `org.apache.commons.collections4.Predicate`"
  (^PredicateTransformer [^org.apache.commons.collections4.Predicate predicate]
    (new PredicateTransformer predicate)))

(defn *predicate-transformer
  "Factory method that performs validation.

  predicate - the predicate to call, not null - `org.apache.commons.collections4.Predicate`

  returns: the predicate transformer - `<T> org.apache.commons.collections4.Transformer<T,java.lang.Boolean>`

  throws: java.lang.IllegalArgumentException - if the predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate]
    (PredicateTransformer/predicateTransformer predicate)))

(defn transform
  "Transforms the input to result by calling a predicate.

  input - the input object to transform - `T`

  returns: the transformed result - `java.lang.Boolean`"
  (^java.lang.Boolean [^PredicateTransformer this input]
    (-> this (.transform input))))

(defn get-predicate
  "Gets the predicate.

  returns: the predicate - `org.apache.commons.collections4.Predicate<? super T>`"
  ([^PredicateTransformer this]
    (-> this (.getPredicate))))

