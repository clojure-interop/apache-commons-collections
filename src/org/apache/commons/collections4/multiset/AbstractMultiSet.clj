(ns org.apache.commons.collections4.multiset.AbstractMultiSet
  "Abstract implementation of the MultiSet interface to simplify the
  creation of subclass implementations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset AbstractMultiSet]))

(defn get-count
  "Returns the number of occurrence of the given element in this multiset by
   iterating over its entrySet.

  object - the object to search for - `java.lang.Object`

  returns: the number of occurrences of the object, zero if not found - `int`"
  (^Integer [^AbstractMultiSet this ^java.lang.Object object]
    (-> this (.getCount object))))

(defn entry-set
  "Returns an unmodifiable view of the entries of this multiset.

  returns: the set of entries in this multiset - `java.util.Set<org.apache.commons.collections4.MultiSet$Entry<E>>`"
  (^java.util.Set [^AbstractMultiSet this]
    (-> this (.entrySet))))

(defn contains
  "Determines if the multiset contains the given element.

  object - the object to search for - `java.lang.Object`

  returns: true if the multiset contains the given element - `boolean`"
  (^Boolean [^AbstractMultiSet this ^java.lang.Object object]
    (-> this (.contains object))))

(defn to-string
  "Implement a toString() method suitable for debugging.

  returns: a debugging toString - `java.lang.String`"
  (^java.lang.String [^AbstractMultiSet this]
    (-> this (.toString))))

(defn set-count
  "Description copied from interface: MultiSet

  object - the object to update - `E`
  count - the number of occurrences of the object - `int`

  returns: the number of occurrences of the object before this operation, zero
     if the object was not contained in the multiset - `int`"
  (^Integer [^AbstractMultiSet this object ^Integer count]
    (-> this (.setCount object count))))

(defn iterator
  "Gets an iterator over the multiset elements. Elements present in the
   MultiSet more than once will be returned repeatedly.

  returns: the iterator - `java.util.Iterator<E>`"
  (^java.util.Iterator [^AbstractMultiSet this]
    (-> this (.iterator))))

(defn remove
  "Description copied from interface: MultiSet

  object - the object to remove - `java.lang.Object`
  occurrences - the number of occurrences to remove, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset
     before the operation; possibly zero - `int`"
  (^Integer [^AbstractMultiSet this ^java.lang.Object object ^Integer occurrences]
    (-> this (.remove object occurrences)))
  (^Boolean [^AbstractMultiSet this ^java.lang.Object object]
    (-> this (.remove object))))

(defn unique-set
  "Returns a view of the unique elements of this multiset.

  returns: the set of unique elements in this multiset - `java.util.Set<E>`"
  (^java.util.Set [^AbstractMultiSet this]
    (-> this (.uniqueSet))))

(defn hash-code
  "Description copied from interface: MultiSet

  returns: the hash code of the MultiSet - `int`"
  (^Integer [^AbstractMultiSet this]
    (-> this (.hashCode))))

(defn add
  "Description copied from interface: MultiSet

  object - the object to add - `E`
  occurrences - the number of occurrences to add, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset before
     this operation; possibly zero - `int`"
  (^Integer [^AbstractMultiSet this object ^Integer occurrences]
    (-> this (.add object occurrences)))
  (^Boolean [^AbstractMultiSet this object]
    (-> this (.add object))))

(defn size
  "Returns the number of elements in this multiset.

  returns: current size of the multiset - `int`"
  (^Integer [^AbstractMultiSet this]
    (-> this (.size))))

(defn clear
  "Clears the multiset removing all elements from the entrySet."
  ([^AbstractMultiSet this]
    (-> this (.clear))))

(defn remove-all
  "Description copied from interface: MultiSet

  coll - the collection of elements to remove - `java.util.Collection`

  returns: true if this call changed the multiset - `boolean`"
  (^Boolean [^AbstractMultiSet this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn equals
  "Description copied from interface: MultiSet

  object - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^AbstractMultiSet this ^java.lang.Object object]
    (-> this (.equals object))))

