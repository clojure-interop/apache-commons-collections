(ns org.apache.commons.collections4.ListUtils
  "Provides utility methods and decorators for List instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 ListUtils]))

(defn *longest-common-subsequence
  "Returns the longest common subsequence (LCS) of two sequences (lists).

  a - the first list - `java.util.List`
  b - the second list - `java.util.List`
  equator - the equator used to test object equality - `org.apache.commons.collections4.Equator`

  returns: the longest common subsequence - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if either list or the equator is null"
  ([^java.util.List a ^java.util.List b ^org.apache.commons.collections4.Equator equator]
    (ListUtils/longestCommonSubsequence a b equator))
  ([^java.util.List a ^java.util.List b]
    (ListUtils/longestCommonSubsequence a b)))

(defn *sum
  "Returns the sum of the given lists.  This is their intersection
   subtracted from their union.

  list-1 - the first list - `java.util.List`
  list-2 - the second list - `java.util.List`

  returns: a new list containing the sum of those lists - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if either list is null"
  ([^java.util.List list-1 ^java.util.List list-2]
    (ListUtils/sum list-1 list-2)))

(defn *union
  "Returns a new list containing the second list appended to the
   first list.  The List.addAll(Collection) operation is
   used to append the two given lists into a new list.

  list-1 - the first list - `java.util.List`
  list-2 - the second list - `java.util.List`

  returns: a new list containing the union of those lists - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if either list is null"
  ([^java.util.List list-1 ^java.util.List list-2]
    (ListUtils/union list-1 list-2)))

(defn *partition
  "Returns consecutive sublists of a
   list, each of the same size (the final list may be smaller). For example,
   partitioning a list containing [a, b, c, d, e] with a partition
   size of 3 yields [[a, b, c], [d, e]] -- an outer list containing
   two inner lists of three and two elements, all in the original order.

   The outer list is unmodifiable, but reflects the latest state of the
   source list. The inner lists are sublist views of the original list,
   produced on demand using List.subList(int, int), and are subject
   to all the usual caveats about modification as explained in that API.

   Adapted from http://code.google.com/p/guava-libraries/

  list - the list to return consecutive sublists of - `java.util.List`
  size - the desired size of each sublist (the last may be smaller) - `int`

  returns: a list of consecutive sublists - `<T> java.util.List<java.util.List<T>>`

  throws: java.lang.NullPointerException - if list is null"
  ([^java.util.List list ^Integer size]
    (ListUtils/partition list size)))

(defn *equal-list?
  "Tests two lists for value-equality as per the equality contract in
   List.equals(java.lang.Object).

   This method is useful for implementing List when you cannot
   extend AbstractList. The method takes Collection instances to enable other
   collection types to use the List implementation algorithm.

   The relevant text (slightly paraphrased as this is a static method) is:

   Compares the two list objects for equality.  Returns
   true if and only if both
   lists have the same size, and all corresponding pairs of elements in
   the two lists are equal.  (Two elements e1 and
   e2 are equal if (e1==null ? e2==null :
   e1.equals(e2)).)  In other words, two lists are defined to be
   equal if they contain the same elements in the same order.  This
   definition ensures that the equals method works properly across
   different implementations of the List interface.


   Note: The behaviour of this method is undefined if the lists are
   modified during the equals comparison.

  list-1 - the first list, may be null - `java.util.Collection`
  list-2 - the second list, may be null - `java.util.Collection`

  returns: whether the lists are equal by value comparison - `boolean`"
  (^Boolean [^java.util.Collection list-1 ^java.util.Collection list-2]
    (ListUtils/isEqualList list-1 list-2)))

(defn *hash-code-for-list
  "Generates a hash code using the algorithm specified in
   List.hashCode().

   This method is useful for implementing List when you cannot
   extend AbstractList. The method takes Collection instances to enable other
   collection types to use the List implementation algorithm.

  list - the list to generate the hashCode for, may be null - `java.util.Collection`

  returns: the hash code - `int`"
  (^Integer [^java.util.Collection list]
    (ListUtils/hashCodeForList list)))

(defn *lazy-list
  "Returns a \"lazy\" list whose elements will be created on demand.

   When the index passed to the returned list's get
   method is greater than the list's size, then the factory will be used
   to create a new object and that object will be inserted at that index.

   For instance:



   Factory<Date> factory = new Factory<Date>() {
       public Date create() {
           return new Date();
       }
   }
   List<Date> lazy = ListUtils.lazyList(new ArrayList<Date>(), factory);
   Date date = lazy.get(3);

   After the above code is executed, date will refer to
   a new Date instance. Furthermore, that Date
   instance is the fourth element in the list.  The first, second,
   and third element are all set to null.

  list - the list to make lazy, must not be null - `java.util.List`
  factory - the factory for creating new objects, must not be null - `org.apache.commons.collections4.Factory`

  returns: a lazy list backed by the given list - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if the List or Factory is null"
  ([^java.util.List list ^org.apache.commons.collections4.Factory factory]
    (ListUtils/lazyList list factory)))

(defn *unmodifiable-list
  "Returns an unmodifiable list backed by the given list.

   This method uses the implementation in the decorators subpackage.

  list - the list to make unmodifiable, must not be null - `java.util.List`

  returns: an unmodifiable list backed by the given list - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if the list is null"
  ([^java.util.List list]
    (ListUtils/unmodifiableList list)))

(defn *empty-if-null
  "Returns an immutable empty list if the argument is null,
   or the argument itself otherwise.

  list - the list, possibly null - `java.util.List`

  returns: an empty list if the argument is null - `<T> java.util.List<T>`"
  ([^java.util.List list]
    (ListUtils/emptyIfNull list)))

(defn *subtract
  "Subtracts all elements in the second list from the first list,
   placing the results in a new list.

   This differs from List.removeAll(Collection) in that
   cardinality is respected; if list1 contains two
   occurrences of null and list2 only
   contains one occurrence, then the returned list will still contain
   one occurrence.

  list-1 - the list to subtract from - `java.util.List`
  list-2 - the list to subtract - `java.util.List`

  returns: a new list containing the results - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if either list is null"
  ([^java.util.List list-1 ^java.util.List list-2]
    (ListUtils/subtract list-1 list-2)))

(defn *select
  "Selects all elements from input collection which match the given
   predicate into an output list.

   A null predicate matches no elements.

  input-collection - the collection to get the input from, may not be null - `java.util.Collection`
  predicate - the predicate to use, may be null - `org.apache.commons.collections4.Predicate`

  returns: the elements matching the predicate (new list) - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if the input list is null"
  ([^java.util.Collection input-collection ^org.apache.commons.collections4.Predicate predicate]
    (ListUtils/select input-collection predicate)))

(defn *select-rejected
  "Selects all elements from inputCollection which don't match the given
   predicate into an output collection.

   If the input predicate is null, the result is an empty list.

  input-collection - the collection to get the input from, may not be null - `java.util.Collection`
  predicate - the predicate to use, may be null - `org.apache.commons.collections4.Predicate`

  returns: the elements not matching the predicate (new list) - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if the input collection is null"
  ([^java.util.Collection input-collection ^org.apache.commons.collections4.Predicate predicate]
    (ListUtils/selectRejected input-collection predicate)))

(defn *fixed-size-list
  "Returns a fixed-sized list backed by the given list.
   Elements may not be added or removed from the returned list, but
   existing elements can be changed (for instance, via the
   List.set(int, Object) method).

  list - the list whose size to fix, must not be null - `java.util.List`

  returns: a fixed-size list backed by that list - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if the List is null"
  ([^java.util.List list]
    (ListUtils/fixedSizeList list)))

(defn *intersection
  "Returns a new list containing all elements that are contained in
   both given lists.

  list-1 - the first list - `java.util.List`
  list-2 - the second list - `java.util.List`

  returns: the intersection of those two lists - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if either list is null"
  ([^java.util.List list-1 ^java.util.List list-2]
    (ListUtils/intersection list-1 list-2)))

(defn *predicated-list
  "Returns a predicated (validating) list backed by the given list.

   Only objects that pass the test in the given predicate can be added to the list.
   Trying to add an invalid object results in an IllegalArgumentException.
   It is important not to use the original list after invoking this method,
   as it is a backdoor for adding invalid objects.

  list - the list to predicate, must not be null - `java.util.List`
  predicate - the predicate for the list, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a predicated list backed by the given list - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if the List or Predicate is null"
  ([^java.util.List list ^org.apache.commons.collections4.Predicate predicate]
    (ListUtils/predicatedList list predicate)))

(defn *synchronized-list
  "Returns a synchronized list backed by the given list.

   You must manually synchronize on the returned list's iterator to
   avoid non-deterministic behavior:



   List list = ListUtils.synchronizedList(myList);
   synchronized (list) {
       Iterator i = list.iterator();
       while (i.hasNext()) {
           process (i.next());
       }
   }

   This method is just a wrapper for Collections.synchronizedList(List).

  list - the list to synchronize, must not be null - `java.util.List`

  returns: a synchronized list backed by the given list - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if the list is null"
  ([^java.util.List list]
    (ListUtils/synchronizedList list)))

(defn *transformed-list
  "Returns a transformed list backed by the given list.

   This method returns a new list (decorating the specified list) that
   will transform any new entries added to it.
   Existing entries in the specified list will not be transformed.

   Each object is passed through the transformer as it is added to the
   List. It is important not to use the original list after invoking this
   method, as it is a backdoor for adding untransformed objects.

   Existing entries in the specified list will not be transformed.
   If you want that behaviour, see TransformedList.transformedList(java.util.List<E>, org.apache.commons.collections4.Transformer<? super E, ? extends E>).

  list - the list to predicate, must not be null - `java.util.List`
  transformer - the transformer for the list, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a transformed list backed by the given list - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if the List or Transformer is null"
  ([^java.util.List list ^org.apache.commons.collections4.Transformer transformer]
    (ListUtils/transformedList list transformer)))

(defn *retain-all
  "Returns a List containing all the elements in collection
   that are also in retain. The cardinality of an element e
   in the returned list is the same as the cardinality of e
   in collection unless retain does not contain e, in which
   case the cardinality is zero. This method is useful if you do not wish to modify
   the collection c and thus cannot call collection.retainAll(retain);.

   This implementation iterates over collection, checking each element in
   turn to see if it's contained in retain. If it's contained, it's added
   to the returned list. As a consequence, it is advised to use a collection type for
   retain that provides a fast (e.g. O(1)) implementation of
   Collection.contains(Object).

  collection - the collection whose contents are the target of the #retailAll operation - `java.util.Collection`
  retain - the collection containing the elements to be retained in the returned collection - `java.util.Collection`

  returns: a List containing all the elements of c
   that occur at least once in retain. - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if either parameter is null"
  ([^java.util.Collection collection ^java.util.Collection retain]
    (ListUtils/retainAll collection retain)))

(defn *index-of
  "Finds the first index in the given List which matches the given predicate.

   If the input List or predicate is null, or no element of the List
   matches the predicate, -1 is returned.

  list - the List to search, may be null - `java.util.List`
  predicate - the predicate to use, may be null - `org.apache.commons.collections4.Predicate`

  returns: the first index of an Object in the List which matches the predicate or -1 if none could be found - `<E> int`"
  ([^java.util.List list ^org.apache.commons.collections4.Predicate predicate]
    (ListUtils/indexOf list predicate)))

(defn *remove-all
  "Removes the elements in remove from collection. That is, this
   method returns a list containing all the elements in collection
   that are not in remove. The cardinality of an element e
   in the returned collection is the same as the cardinality of e
   in collection unless remove contains e, in which
   case the cardinality is zero. This method is useful if you do not wish to modify
   collection and thus cannot call collection.removeAll(remove);.

   This implementation iterates over collection, checking each element in
   turn to see if it's contained in remove. If it's not contained, it's added
   to the returned list. As a consequence, it is advised to use a collection type for
   remove that provides a fast (e.g. O(1)) implementation of
   Collection.contains(Object).

  collection - the collection from which items are removed (in the returned collection) - `java.util.Collection`
  remove - the items to be removed from the returned collection - `java.util.Collection`

  returns: a List containing all the elements of c except
   any elements that also occur in remove. - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if either parameter is null"
  ([^java.util.Collection collection ^java.util.Collection remove]
    (ListUtils/removeAll collection remove)))

(defn *default-if-null
  "Returns either the passed in list, or if the list is null,
   the value of defaultList.

  list - the list, possibly null - `java.util.List`
  default-list - the returned values if list is null - `java.util.List`

  returns: an empty list if the argument is null - `<T> java.util.List<T>`"
  ([^java.util.List list ^java.util.List default-list]
    (ListUtils/defaultIfNull list default-list)))

