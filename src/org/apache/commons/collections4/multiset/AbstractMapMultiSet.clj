(ns org.apache.commons.collections4.multiset.AbstractMapMultiSet
  "Abstract implementation of the MultiSet interface to simplify the
  creation of subclass implementations.

  Subclasses specify a Map implementation to use as the internal storage. The
  map will be used to map multiset elements to a number; the number represents the
  number of occurrences of that element in the multiset."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset AbstractMapMultiSet]))

(defn get-count
  "Returns the number of occurrence of the given element in this multiset by
   looking up its count in the underlying map.

  object - the object to search for - `java.lang.Object`

  returns: the number of occurrences of the object, zero if not found - `int`"
  (^Integer [^AbstractMapMultiSet this ^java.lang.Object object]
    (-> this (.getCount object))))

(defn contains
  "Determines if the multiset contains the given element by checking if the
   underlying map contains the element as a key.

  object - the object to search for - `java.lang.Object`

  returns: true if the multiset contains the given element - `boolean`"
  (^Boolean [^AbstractMapMultiSet this ^java.lang.Object object]
    (-> this (.contains object))))

(defn iterator
  "Gets an iterator over the multiset elements. Elements present in the
   MultiSet more than once will be returned repeatedly.

  returns: the iterator - `java.util.Iterator<E>`"
  (^java.util.Iterator [^AbstractMapMultiSet this]
    (-> this (.iterator))))

(defn remove
  "Description copied from interface: MultiSet

  object - the object to remove - `java.lang.Object`
  occurrences - the number of occurrences to remove, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset
     before the operation; possibly zero - `int`"
  (^Integer [^AbstractMapMultiSet this ^java.lang.Object object ^Integer occurrences]
    (-> this (.remove object occurrences))))

(defn hash-code
  "Description copied from interface: MultiSet

  returns: the hash code of the MultiSet - `int`"
  (^Integer [^AbstractMapMultiSet this]
    (-> this (.hashCode))))

(defn add
  "Description copied from interface: MultiSet

  object - the object to add - `E`
  occurrences - the number of occurrences to add, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset before
     this operation; possibly zero - `int`"
  (^Integer [^AbstractMapMultiSet this object ^Integer occurrences]
    (-> this (.add object occurrences))))

(defn empty?
  "Returns true if the underlying map is empty.

  returns: true if multiset is empty - `boolean`"
  (^Boolean [^AbstractMapMultiSet this]
    (-> this (.isEmpty))))

(defn size
  "Returns the number of elements in this multiset.

  returns: current size of the multiset - `int`"
  (^Integer [^AbstractMapMultiSet this]
    (-> this (.size))))

(defn clear
  "Clears the multiset by clearing the underlying map."
  ([^AbstractMapMultiSet this]
    (-> this (.clear))))

(defn to-array
  "Returns an array of all of this multiset's elements.
   If the input array has more elements than are in the multiset,
   trailing elements will be set to null.

  array - the array to populate - `T[]`

  returns: an array of all of this multiset's elements - `<T> T[]`

  throws: java.lang.ArrayStoreException - if the runtime type of the specified array is not a supertype of the runtime type of the elements in this list"
  ([^AbstractMapMultiSet this array]
    (-> this (.toArray array)))
  ([^AbstractMapMultiSet this]
    (-> this (.toArray))))

(defn equals
  "Description copied from interface: MultiSet

  object - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^AbstractMapMultiSet this ^java.lang.Object object]
    (-> this (.equals object))))

