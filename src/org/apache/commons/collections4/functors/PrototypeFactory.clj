(ns org.apache.commons.collections4.functors.PrototypeFactory
  "Factory implementation that creates a new instance each time based on a prototype.

  WARNING: from v4.1 onwards Factory instances returned by
  prototypeFactory(Object) will not be serializable anymore in order
  to prevent potential remote code execution exploits. Please refer to
  COLLECTIONS-580
  for more details."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors PrototypeFactory]))

(defn *prototype-factory
  "Factory method that performs validation.

   Creates a Factory that will return a clone of the same prototype object
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
    (PrototypeFactory/prototypeFactory prototype)))

