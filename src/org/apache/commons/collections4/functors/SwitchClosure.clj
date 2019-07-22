(ns org.apache.commons.collections4.functors.SwitchClosure
  "Closure implementation calls the closure whose predicate returns true,
  like a switch statement."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors SwitchClosure]))

(defn ->switch-closure
  "Constructor.

  Constructor that performs no validation.
   Use switchClosure if you want that.

  predicates - array of predicates, cloned, no nulls - `org.apache.commons.collections4.Predicate[]`
  closures - matching array of closures, cloned, no nulls - `org.apache.commons.collections4.Closure[]`
  default-closure - the closure to use if no match, null means nop - `org.apache.commons.collections4.Closure`"
  (^SwitchClosure [predicates closures ^org.apache.commons.collections4.Closure default-closure]
    (new SwitchClosure predicates closures default-closure)))

(defn *switch-closure
  "Factory method that performs validation and copies the parameter arrays.

  predicates - array of predicates, cloned, no nulls - `org.apache.commons.collections4.Predicate[]`
  closures - matching array of closures, cloned, no nulls - `org.apache.commons.collections4.Closure[]`
  default-closure - the closure to use if no match, null means nop - `org.apache.commons.collections4.Closure`

  returns: the chained closure - `<E> org.apache.commons.collections4.Closure<E>`

  throws: java.lang.NullPointerException - if any element in the array is null"
  ([predicates closures ^org.apache.commons.collections4.Closure default-closure]
    (SwitchClosure/switchClosure predicates closures default-closure))
  ([^java.util.Map predicates-and-closures]
    (SwitchClosure/switchClosure predicates-and-closures)))

(defn execute
  "Executes the closure whose matching predicate returns true

  input - the input object - `E`"
  ([^SwitchClosure this input]
    (-> this (.execute input))))

(defn get-predicates
  "Gets the predicates.

  returns: a copy of the predicates - `org.apache.commons.collections4.Predicate<? super E>[]`"
  ([^SwitchClosure this]
    (-> this (.getPredicates))))

(defn get-closures
  "Gets the closures.

  returns: a copy of the closures - `org.apache.commons.collections4.Closure<? super E>[]`"
  ([^SwitchClosure this]
    (-> this (.getClosures))))

(defn get-default-closure
  "Gets the default closure.

  returns: the default closure - `org.apache.commons.collections4.Closure<? super E>`"
  ([^SwitchClosure this]
    (-> this (.getDefaultClosure))))

