(ns org.apache.commons.collections4.functors.ClosureTransformer
  "Transformer implementation that calls a Closure using the input object
  and then returns the input."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ClosureTransformer]))

(defn ->closure-transformer
  "Constructor.

  Constructor that performs no validation.
   Use closureTransformer if you want that.

  closure - the closure to call, not null - `org.apache.commons.collections4.Closure`"
  (^ClosureTransformer [^org.apache.commons.collections4.Closure closure]
    (new ClosureTransformer closure)))

(defn *closure-transformer
  "Factory method that performs validation.

  closure - the closure to call, not null - `org.apache.commons.collections4.Closure`

  returns: the closure transformer - `<T> org.apache.commons.collections4.Transformer<T,T>`

  throws: java.lang.NullPointerException - if the closure is null"
  ([^org.apache.commons.collections4.Closure closure]
    (ClosureTransformer/closureTransformer closure)))

(defn transform
  "Transforms the input to result by executing a closure.

  input - the input object to transform - `T`

  returns: the transformed result - `T`"
  ([^ClosureTransformer this input]
    (-> this (.transform input))))

(defn get-closure
  "Gets the closure.

  returns: the closure - `org.apache.commons.collections4.Closure<? super T>`"
  ([^ClosureTransformer this]
    (-> this (.getClosure))))

