(ns org.apache.commons.collections4.IterableUtils
  "Provides utility methods and decorators for Iterable instances.

  Note: this util class has been designed for fail-fast argument checking.



  all decorator methods are NOT null-safe wrt the provided Iterable argument, i.e.
  they will throw a NullPointerException if a null Iterable is passed as argument.

  all other utility methods are null-safe wrt the provided Iterable argument, i.e. they will
  treat a null Iterable the same way as an empty one. Other arguments which are null,
  e.g. a Predicate, will result in a NullPointerException. Exception: passing
  a null Comparator is equivalent to a Comparator with natural ordering."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 IterableUtils]))

(defn ->iterable-utils
  "Constructor."
  (^IterableUtils []
    (new IterableUtils )))

(defn *for-each
  "Applies the closure to each element of the provided iterable.

  iterable - the iterator to use, may be null - `java.lang.Iterable`
  closure - the closure to apply to each element, may not be null - `org.apache.commons.collections4.Closure`

  returns: `<E> void`

  throws: java.lang.NullPointerException - if closure is null"
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Closure closure]
    (IterableUtils/forEach iterable closure)))

(defn *matches-any
  "Answers true if a predicate is true for any element of the iterable.

   A null or empty iterable returns false.

  iterable - the Iterable to use, may be null - `java.lang.Iterable`
  predicate - the predicate to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: true if any element of the collection matches the predicate, false otherwise - `<E> boolean`

  throws: java.lang.NullPointerException - if predicate is null"
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Predicate predicate]
    (IterableUtils/matchesAny iterable predicate)))

(defn *unique-iterable
  "Returns a unique view of the given iterable.

   The returned iterable's iterator supports remove() when the
   corresponding input iterator supports it. Calling remove()
   will only remove a single element from the underlying iterator.

  iterable - the iterable to use, may not be null - `java.lang.Iterable`

  returns: a unique view of the specified iterable - `<E> java.lang.Iterable<E>`

  throws: java.lang.NullPointerException - if iterable is null"
  ([^java.lang.Iterable iterable]
    (IterableUtils/uniqueIterable iterable)))

(defn *reversed-iterable
  "Returns a reversed view of the given iterable.

   In case the provided iterable is a List instance, a
   ReverseListIterator will be used to reverse the traversal
   order, otherwise an intermediate List needs to be created.

   The returned iterable's iterator supports remove() if the
   provided iterable is a List instance.

  iterable - the iterable to use, may not be null - `java.lang.Iterable`

  returns: a reversed view of the specified iterable - `<E> java.lang.Iterable<E>`

  throws: java.lang.NullPointerException - if iterable is null"
  ([^java.lang.Iterable iterable]
    (IterableUtils/reversedIterable iterable)))

(defn *find
  "Finds the first element in the given iterable which matches the given predicate.

   A null or empty iterator returns null.

  iterable - the iterable to search, may be null - `java.lang.Iterable`
  predicate - the predicate to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the first element of the iterable which matches the predicate or null if none could be found - `<E> E`

  throws: java.lang.NullPointerException - if predicate is null"
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Predicate predicate]
    (IterableUtils/find iterable predicate)))

(defn *unmodifiable-iterable
  "Returns an unmodifiable view of the given iterable.

   The returned iterable's iterator does not support remove().

  iterable - the iterable to use, may not be null - `java.lang.Iterable`

  returns: an unmodifiable view of the specified iterable - `<E> java.lang.Iterable<E>`

  throws: java.lang.NullPointerException - if iterable is null"
  ([^java.lang.Iterable iterable]
    (IterableUtils/unmodifiableIterable iterable)))

(defn *zipping-iterable
  "Interleaves two iterables into a single iterable.

   The returned iterable has an iterator that traverses the elements in a
   and b in alternating order. The source iterators are not polled until
   necessary.

   The returned iterable's iterator supports remove() when the corresponding
   input iterator supports it.

  a - the first iterable, may not be null - `java.lang.Iterable`
  b - the second iterable, may not be null - `java.lang.Iterable`

  returns: a new iterable, interleaving the provided iterables - `<E> java.lang.Iterable<E>`

  throws: java.lang.NullPointerException - if either a or b is null"
  ([^java.lang.Iterable a ^java.lang.Iterable b]
    (IterableUtils/zippingIterable a b)))

(defn *contains
  "Checks if the object is contained in the given iterable. Object equality
   is tested with an equator unlike contains(Iterable, Object)
   which uses Object.equals(Object).

   A null or empty iterable returns false.
   A null object will not be passed to the equator, instead a
   NullPredicate
   will be used.

  iterable - the iterable to check, may be null - `java.lang.Iterable`
  object - the object to check - `E`
  equator - the equator to use to check, may not be null - `org.apache.commons.collections4.Equator`

  returns: true if the object is contained in the iterable, false otherwise - `<E> boolean`

  throws: java.lang.NullPointerException - if equator is null"
  ([^java.lang.Iterable iterable object ^org.apache.commons.collections4.Equator equator]
    (IterableUtils/contains iterable object equator))
  ([^java.lang.Iterable iterable ^java.lang.Object object]
    (IterableUtils/contains iterable object)))

(defn *partition
  "Partitions all elements from iterable into separate output collections,
   based on the evaluation of the given predicates.

   For each predicate, the returned list will contain a collection holding
   all elements of the input iterable matching the predicate. The last collection
   contained in the list will hold all elements which didn't match any predicate:


    [C1, C2, R] = partition(I, P1, P2) with
    I = input
    P1 = first predicate
    P2 = second predicate
    C1 = collection of elements matching P1
    C2 = collection of elements matching P2
    R = collection of elements rejected by all predicates

   Note: elements are only added to the output collection of the first matching
   predicate, determined by the order of arguments.

   If the input iterable is null, the same is returned as for an
   empty iterable.
   If no predicates have been provided, all elements of the input collection
   will be added to the rejected collection.

   Example: for an input list [1, 2, 3, 4, 5] calling partition with predicates [x < 3]
   and [x < 5] will result in the following output: [[1, 2], [3, 4], [5]].

  iterable - the collection to get the input from, may be null - `java.lang.Iterable`
  partition-factory - the factory used to create the output collections - `org.apache.commons.collections4.Factory`
  predicates - the predicates to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: a list containing the output collections - `<O,R extends java.util.Collection<O>> java.util.List<R>`

  throws: java.lang.NullPointerException - if any predicate is null"
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Factory partition-factory ^org.apache.commons.collections4.Predicate predicates]
    (IterableUtils/partition iterable partition-factory predicates))
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Predicate predicate]
    (IterableUtils/partition iterable predicate)))

(defn *to-string
  "Returns a string representation of the elements of the specified iterable.

   The string representation consists of a list of the iterable's elements,
   enclosed by the provided prefix and suffix. Adjacent elements
   are separated by the provided delimiter. Elements are converted to
   strings as by using the provided transformer.

  iterable - the iterable to convert to a string, may be null - `java.lang.Iterable`
  transformer - the transformer used to get a string representation of an element - `org.apache.commons.collections4.Transformer`
  delimiter - the string to delimit elements - `java.lang.String`
  prefix - the prefix, prepended to the string representation - `java.lang.String`
  suffix - the suffix, appended to the string representation - `java.lang.String`

  returns: a string representation of iterable - `<E> java.lang.String`

  throws: java.lang.NullPointerException - if either transformer, delimiter, prefix or suffix is null"
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Transformer transformer ^java.lang.String delimiter ^java.lang.String prefix ^java.lang.String suffix]
    (IterableUtils/toString iterable transformer delimiter prefix suffix))
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Transformer transformer]
    (IterableUtils/toString iterable transformer))
  ([^java.lang.Iterable iterable]
    (IterableUtils/toString iterable)))

(defn *transformed-iterable
  "Returns a transformed view of the given iterable where all of its elements
   have been transformed by the provided transformer.

   The returned iterable's iterator supports remove() when the corresponding
   input iterator supports it.

  iterable - the iterable to transform, may not be null - `java.lang.Iterable`
  transformer - the transformer, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a transformed view of the specified iterable - `<I,O> java.lang.Iterable<O>`

  throws: java.lang.NullPointerException - if either iterable or transformer is null"
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Transformer transformer]
    (IterableUtils/transformedIterable iterable transformer)))

(defn *matches-all
  "Answers true if a predicate is true for every element of an iterable.

   A null or empty iterable returns true.

  iterable - the Iterable to use, may be null - `java.lang.Iterable`
  predicate - the predicate to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: true if every element of the collection matches the predicate or if the
     collection is empty, false otherwise - `<E> boolean`

  throws: java.lang.NullPointerException - if predicate is null"
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Predicate predicate]
    (IterableUtils/matchesAll iterable predicate)))

(defn *collated-iterable
  "Combines the two provided iterables into an ordered iterable using the
   provided comparator. If the comparator is null, natural ordering will be
   used.

   The returned iterable's iterator supports remove() when the
   corresponding input iterator supports it.

  comparator - the comparator defining an ordering over the elements, may be null, in which case natural ordering will be used - `java.util.Comparator`
  a - the first iterable, may not be null - `java.lang.Iterable`
  b - the second iterable, may not be null - `java.lang.Iterable`

  returns: a filtered view on the specified iterable - `<E> java.lang.Iterable<E>`

  throws: java.lang.NullPointerException - if either of the provided iterables is null"
  ([^java.util.Comparator comparator ^java.lang.Iterable a ^java.lang.Iterable b]
    (IterableUtils/collatedIterable comparator a b))
  ([^java.lang.Iterable a ^java.lang.Iterable b]
    (IterableUtils/collatedIterable a b)))

(defn *to-list
  "Gets a new list with the contents of the provided iterable.

  iterable - the iterable to use, may be null - `java.lang.Iterable`

  returns: a list of the iterator contents - `<E> java.util.List<E>`"
  ([^java.lang.Iterable iterable]
    (IterableUtils/toList iterable)))

(defn *empty-if-null
  "Returns an immutable empty iterable if the argument is null,
   or the argument itself otherwise.

  iterable - the iterable, may be null - `java.lang.Iterable`

  returns: an empty iterable if the argument is null - `<E> java.lang.Iterable<E>`"
  ([^java.lang.Iterable iterable]
    (IterableUtils/emptyIfNull iterable)))

(defn *for-each-but-last
  "Executes the given closure on each but the last element in the iterable.

   If the input iterable is null no change is made.

  iterable - the iterable to get the input from, may be null - `java.lang.Iterable`
  closure - the closure to perform, may not be null - `org.apache.commons.collections4.Closure`

  returns: the last element in the iterable, or null if iterable is null or empty - `<E> E`"
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Closure closure]
    (IterableUtils/forEachButLast iterable closure)))

(defn *skipping-iterable
  "Returns a view of the given iterable that skips the first N elements.

   The returned iterable's iterator supports remove() when the corresponding
   input iterator supports it.

  iterable - the iterable to use, may not be null - `java.lang.Iterable`
  elements-to-skip - the number of elements to skip from the start, must not be negative - `long`

  returns: a view of the specified iterable, skipping the first N elements - `<E> java.lang.Iterable<E>`

  throws: java.lang.IllegalArgumentException - if elementsToSkip is negative"
  ([^java.lang.Iterable iterable ^Long elements-to-skip]
    (IterableUtils/skippingIterable iterable elements-to-skip)))

(defn *chained-iterable
  "Combines four iterables into a single iterable.

   The returned iterable has an iterator that traverses the elements in a,
   followed by the elements in b, c and d. The source
   iterators are not polled until necessary.

   The returned iterable's iterator supports remove() when the corresponding
   input iterator supports it.

  a - the first iterable, may not be null - `java.lang.Iterable`
  b - the second iterable, may not be null - `java.lang.Iterable`
  c - the third iterable, may not be null - `java.lang.Iterable`
  d - the fourth iterable, may not be null - `java.lang.Iterable`

  returns: a new iterable, combining the provided iterables - `<E> java.lang.Iterable<E>`

  throws: java.lang.NullPointerException - if either of the provided iterables is null"
  ([^java.lang.Iterable a ^java.lang.Iterable b ^java.lang.Iterable c ^java.lang.Iterable d]
    (IterableUtils/chainedIterable a b c d))
  ([^java.lang.Iterable a ^java.lang.Iterable b ^java.lang.Iterable c]
    (IterableUtils/chainedIterable a b c))
  ([^java.lang.Iterable a ^java.lang.Iterable b]
    (IterableUtils/chainedIterable a b))
  ([^java.lang.Iterable iterables]
    (IterableUtils/chainedIterable iterables)))

(defn *empty?
  "Answers true if the provided iterable is empty.

   A null iterable returns true.

  iterable - the to use, may be null - `java.lang.Iterable`

  returns: true if the iterable is null or empty, false otherwise - `boolean`"
  (^Boolean [^java.lang.Iterable iterable]
    (IterableUtils/isEmpty iterable)))

(defn *size
  "Returns the number of elements contained in the given iterator.

   A null or empty iterator returns 0.

  iterable - the iterable to check, may be null - `java.lang.Iterable`

  returns: the number of elements contained in the iterable - `int`"
  (^Integer [^java.lang.Iterable iterable]
    (IterableUtils/size iterable)))

(defn *empty-iterable
  "Gets an empty iterable.

   This iterable does not contain any elements.

  returns: an empty iterable - `<E> java.lang.Iterable<E>`"
  ([]
    (IterableUtils/emptyIterable )))

(defn *index-of
  "Returns the index of the first element in the specified iterable that
   matches the given predicate.

   A null or empty iterable returns -1.

  iterable - the iterable to search, may be null - `java.lang.Iterable`
  predicate - the predicate to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the index of the first element which matches the predicate or -1 if none matches - `<E> int`

  throws: java.lang.NullPointerException - if predicate is null"
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Predicate predicate]
    (IterableUtils/indexOf iterable predicate)))

(defn *bounded-iterable
  "Returns a view of the given iterable that contains at most the given number
   of elements.

   The returned iterable's iterator supports remove() when the corresponding
   input iterator supports it.

  iterable - the iterable to limit, may not be null - `java.lang.Iterable`
  max-size - the maximum number of elements, must not be negative - `long`

  returns: a bounded view on the specified iterable - `<E> java.lang.Iterable<E>`

  throws: java.lang.IllegalArgumentException - if maxSize is negative"
  ([^java.lang.Iterable iterable ^Long max-size]
    (IterableUtils/boundedIterable iterable max-size)))

(defn *get
  "Returns the index-th value in the iterable's Iterator, throwing
   IndexOutOfBoundsException if there is no such element.

   If the Iterable is a List, then it will use List.get(int).

  iterable - the Iterable to get a value from, may be null - `java.lang.Iterable`
  index - the index to get - `int`

  returns: the object at the specified index - `<T> T`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^java.lang.Iterable iterable ^Integer index]
    (IterableUtils/get iterable index)))

(defn *looping-iterable
  "Returns a view of the given iterable which will cycle infinitely over
   its elements.

   The returned iterable's iterator supports remove() if
   iterable.iterator() does. After remove() is called, subsequent
   cycles omit the removed element, which is no longer in iterable. The
   iterator's hasNext() method returns true until iterable
   is empty.

  iterable - the iterable to loop, may not be null - `java.lang.Iterable`

  returns: a view of the iterable, providing an infinite loop over its elements - `<E> java.lang.Iterable<E>`

  throws: java.lang.NullPointerException - if iterable is null"
  ([^java.lang.Iterable iterable]
    (IterableUtils/loopingIterable iterable)))

(defn *count-matches
  "Counts the number of elements in the input iterable that match the predicate.

   A null iterable matches no elements.

  input - the Iterable to get the input from, may be null - `java.lang.Iterable`
  predicate - the predicate to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the number of matches for the predicate in the collection - `<E> long`

  throws: java.lang.NullPointerException - if predicate is null"
  ([^java.lang.Iterable input ^org.apache.commons.collections4.Predicate predicate]
    (IterableUtils/countMatches input predicate)))

(defn *filtered-iterable
  "Returns a view of the given iterable that only contains elements matching
   the provided predicate.

   The returned iterable's iterator supports remove() when the
   corresponding input iterator supports it.

  iterable - the iterable to filter, may not be null - `java.lang.Iterable`
  predicate - the predicate used to filter elements, may not be null - `org.apache.commons.collections4.Predicate`

  returns: a filtered view on the specified iterable - `<E> java.lang.Iterable<E>`

  throws: java.lang.NullPointerException - if either iterable or predicate is null"
  ([^java.lang.Iterable iterable ^org.apache.commons.collections4.Predicate predicate]
    (IterableUtils/filteredIterable iterable predicate)))

(defn *first
  "Shortcut for get(iterator, 0).

   Returns the first value in the iterable's Iterator, throwing
   IndexOutOfBoundsException if there is no such element.


   If the Iterable is a List, then it will use List.get(int).

  iterable - the Iterable to get a value from, may be null - `java.lang.Iterable`

  returns: the first object - `<T> T`

  throws: java.lang.IndexOutOfBoundsException - if the request is invalid"
  ([^java.lang.Iterable iterable]
    (IterableUtils/first iterable)))

(defn *frequency
  "Returns the number of occurrences of the provided object in the iterable.

  iterable - the Iterable to search - `java.lang.Iterable`
  obj - the object to find the cardinality of - `T`

  returns: the number of occurrences of obj in iterable - `<E,T extends E> int`"
  ([^java.lang.Iterable iterable obj]
    (IterableUtils/frequency iterable obj)))

