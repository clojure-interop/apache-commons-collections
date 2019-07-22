(ns org.apache.commons.collections4.MultiSet
  "Defines a collection that counts the number of times an object appears in
  the collection.

  Suppose you have a MultiSet that contains {a, a, b, c}.
  Calling getCount(Object) on a would return 2, while
  calling uniqueSet() would return {a, b, c}."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 MultiSet]))

(defn get-count
  "Returns the number of occurrences of the given object currently
   in the MultiSet. If the object does not exist in the multiset,
   return 0.

  object - the object to search for - `java.lang.Object`

  returns: the number of occurrences of the object, zero if not found - `int`"
  (^Integer [^MultiSet this ^java.lang.Object object]
    (-> this (.getCount object))))

(defn entry-set
  "Returns a Set of all entries contained in the MultiSet.

   The returned set is backed by this multiset, so any change to either
   is immediately reflected in the other.

  returns: the Set of MultiSet entries - `java.util.Set<org.apache.commons.collections4.MultiSet$Entry<E>>`"
  (^java.util.Set [^MultiSet this]
    (-> this (.entrySet))))

(defn set-count
  "Sets the number of occurrences of the specified object in the MultiSet
   to the given count.

   If the provided count is zero, the object will be removed from the
   uniqueSet().

  object - the object to update - `E`
  count - the number of occurrences of the object - `int`

  returns: the number of occurrences of the object before this operation, zero
     if the object was not contained in the multiset - `int`

  throws: java.lang.IllegalArgumentException - if count is negative"
  (^Integer [^MultiSet this object ^Integer count]
    (-> this (.setCount object count))))

(defn iterator
  "Returns an Iterator over the entire set of members,
   including copies due to cardinality. This iterator is fail-fast
   and will not tolerate concurrent modifications.

  returns: iterator over all elements in the MultiSet - `java.util.Iterator<E>`"
  (^java.util.Iterator [^MultiSet this]
    (-> this (.iterator))))

(defn remove
  "Removes a number of occurrences of the specified object from the MultiSet.

   If the number of occurrences to remove is greater than the actual number of
   occurrences in the multiset, the object will be removed from the multiset.

  object - the object to remove - `java.lang.Object`
  occurrences - the number of occurrences to remove, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset
     before the operation; possibly zero - `int`

  throws: java.lang.IllegalArgumentException - if occurrences is negative"
  (^Integer [^MultiSet this ^java.lang.Object object ^Integer occurrences]
    (-> this (.remove object occurrences)))
  (^Boolean [^MultiSet this ^java.lang.Object object]
    (-> this (.remove object))))

(defn unique-set
  "Returns a Set of unique elements in the MultiSet.

   Uniqueness constraints are the same as those in Set.

   The returned set is backed by this multiset, so any change to either
   is immediately reflected in the other. Only removal operations are
   supported, in which case all occurrences of the element are removed
   from the backing multiset.

  returns: the Set of unique MultiSet elements - `java.util.Set<E>`"
  (^java.util.Set [^MultiSet this]
    (-> this (.uniqueSet))))

(defn hash-code
  "Gets a hash code for the MultiSet compatible with the definition of equals.
   The hash code is defined as the sum total of a hash code for each element.
   The per element hash code is defined as
   (e==null ? 0 : e.hashCode()) ^ noOccurances).

  returns: the hash code of the MultiSet - `int`"
  (^Integer [^MultiSet this]
    (-> this (.hashCode))))

(defn add
  "Adds a number of occurrences of the specified object to the MultiSet.

   If the object is already in the uniqueSet() then increment its
   count as reported by getCount(Object). Otherwise add it to the
   uniqueSet() and report its count as occurrences.

  object - the object to add - `E`
  occurrences - the number of occurrences to add, may be zero, in which case no change is made to the multiset - `int`

  returns: the number of occurrences of the object in the multiset before
     this operation; possibly zero - `int`

  throws: java.lang.IllegalArgumentException - if occurrences is negative"
  (^Integer [^MultiSet this object ^Integer occurrences]
    (-> this (.add object occurrences)))
  (^Boolean [^MultiSet this object]
    (-> this (.add object))))

(defn size
  "Returns the total number of items in the MultiSet.

  returns: the total size of the multiset - `int`"
  (^Integer [^MultiSet this]
    (-> this (.size))))

(defn retain-all
  "Remove any elements of this MultiSet that are not contained in the
   given collection.

  coll - the collection of elements to retain - `java.util.Collection`

  returns: true if this call changed the multiset - `boolean`"
  (^Boolean [^MultiSet this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn remove-all
  "Remove all occurrences of all elements from this MultiSet represented
   in the given collection.

  coll - the collection of elements to remove - `java.util.Collection`

  returns: true if this call changed the multiset - `boolean`"
  (^Boolean [^MultiSet this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn equals
  "Compares this MultiSet to another object.

   This MultiSet equals another object if it is also a MultiSet
   that contains the same number of occurrences of the same elements.

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^MultiSet this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn contains-all
  "Returns true if the MultiSet contains at least one
   occurrence for each element contained in the given collection.

  coll - the collection to check against - `java.util.Collection`

  returns: true if the MultiSet contains all the collection - `boolean`"
  (^Boolean [^MultiSet this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

