(ns org.apache.commons.collections4.BagUtils
  "Provides utility methods and decorators for Bag and SortedBag instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 BagUtils]))

(def *-empty-bag
  "Static Constant.

  An empty unmodifiable bag.

  type: org.apache.commons.collections4.Bag"
  BagUtils/EMPTY_BAG)

(def *-empty-sorted-bag
  "Static Constant.

  An empty unmodifiable sorted bag.

  type: org.apache.commons.collections4.Bag"
  BagUtils/EMPTY_SORTED_BAG)

(defn *transforming-bag
  "Returns a transformed bag backed by the given bag.

   Each object is passed through the transformer as it is added to the Bag.
   It is important not to use the original bag after invoking this method,
   as it is a backdoor for adding untransformed objects.


   Existing entries in the specified bag will not be transformed.
   If you want that behaviour, see TransformedBag.transformedBag(Bag, Transformer).

  bag - the bag to predicate, must not be null - `org.apache.commons.collections4.Bag`
  transformer - the transformer for the bag, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a transformed bag backed by the given bag - `<E> org.apache.commons.collections4.Bag<E>`

  throws: java.lang.NullPointerException - if the Bag or Transformer is null"
  ([^org.apache.commons.collections4.Bag bag ^org.apache.commons.collections4.Transformer transformer]
    (BagUtils/transformingBag bag transformer)))

(defn *empty-sorted-bag
  "Get an empty SortedBag.

  returns: an empty sorted Bag - `<E> org.apache.commons.collections4.SortedBag<E>`"
  ([]
    (BagUtils/emptySortedBag )))

(defn *predicated-sorted-bag
  "Returns a predicated (validating) sorted bag backed by the given sorted
   bag.

   Only objects that pass the test in the given predicate can be added to
   the bag. Trying to add an invalid object results in an
   IllegalArgumentException. It is important not to use the original bag
   after invoking this method, as it is a backdoor for adding invalid
   objects.

  bag - the sorted bag to predicate, must not be null - `org.apache.commons.collections4.SortedBag`
  predicate - the predicate for the bag, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a predicated bag backed by the given bag - `<E> org.apache.commons.collections4.SortedBag<E>`

  throws: java.lang.NullPointerException - if the SortedBag or Predicate is null"
  ([^org.apache.commons.collections4.SortedBag bag ^org.apache.commons.collections4.Predicate predicate]
    (BagUtils/predicatedSortedBag bag predicate)))

(defn *synchronized-sorted-bag
  "Returns a synchronized (thread-safe) sorted bag backed by the given
   sorted bag. In order to guarantee serial access, it is critical that all
   access to the backing bag is accomplished through the returned bag.

   It is imperative that the user manually synchronize on the returned bag
   when iterating over it:




   SortedBag bag = BagUtils.synchronizedSortedBag(new TreeBag());
   ...
   synchronized(bag) {
       Iterator i = bag.iterator(); // Must be in synchronized block
       while (i.hasNext())
           foo(i.next());
       }
   }

   Failure to follow this advice may result in non-deterministic behavior.

  bag - the bag to synchronize, must not be null - `org.apache.commons.collections4.SortedBag`

  returns: a synchronized bag backed by that bag - `<E> org.apache.commons.collections4.SortedBag<E>`

  throws: java.lang.NullPointerException - if the SortedBag is null"
  ([^org.apache.commons.collections4.SortedBag bag]
    (BagUtils/synchronizedSortedBag bag)))

(defn *predicated-bag
  "Returns a predicated (validating) bag backed by the given bag.

   Only objects that pass the test in the given predicate can be added to
   the bag. Trying to add an invalid object results in an
   IllegalArgumentException. It is important not to use the original bag
   after invoking this method, as it is a backdoor for adding invalid
   objects.

  bag - the bag to predicate, must not be null - `org.apache.commons.collections4.Bag`
  predicate - the predicate for the bag, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a predicated bag backed by the given bag - `<E> org.apache.commons.collections4.Bag<E>`

  throws: java.lang.NullPointerException - if the Bag or Predicate is null"
  ([^org.apache.commons.collections4.Bag bag ^org.apache.commons.collections4.Predicate predicate]
    (BagUtils/predicatedBag bag predicate)))

(defn *transforming-sorted-bag
  "Returns a transformed sorted bag backed by the given bag.

   Each object is passed through the transformer as it is added to the Bag.
   It is important not to use the original bag after invoking this method,
   as it is a backdoor for adding untransformed objects.


   Existing entries in the specified bag will not be transformed.
   If you want that behaviour, see
   TransformedSortedBag.transformedSortedBag(SortedBag, Transformer).

  bag - the bag to predicate, must not be null - `org.apache.commons.collections4.SortedBag`
  transformer - the transformer for the bag, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a transformed bag backed by the given bag - `<E> org.apache.commons.collections4.SortedBag<E>`

  throws: java.lang.NullPointerException - if the Bag or Transformer is null"
  ([^org.apache.commons.collections4.SortedBag bag ^org.apache.commons.collections4.Transformer transformer]
    (BagUtils/transformingSortedBag bag transformer)))

(defn *unmodifiable-bag
  "Returns an unmodifiable view of the given bag. Any modification attempts
   to the returned bag will raise an UnsupportedOperationException.

  bag - the bag whose unmodifiable view is to be returned, must not be null - `org.apache.commons.collections4.Bag`

  returns: an unmodifiable view of that bag - `<E> org.apache.commons.collections4.Bag<E>`

  throws: java.lang.NullPointerException - if the Bag is null"
  ([^org.apache.commons.collections4.Bag bag]
    (BagUtils/unmodifiableBag bag)))

(defn *synchronized-bag
  "Returns a synchronized (thread-safe) bag backed by the given bag. In
   order to guarantee serial access, it is critical that all access to the
   backing bag is accomplished through the returned bag.

   It is imperative that the user manually synchronize on the returned bag
   when iterating over it:




   Bag bag = BagUtils.synchronizedBag(new HashBag());
   ...
   synchronized(bag) {
       Iterator i = bag.iterator(); // Must be in synchronized block
       while (i.hasNext())
           foo(i.next());
       }
   }

   Failure to follow this advice may result in non-deterministic behavior.

  bag - the bag to synchronize, must not be null - `org.apache.commons.collections4.Bag`

  returns: a synchronized bag backed by that bag - `<E> org.apache.commons.collections4.Bag<E>`

  throws: java.lang.NullPointerException - if the Bag is null"
  ([^org.apache.commons.collections4.Bag bag]
    (BagUtils/synchronizedBag bag)))

(defn *empty-bag
  "Get an empty Bag.

  returns: an empty Bag - `<E> org.apache.commons.collections4.Bag<E>`"
  ([]
    (BagUtils/emptyBag )))

(defn *collection-bag
  "Returns a bag that complies to the Collection contract, backed by the given bag.

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.Bag`

  returns: a Bag that complies to the Collection contract - `<E> org.apache.commons.collections4.Bag<E>`

  throws: java.lang.NullPointerException - if bag is null"
  ([^org.apache.commons.collections4.Bag bag]
    (BagUtils/collectionBag bag)))

(defn *unmodifiable-sorted-bag
  "Returns an unmodifiable view of the given sorted bag. Any modification
   attempts to the returned bag will raise an
   UnsupportedOperationException.

  bag - the bag whose unmodifiable view is to be returned, must not be null - `org.apache.commons.collections4.SortedBag`

  returns: an unmodifiable view of that bag - `<E> org.apache.commons.collections4.SortedBag<E>`

  throws: java.lang.NullPointerException - if the SortedBag is null"
  ([^org.apache.commons.collections4.SortedBag bag]
    (BagUtils/unmodifiableSortedBag bag)))

