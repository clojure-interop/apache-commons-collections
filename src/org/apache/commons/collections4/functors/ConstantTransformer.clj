(ns org.apache.commons.collections4.functors.ConstantTransformer
  "Transformer implementation that returns the same constant each time.

  No check is made that the object is immutable. In general, only immutable
  objects should use the constant factory. Mutable objects should
  use the prototype factory."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ConstantTransformer]))

(defn ->constant-transformer
  "Constructor.

  Constructor that performs no validation.
   Use constantTransformer if you want that.

  constant-to-return - the constant to return each time - `O`"
  (^ConstantTransformer [constant-to-return]
    (new ConstantTransformer constant-to-return)))

(def *-null-instance
  "Static Constant.

  Returns null each time

  type: org.apache.commons.collections4.Transformer"
  ConstantTransformer/NULL_INSTANCE)

(defn *null-transformer
  "Get a typed null instance.

  returns: Transformer<I, O> that always returns null. - `<I,O> org.apache.commons.collections4.Transformer<I,O>`"
  ([]
    (ConstantTransformer/nullTransformer )))

(defn *constant-transformer
  "Transformer method that performs validation.

  constant-to-return - the constant object to return each time in the factory - `O`

  returns: the constant factory. - `<I,O> org.apache.commons.collections4.Transformer<I,O>`"
  ([constant-to-return]
    (ConstantTransformer/constantTransformer constant-to-return)))

(defn transform
  "Transforms the input by ignoring it and returning the stored constant instead.

  input - the input object which is ignored - `I`

  returns: the stored constant - `O`"
  ([^ConstantTransformer this input]
    (-> this (.transform input))))

(defn get-constant
  "Gets the constant.

  returns: the constant - `O`"
  ([^ConstantTransformer this]
    (-> this (.getConstant))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ConstantTransformer this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ConstantTransformer this]
    (-> this (.hashCode))))

