(ns org.apache.commons.collections4.collection.CompositeCollection
  "Decorates a collection of other collections to provide a single unified view.

  Changes made to this collection will actually be made on the decorated collection.
  Add and remove operations require the use of a pluggable strategy. If no
  strategy is provided then add and remove are unsupported."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.collection CompositeCollection]))

(defn ->composite-collection
  "Constructor.

  Create a Composite Collection with two collections.

  composite-collection-1 - the Collection to be appended to the composite - `java.util.Collection`
  composite-collection-2 - the Collection to be appended to the composite - `java.util.Collection`"
  (^CompositeCollection [^java.util.Collection composite-collection-1 ^java.util.Collection composite-collection-2]
    (new CompositeCollection composite-collection-1 composite-collection-2))
  (^CompositeCollection [^java.util.Collection composite-collection]
    (new CompositeCollection composite-collection))
  (^CompositeCollection []
    (new CompositeCollection )))

(defn add-all
  "Adds a collection of elements to this collection, throwing
   UnsupportedOperationException unless a CollectionMutator strategy is specified.

  coll - the collection to add - `java.util.Collection`

  returns: true if the collection was modified - `boolean`

  throws: java.lang.UnsupportedOperationException - if add is unsupported"
  (^Boolean [^CompositeCollection this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn get-collections
  "Gets the collections being decorated.

  returns: Unmodifiable list of all collections in this composite. - `java.util.List<java.util.Collection<E>>`"
  (^java.util.List [^CompositeCollection this]
    (-> this (.getCollections))))

(defn set-mutator
  "Specify a CollectionMutator strategy instance to handle changes.

  mutator - the mutator to use - `org.apache.commons.collections4.collection.CompositeCollection$CollectionMutator`"
  ([^CompositeCollection this ^org.apache.commons.collections4.collection.CompositeCollection$CollectionMutator mutator]
    (-> this (.setMutator mutator))))

(defn remove-composited
  "Removes a collection from the those being decorated in this composite.

  coll - collection to be removed - `java.util.Collection`"
  ([^CompositeCollection this ^java.util.Collection coll]
    (-> this (.removeComposited coll))))

(defn add-composited
  "Add these Collections to the list of collections in this composite

  composite-collection-1 - the Collection to be appended to the composite - `java.util.Collection`
  composite-collection-2 - the Collection to be appended to the composite - `java.util.Collection`"
  ([^CompositeCollection this ^java.util.Collection composite-collection-1 ^java.util.Collection composite-collection-2]
    (-> this (.addComposited composite-collection-1 composite-collection-2)))
  ([^CompositeCollection this ^java.util.Collection composite-collection]
    (-> this (.addComposited composite-collection))))

(defn remove-if
  "Removes all of the elements of this collection that satisfy the given predicate from this composite collection.

   This implementation calls removeIf on each collection.

  filter - a predicate which returns true for elements to be removed - `java.util.function.Predicate`

  returns: true if the collection was modified - `boolean`

  throws: java.lang.UnsupportedOperationException - if removeIf is unsupported"
  (^Boolean [^CompositeCollection this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn contains
  "Checks whether this composite collection contains the object.

   This implementation calls contains() on each collection.

  obj - the object to search for - `java.lang.Object`

  returns: true if obj is contained in any of the contained collections - `boolean`"
  (^Boolean [^CompositeCollection this ^java.lang.Object obj]
    (-> this (.contains obj))))

(defn iterator
  "Gets an iterator over all the collections in this composite.

   This implementation uses an IteratorChain.

  returns: an IteratorChain instance which supports
    remove(). Iteration occurs over contained collections in
    the order they were added, but this behavior should not be relied upon. - `java.util.Iterator<E>`"
  (^java.util.Iterator [^CompositeCollection this]
    (-> this (.iterator))))

(defn to-collection
  "Returns a new collection containing all of the elements

  returns: A new ArrayList containing all of the elements in this composite.
           The new collection is not backed by this composite. - `java.util.Collection<E>`"
  (^java.util.Collection [^CompositeCollection this]
    (-> this (.toCollection))))

(defn remove
  "Removes an object from the collection, throwing UnsupportedOperationException
   unless a CollectionMutator strategy is specified.

  obj - the object being removed - `java.lang.Object`

  returns: true if the collection is changed - `boolean`

  throws: java.lang.UnsupportedOperationException - if removed is unsupported"
  (^Boolean [^CompositeCollection this ^java.lang.Object obj]
    (-> this (.remove obj))))

(defn add
  "Adds an object to the collection, throwing UnsupportedOperationException
   unless a CollectionMutator strategy is specified.

  obj - the object to add - `E`

  returns: true if the collection was modified - `boolean`

  throws: java.lang.UnsupportedOperationException - if add is unsupported"
  (^Boolean [^CompositeCollection this obj]
    (-> this (.add obj))))

(defn empty?
  "Checks whether this composite collection is empty.

   This implementation calls isEmpty() on each collection.

  returns: true if all of the contained collections are empty - `boolean`"
  (^Boolean [^CompositeCollection this]
    (-> this (.isEmpty))))

(defn size
  "Gets the size of this composite collection.

   This implementation calls size() on each collection.

  returns: total number of elements in all contained containers - `int`"
  (^Integer [^CompositeCollection this]
    (-> this (.size))))

(defn retain-all
  "Retains all the elements in the specified collection in this composite collection,
   removing all others.

   This implementation calls retainAll() on each collection.

  coll - the collection to remove - `java.util.Collection`

  returns: true if the collection was modified - `boolean`

  throws: java.lang.UnsupportedOperationException - if retainAll is unsupported"
  (^Boolean [^CompositeCollection this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  "Removes all of the elements from this collection .

   This implementation calls clear() on each collection.

  throws: java.lang.UnsupportedOperationException - if clear is unsupported"
  ([^CompositeCollection this]
    (-> this (.clear))))

(defn to-array
  "Returns an object array, populating the supplied array if possible.
   See Collection interface for full details.

  array - the array to use, populating if possible - `T[]`

  returns: an array of all the elements in the collection - `<T> T[]`"
  ([^CompositeCollection this array]
    (-> this (.toArray array)))
  ([^CompositeCollection this]
    (-> this (.toArray))))

(defn remove-all
  "Removes the elements in the specified collection from this composite collection.

   This implementation calls removeAll on each collection.

  coll - the collection to remove - `java.util.Collection`

  returns: true if the collection was modified - `boolean`

  throws: java.lang.UnsupportedOperationException - if removeAll is unsupported"
  (^Boolean [^CompositeCollection this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn contains-all
  "Checks whether this composite contains all the elements in the specified collection.

   This implementation calls contains() for each element in the
   specified collection.

  coll - the collection to check for - `java.util.Collection`

  returns: true if all elements contained - `boolean`"
  (^Boolean [^CompositeCollection this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

