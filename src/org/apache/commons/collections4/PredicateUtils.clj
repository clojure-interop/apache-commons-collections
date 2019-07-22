(ns org.apache.commons.collections4.PredicateUtils
  "PredicateUtils provides reference implementations and utilities
  for the Predicate functor interface. The supplied predicates are:

  Invoker - returns the result of a method call on the input object
  InstanceOf - true if the object is an instanceof a class
  Equal - true if the object equals() a specified object
  Identity - true if the object == a specified object
  Null - true if the object is null
  NotNull - true if the object is not null
  Unique - true if the object has not already been evaluated
  And/All - true if all of the predicates are true
  Or/Any - true if any of the predicates is true
  Either/One - true if only one of the predicate is true
  Neither/None - true if none of the predicates are true
  Not - true if the predicate is false, and vice versa
  Transformer - wraps a Transformer as a Predicate
  True - always return true
  False - always return false
  Exception - always throws an exception
  NullIsException/NullIsFalse/NullIsTrue - check for null input
  Transformed - transforms the input before calling the predicate

  All the supplied predicates are Serializable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 PredicateUtils]))

(defn *neither-predicate
  "Create a new Predicate that returns true if neither of the specified
   predicates are true.

  predicate-1 - the first predicate, may not be null - `org.apache.commons.collections4.Predicate`
  predicate-2 - the second predicate, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the neither predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if either predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate-1 ^org.apache.commons.collections4.Predicate predicate-2]
    (PredicateUtils/neitherPredicate predicate-1 predicate-2)))

(defn *null-predicate
  "Gets a Predicate that checks if the input object passed in is null.

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([]
    (PredicateUtils/nullPredicate )))

(defn *identity-predicate
  "Creates a Predicate that checks if the input object is equal to the
   specified object by identity.

  value - the value to compare against - `T`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([value]
    (PredicateUtils/identityPredicate value)))

(defn *as-predicate
  "Create a new Predicate that wraps a Transformer. The Transformer must
   return either Boolean.TRUE or Boolean.FALSE otherwise a PredicateException
   will be thrown.

  transformer - the transformer to wrap, may not be null - `org.apache.commons.collections4.Transformer`

  returns: the transformer wrapping predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the transformer is null"
  ([^org.apache.commons.collections4.Transformer transformer]
    (PredicateUtils/asPredicate transformer)))

(defn *null-is-exception-predicate
  "Gets a Predicate that throws an exception if the input object is null,
   otherwise it calls the specified Predicate. This allows null handling
   behaviour to be added to Predicates that don't support nulls.

  predicate - the predicate to wrap, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the predicate is null."
  ([^org.apache.commons.collections4.Predicate predicate]
    (PredicateUtils/nullIsExceptionPredicate predicate)))

(defn *equal-predicate
  "Creates a Predicate that checks if the input object is equal to the
   specified object using equals().

  value - the value to compare against - `T`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([value]
    (PredicateUtils/equalPredicate value)))

(defn *not-null-predicate
  "Gets a Predicate that checks if the input object passed in is not null.

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([]
    (PredicateUtils/notNullPredicate )))

(defn *not-predicate
  "Create a new Predicate that returns true if the specified predicate
   returns false and vice versa.

  predicate - the predicate to not - `org.apache.commons.collections4.Predicate`

  returns: the not predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate]
    (PredicateUtils/notPredicate predicate)))

(defn *true-predicate
  "Gets a Predicate that always returns true.

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([]
    (PredicateUtils/truePredicate )))

(defn *false-predicate
  "Gets a Predicate that always returns false.

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([]
    (PredicateUtils/falsePredicate )))

(defn *all-predicate
  "Create a new Predicate that returns true only if all of the specified
   predicates are true.
   If the array of predicates is empty, then this predicate returns true.

  predicates - an array of predicates to check, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the all predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if any predicate in the array is null"
  ([^org.apache.commons.collections4.Predicate predicates]
    (PredicateUtils/allPredicate predicates)))

(defn *either-predicate
  "Create a new Predicate that returns true if one, but not both, of the
   specified predicates are true. XOR

  predicate-1 - the first predicate, may not be null - `org.apache.commons.collections4.Predicate`
  predicate-2 - the second predicate, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the either predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if either predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate-1 ^org.apache.commons.collections4.Predicate predicate-2]
    (PredicateUtils/eitherPredicate predicate-1 predicate-2)))

(defn *instanceof-predicate
  "Creates a Predicate that checks if the object passed in is of
   a particular type, using instanceof. A null input
   object will return false.

  type - the type to check for, may not be null - `java.lang.Class`

  returns: the predicate - `org.apache.commons.collections4.Predicate<java.lang.Object>`

  throws: java.lang.NullPointerException - if the class is null"
  (^org.apache.commons.collections4.Predicate [^java.lang.Class type]
    (PredicateUtils/instanceofPredicate type)))

(defn *transformed-predicate
  "Creates a predicate that transforms the input object before passing it
   to the predicate.

  transformer - the transformer to call first - `org.apache.commons.collections4.Transformer`
  predicate - the predicate to call with the result of the transform - `org.apache.commons.collections4.Predicate`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the transformer or the predicate is null"
  ([^org.apache.commons.collections4.Transformer transformer ^org.apache.commons.collections4.Predicate predicate]
    (PredicateUtils/transformedPredicate transformer predicate)))

(defn *and-predicate
  "Create a new Predicate that returns true only if both of the specified
   predicates are true.

  predicate-1 - the first predicate, may not be null - `org.apache.commons.collections4.Predicate`
  predicate-2 - the second predicate, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the and predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if either predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate-1 ^org.apache.commons.collections4.Predicate predicate-2]
    (PredicateUtils/andPredicate predicate-1 predicate-2)))

(defn *exception-predicate
  "Gets a Predicate that always throws an exception.
   This could be useful during testing as a placeholder.

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([]
    (PredicateUtils/exceptionPredicate )))

(defn *null-is-true-predicate
  "Gets a Predicate that returns true if the input object is null, otherwise
   it calls the specified Predicate. This allows null handling behaviour to
   be added to Predicates that don't support nulls.

  predicate - the predicate to wrap, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the predicate is null."
  ([^org.apache.commons.collections4.Predicate predicate]
    (PredicateUtils/nullIsTruePredicate predicate)))

(defn *or-predicate
  "Create a new Predicate that returns true if either of the specified
   predicates are true.

  predicate-1 - the first predicate, may not be null - `org.apache.commons.collections4.Predicate`
  predicate-2 - the second predicate, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the or predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if either predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate-1 ^org.apache.commons.collections4.Predicate predicate-2]
    (PredicateUtils/orPredicate predicate-1 predicate-2)))

(defn *one-predicate
  "Create a new Predicate that returns true if only one of the specified
   predicates are true.
   If the array of predicates is empty, then this predicate returns false.

  predicates - an array of predicates to check, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the one predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if any predicate in the array is null"
  ([^org.apache.commons.collections4.Predicate predicates]
    (PredicateUtils/onePredicate predicates)))

(defn *any-predicate
  "Create a new Predicate that returns true if any of the specified
   predicates are true.
   If the array of predicates is empty, then this predicate returns false.

  predicates - an array of predicates to check, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the any predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if any predicate in the array is null"
  ([^org.apache.commons.collections4.Predicate predicates]
    (PredicateUtils/anyPredicate predicates)))

(defn *unique-predicate
  "Creates a Predicate that returns true the first time an object is
   encountered, and false if the same object is received
   again. The comparison is by equals(). A null input object
   is accepted and will return true the first time, and false subsequently
   as well.

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([]
    (PredicateUtils/uniquePredicate )))

(defn *none-predicate
  "Create a new Predicate that returns true if none of the specified
   predicates are true.
   If the array of predicates is empty, then this predicate returns true.

  predicates - an array of predicates to check, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the none predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if any predicate in the array is null"
  ([^org.apache.commons.collections4.Predicate predicates]
    (PredicateUtils/nonePredicate predicates)))

(defn *invoker-predicate
  "Creates a Predicate that invokes a method on the input object.
   The method must return either a boolean or a non-null Boolean,
   and have no parameters. If the input object is null, a
   PredicateException is thrown.

   For example, PredicateUtils.invokerPredicate(\"isEmpty\");
   will call the isEmpty method on the input object to
   determine the predicate result.

  method-name - the method name to call on the input object, may not be null - `java.lang.String`
  param-types - the parameter types - `java.lang.Class[]`
  args - the arguments - `java.lang.Object[]`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the method name is null"
  ([^java.lang.String method-name param-types args]
    (PredicateUtils/invokerPredicate method-name param-types args))
  ([^java.lang.String method-name]
    (PredicateUtils/invokerPredicate method-name)))

(defn *null-is-false-predicate
  "Gets a Predicate that returns false if the input object is null, otherwise
   it calls the specified Predicate. This allows null handling behaviour to
   be added to Predicates that don't support nulls.

  predicate - the predicate to wrap, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if the predicate is null."
  ([^org.apache.commons.collections4.Predicate predicate]
    (PredicateUtils/nullIsFalsePredicate predicate)))

