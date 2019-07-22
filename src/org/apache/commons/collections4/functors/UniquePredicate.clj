(ns org.apache.commons.collections4.functors.UniquePredicate
  "Predicate implementation that returns true the first time an object is
  passed into the predicate."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors UniquePredicate]))

(defn ->unique-predicate
  "Constructor.

  Constructor that performs no validation.
   Use uniquePredicate if you want that."
  (^UniquePredicate []
    (new UniquePredicate )))

(defn *unique-predicate
  "Factory to create the predicate.

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.IllegalArgumentException - if the predicate is null"
  ([]
    (UniquePredicate/uniquePredicate )))

(defn evaluate
  "Evaluates the predicate returning true if the input object hasn't been
   received yet.

  object - the input object - `T`

  returns: true if this is the first time the object is seen - `boolean`"
  (^Boolean [^UniquePredicate this object]
    (-> this (.evaluate object))))

