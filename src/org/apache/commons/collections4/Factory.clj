(ns org.apache.commons.collections4.Factory
  "Defines a functor interface implemented by classes that create objects.

  A Factory creates an object without using an input parameter.
  If an input parameter is required, then Transformer is more appropriate.


  Standard implementations of common factories are provided by
  FactoryUtils. These include factories that return a constant,
  a copy of a prototype or a new instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 Factory]))

(defn create
  "Create a new object.

  returns: a new object - `T`

  throws: org.apache.commons.collections4.FunctorException - (runtime) if the factory cannot create an object"
  ([^Factory this]
    (-> this (.create))))

