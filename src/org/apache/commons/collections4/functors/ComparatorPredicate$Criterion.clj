(ns org.apache.commons.collections4.functors.ComparatorPredicate$Criterion
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ComparatorPredicate$Criterion]))

(def EQUAL
  "Enum Constant.

  type: org.apache.commons.collections4.functors.ComparatorPredicate$Criterion"
  ComparatorPredicate$Criterion/EQUAL)

(def GREATER
  "Enum Constant.

  type: org.apache.commons.collections4.functors.ComparatorPredicate$Criterion"
  ComparatorPredicate$Criterion/GREATER)

(def LESS
  "Enum Constant.

  type: org.apache.commons.collections4.functors.ComparatorPredicate$Criterion"
  ComparatorPredicate$Criterion/LESS)

(def GREATER_OR_EQUAL
  "Enum Constant.

  type: org.apache.commons.collections4.functors.ComparatorPredicate$Criterion"
  ComparatorPredicate$Criterion/GREATER_OR_EQUAL)

(def LESS_OR_EQUAL
  "Enum Constant.

  type: org.apache.commons.collections4.functors.ComparatorPredicate$Criterion"
  ComparatorPredicate$Criterion/LESS_OR_EQUAL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ComparatorPredicate.Criterion c : ComparatorPredicate.Criterion.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.collections4.functors.ComparatorPredicate$Criterion[]`"
  ([]
    (ComparatorPredicate$Criterion/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.collections4.functors.ComparatorPredicate$Criterion`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.collections4.functors.ComparatorPredicate$Criterion [^java.lang.String name]
    (ComparatorPredicate$Criterion/valueOf name)))

