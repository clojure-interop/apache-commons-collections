(ns org.apache.commons.collections4.functors.IdentityPredicate
  "Predicate implementation that returns true if the input is the same object
  as the one stored in this predicate."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors IdentityPredicate]))

(defn ->identity-predicate
  "Constructor.

  Constructor that performs no validation.
   Use identityPredicate if you want that.

  object - the object to compare to - `T`"
  (^IdentityPredicate [object]
    (new IdentityPredicate object)))

(defn *identity-predicate
  "Factory to create the identity predicate.

  object - the object to compare to - `T`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`"
  ([object]
    (IdentityPredicate/identityPredicate object)))

(defn evaluate
  "Evaluates the predicate returning true if the input object is identical to
   the stored object.

  object - the input object - `T`

  returns: true if input is the same object as the stored value - `boolean`"
  (^Boolean [^IdentityPredicate this object]
    (-> this (.evaluate object))))

(defn get-value
  "Gets the value.

  returns: the value - `T`"
  ([^IdentityPredicate this]
    (-> this (.getValue))))

