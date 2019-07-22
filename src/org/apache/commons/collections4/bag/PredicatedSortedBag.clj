(ns org.apache.commons.collections4.bag.PredicatedSortedBag
  "Decorates another SortedBag to validate that additions
  match a specified predicate.

  This bag exists to provide validation for the decorated bag.
  It is normally created to decorate an empty bag.
  If an object cannot be added to the bag, an IllegalArgumentException is thrown.


  One usage would be to ensure that no null entries are added to the bag.


  SortedBag bag = PredicatedSortedBag.predicatedSortedBag(new TreeBag(), NotNullPredicate.INSTANCE);

  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag PredicatedSortedBag]))

(defn *predicated-sorted-bag
  "Factory method to create a predicated (validating) bag.

   If there are any elements already in the bag being decorated, they
   are validated.

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.SortedBag`
  predicate - the predicate to use for validation, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a new predicated SortedBag - `<E> org.apache.commons.collections4.bag.PredicatedSortedBag<E>`

  throws: java.lang.NullPointerException - if bag or predicate is null"
  ([^org.apache.commons.collections4.SortedBag bag ^org.apache.commons.collections4.Predicate predicate]
    (PredicatedSortedBag/predicatedSortedBag bag predicate)))

(defn first
  "Description copied from interface: SortedBag

  returns: the first element in the sorted bag - `E`"
  ([^PredicatedSortedBag this]
    (-> this (.first))))

(defn last
  "Description copied from interface: SortedBag

  returns: the last element in the sorted bag - `E`"
  ([^PredicatedSortedBag this]
    (-> this (.last))))

(defn comparator
  "Description copied from interface: SortedBag

  returns: the comparator in use, or null if natural ordering - `java.util.Comparator<? super E>`"
  ([^PredicatedSortedBag this]
    (-> this (.comparator))))

