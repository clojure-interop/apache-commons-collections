(ns org.apache.commons.collections4.bag.AbstractMapBag
  "Abstract implementation of the Bag interface to simplify the creation
  of subclass implementations.

  Subclasses specify a Map implementation to use as the internal storage. The
  map will be used to map bag elements to a number; the number represents the
  number of occurrences of that element in the bag."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag AbstractMapBag]))

(defn add-all
  "Invokes add(Object) for each element in the given collection.

  coll - the collection to add - `java.util.Collection`

  returns: true if this call changed the bag - `boolean`"
  (^Boolean [^AbstractMapBag this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn get-count
  "Returns the number of occurrence of the given element in this bag by
   looking up its count in the underlying map.

  object - the object to search for - `java.lang.Object`

  returns: the number of occurrences of the object, zero if not found - `int`"
  (^Integer [^AbstractMapBag this ^java.lang.Object object]
    (-> this (.getCount object))))

(defn contains
  "Determines if the bag contains the given element by checking if the
   underlying map contains the element as a key.

  object - the object to search for - `java.lang.Object`

  returns: true if the bag contains the given element - `boolean`"
  (^Boolean [^AbstractMapBag this ^java.lang.Object object]
    (-> this (.contains object))))

(defn to-string
  "Implement a toString() method suitable for debugging.

  returns: a debugging toString - `java.lang.String`"
  (^java.lang.String [^AbstractMapBag this]
    (-> this (.toString))))

(defn iterator
  "Gets an iterator over the bag elements. Elements present in the Bag more
   than once will be returned repeatedly.

  returns: the iterator - `java.util.Iterator<E>`"
  (^java.util.Iterator [^AbstractMapBag this]
    (-> this (.iterator))))

(defn remove
  "Removes a specified number of copies of an object from the bag.

  object - the object to remove - `java.lang.Object`
  n-copies - the number of copies to remove - `int`

  returns: true if the bag changed - `boolean`"
  (^Boolean [^AbstractMapBag this ^java.lang.Object object ^Integer n-copies]
    (-> this (.remove object n-copies)))
  (^Boolean [^AbstractMapBag this ^java.lang.Object object]
    (-> this (.remove object))))

(defn unique-set
  "Returns an unmodifiable view of the underlying map's key set.

  returns: the set of unique elements in this bag - `java.util.Set<E>`"
  (^java.util.Set [^AbstractMapBag this]
    (-> this (.uniqueSet))))

(defn hash-code
  "Gets a hash code for the Bag compatible with the definition of equals.
   The hash code is defined as the sum total of a hash code for each
   element. The per element hash code is defined as
   (e==null ? 0 : e.hashCode()) ^ noOccurances). This hash code
   is compatible with the Set interface.

  returns: the hash code of the Bag - `int`"
  (^Integer [^AbstractMapBag this]
    (-> this (.hashCode))))

(defn add
  "Adds a new element to the bag, incrementing its count in the map.

  object - the object to search for - `E`
  n-copies - the number of copies to add - `int`

  returns: true if the object was not already in the uniqueSet - `boolean`"
  (^Boolean [^AbstractMapBag this object ^Integer n-copies]
    (-> this (.add object n-copies)))
  (^Boolean [^AbstractMapBag this object]
    (-> this (.add object))))

(defn empty?
  "Returns true if the underlying map is empty.

  returns: true if bag is empty - `boolean`"
  (^Boolean [^AbstractMapBag this]
    (-> this (.isEmpty))))

(defn size
  "Returns the number of elements in this bag.

  returns: current size of the bag - `int`"
  (^Integer [^AbstractMapBag this]
    (-> this (.size))))

(defn retain-all
  "Remove any members of the bag that are not in the given bag, respecting
   cardinality.

  coll - the collection to retain - `java.util.Collection`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^AbstractMapBag this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  "Clears the bag by clearing the underlying map."
  ([^AbstractMapBag this]
    (-> this (.clear))))

(defn to-array
  "Returns an array of all of this bag's elements.
   If the input array has more elements than are in the bag,
   trailing elements will be set to null.

  array - the array to populate - `T[]`

  returns: an array of all of this bag's elements - `<T> T[]`

  throws: java.lang.ArrayStoreException - if the runtime type of the specified array is not a supertype of the runtime type of the elements in this list"
  ([^AbstractMapBag this array]
    (-> this (.toArray array)))
  ([^AbstractMapBag this]
    (-> this (.toArray))))

(defn remove-all
  "Removes objects from the bag according to their count in the specified
   collection.

  coll - the collection to use - `java.util.Collection`

  returns: true if the bag changed - `boolean`"
  (^Boolean [^AbstractMapBag this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn equals
  "Compares this Bag to another. This Bag equals another Bag if it contains
   the same number of occurrences of the same elements.

  object - the Bag to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^AbstractMapBag this ^java.lang.Object object]
    (-> this (.equals object))))

(defn contains-all
  "Determines if the bag contains the given elements.

  coll - the collection to check against - `java.util.Collection`

  returns: true if the Bag contains all the collection - `boolean`"
  (^Boolean [^AbstractMapBag this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

