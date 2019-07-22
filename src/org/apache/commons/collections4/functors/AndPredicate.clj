(ns org.apache.commons.collections4.functors.AndPredicate
  "Predicate implementation that returns true if both the predicates return true."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors AndPredicate]))

(defn ->and-predicate
  "Constructor.

  Constructor that performs no validation.
   Use andPredicate if you want that.

  predicate-1 - the first predicate to check, not null - `org.apache.commons.collections4.Predicate`
  predicate-2 - the second predicate to check, not null - `org.apache.commons.collections4.Predicate`"
  (^AndPredicate [^org.apache.commons.collections4.Predicate predicate-1 ^org.apache.commons.collections4.Predicate predicate-2]
    (new AndPredicate predicate-1 predicate-2)))

(defn *and-predicate
  "Factory to create the predicate.

  predicate-1 - the first predicate to check, not null - `org.apache.commons.collections4.Predicate`
  predicate-2 - the second predicate to check, not null - `org.apache.commons.collections4.Predicate`

  returns: the and predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if either predicate is null"
  ([^org.apache.commons.collections4.Predicate predicate-1 ^org.apache.commons.collections4.Predicate predicate-2]
    (AndPredicate/andPredicate predicate-1 predicate-2)))

(defn evaluate
  "Evaluates the predicate returning true if both predicates return true.

  object - the input object - `T`

  returns: true if both decorated predicates return true - `boolean`"
  (^Boolean [^AndPredicate this object]
    (-> this (.evaluate object))))

(defn get-predicates
  "Gets the two predicates being decorated as an array.

  returns: the predicates - `org.apache.commons.collections4.Predicate<? super T>[]`"
  ([^AndPredicate this]
    (-> this (.getPredicates))))

