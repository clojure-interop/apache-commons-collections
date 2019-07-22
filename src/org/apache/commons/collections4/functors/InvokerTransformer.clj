(ns org.apache.commons.collections4.functors.InvokerTransformer
  "Transformer implementation that creates a new object instance by reflection.

  WARNING: from v4.1 onwards this class will not be serializable anymore
  in order to prevent potential remote code execution exploits. Please refer to
  COLLECTIONS-580
  for more details."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors InvokerTransformer]))

(defn ->invoker-transformer
  "Constructor.

  Constructor that performs no validation.
   Use invokerTransformer if you want that.

   Note: from 4.0, the input parameters will be cloned

  method-name - the method to call - `java.lang.String`
  param-types - the constructor parameter types - `java.lang.Class[]`
  args - the constructor arguments - `java.lang.Object[]`"
  (^InvokerTransformer [^java.lang.String method-name param-types args]
    (new InvokerTransformer method-name param-types args)))

(defn *invoker-transformer
  "Gets an instance of this transformer calling a specific method with specific values.

  method-name - the method name to call - `java.lang.String`
  param-types - the parameter types of the method - `java.lang.Class[]`
  args - the arguments to pass to the method - `java.lang.Object[]`

  returns: an invoker transformer - `<I,O> org.apache.commons.collections4.Transformer<I,O>`

  throws: java.lang.NullPointerException - if methodName is null"
  ([^java.lang.String method-name param-types args]
    (InvokerTransformer/invokerTransformer method-name param-types args))
  ([^java.lang.String method-name]
    (InvokerTransformer/invokerTransformer method-name)))

(defn transform
  "Transforms the input to result by invoking a method on the input.

  input - the input object to transform - `java.lang.Object`

  returns: the transformed result, null if null input - `O`"
  ([^InvokerTransformer this ^java.lang.Object input]
    (-> this (.transform input))))

