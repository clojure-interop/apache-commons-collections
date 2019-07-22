(ns org.apache.commons.collections4.multiset.UnmodifiableMultiSet
  "Decorates another MultiSet to ensure it can't be altered.

  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset UnmodifiableMultiSet]))

(defn *unmodifiable-multi-set
  "Factory method to create an unmodifiable multiset.

   If the multiset passed in is already unmodifiable, it is returned.

  multiset - the multiset to decorate, may not be null - `org.apache.commons.collections4.MultiSet`

  returns: an unmodifiable MultiSet - `<E> org.apache.commons.collections4.MultiSet<E>`

  throws: java.lang.NullPointerException - if multiset is null"
  ([^org.apache.commons.collections4.MultiSet multiset]
    (UnmodifiableMultiSet/unmodifiableMultiSet multiset)))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableMultiSet this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^UnmodifiableMultiSet this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn entry-set
  "Description copied from interface: MultiSet

  returns: the Set of MultiSet entries - `java.util.Set<org.apache.commons.collections4.MultiSet$Entry<E>>`"
  (^java.util.Set [^UnmodifiableMultiSet this]
    (-> this (.entrySet))))

(defn set-count
  "Description copied from interface: MultiSet

  object - the object to update - `E`
  count - the number of occurrences of the object - `int`

  returns: the number of occurrences of the object before this operation, zero
     if the object was not contained in the multiset - `int`"
  (^Integer [^UnmodifiableMultiSet this object ^Integer count]
    (-> this (.setCount object count))))

(defn iterator
  "Description copied from interface: MultiSet

  returns: iterator over all elements in the MultiSet - `java.util.Iterator<E>`"
  (^java.util.Iterator [^UnmodifiableMultiSet this]
    (-> this (.iterator))))

(defn remove
  "Description copied from interface: MultiSet

  object - the object to remove - `java.lang.Object`
  count - the number of occurrences to remove, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset
     before the operation; possibly zero - `int`"
  (^Integer [^UnmodifiableMultiSet this ^java.lang.Object object ^Integer count]
    (-> this (.remove object count)))
  (^Boolean [^UnmodifiableMultiSet this ^java.lang.Object object]
    (-> this (.remove object))))

(defn unique-set
  "Description copied from interface: MultiSet

  returns: the Set of unique MultiSet elements - `java.util.Set<E>`"
  (^java.util.Set [^UnmodifiableMultiSet this]
    (-> this (.uniqueSet))))

(defn add
  "Description copied from interface: MultiSet

  object - the object to add - `E`
  count - the number of occurrences to add, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset before
     this operation; possibly zero - `int`"
  (^Integer [^UnmodifiableMultiSet this object ^Integer count]
    (-> this (.add object count)))
  (^Boolean [^UnmodifiableMultiSet this object]
    (-> this (.add object))))

(defn retain-all
  "Description copied from interface: MultiSet

  coll - the collection of elements to retain - `java.util.Collection`

  returns: true if this call changed the multiset - `boolean`"
  (^Boolean [^UnmodifiableMultiSet this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^UnmodifiableMultiSet this]
    (-> this (.clear))))

(defn remove-all
  "Description copied from interface: MultiSet

  coll - the collection of elements to remove - `java.util.Collection`

  returns: true if this call changed the multiset - `boolean`"
  (^Boolean [^UnmodifiableMultiSet this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

