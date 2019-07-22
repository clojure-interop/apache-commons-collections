(ns org.apache.commons.collections4.Bag
  "Defines a collection that counts the number of times an object appears in
  the collection.

  Suppose you have a Bag that contains {a, a, b, c}.
  Calling getCount(Object) on a would return 2, while
  calling uniqueSet() would return {a, b, c}.


  NOTE: This interface violates the Collection contract.
  The behavior specified in many of these methods is not the same
  as the behavior specified by Collection.
  The noncompliant methods are clearly marked with \"(Violation)\".
  Exercise caution when using a bag as a Collection.


  This violation resulted from the original specification of this interface.
  In an ideal world, the interface would be changed to fix the problems, however
  it has been decided to maintain backwards compatibility instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 Bag]))

(defn get-count
  "Returns the number of occurrences (cardinality) of the given
   object currently in the bag. If the object does not exist in the
   bag, return 0.

  object - the object to search for - `java.lang.Object`

  returns: the number of occurrences of the object, zero if not found - `int`"
  (^Integer [^Bag this ^java.lang.Object object]
    (-> this (.getCount object))))

(defn iterator
  "Returns an Iterator over the entire set of members,
   including copies due to cardinality. This iterator is fail-fast
   and will not tolerate concurrent modifications.

  returns: iterator over all elements in the Bag - `java.util.Iterator<E>`"
  (^java.util.Iterator [^Bag this]
    (-> this (.iterator))))

(defn remove
  "Removes nCopies copies of the specified object from the Bag.

   If the number of copies to remove is greater than the actual number of
   copies in the Bag, no error is thrown.

  object - the object to remove - `java.lang.Object`
  n-copies - the number of copies to remove - `int`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^Bag this ^java.lang.Object object ^Integer n-copies]
    (-> this (.remove object n-copies)))
  (^Boolean [^Bag this ^java.lang.Object object]
    (-> this (.remove object))))

(defn unique-set
  "Returns a Set of unique elements in the Bag.

   Uniqueness constraints are the same as those in Set.

  returns: the Set of unique Bag elements - `java.util.Set<E>`"
  (^java.util.Set [^Bag this]
    (-> this (.uniqueSet))))

(defn add
  "Adds nCopies copies of the specified object to the Bag.

   If the object is already in the uniqueSet() then increment its
   count as reported by getCount(Object). Otherwise add it to the
   uniqueSet() and report its count as nCopies.

  object - the object to add - `E`
  n-copies - the number of copies to add - `int`

  returns: true if the object was not already in the uniqueSet - `boolean`"
  (^Boolean [^Bag this object ^Integer n-copies]
    (-> this (.add object n-copies)))
  (^Boolean [^Bag this object]
    (-> this (.add object))))

(defn size
  "Returns the total number of items in the bag across all types.

  returns: the total size of the Bag - `int`"
  (^Integer [^Bag this]
    (-> this (.size))))

(defn retain-all
  "(Violation)
   Remove any members of the bag that are not in the given
   collection, respecting cardinality.  That is, if the given
   collection coll contains n copies of a
   given object and the bag has m > n copies, then
   delete m - n copies from the bag.  In addition, if
   e is an object in the bag but
   !coll.contains(e), then remove e and any
   of its copies.


   The Collection.retainAll(Collection) method specifies
   that cardinality should not be respected; this method should
   keep all occurrences of every object contained in the
   given collection.

  coll - the collection to retain - `java.util.Collection`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^Bag this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn remove-all
  "(Violation)
   Remove all elements represented in the given collection,
   respecting cardinality.  That is, if the given collection
   coll contains n copies of a given object,
   the bag will have n fewer copies, assuming the bag
   had at least n copies to begin with.


   The Collection.removeAll(Collection) method specifies
   that cardinality should not be respected; this method should
   remove all occurrences of every object contained in the
   given collection.

  coll - the collection to remove - `java.util.Collection`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^Bag this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn contains-all
  "(Violation)
   Returns true if the bag contains all elements in
   the given collection, respecting cardinality.  That is, if the
   given collection coll contains n copies
   of a given object, calling getCount(Object) on that object must
   be >= n for all n in coll.


   The Collection.containsAll(Collection) method specifies
   that cardinality should not be respected; this method should
   return true if the bag contains at least one of every object contained
   in the given collection.

  coll - the collection to check against - `java.util.Collection`

  returns: true if the Bag contains all the collection - `boolean`"
  (^Boolean [^Bag this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

