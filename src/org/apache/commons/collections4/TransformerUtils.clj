(ns org.apache.commons.collections4.TransformerUtils
  "TransformerUtils provides reference implementations and
  utilities for the Transformer functor interface. The supplied transformers are:

  Invoker - returns the result of a method call on the input object
  Clone - returns a clone of the input object
  Constant - always returns the same object
  Closure - performs a Closure and returns the input object
  Predicate - returns the result of the predicate as a Boolean
  Factory - returns a new object from a factory
  Chained - chains two or more transformers together
  If - calls one transformer or another based on a predicate
  Switch - calls one transformer based on one or more predicates
  SwitchMap - calls one transformer looked up from a Map
  Instantiate - the Class input object is instantiated
  Map - returns an object from a supplied Map
  Null - always returns null
  NOP - returns the input object, which should be immutable
  Exception - always throws an exception
  StringValue - returns a java.lang.String representation of the input object


  Since v4.1 only transformers which are considered to be safe are
  Serializable. Transformers considered to be unsafe for serialization are:


  Invoker
  Clone
  Instantiate"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 TransformerUtils]))

(defn *as-transformer
  "Creates a Transformer that calls a Closure each time the transformer is used.
   The transformer returns the input object.

  closure - the closure to run each time in the transformer, not null - `org.apache.commons.collections4.Closure`

  returns: the transformer - `<T> org.apache.commons.collections4.Transformer<T,T>`

  throws: java.lang.NullPointerException - if the closure is null"
  ([^org.apache.commons.collections4.Closure closure]
    (TransformerUtils/asTransformer closure)))

(defn *exception-transformer
  "Gets a transformer that always throws an exception.
   This could be useful during testing as a placeholder.

  returns: the transformer - `<I,O> org.apache.commons.collections4.Transformer<I,O>`"
  ([]
    (TransformerUtils/exceptionTransformer )))

(defn *chained-transformer
  "Create a new Transformer that calls each transformer in turn, passing the
   result into the next transformer.

  transformers - an array of transformers to chain - `org.apache.commons.collections4.Transformer`

  returns: the transformer - `<T> org.apache.commons.collections4.Transformer<T,T>`

  throws: java.lang.NullPointerException - if the transformers array or any of the transformers is null"
  ([^org.apache.commons.collections4.Transformer transformers]
    (TransformerUtils/chainedTransformer transformers)))

(defn *null-transformer
  "Gets a transformer that always returns null.

  returns: the transformer - `<I,O> org.apache.commons.collections4.Transformer<I,O>`"
  ([]
    (TransformerUtils/nullTransformer )))

(defn *constant-transformer
  "Creates a Transformer that will return the same object each time the
   transformer is used.

  constant-to-return - the constant object to return each time in the transformer - `O`

  returns: the transformer. - `<I,O> org.apache.commons.collections4.Transformer<I,O>`"
  ([constant-to-return]
    (TransformerUtils/constantTransformer constant-to-return)))

(defn *string-value-transformer
  "Gets a transformer that returns a java.lang.String
   representation of the input object. This is achieved via the
   toString method, null returns 'null'.

  returns: the transformer - `<T> org.apache.commons.collections4.Transformer<T,java.lang.String>`"
  ([]
    (TransformerUtils/stringValueTransformer )))

(defn *switch-map-transformer
  "Create a new Transformer that uses the input object as a key to find the
   transformer to call.

   The Map consists of object keys and Transformer values. A transformer
   is called if the input object equals the key. If there is no match, the
   default transformer is called. The default transformer is set in the map
   using a null key. If no default is set, null will be returned in a default case.

  objects-and-transformers - a map of objects to transformers - `java.util.Map`

  returns: the transformer - `<I,O> org.apache.commons.collections4.Transformer<I,O>`

  throws: java.lang.NullPointerException - if any transformer in the map is null"
  ([^java.util.Map objects-and-transformers]
    (TransformerUtils/switchMapTransformer objects-and-transformers)))

(defn *switch-transformer
  "Deprecated. as of 4.1, use ifTransformer(Predicate, Transformer, Transformer)

  predicate - the predicate to switch on - `org.apache.commons.collections4.Predicate`
  true-transformer - the transformer called if the predicate is true - `org.apache.commons.collections4.Transformer`
  false-transformer - the transformer called if the predicate is false - `org.apache.commons.collections4.Transformer`

  returns: the transformer - `<I,O> org.apache.commons.collections4.Transformer<I,O>`

  throws: java.lang.NullPointerException - if either the predicate or transformer is null"
  ([^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Transformer true-transformer ^org.apache.commons.collections4.Transformer false-transformer]
    (TransformerUtils/switchTransformer predicate true-transformer false-transformer))
  ([predicates transformers]
    (TransformerUtils/switchTransformer predicates transformers))
  ([^java.util.Map predicates-and-transformers]
    (TransformerUtils/switchTransformer predicates-and-transformers)))

(defn *if-transformer
  "Create a new Transformer that calls one of two transformers depending
   on the specified predicate.

  predicate - the predicate to switch on - `org.apache.commons.collections4.Predicate`
  true-transformer - the transformer called if the predicate is true - `org.apache.commons.collections4.Transformer`
  false-transformer - the transformer called if the predicate is false - `org.apache.commons.collections4.Transformer`

  returns: the transformer - `<I,O> org.apache.commons.collections4.Transformer<I,O>`

  throws: java.lang.NullPointerException - if either the predicate or transformer is null"
  ([^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Transformer true-transformer ^org.apache.commons.collections4.Transformer false-transformer]
    (TransformerUtils/ifTransformer predicate true-transformer false-transformer))
  ([^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Transformer true-transformer]
    (TransformerUtils/ifTransformer predicate true-transformer)))

(defn *instantiate-transformer
  "Creates a Transformer that expects an input Class object that it will
   instantiate. The constructor used is determined by the arguments specified
   to this method.

  param-types - parameter types for the constructor, can be null - `java.lang.Class[]`
  args - the arguments to pass to the constructor, can be null - `java.lang.Object[]`

  returns: the transformer - `<T> org.apache.commons.collections4.Transformer<java.lang.Class<? extends T>,T>`

  throws: java.lang.IllegalArgumentException - if the paramTypes and args don't match"
  ([param-types args]
    (TransformerUtils/instantiateTransformer param-types args))
  ([]
    (TransformerUtils/instantiateTransformer )))

(defn *nop-transformer
  "Gets a transformer that returns the input object.
   The input object should be immutable to maintain the
   contract of Transformer (although this is not checked).

  returns: the transformer - `<T> org.apache.commons.collections4.Transformer<T,T>`"
  ([]
    (TransformerUtils/nopTransformer )))

(defn *invoker-transformer
  "Gets a Transformer that invokes a method on the input object.
   The method parameters are specified. If the input object is null,
   null is returned.

  method-name - the name of the method - `java.lang.String`
  param-types - the parameter types - `java.lang.Class[]`
  args - the arguments - `java.lang.Object[]`

  returns: the transformer - `<I,O> org.apache.commons.collections4.Transformer<I,O>`

  throws: java.lang.NullPointerException - if the method name is null"
  ([^java.lang.String method-name param-types args]
    (TransformerUtils/invokerTransformer method-name param-types args))
  ([^java.lang.String method-name]
    (TransformerUtils/invokerTransformer method-name)))

(defn *map-transformer
  "Creates a Transformer that uses the passed in Map to transform the input
   object (as a simple lookup).

  map - the map to use to transform the objects - `java.util.Map`

  returns: the transformer, or ConstantTransformer.nullTransformer() if the
     map is null - `<I,O> org.apache.commons.collections4.Transformer<I,O>`"
  ([^java.util.Map map]
    (TransformerUtils/mapTransformer map)))

(defn *clone-transformer
  "Gets a transformer that returns a clone of the input object.
   The input object will be cloned using one of these techniques (in order):

   public clone method
   public copy constructor
   serialization clone

  returns: the transformer - `<T> org.apache.commons.collections4.Transformer<T,T>`"
  ([]
    (TransformerUtils/cloneTransformer )))

