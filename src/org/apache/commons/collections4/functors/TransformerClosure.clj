(ns org.apache.commons.collections4.functors.TransformerClosure
  "Closure implementation that calls a Transformer using the input object
  and ignore the result."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors TransformerClosure]))

(defn ->transformer-closure
  "Constructor.

  Constructor that performs no validation.
   Use transformerClosure if you want that.

  transformer - the transformer to call, not null - `org.apache.commons.collections4.Transformer`"
  (^TransformerClosure [^org.apache.commons.collections4.Transformer transformer]
    (new TransformerClosure transformer)))

(defn *transformer-closure
  "Factory method that performs validation.

   A null transformer will return the NOPClosure.

  transformer - the transformer to call, null means nop - `org.apache.commons.collections4.Transformer`

  returns: the transformer closure - `<E> org.apache.commons.collections4.Closure<E>`"
  ([^org.apache.commons.collections4.Transformer transformer]
    (TransformerClosure/transformerClosure transformer)))

(defn execute
  "Executes the closure by calling the decorated transformer.

  input - the input object - `E`"
  ([^TransformerClosure this input]
    (-> this (.execute input))))

(defn get-transformer
  "Gets the transformer.

  returns: the transformer - `org.apache.commons.collections4.Transformer<? super E,?>`"
  ([^TransformerClosure this]
    (-> this (.getTransformer))))

