(ns org.apache.commons.collections4.functors.InstanceofPredicate
  "Predicate implementation that returns true if the input is an instanceof
  the type stored in this predicate."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors InstanceofPredicate]))

(defn ->instanceof-predicate
  "Constructor.

  Constructor that performs no validation.
   Use instanceOfPredicate if you want that.

  type - the type to check for - `java.lang.Class`"
  (^InstanceofPredicate [^java.lang.Class type]
    (new InstanceofPredicate type)))

(defn *instance-of-predicate
  "Factory to create the identity predicate.

  type - the type to check for, may not be null - `java.lang.Class`

  returns: the predicate - `org.apache.commons.collections4.Predicate<java.lang.Object>`

  throws: java.lang.NullPointerException - if the class is null"
  (^org.apache.commons.collections4.Predicate [^java.lang.Class type]
    (InstanceofPredicate/instanceOfPredicate type)))

(defn evaluate
  "Evaluates the predicate returning true if the input object is of the correct type.

  object - the input object - `java.lang.Object`

  returns: true if input is of stored type - `boolean`"
  (^Boolean [^InstanceofPredicate this ^java.lang.Object object]
    (-> this (.evaluate object))))

(defn get-type
  "Gets the type to compare to.

  returns: the type - `java.lang.Class<?>`"
  (^java.lang.Class [^InstanceofPredicate this]
    (-> this (.getType))))

