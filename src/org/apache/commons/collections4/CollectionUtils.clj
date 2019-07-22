(ns org.apache.commons.collections4.CollectionUtils
  "Provides utility methods and decorators for Collection instances.

  Various utility methods might put the input objects into a Set/Map/Bag. In case
  the input objects override Object.equals(Object), it is mandatory that
  the general contract of the Object.hashCode() method is maintained.


  NOTE: From 4.0, method parameters will take Iterable objects when possible."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 CollectionUtils]))

(def *-empty-collection
  "Static Constant.

  An empty unmodifiable collection.
   The JDK provides empty Set and List implementations which could be used for
   this purpose. However they could be cast to Set or List which might be
   undesirable. This implementation only implements Collection.

  type: java.util.Collection"
  CollectionUtils/EMPTY_COLLECTION)

(defn *add-all
  "Adds all elements in the Iterable to the given collection. If the
   Iterable is a Collection then it is cast and will be
   added using Collection.addAll(Collection) instead of iterating.

  collection - the collection to add to, must not be null - `java.util.Collection`
  iterable - the iterable of elements to add, must not be null - `java.lang.Iterable`

  returns: a boolean indicating whether the collection has changed or not. - `<C> boolean`

  throws: java.lang.NullPointerException - if the collection or iterator is null"
  ([^java.util.Collection collection ^java.lang.Iterable iterable]
    (CollectionUtils/addAll collection iterable)))

(defn *collate
  "Merges two sorted Collections, a and b, into a single, sorted List
   such that the ordering of the elements according to Comparator c is retained.

   Uses the standard O(n) merge algorithm for combining two sorted lists.

  a - the first collection, must not be null - `java.lang.Iterable`
  b - the second collection, must not be null - `java.lang.Iterable`
  c - the comparator to use for the merge. - `java.util.Comparator`
  include-duplicates - if true duplicate elements will be retained, otherwise they will be removed in the output collection - `boolean`

  returns: a new sorted List, containing the elements of Collection a and b - `<O> java.util.List<O>`

  throws: java.lang.NullPointerException - if either collection or the comparator is null"
  ([^java.lang.Iterable a ^java.lang.Iterable b ^java.util.Comparator c ^Boolean include-duplicates]
    (CollectionUtils/collate a b c include-duplicates))
  ([^java.lang.Iterable a ^java.lang.Iterable b ^Boolean include-duplicates]
    (CollectionUtils/collate a b include-duplicates))
  ([^java.lang.Iterable a ^java.lang.Iterable b]
    (CollectionUtils/collate a b)))

(defn *filter-inverse
  "Filter the collection by applying a Predicate to each element. If the
   predicate returns true, remove the element.

   This is equivalent to filter(collection, PredicateUtils.notPredicate(predicate))
   if predicate is != null.


   If the input collection or predicate is null, there is no change made.

  collection - the collection to get the input from, may be null - `java.lang.Iterable`
  predicate - the predicate to use as a filter, may be null - `org.apache.commons.collections4.Predicate`

  returns: true if the collection is modified by this call, false otherwise. - `<T> boolean`"
  ([^java.lang.Iterable collection ^org.apache.commons.collections4.Predicate predicate]
    (CollectionUtils/filterInverse collection predicate)))

(defn *find
  "Deprecated. since 4.1, use IterableUtils.find(Iterable, Predicate) instead

  collection - the collection to search, may be null - `java.lang.Iterable`
  predicate - the predicate to use, may be null - `org.apache.commons.collections4.Predicate`

  returns: the first element of the collection which matches the predicate or null if none could be found - `<T> T`"
  ([^java.lang.Iterable collection ^org.apache.commons.collections4.Predicate predicate]
    (CollectionUtils/find collection predicate)))

(defn *unmodifiable-collection
  "Deprecated. since 4.1, use Collections.unmodifiableCollection(Collection) instead

  collection - the collection to make unmodifiable, must not be null - `java.util.Collection`

  returns: an unmodifiable collection backed by the given collection - `<C> java.util.Collection<C>`

  throws: java.lang.NullPointerException - if the collection is null"
  ([^java.util.Collection collection]
    (CollectionUtils/unmodifiableCollection collection)))

(defn *disjunction
  "Returns a Collection containing the exclusive disjunction
   (symmetric difference) of the given Iterables.

   The cardinality of each element e in the returned
   Collection will be equal to
   max(cardinality(e,a),cardinality(e,b)) - min(cardinality(e,a),
   cardinality(e,b)).


   This is equivalent to
   {@link #subtract subtract}({@link #union union(a,b)},{@link #intersection intersection(a,b)})
   or
   {@link #union union}({@link #subtract subtract(a,b)},{@link #subtract subtract(b,a)}).

  a - the first collection, must not be null - `java.lang.Iterable`
  b - the second collection, must not be null - `java.lang.Iterable`

  returns: the symmetric difference of the two collections - `<O> java.util.Collection<O>`"
  ([^java.lang.Iterable a ^java.lang.Iterable b]
    (CollectionUtils/disjunction a b)))

(defn *for-all-but-last-do
  "Deprecated. since 4.1, use IterableUtils.forEachButLast(Iterable, Closure) instead

  collection - the collection to get the input from, may be null - `java.lang.Iterable`
  closure - the closure to perform, may be null - `C`

  returns: the last element in the collection, or null if either collection or closure is null - `<T,C extends org.apache.commons.collections4.Closure<? super T>> T`"
  ([^java.lang.Iterable collection closure]
    (CollectionUtils/forAllButLastDo collection closure)))

(defn *get-cardinality-map
  "Returns a Map mapping each unique element in the given
   Collection to an Integer representing the number
   of occurrences of that element in the Collection.

   Only those elements present in the collection will appear as
   keys in the map.

  coll - the collection to get the cardinality map for, must not be null - `java.lang.Iterable`

  returns: the populated cardinality map - `<O> java.util.Map<O,java.lang.Integer>`"
  ([^java.lang.Iterable coll]
    (CollectionUtils/getCardinalityMap coll)))

(defn *contains-any
  "Returns true iff at least one element is in both collections.

   In other words, this method returns true iff the
   intersection(java.lang.Iterable<? extends O>, java.lang.Iterable<? extends O>) of coll1 and coll2 is not empty.

  coll-1 - the first collection, must not be null - `java.util.Collection`
  coll-2 - the second collection, must not be null - `T`

  returns: true iff the intersection of the collections is non-empty - `<T> boolean`"
  ([^java.util.Collection coll-1 coll-2]
    (CollectionUtils/containsAny coll-1 coll-2)))

(defn *union
  "Returns a Collection containing the union of the given
   Iterables.

   The cardinality of each element in the returned Collection will
   be equal to the maximum of the cardinality of that element in the two
   given Iterables.

  a - the first collection, must not be null - `java.lang.Iterable`
  b - the second collection, must not be null - `java.lang.Iterable`

  returns: the union of the two collections - `<O> java.util.Collection<O>`"
  ([^java.lang.Iterable a ^java.lang.Iterable b]
    (CollectionUtils/union a b)))

(defn *transform
  "Transform the collection by applying a Transformer to each element.

   If the input collection or transformer is null, there is no change made.


   This routine is best for Lists, for which set() is used to do the
   transformations \"in place.\" For other Collections, clear() and addAll()
   are used to replace elements.


   If the input collection controls its input, such as a Set, and the
   Transformer creates duplicates (or are otherwise invalid), the collection
   may reduce in size due to calling this method.

  collection - the Collection to get the input from, may be null - `java.util.Collection`
  transformer - the transformer to perform, may be null - `org.apache.commons.collections4.Transformer`

  returns: `<C> void`"
  ([^java.util.Collection collection ^org.apache.commons.collections4.Transformer transformer]
    (CollectionUtils/transform collection transformer)))

(defn *matches-all
  "Deprecated. since 4.1, use IterableUtils.matchesAll(Iterable, Predicate) instead

  input - the Iterable to get the input from, may be null - `java.lang.Iterable`
  predicate - the predicate to use, may be null - `org.apache.commons.collections4.Predicate`

  returns: true if every element of the collection matches the predicate or if the
   collection is empty, false otherwise - `<C> boolean`"
  ([^java.lang.Iterable input ^org.apache.commons.collections4.Predicate predicate]
    (CollectionUtils/matchesAll input predicate)))

(defn *extract-singleton
  "Extract the lone element of the specified Collection.

  collection - to read - `java.util.Collection`

  returns: sole member of collection - `<E> E`

  throws: java.lang.NullPointerException - if collection is null"
  ([^java.util.Collection collection]
    (CollectionUtils/extractSingleton collection)))

(defn *sub-collection?
  "Returns true iff a is a sub-collection of b,
   that is, iff the cardinality of e in a is less than or
   equal to the cardinality of e in b, for each element e
   in a.

  a - the first (sub?) collection, must not be null - `java.util.Collection`
  b - the second (super?) collection, must not be null - `java.util.Collection`

  returns: true iff a is a sub-collection of b - `boolean`"
  (^Boolean [^java.util.Collection a ^java.util.Collection b]
    (CollectionUtils/isSubCollection a b)))

(defn *empty-if-null
  "Returns an immutable empty collection if the argument is null,
   or the argument itself otherwise.

  collection - the collection, possibly null - `java.util.Collection`

  returns: an empty collection if the argument is null - `<T> java.util.Collection<T>`"
  ([^java.util.Collection collection]
    (CollectionUtils/emptyIfNull collection)))

(defn *not-empty?
  "Null-safe check if the specified collection is not empty.

   Null returns false.

  coll - the collection to check, may be null - `java.util.Collection`

  returns: true if non-null and non-empty - `boolean`"
  (^Boolean [^java.util.Collection coll]
    (CollectionUtils/isNotEmpty coll)))

(defn *subtract
  "Returns a new Collection containing a minus a subset of
   b.  Only the elements of b that satisfy the predicate
   condition, p are subtracted from a.


   The cardinality of each element e in the returned Collection
   that satisfies the predicate condition will be the cardinality of e in a
   minus the cardinality of e in b, or zero, whichever is greater.


   The cardinality of each element e in the returned Collection that does not
   satisfy the predicate condition will be equal to the cardinality of e in a.

  a - the collection to subtract from, must not be null - `java.lang.Iterable`
  b - the collection to subtract, must not be null - `java.lang.Iterable`
  p - the condition used to determine which elements of b are subtracted. - `org.apache.commons.collections4.Predicate`

  returns: a new collection with the results - `<O> java.util.Collection<O>`"
  ([^java.lang.Iterable a ^java.lang.Iterable b ^org.apache.commons.collections4.Predicate p]
    (CollectionUtils/subtract a b p))
  ([^java.lang.Iterable a ^java.lang.Iterable b]
    (CollectionUtils/subtract a b)))

(defn *select
  "Selects all elements from inputCollection into an output and rejected collection,
   based on the evaluation of the given predicate.

   Elements matching the predicate are added to the outputCollection,
   all other elements are added to the rejectedCollection.


   If the input predicate is null, no elements are added to
   outputCollection or rejectedCollection.


   Note: calling the method is equivalent to the following code snippet:



     select(inputCollection, predicate, outputCollection);
     selectRejected(inputCollection, predicate, rejectedCollection);

  input-collection - the collection to get the input from, may be null - `java.lang.Iterable`
  predicate - the predicate to use, may be null - `org.apache.commons.collections4.Predicate`
  output-collection - the collection to output selected elements into, may not be null if the inputCollection and predicate are not null - `R`
  rejected-collection - the collection to output rejected elements into, may not be null if the inputCollection or predicate are not null - `R`

  returns: the outputCollection - `<O,R extends java.util.Collection<? super O>> R`"
  ([^java.lang.Iterable input-collection ^org.apache.commons.collections4.Predicate predicate output-collection rejected-collection]
    (CollectionUtils/select input-collection predicate output-collection rejected-collection))
  ([^java.lang.Iterable input-collection ^org.apache.commons.collections4.Predicate predicate output-collection]
    (CollectionUtils/select input-collection predicate output-collection))
  ([^java.lang.Iterable input-collection ^org.apache.commons.collections4.Predicate predicate]
    (CollectionUtils/select input-collection predicate)))

(defn *select-rejected
  "Selects all elements from inputCollection which don't match the given
   predicate and adds them to outputCollection.

   If the input predicate is null, no elements are added to
   outputCollection.

  input-collection - the collection to get the input from, may be null - `java.lang.Iterable`
  predicate - the predicate to use, may be null - `org.apache.commons.collections4.Predicate`
  output-collection - the collection to output into, may not be null if the inputCollection and predicate or not null - `R`

  returns: outputCollection - `<O,R extends java.util.Collection<? super O>> R`"
  ([^java.lang.Iterable input-collection ^org.apache.commons.collections4.Predicate predicate output-collection]
    (CollectionUtils/selectRejected input-collection predicate output-collection))
  ([^java.lang.Iterable input-collection ^org.apache.commons.collections4.Predicate predicate]
    (CollectionUtils/selectRejected input-collection predicate)))

(defn *for-all-do
  "Deprecated. since 4.1, use IterableUtils.forEach(Iterable, Closure) instead

  collection - the collection to get the input from, may be null - `java.lang.Iterable`
  closure - the closure to perform, may be null - `C`

  returns: closure - `<T,C extends org.apache.commons.collections4.Closure<? super T>> C`"
  ([^java.lang.Iterable collection closure]
    (CollectionUtils/forAllDo collection closure)))

(defn *empty-collection
  "Returns the immutable EMPTY_COLLECTION with generic type safety.

  returns: immutable empty collection - `<T> java.util.Collection<T>`"
  ([]
    (CollectionUtils/emptyCollection )))

(defn *filter
  "Filter the collection by applying a Predicate to each element. If the
   predicate returns false, remove the element.

   If the input collection or predicate is null, there is no change made.

  collection - the collection to get the input from, may be null - `java.lang.Iterable`
  predicate - the predicate to use as a filter, may be null - `org.apache.commons.collections4.Predicate`

  returns: true if the collection is modified by this call, false otherwise. - `<T> boolean`"
  ([^java.lang.Iterable collection ^org.apache.commons.collections4.Predicate predicate]
    (CollectionUtils/filter collection predicate)))

(defn *intersection
  "Returns a Collection containing the intersection of the given
   Iterables.

   The cardinality of each element in the returned Collection will
   be equal to the minimum of the cardinality of that element in the two
   given Iterables.

  a - the first collection, must not be null - `java.lang.Iterable`
  b - the second collection, must not be null - `java.lang.Iterable`

  returns: the intersection of the two collections - `<O> java.util.Collection<O>`"
  ([^java.lang.Iterable a ^java.lang.Iterable b]
    (CollectionUtils/intersection a b)))

(defn *permutations
  "Returns a Collection of all the permutations of the input collection.

   NOTE: the number of permutations of a given collection is equal to n!, where
   n is the size of the collection. Thus, the resulting collection will become
   very large for collections > 10 (e.g. 10! = 3628800, 15! = 1307674368000).


   For larger collections it is advised to use a PermutationIterator to
   iterate over all permutations.

  collection - the collection to create permutations for, may not be null - `java.util.Collection`

  returns: an unordered collection of all permutations of the input collection - `<E> java.util.Collection<java.util.List<E>>`

  throws: java.lang.NullPointerException - if collection is null"
  ([^java.util.Collection collection]
    (CollectionUtils/permutations collection)))

(defn *predicated-collection
  "Returns a predicated (validating) collection backed by the given collection.

   Only objects that pass the test in the given predicate can be added to the collection.
   Trying to add an invalid object results in an IllegalArgumentException.
   It is important not to use the original collection after invoking this method,
   as it is a backdoor for adding invalid objects.

  collection - the collection to predicate, must not be null - `java.util.Collection`
  predicate - the predicate for the collection, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a predicated collection backed by the given collection - `<C> java.util.Collection<C>`

  throws: java.lang.NullPointerException - if the Collection is null"
  ([^java.util.Collection collection ^org.apache.commons.collections4.Predicate predicate]
    (CollectionUtils/predicatedCollection collection predicate)))

(defn *add-ignore-null
  "Adds an element to the collection unless the element is null.

  collection - the collection to add to, must not be null - `java.util.Collection`
  object - the object to add, if null it will not be added - `T`

  returns: true if the collection changed - `<T> boolean`

  throws: java.lang.NullPointerException - if the collection is null"
  ([^java.util.Collection collection object]
    (CollectionUtils/addIgnoreNull collection object)))

(defn *is-equal-collection
  "Returns true iff the given Collections contain
   exactly the same elements with exactly the same cardinalities.

   That is, iff the cardinality of e in a is
   equal to the cardinality of e in b,
   for each element e in a or b.


   Note: from version 4.1 onwards this method requires the input
   collections and equator to be of compatible type (using bounded wildcards).
   Providing incompatible arguments (e.g. by casting to their rawtypes)
   will result in a ClassCastException thrown at runtime.

  a - the first collection, must not be null - `java.util.Collection`
  b - the second collection, must not be null - `java.util.Collection`
  equator - the Equator used for testing equality - `org.apache.commons.collections4.Equator`

  returns: true iff the collections contain the same elements with the same cardinalities. - `<E> boolean`

  throws: java.lang.NullPointerException - if the equator is null"
  ([^java.util.Collection a ^java.util.Collection b ^org.apache.commons.collections4.Equator equator]
    (CollectionUtils/isEqualCollection a b equator))
  (^Boolean [^java.util.Collection a ^java.util.Collection b]
    (CollectionUtils/isEqualCollection a b)))

(defn *full?
  "Returns true if no more elements can be added to the Collection.

   This method uses the BoundedCollection interface to determine the
   full status. If the collection does not implement this interface then
   false is returned.


   The collection does not have to implement this interface directly.
   If the collection has been decorated using the decorators subpackage
   then these will be removed to access the BoundedCollection.

  coll - the collection to check - `java.util.Collection`

  returns: true if the BoundedCollection is full - `boolean`

  throws: java.lang.NullPointerException - if the collection is null"
  (^Boolean [^java.util.Collection coll]
    (CollectionUtils/isFull coll)))

(defn *reverse-array
  "Reverses the order of the given array.

  array - the array to reverse - `java.lang.Object[]`"
  ([array]
    (CollectionUtils/reverseArray array)))

(defn *collect
  "Transforms all elements from input collection with the given transformer
   and adds them to the output collection.

   If the input collection or transformer is null, there is no change to the
   output collection.

  input-collection - the collection to get the input from, may be null - `java.lang.Iterable`
  transformer - the transformer to use, may be null - `org.apache.commons.collections4.Transformer`
  output-collection - the collection to output into, may not be null if inputCollection and transformer are not null - `R`

  returns: the output collection with the transformed input added - `<I,O,R extends java.util.Collection<? super O>> R`

  throws: java.lang.NullPointerException - if the outputCollection is null and both, inputCollection and transformer are not null"
  ([^java.lang.Iterable input-collection ^org.apache.commons.collections4.Transformer transformer output-collection]
    (CollectionUtils/collect input-collection transformer output-collection))
  ([^java.lang.Iterable input-collection ^org.apache.commons.collections4.Transformer transformer]
    (CollectionUtils/collect input-collection transformer)))

(defn *transforming-collection
  "Returns a transformed bag backed by the given collection.

   Each object is passed through the transformer as it is added to the
   Collection. It is important not to use the original collection after invoking this
   method, as it is a backdoor for adding untransformed objects.


   Existing entries in the specified collection will not be transformed.
   If you want that behaviour, see TransformedCollection.transformedCollection(java.util.Collection<E>, org.apache.commons.collections4.Transformer<? super E, ? extends E>).

  collection - the collection to predicate, must not be null - `java.util.Collection`
  transformer - the transformer for the collection, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a transformed collection backed by the given collection - `<E> java.util.Collection<E>`

  throws: java.lang.NullPointerException - if the Collection or Transformer is null"
  ([^java.util.Collection collection ^org.apache.commons.collections4.Transformer transformer]
    (CollectionUtils/transformingCollection collection transformer)))

(defn *proper-sub-collection?
  "Returns true iff a is a proper sub-collection of b,
   that is, iff the cardinality of e in a is less
   than or equal to the cardinality of e in b,
   for each element e in a, and there is at least one
   element f such that the cardinality of f in b
   is strictly greater than the cardinality of f in a.

   The implementation assumes


      a.size() and b.size() represent the
      total cardinality of a and b, resp.
      a.size() < Integer.MAXVALUE

  a - the first (sub?) collection, must not be null - `java.util.Collection`
  b - the second (super?) collection, must not be null - `java.util.Collection`

  returns: true iff a is a proper sub-collection of b - `boolean`"
  (^Boolean [^java.util.Collection a ^java.util.Collection b]
    (CollectionUtils/isProperSubCollection a b)))

(defn *exists
  "Deprecated. since 4.1, use IterableUtils.matchesAny(Iterable, Predicate) instead

  input - the Iterable to get the input from, may be null - `java.lang.Iterable`
  predicate - the predicate to use, may be null - `org.apache.commons.collections4.Predicate`

  returns: true if at least one element of the collection matches the predicate - `<C> boolean`"
  ([^java.lang.Iterable input ^org.apache.commons.collections4.Predicate predicate]
    (CollectionUtils/exists input predicate)))

(defn *empty?
  "Null-safe check if the specified collection is empty.

   Null returns true.

  coll - the collection to check, may be null - `java.util.Collection`

  returns: true if empty or null - `boolean`"
  (^Boolean [^java.util.Collection coll]
    (CollectionUtils/isEmpty coll)))

(defn *size
  "Gets the size of the collection/iterator specified.

   This method can handles objects as follows


   Collection - the collection size
   Map - the map size
   Array - the array size
   Iterator - the number of elements remaining in the iterator
   Enumeration - the number of elements remaining in the enumeration

  object - the object to get the size of, may be null - `java.lang.Object`

  returns: the size of the specified collection or 0 if the object was null - `int`

  throws: java.lang.IllegalArgumentException - thrown if object is not recognized"
  (^Integer [^java.lang.Object object]
    (CollectionUtils/size object)))

(defn *retain-all
  "Returns a collection containing all the elements in
   collection that are also in retain. The
   cardinality of an element e in the returned collection is
   the same as the cardinality of e in collection
   unless retain does not contain e, in which case
   the cardinality is zero. This method is useful if you do not wish to
   modify the collection c and thus cannot call
   c.retainAll(retain);.

   Moreover this method uses an Equator instead of
   Object.equals(Object) to determine the equality of the elements
   in collection and retain. Hence this method is
   useful in cases where the equals behavior of an object needs to be
   modified without changing the object itself.

  collection - the collection whose contents are the target of the retainAll operation - `java.lang.Iterable`
  retain - the collection containing the elements to be retained in the returned collection - `java.lang.Iterable`
  equator - the Equator used for testing equality - `org.apache.commons.collections4.Equator`

  returns: a Collection containing all the elements of collection
   that occur at least once in retain according to the equator - `<E> java.util.Collection<E>`

  throws: java.lang.NullPointerException - if any of the parameters is null"
  ([^java.lang.Iterable collection ^java.lang.Iterable retain ^org.apache.commons.collections4.Equator equator]
    (CollectionUtils/retainAll collection retain equator))
  ([^java.util.Collection collection ^java.util.Collection retain]
    (CollectionUtils/retainAll collection retain)))

(defn *synchronized-collection
  "Deprecated. since 4.1, use Collections.synchronizedCollection(Collection) instead

  collection - the collection to synchronize, must not be null - `java.util.Collection`

  returns: a synchronized collection backed by the given collection - `<C> java.util.Collection<C>`

  throws: java.lang.NullPointerException - if the collection is null"
  ([^java.util.Collection collection]
    (CollectionUtils/synchronizedCollection collection)))

(defn *cardinality
  "Deprecated. since 4.1, use IterableUtils.frequency(Iterable, Object) instead.
     Be aware that the order of parameters has changed.

  obj - the object to find the cardinality of - `O`
  coll - the Iterable to search - `java.lang.Iterable`

  returns: the number of occurrences of obj in coll - `<O> int`

  throws: java.lang.NullPointerException - if coll is null"
  ([obj ^java.lang.Iterable coll]
    (CollectionUtils/cardinality obj coll)))

(defn *max-size
  "Get the maximum number of elements that the Collection can contain.

   This method uses the BoundedCollection interface to determine the
   maximum size. If the collection does not implement this interface then
   -1 is returned.


   The collection does not have to implement this interface directly.
   If the collection has been decorated using the decorators subpackage
   then these will be removed to access the BoundedCollection.

  coll - the collection to check - `java.util.Collection`

  returns: the maximum size of the BoundedCollection, -1 if no maximum size - `int`

  throws: java.lang.NullPointerException - if the collection is null"
  (^Integer [^java.util.Collection coll]
    (CollectionUtils/maxSize coll)))

(defn *size-is-empty
  "Checks if the specified collection/array/iterator is empty.

   This method can handles objects as follows


   Collection - via collection isEmpty
   Map - via map isEmpty
   Array - using array size
   Iterator - via hasNext
   Enumeration - via hasMoreElements


   Note: This method is named to avoid clashing with
   isEmpty(Collection).

  object - the object to get the size of, may be null - `java.lang.Object`

  returns: true if empty or null - `boolean`

  throws: java.lang.IllegalArgumentException - thrown if object is not recognized"
  (^Boolean [^java.lang.Object object]
    (CollectionUtils/sizeIsEmpty object)))

(defn *remove-all
  "Removes all elements in remove from collection.
   That is, this method returns a collection containing all the elements in
   collection that are not in remove. The
   cardinality of an element e in the returned collection is
   the same as the cardinality of e in collection
   unless remove contains e, in which case the
   cardinality is zero. This method is useful if you do not wish to modify
   the collection c and thus cannot call
   collection.removeAll(remove).

   Moreover this method uses an Equator instead of
   Object.equals(Object) to determine the equality of the elements
   in collection and remove. Hence this method is
   useful in cases where the equals behavior of an object needs to be
   modified without changing the object itself.

  collection - the collection from which items are removed (in the returned collection) - `java.lang.Iterable`
  remove - the items to be removed from the returned collection - `java.lang.Iterable`
  equator - the Equator used for testing equality - `org.apache.commons.collections4.Equator`

  returns: a Collection containing all the elements of collection
   except any element that if equal according to the equator - `<E> java.util.Collection<E>`

  throws: java.lang.NullPointerException - if any of the parameters is null"
  ([^java.lang.Iterable collection ^java.lang.Iterable remove ^org.apache.commons.collections4.Equator equator]
    (CollectionUtils/removeAll collection remove equator))
  ([^java.util.Collection collection ^java.util.Collection remove]
    (CollectionUtils/removeAll collection remove)))

(defn *get
  "Deprecated. since 4.1, use IteratorUtils.get(Iterator, int) instead

  iterator - the iterator to get a value from - `java.util.Iterator`
  index - the index to get - `int`

  returns: the object at the specified index - `<T> T`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^java.util.Iterator iterator ^Integer index]
    (CollectionUtils/get iterator index)))

(defn *count-matches
  "Deprecated. since 4.1, use IterableUtils.countMatches(Iterable, Predicate) instead

  input - the Iterable to get the input from, may be null - `java.lang.Iterable`
  predicate - the predicate to use, may be null - `org.apache.commons.collections4.Predicate`

  returns: the number of matches for the predicate in the collection - `<C> int`"
  ([^java.lang.Iterable input ^org.apache.commons.collections4.Predicate predicate]
    (CollectionUtils/countMatches input predicate)))

(defn *contains-all
  "Returns true iff all elements of coll2 are also contained
   in coll1. The cardinality of values in coll2 is not taken into account,
   which is the same behavior as Collection.containsAll(Collection).

   In other words, this method returns true iff the
   intersection(java.lang.Iterable<? extends O>, java.lang.Iterable<? extends O>) of coll1 and coll2 has the same cardinality as
   the set of unique values from coll2. In case coll2 is empty, true
   will be returned.


   This method is intended as a replacement for Collection.containsAll(Collection)
   with a guaranteed runtime complexity of O(n  m). Depending on the type of
   Collection provided, this method will be much faster than calling
   Collection.containsAll(Collection) instead, though this will come at the
   cost of an additional space complexity O(n).

  coll-1 - the first collection, must not be null - `java.util.Collection`
  coll-2 - the second collection, must not be null - `java.util.Collection`

  returns: true iff the intersection of the collections has the same cardinality
     as the set of unique elements from the second collection - `boolean`"
  (^Boolean [^java.util.Collection coll-1 ^java.util.Collection coll-2]
    (CollectionUtils/containsAll coll-1 coll-2)))

