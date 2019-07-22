(ns org.apache.commons.collections4.functors.InstantiateFactory
  "Factory implementation that creates a new object instance by reflection.

  WARNING: from v4.1 onwards this class will not be serializable anymore
  in order to prevent potential remote code execution exploits. Please refer to
  COLLECTIONS-580
  for more details."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors InstantiateFactory]))

(defn ->instantiate-factory
  "Constructor.

  Constructor that performs no validation.
   Use instantiateFactory if you want that.

  class-to-instantiate - the class to instantiate - `java.lang.Class`
  param-types - the constructor parameter types, cloned - `java.lang.Class[]`
  args - the constructor arguments, cloned - `java.lang.Object[]`"
  (^InstantiateFactory [^java.lang.Class class-to-instantiate param-types args]
    (new InstantiateFactory class-to-instantiate param-types args))
  (^InstantiateFactory [^java.lang.Class class-to-instantiate]
    (new InstantiateFactory class-to-instantiate)))

(defn *instantiate-factory
  "Factory method that performs validation.

  class-to-instantiate - the class to instantiate, not null - `java.lang.Class`
  param-types - the constructor parameter types, cloned - `java.lang.Class[]`
  args - the constructor arguments, cloned - `java.lang.Object[]`

  returns: a new instantiate factory - `<T> org.apache.commons.collections4.Factory<T>`

  throws: java.lang.NullPointerException - if classToInstantiate is null"
  ([^java.lang.Class class-to-instantiate param-types args]
    (InstantiateFactory/instantiateFactory class-to-instantiate param-types args)))

(defn create
  "Creates an object using the stored constructor.

  returns: the new object - `T`"
  ([^InstantiateFactory this]
    (-> this (.create))))

