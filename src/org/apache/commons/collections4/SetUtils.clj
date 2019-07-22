(ns org.apache.commons.collections4.SetUtils
  "Provides utility methods and decorators for
  Set and SortedSet instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 SetUtils]))

(def *-empty-sorted-set
  "Static Constant.

  An empty unmodifiable sorted set.
   This is not provided in the JDK.

  type: java.util.SortedSet"
  SetUtils/EMPTY_SORTED_SET)

(defn *transformed-sorted-set
  "Returns a transformed sorted set backed by the given set.

   Each object is passed through the transformer as it is added to the
   Set. It is important not to use the original set after invoking this
   method, as it is a backdoor for adding untransformed objects.

   Existing entries in the specified set will not be transformed.
   If you want that behaviour, see TransformedSortedSet.transformedSortedSet(java.util.SortedSet<E>, org.apache.commons.collections4.Transformer<? super E, ? extends E>).

  set - the set to transform, must not be null - `java.util.SortedSet`
  transformer - the transformer for the set, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a transformed set backed by the given set - `<E> java.util.SortedSet<E>`

  throws: java.lang.NullPointerException - if the set or transformer is null"
  ([^java.util.SortedSet set ^org.apache.commons.collections4.Transformer transformer]
    (SetUtils/transformedSortedSet set transformer)))

(defn *synchronized-sorted-set
  "Returns a synchronized sorted set backed by the given sorted set.

   You must manually synchronize on the returned set's iterator to
   avoid non-deterministic behavior:



   Set s = SetUtils.synchronizedSortedSet(mySet);
   synchronized (s) {
       Iterator i = s.iterator();
       while (i.hasNext()) {
           process (i.next());
       }
   }

   This method is just a wrapper for Collections.synchronizedSortedSet(SortedSet).

  set - the sorted set to synchronize, must not be null - `java.util.SortedSet`

  returns: a synchronized set backed by the given set - `<E> java.util.SortedSet<E>`

  throws: java.lang.NullPointerException - if the set is null"
  ([^java.util.SortedSet set]
    (SetUtils/synchronizedSortedSet set)))

(defn *disjunction
  "Returns a unmodifiable view of the symmetric difference of the given
   Sets.

   The returned view contains all elements of a and b that are
   not a member of the other set.

   This is equivalent to union(difference(a, b), difference(b, a)).

  a - the first set, must not be null - `java.util.Set`
  b - the second set, must not be null - `java.util.Set`

  returns: a view of the symmetric difference of the two sets - `<E> org.apache.commons.collections4.SetUtils$SetView<E>`"
  ([^java.util.Set a ^java.util.Set b]
    (SetUtils/disjunction a b)))

(defn *hash-set
  "Creates a set from the given items. If the passed var-args argument is null, then the method returns null.

  items - the elements that make up the new set - `E`

  returns: a set - `<E> java.util.HashSet<E>`"
  ([items]
    (SetUtils/hashSet items)))

(defn *transformed-set
  "Returns a transformed set backed by the given set.

   Each object is passed through the transformer as it is added to the
   Set. It is important not to use the original set after invoking this
   method, as it is a backdoor for adding untransformed objects.

   Existing entries in the specified set will not be transformed.
   If you want that behaviour, see TransformedSet.transformedSet(java.util.Set<E>, org.apache.commons.collections4.Transformer<? super E, ? extends E>).

  set - the set to transform, must not be null - `java.util.Set`
  transformer - the transformer for the set, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a transformed set backed by the given set - `<E> java.util.Set<E>`

  throws: java.lang.NullPointerException - if the set or transformer is null"
  ([^java.util.Set set ^org.apache.commons.collections4.Transformer transformer]
    (SetUtils/transformedSet set transformer)))

(defn *union
  "Returns a unmodifiable view of the union of the given Sets.

   The returned view contains all elements of a and b.

  a - the first set, must not be null - `java.util.Set`
  b - the second set, must not be null - `java.util.Set`

  returns: a view of the union of the two set - `<E> org.apache.commons.collections4.SetUtils$SetView<E>`

  throws: java.lang.NullPointerException - if either input set is null"
  ([^java.util.Set a ^java.util.Set b]
    (SetUtils/union a b)))

(defn *unmodifiable-sorted-set
  "Returns an unmodifiable sorted set backed by the given sorted set.

   This method uses the implementation in the decorators subpackage.

  set - the sorted set to make unmodifiable, must not be null - `java.util.SortedSet`

  returns: an unmodifiable set backed by the given set - `<E> java.util.SortedSet<E>`

  throws: java.lang.NullPointerException - if the set is null"
  ([^java.util.SortedSet set]
    (SetUtils/unmodifiableSortedSet set)))

(defn *synchronized-set
  "Returns a synchronized set backed by the given set.

   You must manually synchronize on the returned set's iterator to
   avoid non-deterministic behavior:



   Set s = SetUtils.synchronizedSet(mySet);
   synchronized (s) {
       Iterator i = s.iterator();
       while (i.hasNext()) {
           process (i.next());
       }
   }

   This method is just a wrapper for Collections.synchronizedSet(Set).

  set - the set to synchronize, must not be null - `java.util.Set`

  returns: a synchronized set backed by the given set - `<E> java.util.Set<E>`

  throws: java.lang.NullPointerException - if the set is null"
  ([^java.util.Set set]
    (SetUtils/synchronizedSet set)))

(defn *new-identity-hash-set
  "Returns a new hash set that matches elements based on == not
   equals().

   This set will violate the detail of various Set contracts.
   As a general rule, don't compare this set to other sets. In particular, you can't
   use decorators like ListOrderedSet on it, which silently assume that these
   contracts are fulfilled.

   Note that the returned set is not synchronized and is not thread-safe.
   If you wish to use this set from multiple threads concurrently, you must use
   appropriate synchronization. The simplest approach is to wrap this map
   using Collections.synchronizedSet(Set). This class may throw
   exceptions when accessed by concurrent threads without synchronization.

  returns: a new identity hash set - `<E> java.util.Set<E>`"
  ([]
    (SetUtils/newIdentityHashSet )))

(defn *empty-if-null
  "Returns an immutable empty set if the argument is null,
   or the argument itself otherwise.

  set - the set, possibly null - `java.util.Set`

  returns: an empty set if the argument is null - `<T> java.util.Set<T>`"
  ([^java.util.Set set]
    (SetUtils/emptyIfNull set)))

(defn *empty-set
  "Get a typed empty unmodifiable Set.

  returns: an empty Set - `<E> java.util.Set<E>`"
  ([]
    (SetUtils/emptySet )))

(defn *intersection
  "Returns a unmodifiable view of the intersection of the given Sets.

   The returned view contains all elements that are members of both input sets
   (a and b).

  a - the first set, must not be null - `java.util.Set`
  b - the second set, must not be null - `java.util.Set`

  returns: a view of the intersection of the two sets - `<E> org.apache.commons.collections4.SetUtils$SetView<E>`"
  ([^java.util.Set a ^java.util.Set b]
    (SetUtils/intersection a b)))

(defn *equal-set?
  "Tests two sets for equality as per the equals() contract
   in Set.equals(java.lang.Object).

   This method is useful for implementing Set when you cannot
   extend AbstractSet. The method takes Collection instances to enable other
   collection types to use the Set implementation algorithm.

   The relevant text (slightly paraphrased as this is a static method) is:

   Two sets are considered equal if they have
   the same size, and every member of the first set is contained in
   the second. This ensures that the equals method works
   properly across different implementations of the Set
   interface.


   This implementation first checks if the two sets are the same object:
   if so it returns true.  Then, it checks if the two sets are
   identical in size; if not, it returns false. If so, it returns
   a.containsAll((Collection) b).

  set-1 - the first set, may be null - `java.util.Collection`
  set-2 - the second set, may be null - `java.util.Collection`

  returns: whether the sets are equal by value comparison - `boolean`"
  (^Boolean [^java.util.Collection set-1 ^java.util.Collection set-2]
    (SetUtils/isEqualSet set-1 set-2)))

(defn *predicated-navigable-set
  "Returns a predicated (validating) navigable set backed by the given navigable set.

   Only objects that pass the test in the given predicate can be added to the set.
   Trying to add an invalid object results in an IllegalArgumentException.
   It is important not to use the original set after invoking this method,
   as it is a backdoor for adding invalid objects.

  set - the navigable set to predicate, must not be null - `java.util.NavigableSet`
  predicate - the predicate for the navigable set, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a predicated navigable set backed by the given navigable set - `<E> java.util.SortedSet<E>`

  throws: java.lang.NullPointerException - if the set or predicate is null"
  ([^java.util.NavigableSet set ^org.apache.commons.collections4.Predicate predicate]
    (SetUtils/predicatedNavigableSet set predicate)))

(defn *hash-code-for-set
  "Generates a hash code using the algorithm specified in
   Set.hashCode().

   This method is useful for implementing Set when you cannot
   extend AbstractSet. The method takes Collection instances to enable other
   collection types to use the Set implementation algorithm.

  set - the set to calculate the hash code for, may be null - `java.util.Collection`

  returns: the hash code - `<T> int`"
  ([^java.util.Collection set]
    (SetUtils/hashCodeForSet set)))

(defn *ordered-set
  "Returns a set that maintains the order of elements that are added
   backed by the given set.

   If an element is added twice, the order is determined by the first add.
   The order is observed through the iterator or toArray.

  set - the set to order, must not be null - `java.util.Set`

  returns: an ordered set backed by the given set - `<E> java.util.Set<E>`

  throws: java.lang.NullPointerException - if the set is null"
  ([^java.util.Set set]
    (SetUtils/orderedSet set)))

(defn *predicated-set
  "Returns a predicated (validating) set backed by the given set.

   Only objects that pass the test in the given predicate can be added to the set.
   Trying to add an invalid object results in an IllegalArgumentException.
   It is important not to use the original set after invoking this method,
   as it is a backdoor for adding invalid objects.

  set - the set to predicate, must not be null - `java.util.Set`
  predicate - the predicate for the set, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a predicated set backed by the given set - `<E> java.util.Set<E>`

  throws: java.lang.NullPointerException - if the set or predicate is null"
  ([^java.util.Set set ^org.apache.commons.collections4.Predicate predicate]
    (SetUtils/predicatedSet set predicate)))

(defn *unmodifiable-navigable-set
  "Returns an unmodifiable navigable set backed by the given navigable set.

   This method uses the implementation in the decorators subpackage.

  set - the navigable set to make unmodifiable, must not be null - `java.util.NavigableSet`

  returns: an unmodifiable set backed by the given set - `<E> java.util.SortedSet<E>`

  throws: java.lang.NullPointerException - if the set is null"
  ([^java.util.NavigableSet set]
    (SetUtils/unmodifiableNavigableSet set)))

(defn *transformed-navigable-set
  "Returns a transformed navigable set backed by the given navigable set.

   Each object is passed through the transformer as it is added to the
   Set. It is important not to use the original set after invoking this
   method, as it is a backdoor for adding untransformed objects.

   Existing entries in the specified set will not be transformed.
   If you want that behaviour, see TransformedNavigableSet.transformedNavigableSet(java.util.NavigableSet<E>, org.apache.commons.collections4.Transformer<? super E, ? extends E>).

  set - the navigable set to transform, must not be null - `java.util.NavigableSet`
  transformer - the transformer for the set, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a transformed set backed by the given set - `<E> java.util.SortedSet<E>`

  throws: java.lang.NullPointerException - if the set or transformer is null"
  ([^java.util.NavigableSet set ^org.apache.commons.collections4.Transformer transformer]
    (SetUtils/transformedNavigableSet set transformer)))

(defn *difference
  "Returns a unmodifiable view containing the difference of the given
   Sets, denoted by a \\ b (or a - b).

   The returned view contains all elements of a that are not a member
   of b.

  a - the set to subtract from, must not be null - `java.util.Set`
  b - the set to subtract, must not be null - `java.util.Set`

  returns: a view of the relative complement of  of the two sets - `<E> org.apache.commons.collections4.SetUtils$SetView<E>`"
  ([^java.util.Set a ^java.util.Set b]
    (SetUtils/difference a b)))

(defn *predicated-sorted-set
  "Returns a predicated (validating) sorted set backed by the given sorted set.

   Only objects that pass the test in the given predicate can be added to the set.
   Trying to add an invalid object results in an IllegalArgumentException.
   It is important not to use the original set after invoking this method,
   as it is a backdoor for adding invalid objects.

  set - the sorted set to predicate, must not be null - `java.util.SortedSet`
  predicate - the predicate for the sorted set, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a predicated sorted set backed by the given sorted set - `<E> java.util.SortedSet<E>`

  throws: java.lang.NullPointerException - if the set or predicate is null"
  ([^java.util.SortedSet set ^org.apache.commons.collections4.Predicate predicate]
    (SetUtils/predicatedSortedSet set predicate)))

(defn *empty-sorted-set
  "Get a typed empty unmodifiable sorted set.

  returns: an empty sorted Set - `<E> java.util.SortedSet<E>`"
  ([]
    (SetUtils/emptySortedSet )))

(defn *unmodifiable-set
  "Creates an unmodifiable set from the given items. If the passed var-args argument is null, then the method returns null.

  items - the elements that make up the new set - `E`

  returns: a set - `<E> java.util.Set<E>`"
  ([items]
    (SetUtils/unmodifiableSet items)))

