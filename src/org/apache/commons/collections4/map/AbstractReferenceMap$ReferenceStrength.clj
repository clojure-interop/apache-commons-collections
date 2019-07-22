(ns org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractReferenceMap$ReferenceStrength]))

(def HARD
  "Enum Constant.

  type: org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength"
  AbstractReferenceMap$ReferenceStrength/HARD)

(def SOFT
  "Enum Constant.

  type: org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength"
  AbstractReferenceMap$ReferenceStrength/SOFT)

(def WEAK
  "Enum Constant.

  type: org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength"
  AbstractReferenceMap$ReferenceStrength/WEAK)

(defn value
  "Instance Constant.

  value

  type: int"
  (^Integer [^AbstractReferenceMap$ReferenceStrength this]
    (-> this .-value)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AbstractReferenceMap.ReferenceStrength c : AbstractReferenceMap.ReferenceStrength.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength[]`"
  ([]
    (AbstractReferenceMap$ReferenceStrength/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength [^java.lang.String name]
    (AbstractReferenceMap$ReferenceStrength/valueOf name)))

(defn *resolve
  "Resolve enum from int.

  value - the int value - `int`

  returns: ReferenceType - `org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength`

  throws: java.lang.IllegalArgumentException - if the specified value is invalid."
  (^org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength [^Integer value]
    (AbstractReferenceMap$ReferenceStrength/resolve value)))

