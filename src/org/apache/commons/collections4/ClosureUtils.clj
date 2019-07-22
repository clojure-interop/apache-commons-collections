(ns org.apache.commons.collections4.ClosureUtils
  "ClosureUtils provides reference implementations and utilities
  for the Closure functor interface. The supplied closures are:

  Invoker - invokes a method on the input object
  For - repeatedly calls a closure for a fixed number of times
  While - repeatedly calls a closure while a predicate is true
  Chained - chains two or more closures together
  If - calls one closure or another based on a predicate
  Switch - calls one closure based on one or more predicates
  SwitchMap - calls one closure looked up from a Map
  Transformer - wraps a Transformer as a Closure
  NOP - does nothing
  Exception - always throws an exception


  Since v4.1 only closures which are considered to be safe are
  Serializable. Closures considered to be unsafe for serialization are:


  Invoker
  For
  While"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 ClosureUtils]))

(defn *while-closure
  "Creates a Closure that will call the closure repeatedly until the
   predicate returns false.

  predicate - the predicate to use as an end of loop test, not null - `org.apache.commons.collections4.Predicate`
  closure - the closure to call repeatedly, not null - `org.apache.commons.collections4.Closure`

  returns: the while closure - `<E> org.apache.commons.collections4.Closure<E>`

  throws: java.lang.NullPointerException - if either argument is null"
  ([^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Closure closure]
    (ClosureUtils/whileClosure predicate closure)))

(defn *nop-closure
  "Gets a Closure that will do nothing.
   This could be useful during testing as a placeholder.

  returns: the closure - `<E> org.apache.commons.collections4.Closure<E>`"
  ([]
    (ClosureUtils/nopClosure )))

(defn *for-closure
  "Creates a Closure that will call the closure count times.

   A null closure or zero count returns the NOPClosure.

  count - the number of times to loop - `int`
  closure - the closure to call repeatedly - `org.apache.commons.collections4.Closure`

  returns: the for closure - `<E> org.apache.commons.collections4.Closure<E>`"
  ([^Integer count ^org.apache.commons.collections4.Closure closure]
    (ClosureUtils/forClosure count closure)))

(defn *exception-closure
  "Gets a Closure that always throws an exception.
   This could be useful during testing as a placeholder.

  returns: the closure - `<E> org.apache.commons.collections4.Closure<E>`"
  ([]
    (ClosureUtils/exceptionClosure )))

(defn *switch-closure
  "Create a new Closure that calls one of the closures depending
   on the predicates.

   The closure at array location 0 is called if the predicate at array
   location 0 returned true. Each predicate is evaluated
   until one returns true. If no predicates evaluate to true, the default
   closure is called.

  predicates - an array of predicates to check, not null - `org.apache.commons.collections4.Predicate[]`
  closures - an array of closures to call, not null - `org.apache.commons.collections4.Closure[]`
  default-closure - the default to call if no predicate matches - `org.apache.commons.collections4.Closure`

  returns: the switch closure - `<E> org.apache.commons.collections4.Closure<E>`

  throws: java.lang.NullPointerException - if any element in the arrays is null"
  ([predicates closures ^org.apache.commons.collections4.Closure default-closure]
    (ClosureUtils/switchClosure predicates closures default-closure))
  ([predicates closures]
    (ClosureUtils/switchClosure predicates closures))
  ([^java.util.Map predicates-and-closures]
    (ClosureUtils/switchClosure predicates-and-closures)))

(defn *as-closure
  "Creates a Closure that calls a Transformer each time it is called.
   The transformer will be called using the closure's input object.
   The transformer's result will be ignored.

  transformer - the transformer to run each time in the closure, null means nop - `org.apache.commons.collections4.Transformer`

  returns: the closure - `<E> org.apache.commons.collections4.Closure<E>`"
  ([^org.apache.commons.collections4.Transformer transformer]
    (ClosureUtils/asClosure transformer)))

(defn *chained-closure
  "Create a new Closure that calls each closure in turn, passing the
   result into the next closure.

  closures - an array of closures to chain - `org.apache.commons.collections4.Closure`

  returns: the chained closure - `<E> org.apache.commons.collections4.Closure<E>`

  throws: java.lang.NullPointerException - if any closure in the array is null"
  ([^org.apache.commons.collections4.Closure closures]
    (ClosureUtils/chainedClosure closures)))

(defn *if-closure
  "Create a new Closure that calls one of two closures depending
   on the specified predicate.

  predicate - the predicate to switch on - `org.apache.commons.collections4.Predicate`
  true-closure - the closure called if the predicate is true - `org.apache.commons.collections4.Closure`
  false-closure - the closure called if the predicate is false - `org.apache.commons.collections4.Closure`

  returns: the switch closure - `<E> org.apache.commons.collections4.Closure<E>`

  throws: java.lang.NullPointerException - if the predicate or either closure is null"
  ([^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Closure true-closure ^org.apache.commons.collections4.Closure false-closure]
    (ClosureUtils/ifClosure predicate true-closure false-closure))
  ([^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Closure true-closure]
    (ClosureUtils/ifClosure predicate true-closure)))

(defn *invoker-closure
  "Creates a Closure that will invoke a specific method on the closure's
   input object by reflection.

  method-name - the name of the method - `java.lang.String`
  param-types - the parameter types - `java.lang.Class[]`
  args - the arguments - `java.lang.Object[]`

  returns: the invoker closure - `<E> org.apache.commons.collections4.Closure<E>`

  throws: java.lang.NullPointerException - if the method name is null"
  ([^java.lang.String method-name param-types args]
    (ClosureUtils/invokerClosure method-name param-types args))
  ([^java.lang.String method-name]
    (ClosureUtils/invokerClosure method-name)))

(defn *do-while-closure
  "Creates a Closure that will call the closure once and then repeatedly
   until the predicate returns false.

  closure - the closure to call repeatedly, not null - `org.apache.commons.collections4.Closure`
  predicate - the predicate to use as an end of loop test, not null - `org.apache.commons.collections4.Predicate`

  returns: the do-while closure - `<E> org.apache.commons.collections4.Closure<E>`

  throws: java.lang.NullPointerException - if either argument is null"
  ([^org.apache.commons.collections4.Closure closure ^org.apache.commons.collections4.Predicate predicate]
    (ClosureUtils/doWhileClosure closure predicate)))

(defn *switch-map-closure
  "Create a new Closure that uses the input object as a key to find the
   closure to call.

   The Map consists of object keys and Closure values. A closure
   is called if the input object equals the key. If there is no match, the
   default closure is called. The default closure is set in the map
   using a null key.

  objects-and-closures - a map of objects to closures - `java.util.Map`

  returns: the closure - `<E> org.apache.commons.collections4.Closure<E>`

  throws: java.lang.NullPointerException - if any closure in the map is null"
  ([^java.util.Map objects-and-closures]
    (ClosureUtils/switchMapClosure objects-and-closures)))

