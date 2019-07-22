(ns org.apache.commons.collections4.multiset.SynchronizedMultiSet
  "Decorates another MultiSet to synchronize its behaviour
  for a multi-threaded environment.

  Methods are synchronized, then forwarded to the decorated multiset.
  Iterators must be separately synchronized around the loop."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset SynchronizedMultiSet]))

(defn *synchronized-multi-set
  "Factory method to create a synchronized multiset.

  multiset - the multiset to decorate, must not be null - `org.apache.commons.collections4.MultiSet`

  returns: a new synchronized MultiSet - `<E> org.apache.commons.collections4.multiset.SynchronizedMultiSet<E>`

  throws: java.lang.NullPointerException - if multiset is null"
  ([^org.apache.commons.collections4.MultiSet multiset]
    (SynchronizedMultiSet/synchronizedMultiSet multiset)))

(defn equals
  "Description copied from interface: MultiSet

  object - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^SynchronizedMultiSet this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "Description copied from interface: MultiSet

  returns: the hash code of the MultiSet - `int`"
  (^Integer [^SynchronizedMultiSet this]
    (-> this (.hashCode))))

(defn add
  "Description copied from interface: MultiSet

  object - the object to add - `E`
  count - the number of occurrences to add, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset before
     this operation; possibly zero - `int`"
  (^Integer [^SynchronizedMultiSet this object ^Integer count]
    (-> this (.add object count))))

(defn remove
  "Description copied from interface: MultiSet

  object - the object to remove - `java.lang.Object`
  count - the number of occurrences to remove, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset
     before the operation; possibly zero - `int`"
  (^Integer [^SynchronizedMultiSet this ^java.lang.Object object ^Integer count]
    (-> this (.remove object count))))

(defn get-count
  "Description copied from interface: MultiSet

  object - the object to search for - `java.lang.Object`

  returns: the number of occurrences of the object, zero if not found - `int`"
  (^Integer [^SynchronizedMultiSet this ^java.lang.Object object]
    (-> this (.getCount object))))

(defn set-count
  "Description copied from interface: MultiSet

  object - the object to update - `E`
  count - the number of occurrences of the object - `int`

  returns: the number of occurrences of the object before this operation, zero
     if the object was not contained in the multiset - `int`"
  (^Integer [^SynchronizedMultiSet this object ^Integer count]
    (-> this (.setCount object count))))

(defn unique-set
  "Description copied from interface: MultiSet

  returns: the Set of unique MultiSet elements - `java.util.Set<E>`"
  (^java.util.Set [^SynchronizedMultiSet this]
    (-> this (.uniqueSet))))

(defn entry-set
  "Description copied from interface: MultiSet

  returns: the Set of MultiSet entries - `java.util.Set<org.apache.commons.collections4.MultiSet$Entry<E>>`"
  (^java.util.Set [^SynchronizedMultiSet this]
    (-> this (.entrySet))))

