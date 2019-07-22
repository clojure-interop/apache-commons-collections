(ns org.apache.commons.collections4.bag.SynchronizedSortedBag
  "Decorates another SortedBag to synchronize its behaviour
  for a multi-threaded environment.

  Methods are synchronized, then forwarded to the decorated bag.
  Iterators must be separately synchronized around the loop.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag SynchronizedSortedBag]))

(defn *synchronized-sorted-bag
  "Factory method to create a synchronized sorted bag.

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.SortedBag`

  returns: a new synchronized SortedBag - `<E> org.apache.commons.collections4.bag.SynchronizedSortedBag<E>`

  throws: java.lang.NullPointerException - if bag is null"
  ([^org.apache.commons.collections4.SortedBag bag]
    (SynchronizedSortedBag/synchronizedSortedBag bag)))

(defn first
  "Description copied from interface: SortedBag

  returns: the first element in the sorted bag - `E`"
  ([^SynchronizedSortedBag this]
    (-> this (.first))))

(defn last
  "Description copied from interface: SortedBag

  returns: the last element in the sorted bag - `E`"
  ([^SynchronizedSortedBag this]
    (-> this (.last))))

(defn comparator
  "Description copied from interface: SortedBag

  returns: the comparator in use, or null if natural ordering - `java.util.Comparator<? super E>`"
  ([^SynchronizedSortedBag this]
    (-> this (.comparator))))

