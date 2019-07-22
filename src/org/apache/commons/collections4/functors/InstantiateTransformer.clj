(ns org.apache.commons.collections4.functors.InstantiateTransformer
  "Transformer implementation that creates a new object instance by reflection.

  WARNING: from v4.1 onwards this class will not be serializable anymore
  in order to prevent potential remote code execution exploits. Please refer to
  COLLECTIONS-580
  for more details."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors InstantiateTransformer]))

(defn ->instantiate-transformer
  "Constructor.

  Constructor that performs no validation.
   Use instantiateTransformer if you want that.

   Note: from 4.0, the input parameters will be cloned

  param-types - the constructor parameter types - `java.lang.Class[]`
  args - the constructor arguments - `java.lang.Object[]`"
  (^InstantiateTransformer [param-types args]
    (new InstantiateTransformer param-types args)))

(defn *instantiate-transformer
  "Transformer method that performs validation.

  param-types - the constructor parameter types - `java.lang.Class[]`
  args - the constructor arguments - `java.lang.Object[]`

  returns: an instantiate transformer - `<T> org.apache.commons.collections4.Transformer<java.lang.Class<? extends T>,T>`

  throws: java.lang.IllegalArgumentException - if paramTypes does not match args"
  ([param-types args]
    (InstantiateTransformer/instantiateTransformer param-types args))
  ([]
    (InstantiateTransformer/instantiateTransformer )))

(defn transform
  "Transforms the input Class object to a result by instantiation.

  input - the input object to transform - `java.lang.Class`

  returns: the transformed result - `T`"
  ([^InstantiateTransformer this ^java.lang.Class input]
    (-> this (.transform input))))

