(ns org.apache.commons.collections4.functors.WhileClosure
  "Closure implementation that executes a closure repeatedly until a condition is met,
  like a do-while or while loop.

  WARNING: from v4.1 onwards this class will not be serializable anymore
  in order to prevent potential remote code execution exploits. Please refer to
  COLLECTIONS-580
  for more details."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors WhileClosure]))

(defn ->while-closure
  "Constructor.

  Constructor that performs no validation.
   Use whileClosure if you want that.

  predicate - the predicate used to evaluate when the loop terminates, not null - `org.apache.commons.collections4.Predicate`
  closure - the closure the execute, not null - `org.apache.commons.collections4.Closure`
  do-loop - true to act as a do-while loop, always executing the closure once - `boolean`"
  (^WhileClosure [^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Closure closure ^Boolean do-loop]
    (new WhileClosure predicate closure do-loop)))

(defn *while-closure
  "Factory method that performs validation.

  predicate - the predicate used to evaluate when the loop terminates, not null - `org.apache.commons.collections4.Predicate`
  closure - the closure the execute, not null - `org.apache.commons.collections4.Closure`
  do-loop - true to act as a do-while loop, always executing the closure once - `boolean`

  returns: the while closure - `<E> org.apache.commons.collections4.Closure<E>`

  throws: java.lang.NullPointerException - if the predicate or closure is null"
  ([^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Closure closure ^Boolean do-loop]
    (WhileClosure/whileClosure predicate closure do-loop)))

(defn execute
  "Executes the closure until the predicate is false.

  input - the input object - `E`"
  ([^WhileClosure this input]
    (-> this (.execute input))))

(defn get-predicate
  "Gets the predicate in use.

  returns: the predicate - `org.apache.commons.collections4.Predicate<? super E>`"
  ([^WhileClosure this]
    (-> this (.getPredicate))))

(defn get-closure
  "Gets the closure.

  returns: the closure - `org.apache.commons.collections4.Closure<? super E>`"
  ([^WhileClosure this]
    (-> this (.getClosure))))

(defn do-loop?
  "Is the loop a do-while loop.

  returns: true is do-while, false if while - `boolean`"
  (^Boolean [^WhileClosure this]
    (-> this (.isDoLoop))))

