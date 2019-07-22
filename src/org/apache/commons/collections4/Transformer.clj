(ns org.apache.commons.collections4.Transformer
  "Defines a functor interface implemented by classes that transform one
  object into another.

  A Transformer converts the input object to the output object.
  The input object should be left unchanged.
  Transformers are typically used for type conversions, or extracting data
  from an object.


  Standard implementations of common transformers are provided by
  TransformerUtils. These include method invocation, returning a constant,
  cloning and returning the string value."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 Transformer]))

(defn transform
  "Transforms the input object (leaving it unchanged) into some output object.

  input - the object to be transformed, should be left unchanged - `I`

  returns: a transformed object - `O`

  throws: java.lang.ClassCastException - (runtime) if the input is the wrong class"
  ([^Transformer this input]
    (-> this (.transform input))))

