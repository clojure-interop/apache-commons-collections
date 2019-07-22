(ns org.apache.commons.collections4.comparators.FixedOrderComparator$UnknownObjectBehavior
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.comparators FixedOrderComparator$UnknownObjectBehavior]))

(def BEFORE
  "Enum Constant.

  type: org.apache.commons.collections4.comparators.FixedOrderComparator$UnknownObjectBehavior"
  FixedOrderComparator$UnknownObjectBehavior/BEFORE)

(def AFTER
  "Enum Constant.

  type: org.apache.commons.collections4.comparators.FixedOrderComparator$UnknownObjectBehavior"
  FixedOrderComparator$UnknownObjectBehavior/AFTER)

(def EXCEPTION
  "Enum Constant.

  type: org.apache.commons.collections4.comparators.FixedOrderComparator$UnknownObjectBehavior"
  FixedOrderComparator$UnknownObjectBehavior/EXCEPTION)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (FixedOrderComparator.UnknownObjectBehavior c : FixedOrderComparator.UnknownObjectBehavior.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.collections4.comparators.FixedOrderComparator$UnknownObjectBehavior[]`"
  ([]
    (FixedOrderComparator$UnknownObjectBehavior/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.collections4.comparators.FixedOrderComparator$UnknownObjectBehavior`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.collections4.comparators.FixedOrderComparator$UnknownObjectBehavior [^java.lang.String name]
    (FixedOrderComparator$UnknownObjectBehavior/valueOf name)))

