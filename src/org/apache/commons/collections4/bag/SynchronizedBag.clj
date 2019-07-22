(ns org.apache.commons.collections4.bag.SynchronizedBag
  "Decorates another Bag to synchronize its behaviour
  for a multi-threaded environment.

  Methods are synchronized, then forwarded to the decorated bag.
  Iterators must be separately synchronized around the loop.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag SynchronizedBag]))

(defn *synchronized-bag
  "Factory method to create a synchronized bag.

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.Bag`

  returns: a new synchronized Bag - `<E> org.apache.commons.collections4.bag.SynchronizedBag<E>`

  throws: java.lang.NullPointerException - if bag is null"
  ([^org.apache.commons.collections4.Bag bag]
    (SynchronizedBag/synchronizedBag bag)))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SynchronizedBag this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SynchronizedBag this]
    (-> this (.hashCode))))

(defn add
  "Description copied from interface: Bag

  object - the object to add - `E`
  count - the number of copies to add - `int`

  returns: true if the object was not already in the uniqueSet - `boolean`"
  (^Boolean [^SynchronizedBag this object ^Integer count]
    (-> this (.add object count))))

(defn remove
  "Description copied from interface: Bag

  object - the object to remove - `java.lang.Object`
  count - the number of copies to remove - `int`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^SynchronizedBag this ^java.lang.Object object ^Integer count]
    (-> this (.remove object count))))

(defn unique-set
  "Description copied from interface: Bag

  returns: the Set of unique Bag elements - `java.util.Set<E>`"
  (^java.util.Set [^SynchronizedBag this]
    (-> this (.uniqueSet))))

(defn get-count
  "Description copied from interface: Bag

  object - the object to search for - `java.lang.Object`

  returns: the number of occurrences of the object, zero if not found - `int`"
  (^Integer [^SynchronizedBag this ^java.lang.Object object]
    (-> this (.getCount object))))

