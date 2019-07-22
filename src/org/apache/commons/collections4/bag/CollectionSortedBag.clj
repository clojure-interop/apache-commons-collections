(ns org.apache.commons.collections4.bag.CollectionSortedBag
  "Decorates another SortedBag to comply with the Collection contract."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag CollectionSortedBag]))

(defn ->collection-sorted-bag
  "Constructor.

  Constructor that wraps (not copies).

  bag - the sorted bag to decorate, must not be null - `org.apache.commons.collections4.SortedBag`

  throws: java.lang.NullPointerException - if bag is null"
  (^CollectionSortedBag [^org.apache.commons.collections4.SortedBag bag]
    (new CollectionSortedBag bag)))

(defn *collection-sorted-bag
  "Factory method to create a sorted bag that complies to the Collection contract.

  bag - the sorted bag to decorate, must not be null - `org.apache.commons.collections4.SortedBag`

  returns: a SortedBag that complies to the Collection contract - `<E> org.apache.commons.collections4.SortedBag<E>`

  throws: java.lang.NullPointerException - if bag is null"
  ([^org.apache.commons.collections4.SortedBag bag]
    (CollectionSortedBag/collectionSortedBag bag)))

(defn contains-all
  "Description copied from interface: Bag

  coll - the collection to check against - `java.util.Collection`

  returns: true if the Bag contains all the collection - `boolean`"
  (^Boolean [^CollectionSortedBag this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

(defn add
  "Description copied from interface: Bag

  object - the object to add - `E`
  count - the number of copies to add - `int`

  returns: true if the object was not already in the uniqueSet - `boolean`"
  (^Boolean [^CollectionSortedBag this object ^Integer count]
    (-> this (.add object count)))
  (^Boolean [^CollectionSortedBag this object]
    (-> this (.add object))))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^CollectionSortedBag this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove
  "Description copied from interface: Bag

  object - the object to remove - `java.lang.Object`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^CollectionSortedBag this ^java.lang.Object object]
    (-> this (.remove object))))

(defn remove-all
  "Description copied from interface: Bag

  coll - the collection to remove - `java.util.Collection`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^CollectionSortedBag this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn retain-all
  "Description copied from interface: Bag

  coll - the collection to retain - `java.util.Collection`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^CollectionSortedBag this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

