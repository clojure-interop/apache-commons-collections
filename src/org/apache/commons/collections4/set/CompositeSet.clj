(ns org.apache.commons.collections4.set.CompositeSet
  "Decorates a set of other sets to provide a single unified view.

  Changes made to this set will actually be made on the decorated set.
  Add operations require the use of a pluggable strategy.
  If no strategy is provided then add is unsupported.


  From version 4.0, this class does not extend
  CompositeCollection
  anymore due to its input restrictions (only accepts Sets).
  See COLLECTIONS-424
  for more details."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set CompositeSet]))

(defn ->composite-set
  "Constructor.

  Create a CompositeSet with just set composited.

  set - the initial set in the composite - `java.util.Set`"
  (^CompositeSet [^java.util.Set set]
    (new CompositeSet set))
  (^CompositeSet []
    (new CompositeSet )))

(defn add-all
  "Adds a collection of elements to this composite, throwing
   UnsupportedOperationException unless a SetMutator strategy is specified.

  coll - the collection to add - `java.util.Collection`

  returns: true if the composite was modified - `boolean`

  throws: java.lang.UnsupportedOperationException - if SetMutator hasn't been set or add is unsupported"
  (^Boolean [^CompositeSet this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn set-mutator
  "Specify a SetMutator strategy instance to handle changes.

  mutator - the mutator to use - `org.apache.commons.collections4.set.CompositeSet$SetMutator`"
  ([^CompositeSet this ^org.apache.commons.collections4.set.CompositeSet$SetMutator mutator]
    (-> this (.setMutator mutator))))

(defn remove-composited
  "Removes a set from those being decorated in this composite.

  set - set to be removed - `java.util.Set`"
  ([^CompositeSet this ^java.util.Set set]
    (-> this (.removeComposited set))))

(defn get-sets
  "Gets the sets being decorated.

  returns: Unmodifiable list of all sets in this composite. - `java.util.List<java.util.Set<E>>`"
  (^java.util.List [^CompositeSet this]
    (-> this (.getSets))))

(defn add-composited
  "Add these Sets to the list of sets in this composite.

  set-1 - the first Set to be appended to the composite - `java.util.Set`
  set-2 - the second Set to be appended to the composite - `java.util.Set`"
  ([^CompositeSet this ^java.util.Set set-1 ^java.util.Set set-2]
    (-> this (.addComposited set-1 set-2)))
  ([^CompositeSet this ^java.util.Set set]
    (-> this (.addComposited set))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^CompositeSet this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn contains
  "Checks whether this composite set contains the object.

   This implementation calls contains() on each set.

  obj - the object to search for - `java.lang.Object`

  returns: true if obj is contained in any of the contained sets - `boolean`"
  (^Boolean [^CompositeSet this ^java.lang.Object obj]
    (-> this (.contains obj))))

(defn iterator
  "Gets an iterator over all the sets in this composite.

   This implementation uses an IteratorChain.

  returns: an IteratorChain instance which supports
    remove(). Iteration occurs over contained collections in
    the order they were added, but this behavior should not be relied upon. - `java.util.Iterator<E>`"
  (^java.util.Iterator [^CompositeSet this]
    (-> this (.iterator))))

(defn to-set
  "Returns a new Set containing all of the elements.

  returns: A new HashSet containing all of the elements in this composite.
     The new collection is not backed by this composite. - `java.util.Set<E>`"
  (^java.util.Set [^CompositeSet this]
    (-> this (.toSet))))

(defn remove
  "If a CollectionMutator is defined for this CompositeSet then this
   method will be called anyway.

  obj - object to be removed - `java.lang.Object`

  returns: true if the object is removed, false otherwise - `boolean`"
  (^Boolean [^CompositeSet this ^java.lang.Object obj]
    (-> this (.remove obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CompositeSet this]
    (-> this (.hashCode))))

(defn add
  "Adds an object to the collection, throwing UnsupportedOperationException
   unless a SetMutator strategy is specified.

  obj - the object to add - `E`

  returns: true if the collection was modified - `boolean`

  throws: java.lang.UnsupportedOperationException - if SetMutator hasn't been set or add is unsupported"
  (^Boolean [^CompositeSet this obj]
    (-> this (.add obj))))

(defn empty?
  "Checks whether this composite set is empty.

   This implementation calls isEmpty() on each set.

  returns: true if all of the contained sets are empty - `boolean`"
  (^Boolean [^CompositeSet this]
    (-> this (.isEmpty))))

(defn size
  "Gets the size of this composite set.

   This implementation calls size() on each set.

  returns: total number of elements in all contained containers - `int`"
  (^Integer [^CompositeSet this]
    (-> this (.size))))

(defn retain-all
  "Retains all the elements in the specified collection in this composite set,
   removing all others.

   This implementation calls retainAll() on each collection.

  coll - the collection to remove - `java.util.Collection`

  returns: true if the composite was modified - `boolean`

  throws: java.lang.UnsupportedOperationException - if retainAll is unsupported"
  (^Boolean [^CompositeSet this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  "Removes all of the elements from this composite set.

   This implementation calls clear() on each set.

  throws: java.lang.UnsupportedOperationException - if clear is unsupported"
  ([^CompositeSet this]
    (-> this (.clear))))

(defn to-array
  "Returns an object array, populating the supplied array if possible.
   See Collection interface for full details.

  array - the array to use, populating if possible - `T[]`

  returns: an array of all the elements in the collection - `<T> T[]`"
  ([^CompositeSet this array]
    (-> this (.toArray array)))
  ([^CompositeSet this]
    (-> this (.toArray))))

(defn remove-all
  "Removes the elements in the specified collection from this composite set.

   This implementation calls removeAll on each collection.

  coll - the collection to remove - `java.util.Collection`

  returns: true if the composite was modified - `boolean`

  throws: java.lang.UnsupportedOperationException - if removeAll is unsupported"
  (^Boolean [^CompositeSet this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CompositeSet this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn contains-all
  "Checks whether this composite contains all the elements in the specified collection.

   This implementation calls contains() for each element in the
   specified collection.

  coll - the collection to check for - `java.util.Collection`

  returns: true if all elements contained - `boolean`"
  (^Boolean [^CompositeSet this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

