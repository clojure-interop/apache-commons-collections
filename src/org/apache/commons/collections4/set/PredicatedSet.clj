(ns org.apache.commons.collections4.set.PredicatedSet
  "Decorates another Set to validate that all additions
  match a specified predicate.

  This set exists to provide validation for the decorated set.
  It is normally created to decorate an empty set.
  If an object cannot be added to the set, an IllegalArgumentException is thrown.


  One usage would be to ensure that no null entries are added to the set.



 Set set = PredicatedSet.decorate(new HashSet(), NotNullPredicate.INSTANCE);

  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set PredicatedSet]))

(defn *predicated-set
  "Factory method to create a predicated (validating) set.

   If there are any elements already in the set being decorated, they
   are validated.

  set - the set to decorate, must not be null - `java.util.Set`
  predicate - the predicate to use for validation, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a decorated set - `<E> org.apache.commons.collections4.set.PredicatedSet<E>`

  throws: java.lang.NullPointerException - if set or predicate is null"
  ([^java.util.Set set ^org.apache.commons.collections4.Predicate predicate]
    (PredicatedSet/predicatedSet set predicate)))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PredicatedSet this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PredicatedSet this]
    (-> this (.hashCode))))

