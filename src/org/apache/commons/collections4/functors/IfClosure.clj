(ns org.apache.commons.collections4.functors.IfClosure
  "Closure implementation acts as an if statement calling one or other closure
  based on a predicate."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors IfClosure]))

(defn ->if-closure
  "Constructor.

  Constructor that performs no validation.
   Use ifClosure if you want that.

  predicate - predicate to switch on, not null - `org.apache.commons.collections4.Predicate`
  true-closure - closure used if true, not null - `org.apache.commons.collections4.Closure`
  false-closure - closure used if false, not null - `org.apache.commons.collections4.Closure`"
  (^IfClosure [^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Closure true-closure ^org.apache.commons.collections4.Closure false-closure]
    (new IfClosure predicate true-closure false-closure))
  (^IfClosure [^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Closure true-closure]
    (new IfClosure predicate true-closure)))

(defn *if-closure
  "Factory method that performs validation.

  predicate - predicate to switch on - `org.apache.commons.collections4.Predicate`
  true-closure - closure used if true - `org.apache.commons.collections4.Closure`
  false-closure - closure used if false - `org.apache.commons.collections4.Closure`

  returns: the if closure - `<E> org.apache.commons.collections4.Closure<E>`

  throws: java.lang.NullPointerException - if any argument is null"
  ([^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Closure true-closure ^org.apache.commons.collections4.Closure false-closure]
    (IfClosure/ifClosure predicate true-closure false-closure))
  ([^org.apache.commons.collections4.Predicate predicate ^org.apache.commons.collections4.Closure true-closure]
    (IfClosure/ifClosure predicate true-closure)))

(defn execute
  "Executes the true or false closure according to the result of the predicate.

  input - the input object - `E`"
  ([^IfClosure this input]
    (-> this (.execute input))))

(defn get-predicate
  "Gets the predicate.

  returns: the predicate - `org.apache.commons.collections4.Predicate<? super E>`"
  ([^IfClosure this]
    (-> this (.getPredicate))))

(defn get-true-closure
  "Gets the closure called when true.

  returns: the closure - `org.apache.commons.collections4.Closure<? super E>`"
  ([^IfClosure this]
    (-> this (.getTrueClosure))))

(defn get-false-closure
  "Gets the closure called when false.

  returns: the closure - `org.apache.commons.collections4.Closure<? super E>`"
  ([^IfClosure this]
    (-> this (.getFalseClosure))))

