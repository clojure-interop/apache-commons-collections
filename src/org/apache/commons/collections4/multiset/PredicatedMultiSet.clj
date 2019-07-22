(ns org.apache.commons.collections4.multiset.PredicatedMultiSet
  "Decorates another MultiSet to validate that additions
  match a specified predicate.

  This multiset exists to provide validation for the decorated multiset.
  It is normally created to decorate an empty multiset.
  If an object cannot be added to the multiset, an IllegalArgumentException
  is thrown.


  One usage would be to ensure that no null entries are added to the multiset.



  MultiSet<E> set =
       PredicatedMultiSet.predicatedMultiSet(new HashMultiSet<E>(),
                                             NotNullPredicate.notNullPredicate());"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset PredicatedMultiSet]))

(defn *predicated-multi-set
  "Factory method to create a predicated (validating) multiset.

   If there are any elements already in the multiset being decorated, they
   are validated.

  multiset - the multiset to decorate, must not be null - `org.apache.commons.collections4.MultiSet`
  predicate - the predicate to use for validation, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a new predicated MultiSet - `<E> org.apache.commons.collections4.multiset.PredicatedMultiSet<E>`

  throws: java.lang.NullPointerException - if multiset or predicate is null"
  ([^org.apache.commons.collections4.MultiSet multiset ^org.apache.commons.collections4.Predicate predicate]
    (PredicatedMultiSet/predicatedMultiSet multiset predicate)))

(defn equals
  "Description copied from interface: MultiSet

  object - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^PredicatedMultiSet this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "Description copied from interface: MultiSet

  returns: the hash code of the MultiSet - `int`"
  (^Integer [^PredicatedMultiSet this]
    (-> this (.hashCode))))

(defn add
  "Description copied from interface: MultiSet

  object - the object to add - `E`
  count - the number of occurrences to add, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset before
     this operation; possibly zero - `int`"
  (^Integer [^PredicatedMultiSet this object ^Integer count]
    (-> this (.add object count))))

(defn remove
  "Description copied from interface: MultiSet

  object - the object to remove - `java.lang.Object`
  count - the number of occurrences to remove, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset
     before the operation; possibly zero - `int`"
  (^Integer [^PredicatedMultiSet this ^java.lang.Object object ^Integer count]
    (-> this (.remove object count))))

(defn get-count
  "Description copied from interface: MultiSet

  object - the object to search for - `java.lang.Object`

  returns: the number of occurrences of the object, zero if not found - `int`"
  (^Integer [^PredicatedMultiSet this ^java.lang.Object object]
    (-> this (.getCount object))))

(defn set-count
  "Description copied from interface: MultiSet

  object - the object to update - `E`
  count - the number of occurrences of the object - `int`

  returns: the number of occurrences of the object before this operation, zero
     if the object was not contained in the multiset - `int`"
  (^Integer [^PredicatedMultiSet this object ^Integer count]
    (-> this (.setCount object count))))

(defn unique-set
  "Description copied from interface: MultiSet

  returns: the Set of unique MultiSet elements - `java.util.Set<E>`"
  (^java.util.Set [^PredicatedMultiSet this]
    (-> this (.uniqueSet))))

(defn entry-set
  "Description copied from interface: MultiSet

  returns: the Set of MultiSet entries - `java.util.Set<org.apache.commons.collections4.MultiSet$Entry<E>>`"
  (^java.util.Set [^PredicatedMultiSet this]
    (-> this (.entrySet))))

