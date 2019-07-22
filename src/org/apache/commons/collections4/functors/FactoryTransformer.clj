(ns org.apache.commons.collections4.functors.FactoryTransformer
  "Transformer implementation that calls a Factory and returns the result."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors FactoryTransformer]))

(defn ->factory-transformer
  "Constructor.

  Constructor that performs no validation.
   Use factoryTransformer if you want that.

  factory - the factory to call, not null - `org.apache.commons.collections4.Factory`"
  (^FactoryTransformer [^org.apache.commons.collections4.Factory factory]
    (new FactoryTransformer factory)))

(defn *factory-transformer
  "Factory method that performs validation.

  factory - the factory to call, not null - `org.apache.commons.collections4.Factory`

  returns: the factory transformer - `<I,O> org.apache.commons.collections4.Transformer<I,O>`

  throws: java.lang.NullPointerException - if the factory is null"
  ([^org.apache.commons.collections4.Factory factory]
    (FactoryTransformer/factoryTransformer factory)))

(defn transform
  "Transforms the input by ignoring the input and returning the result of
   calling the decorated factory.

  input - the input object to transform - `I`

  returns: the transformed result - `O`"
  ([^FactoryTransformer this input]
    (-> this (.transform input))))

(defn get-factory
  "Gets the factory.

  returns: the factory - `org.apache.commons.collections4.Factory<? extends O>`"
  ([^FactoryTransformer this]
    (-> this (.getFactory))))

