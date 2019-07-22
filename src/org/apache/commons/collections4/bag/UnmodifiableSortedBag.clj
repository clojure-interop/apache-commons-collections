(ns org.apache.commons.collections4.bag.UnmodifiableSortedBag
  "Decorates another SortedBag to ensure it can't be altered.

  This class is Serializable from Commons Collections 3.1.


  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag UnmodifiableSortedBag]))

(defn *unmodifiable-sorted-bag
  "Factory method to create an unmodifiable bag.

   If the bag passed in is already unmodifiable, it is returned.

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.SortedBag`

  returns: an unmodifiable SortedBag - `<E> org.apache.commons.collections4.SortedBag<E>`

  throws: java.lang.NullPointerException - if bag is null"
  ([^org.apache.commons.collections4.SortedBag bag]
    (UnmodifiableSortedBag/unmodifiableSortedBag bag)))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSortedBag this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^UnmodifiableSortedBag this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn iterator
  "Description copied from interface: Bag

  returns: iterator over all elements in the Bag - `java.util.Iterator<E>`"
  (^java.util.Iterator [^UnmodifiableSortedBag this]
    (-> this (.iterator))))

(defn remove
  "Description copied from interface: Bag

  object - the object to remove - `java.lang.Object`
  count - the number of copies to remove - `int`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^UnmodifiableSortedBag this ^java.lang.Object object ^Integer count]
    (-> this (.remove object count)))
  (^Boolean [^UnmodifiableSortedBag this ^java.lang.Object object]
    (-> this (.remove object))))

(defn unique-set
  "Description copied from interface: Bag

  returns: the Set of unique Bag elements - `java.util.Set<E>`"
  (^java.util.Set [^UnmodifiableSortedBag this]
    (-> this (.uniqueSet))))

(defn add
  "Description copied from interface: Bag

  object - the object to add - `E`
  count - the number of copies to add - `int`

  returns: true if the object was not already in the uniqueSet - `boolean`"
  (^Boolean [^UnmodifiableSortedBag this object ^Integer count]
    (-> this (.add object count)))
  (^Boolean [^UnmodifiableSortedBag this object]
    (-> this (.add object))))

(defn retain-all
  "Description copied from interface: Bag

  coll - the collection to retain - `java.util.Collection`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^UnmodifiableSortedBag this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^UnmodifiableSortedBag this]
    (-> this (.clear))))

(defn remove-all
  "Description copied from interface: Bag

  coll - the collection to remove - `java.util.Collection`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^UnmodifiableSortedBag this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

