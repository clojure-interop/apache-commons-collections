(ns org.apache.commons.collections4.functors.ChainedClosure
  "Closure implementation that chains the specified closures together."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ChainedClosure]))

(defn ->chained-closure
  "Constructor.

  Constructor that performs no validation.
   Use chainedClosure if you want that.

  closures - the closures to chain, copied, no nulls - `org.apache.commons.collections4.Closure`"
  (^ChainedClosure [^org.apache.commons.collections4.Closure closures]
    (new ChainedClosure closures)))

(defn *chained-closure
  "Factory method that performs validation and copies the parameter array.

  closures - the closures to chain, copied, no nulls - `org.apache.commons.collections4.Closure`

  returns: the chained closure - `<E> org.apache.commons.collections4.Closure<E>`

  throws: java.lang.NullPointerException - if any closure in the array is null"
  ([^org.apache.commons.collections4.Closure closures]
    (ChainedClosure/chainedClosure closures)))

(defn execute
  "Execute a list of closures.

  input - the input object passed to each closure - `E`"
  ([^ChainedClosure this input]
    (-> this (.execute input))))

(defn get-closures
  "Gets the closures.

  returns: a copy of the closures - `org.apache.commons.collections4.Closure<? super E>[]`"
  ([^ChainedClosure this]
    (-> this (.getClosures))))

