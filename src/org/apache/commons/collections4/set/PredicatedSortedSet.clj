(ns org.apache.commons.collections4.set.PredicatedSortedSet
  "Decorates another SortedSet to validate that all additions
  match a specified predicate.

  This set exists to provide validation for the decorated set.
  It is normally created to decorate an empty set.
  If an object cannot be added to the set, an IllegalArgumentException is thrown.


  One usage would be to ensure that no null entries are added to the set.



  SortedSet set =
    PredicatedSortedSet.predicatedSortedSet(new TreeSet(),
                                            NotNullPredicate.notNullPredicate());

  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set PredicatedSortedSet]))

(defn *predicated-sorted-set
  "Factory method to create a predicated (validating) sorted set.

   If there are any elements already in the set being decorated, they
   are validated.

  set - the set to decorate, must not be null - `java.util.SortedSet`
  predicate - the predicate to use for validation, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a new predicated sorted set. - `<E> org.apache.commons.collections4.set.PredicatedSortedSet<E>`

  throws: java.lang.NullPointerException - if set or predicate is null"
  ([^java.util.SortedSet set ^org.apache.commons.collections4.Predicate predicate]
    (PredicatedSortedSet/predicatedSortedSet set predicate)))

(defn comparator
  "returns: `java.util.Comparator<? super E>`"
  ([^PredicatedSortedSet this]
    (-> this (.comparator))))

(defn first
  "returns: `E`"
  ([^PredicatedSortedSet this]
    (-> this (.first))))

(defn last
  "returns: `E`"
  ([^PredicatedSortedSet this]
    (-> this (.last))))

(defn sub-set
  "from-element - `E`
  to-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^PredicatedSortedSet this from-element to-element]
    (-> this (.subSet from-element to-element))))

(defn head-set
  "to-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^PredicatedSortedSet this to-element]
    (-> this (.headSet to-element))))

(defn tail-set
  "from-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^PredicatedSortedSet this from-element]
    (-> this (.tailSet from-element))))

