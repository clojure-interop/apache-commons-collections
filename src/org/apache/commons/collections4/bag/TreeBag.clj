(ns org.apache.commons.collections4.bag.TreeBag
  "Implements SortedBag, using a TreeMap to provide the data storage.
  This is the standard implementation of a sorted bag.

  Order will be maintained among the bag members and can be viewed through the iterator.


  A Bag stores each object in the collection
  together with a count of occurrences. Extra methods on the interface allow multiple
  copies of an object to be added or removed at once. It is important to read the interface
  javadoc carefully as several methods violate the Collection interface specification."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag TreeBag]))

(defn ->tree-bag
  "Constructor.

  Constructs an empty bag that maintains order on its unique representative
   members according to the given Comparator.

  comparator - the comparator to use - `java.util.Comparator`"
  (^TreeBag [^java.util.Comparator comparator]
    (new TreeBag comparator))
  (^TreeBag []
    (new TreeBag )))

(defn add
  "Adds a new element to the bag, incrementing its count in the underlying map.

  object - the object to add - `E`

  returns: true if the object was not already in the uniqueSet - `boolean`

  throws: java.lang.IllegalArgumentException - if the object to be added does not implement Comparable and the TreeBag is using natural ordering"
  (^Boolean [^TreeBag this object]
    (-> this (.add object))))

(defn first
  "Description copied from interface: SortedBag

  returns: the first element in the sorted bag - `E`"
  ([^TreeBag this]
    (-> this (.first))))

(defn last
  "Description copied from interface: SortedBag

  returns: the last element in the sorted bag - `E`"
  ([^TreeBag this]
    (-> this (.last))))

(defn comparator
  "Description copied from interface: SortedBag

  returns: the comparator in use, or null if natural ordering - `java.util.Comparator<? super E>`"
  ([^TreeBag this]
    (-> this (.comparator))))

