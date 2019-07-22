(ns org.apache.commons.collections4.FactoryUtils
  "FactoryUtils provides reference implementations and utilities
  for the Factory functor interface. The supplied factories are:

  Prototype - clones a specified object
  Instantiate - creates objects using reflection
  Constant - always returns the same object
  Null - always returns null
  Exception - always throws an exception


  Since v4.1 only factories which are considered to be safe are
  Serializable. Factories considered to be unsafe for serialization are:

  Prototype
  Instantiate"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 FactoryUtils]))

(defn *exception-factory
  "Gets a Factory that always throws an exception.
   This could be useful during testing as a placeholder.

  returns: the factory - `<T> org.apache.commons.collections4.Factory<T>`"
  ([]
    (FactoryUtils/exceptionFactory )))

(defn *null-factory
  "Gets a Factory that will return null each time the factory is used.
   This could be useful during testing as a placeholder.

  returns: the factory - `<T> org.apache.commons.collections4.Factory<T>`"
  ([]
    (FactoryUtils/nullFactory )))

(defn *constant-factory
  "Creates a Factory that will return the same object each time the factory
   is used. No check is made that the object is immutable. In general, only
   immutable objects should use the constant factory. Mutable objects should
   use the prototype factory.

  constant-to-return - the constant object to return each time in the factory - `T`

  returns: the constant factory. - `<T> org.apache.commons.collections4.Factory<T>`"
  ([constant-to-return]
    (FactoryUtils/constantFactory constant-to-return)))

(defn *prototype-factory
  "Creates a Factory that will return a clone of the same prototype object
   each time the factory is used. The prototype will be cloned using one of these
   techniques (in order):


   public clone method
   public copy constructor
   serialization clone

  prototype - the object to clone each time in the factory - `T`

  returns: the prototype factory, or a ConstantFactory.NULL_INSTANCE if
   the prototype is null - `<T> org.apache.commons.collections4.Factory<T>`

  throws: java.lang.IllegalArgumentException - if the prototype cannot be cloned"
  ([prototype]
    (FactoryUtils/prototypeFactory prototype)))

(defn *instantiate-factory
  "Creates a Factory that can create objects of a specific type using
   the arguments specified to this method.

  class-to-instantiate - the Class to instantiate each time in the factory - `java.lang.Class`
  param-types - parameter types for the constructor, can be null - `java.lang.Class[]`
  args - the arguments to pass to the constructor, can be null - `java.lang.Object[]`

  returns: the reflection factory - `<T> org.apache.commons.collections4.Factory<T>`

  throws: java.lang.NullPointerException - if the classToInstantiate is null"
  ([^java.lang.Class class-to-instantiate param-types args]
    (FactoryUtils/instantiateFactory class-to-instantiate param-types args))
  ([^java.lang.Class class-to-instantiate]
    (FactoryUtils/instantiateFactory class-to-instantiate)))

