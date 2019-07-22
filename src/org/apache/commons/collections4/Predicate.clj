(ns org.apache.commons.collections4.Predicate
  "Defines a functor interface implemented by classes that perform a predicate
  test on an object.

  A Predicate is the object equivalent of an if statement.
  It uses the input object to return a true or false value, and is often used in
  validation or filtering.


  Standard implementations of common predicates are provided by
  PredicateUtils. These include true, false, instanceof, equals, and,
  or, not, method invokation and null testing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 Predicate]))

(defn evaluate
  "Use the specified parameter to perform a test that returns true or false.

  object - the object to evaluate, should not be changed - `T`

  returns: true or false - `boolean`

  throws: java.lang.ClassCastException - (runtime) if the input is the wrong class"
  (^Boolean [^Predicate this object]
    (-> this (.evaluate object))))

