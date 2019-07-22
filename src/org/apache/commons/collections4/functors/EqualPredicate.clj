(ns org.apache.commons.collections4.functors.EqualPredicate
  "Predicate implementation that returns true if the input is the same object
  as the one stored in this predicate by equals."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors EqualPredicate]))

(defn ->equal-predicate
  "Constructor.

  Constructor that performs no validation.
   Use equalPredicate if you want that.

  object - the object to compare to - `T`
  equator - the equator to use for comparison - `org.apache.commons.collections4.Equator`"
  (^EqualPredicate [object ^org.apache.commons.collections4.Equator equator]
    (new EqualPredicate object equator))
  (^EqualPredicate [object]
    (new EqualPredicate object)))

(defn *equal-predicate
  "Factory to create the identity predicate.

  object - the object to compare to - `T`
  equator - the equator to use for comparison - `org.apache.commons.collections4.Equator`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([object ^org.apache.commons.collections4.Equator equator]
    (EqualPredicate/equalPredicate object equator))
  ([object]
    (EqualPredicate/equalPredicate object)))

(defn evaluate
  "Evaluates the predicate returning true if the input equals the stored value.

  object - the input object - `T`

  returns: true if input object equals stored value - `boolean`"
  (^Boolean [^EqualPredicate this object]
    (-> this (.evaluate object))))

(defn get-value
  "Gets the value.

  returns: the value - `java.lang.Object`"
  (^java.lang.Object [^EqualPredicate this]
    (-> this (.getValue))))

