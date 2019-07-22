(ns org.apache.commons.collections4.IteratorUtils
  "Provides static utility methods and decorators for Iterator
  instances. The implementations are provided in the iterators subpackage."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 IteratorUtils]))

(def *-empty-iterator
  "Static Constant.

  An iterator over no elements.

  type: org.apache.commons.collections4.ResettableIterator"
  IteratorUtils/EMPTY_ITERATOR)

(def *-empty-list-iterator
  "Static Constant.

  A list iterator over no elements.

  type: org.apache.commons.collections4.ResettableListIterator"
  IteratorUtils/EMPTY_LIST_ITERATOR)

(def *-empty-ordered-iterator
  "Static Constant.

  An ordered iterator over no elements.

  type: org.apache.commons.collections4.OrderedIterator"
  IteratorUtils/EMPTY_ORDERED_ITERATOR)

(def *-empty-map-iterator
  "Static Constant.

  A map iterator over no elements.

  type: org.apache.commons.collections4.MapIterator"
  IteratorUtils/EMPTY_MAP_ITERATOR)

(def *-empty-ordered-map-iterator
  "Static Constant.

  An ordered map iterator over no elements.

  type: org.apache.commons.collections4.OrderedMapIterator"
  IteratorUtils/EMPTY_ORDERED_MAP_ITERATOR)

(defn *unmodifiable-iterator
  "Gets an immutable version of an Iterator. The returned object
   will always throw an UnsupportedOperationException for
   the Iterator.remove() method.

  iterator - the iterator to make immutable - `java.util.Iterator`

  returns: an immutable version of the iterator - `<E> java.util.Iterator<E>`"
  ([^java.util.Iterator iterator]
    (IteratorUtils/unmodifiableIterator iterator)))

(defn *for-each
  "Applies the closure to each element of the provided iterator.

  iterator - the iterator to use, may be null - `java.util.Iterator`
  closure - the closure to apply to each element, may not be null - `org.apache.commons.collections4.Closure`

  returns: `<E> void`

  throws: java.lang.NullPointerException - if closure is null"
  ([^java.util.Iterator iterator ^org.apache.commons.collections4.Closure closure]
    (IteratorUtils/forEach iterator closure)))

(defn *singleton-iterator
  "Gets a singleton iterator.

   This iterator is a valid iterator object that will iterate over
   the specified object.

  object - the single object over which to iterate - `E`

  returns: a singleton iterator over the object - `<E> org.apache.commons.collections4.ResettableIterator<E>`"
  ([object]
    (IteratorUtils/singletonIterator object)))

(defn *matches-any
  "Answers true if a predicate is true for any element of the iterator.

   A null or empty iterator returns false.

  iterator - the Iterator to use, may be null - `java.util.Iterator`
  predicate - the predicate to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: true if any element of the collection matches the predicate, false otherwise - `<E> boolean`

  throws: java.lang.NullPointerException - if predicate is null"
  ([^java.util.Iterator iterator ^org.apache.commons.collections4.Predicate predicate]
    (IteratorUtils/matchesAny iterator predicate)))

(defn *empty-map-iterator
  "Gets an empty map iterator.

   This iterator is a valid map iterator object that will iterate
   over nothing.

  returns: a map iterator over nothing - `<K,V> org.apache.commons.collections4.MapIterator<K,V>`"
  ([]
    (IteratorUtils/emptyMapIterator )))

(defn *looping-iterator
  "Gets an iterator that loops continuously over the supplied collection.

   The iterator will only stop looping if the remove method is called
   enough times to empty the collection, or if the collection is empty
   to start with.

  coll - the collection to iterate over, not null - `java.util.Collection`

  returns: a new looping iterator - `<E> org.apache.commons.collections4.ResettableIterator<E>`

  throws: java.lang.NullPointerException - if the collection is null"
  ([^java.util.Collection coll]
    (IteratorUtils/loopingIterator coll)))

(defn *as-enumeration
  "Gets an enumeration that wraps an iterator.

  iterator - the iterator to use, may not be null - `java.util.Iterator`

  returns: a new enumeration - `<E> java.util.Enumeration<E>`

  throws: java.lang.NullPointerException - if iterator is null"
  ([^java.util.Iterator iterator]
    (IteratorUtils/asEnumeration iterator)))

(defn *find
  "Finds the first element in the given iterator which matches the given predicate.

   A null or empty iterator returns null.

  iterator - the iterator to search, may be null - `java.util.Iterator`
  predicate - the predicate to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the first element of the iterator which matches the predicate or null if none could be found - `<E> E`

  throws: java.lang.NullPointerException - if predicate is null"
  ([^java.util.Iterator iterator ^org.apache.commons.collections4.Predicate predicate]
    (IteratorUtils/find iterator predicate)))

(defn *object-graph-iterator
  "Gets an iterator that operates over an object graph.

   This iterator can extract multiple objects from a complex tree-like object graph.
   The iteration starts from a single root object.
   It uses a Transformer to extract the iterators and elements.
   Its main benefit is that no intermediate List is created.

   For example, consider an object graph:


                   |- Branch -- Leaf
                   |         \\- Leaf
           |- Tree |         /- Leaf
           |       |- Branch -- Leaf
    Forest |                 \\- Leaf
           |       |- Branch -- Leaf
           |       |         \\- Leaf
           |- Tree |         /- Leaf
                   |- Branch -- Leaf
                   |- Branch -- Leaf
   The following Transformer, used in this class, will extract all
   the Leaf objects without creating a combined intermediate list:


   public Object transform(Object input) {
     if (input instanceof Forest) {
       return ((Forest) input).treeIterator();
     }
     if (input instanceof Tree) {
       return ((Tree) input).branchIterator();
     }
     if (input instanceof Branch) {
       return ((Branch) input).leafIterator();
     }
     if (input instanceof Leaf) {
       return input;
     }
     throw new ClassCastException();
   }

   Internally, iteration starts from the root object. When next is called,
   the transformer is called to examine the object. The transformer will return
   either an iterator or an object. If the object is an Iterator, the next element
   from that iterator is obtained and the process repeats. If the element is an object
   it is returned.

   Under many circumstances, linking Iterators together in this manner is
   more efficient (and convenient) than using nested for loops to extract a list.

  root - the root object to start iterating from, null results in an empty iterator - `E`
  transformer - the transformer to use, see above, null uses no effect transformer - `org.apache.commons.collections4.Transformer`

  returns: a new object graph iterator - `<E> java.util.Iterator<E>`"
  ([root ^org.apache.commons.collections4.Transformer transformer]
    (IteratorUtils/objectGraphIterator root transformer)))

(defn *array-list-iterator
  "Gets a list iterator over part of an object array.

  array - the array over which to iterate - `E[]`
  start - the index to start iterating at - `int`
  end - the index to finish iterating at - `int`

  returns: a list iterator over part of the array - `<E> org.apache.commons.collections4.ResettableListIterator<E>`

  throws: java.lang.IndexOutOfBoundsException - if array bounds are invalid"
  ([array ^Integer start ^Integer end]
    (IteratorUtils/arrayListIterator array start end))
  ([array ^Integer start]
    (IteratorUtils/arrayListIterator array start))
  ([array]
    (IteratorUtils/arrayListIterator array)))

(defn *contains
  "Checks if the object is contained in the given iterator.

   A null or empty iterator returns false.

  iterator - the iterator to check, may be null - `java.util.Iterator`
  object - the object to check - `java.lang.Object`

  returns: true if the object is contained in the iterator, false otherwise - `<E> boolean`"
  ([^java.util.Iterator iterator ^java.lang.Object object]
    (IteratorUtils/contains iterator object)))

(defn *array-iterator
  "Gets an iterator over part of an object array.

  array - the array over which to iterate - `E[]`
  start - the index to start iterating at - `int`
  end - the index to finish iterating at - `int`

  returns: an iterator over part of the array - `<E> org.apache.commons.collections4.ResettableIterator<E>`

  throws: java.lang.IndexOutOfBoundsException - if array bounds are invalid"
  ([array ^Integer start ^Integer end]
    (IteratorUtils/arrayIterator array start end))
  ([array ^Integer start]
    (IteratorUtils/arrayIterator array start))
  ([array]
    (IteratorUtils/arrayIterator array)))

(defn *get-iterator
  "Gets a suitable Iterator for the given object.

   This method can handle objects as follows

   null - empty iterator
   Iterator - returned directly
   Enumeration - wrapped
   Collection - iterator from collection returned
   Map - values iterator returned
   Dictionary - values (elements) enumeration returned as iterator
   array - iterator over array returned
   object with iterator() public method accessed by reflection
   object - singleton iterator
   NodeList - iterator over the list
   Node - iterator over the child nodes

  obj - the object to convert to an iterator - `java.lang.Object`

  returns: a suitable iterator, never null - `java.util.Iterator<?>`"
  (^java.util.Iterator [^java.lang.Object obj]
    (IteratorUtils/getIterator obj)))

(defn *to-string
  "Returns a string representation of the elements of the specified iterator.

   The string representation consists of a list of the iterator's elements,
   enclosed by the provided prefix and suffix. Adjacent elements
   are separated by the provided delimiter. Elements are converted to
   strings as by using the provided transformer.

  iterator - the iterator to convert to a string, may be null - `java.util.Iterator`
  transformer - the transformer used to get a string representation of an element - `org.apache.commons.collections4.Transformer`
  delimiter - the string to delimit elements - `java.lang.String`
  prefix - the prefix, prepended to the string representation - `java.lang.String`
  suffix - the suffix, appended to the string representation - `java.lang.String`

  returns: a string representation of iterator - `<E> java.lang.String`

  throws: java.lang.NullPointerException - if either transformer, delimiter, prefix or suffix is null"
  ([^java.util.Iterator iterator ^org.apache.commons.collections4.Transformer transformer ^java.lang.String delimiter ^java.lang.String prefix ^java.lang.String suffix]
    (IteratorUtils/toString iterator transformer delimiter prefix suffix))
  ([^java.util.Iterator iterator ^org.apache.commons.collections4.Transformer transformer]
    (IteratorUtils/toString iterator transformer))
  ([^java.util.Iterator iterator]
    (IteratorUtils/toString iterator)))

(defn *matches-all
  "Answers true if a predicate is true for every element of an iterator.

   A null or empty iterator returns true.

  iterator - the Iterator to use, may be null - `java.util.Iterator`
  predicate - the predicate to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: true if every element of the collection matches the predicate or if the
     collection is empty, false otherwise - `<E> boolean`

  throws: java.lang.NullPointerException - if predicate is null"
  ([^java.util.Iterator iterator ^org.apache.commons.collections4.Predicate predicate]
    (IteratorUtils/matchesAll iterator predicate)))

(defn *empty-ordered-map-iterator
  "Gets an empty ordered map iterator.

   This iterator is a valid map iterator object that will iterate
   over nothing.

  returns: a map iterator over nothing - `<K,V> org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  ([]
    (IteratorUtils/emptyOrderedMapIterator )))

(defn *empty-ordered-iterator
  "Gets an empty ordered iterator.

   This iterator is a valid iterator object that will iterate
   over nothing.

  returns: an ordered iterator over nothing - `<E> org.apache.commons.collections4.OrderedIterator<E>`"
  ([]
    (IteratorUtils/emptyOrderedIterator )))

(defn *unmodifiable-list-iterator
  "Gets an immutable version of a ListIterator. The returned object
   will always throw an UnsupportedOperationException for
   the Iterator.remove(), ListIterator.add(E) and
   ListIterator.set(E) methods.

  list-iterator - the iterator to make immutable - `java.util.ListIterator`

  returns: an immutable version of the iterator - `<E> java.util.ListIterator<E>`"
  ([^java.util.ListIterator list-iterator]
    (IteratorUtils/unmodifiableListIterator list-iterator)))

(defn *chained-iterator
  "Gets an iterator that iterates through two Iterators
   one after another.

  iterator-1 - the first iterator to use, not null - `java.util.Iterator`
  iterator-2 - the second iterator to use, not null - `java.util.Iterator`

  returns: a combination iterator over the iterators - `<E> java.util.Iterator<E>`

  throws: java.lang.NullPointerException - if either iterator is null"
  ([^java.util.Iterator iterator-1 ^java.util.Iterator iterator-2]
    (IteratorUtils/chainedIterator iterator-1 iterator-2))
  ([^java.util.Iterator iterators]
    (IteratorUtils/chainedIterator iterators)))

(defn *collated-iterator
  "Gets an iterator that provides an ordered iteration over the elements
   contained in a collection of ordered Iterators.

   Given two ordered Iterators A and B,
   the Iterator.next() method will return the lesser of
   A.next() and B.next().

   The comparator is optional. If null is specified then natural order is used.

  comparator - the comparator to use, may be null for natural order - `java.util.Comparator`
  iterator-1 - the first iterators to use, not null - `java.util.Iterator`
  iterator-2 - the first iterators to use, not null - `java.util.Iterator`

  returns: a combination iterator over the iterators - `<E> java.util.Iterator<E>`

  throws: java.lang.NullPointerException - if either iterator is null"
  ([^java.util.Comparator comparator ^java.util.Iterator iterator-1 ^java.util.Iterator iterator-2]
    (IteratorUtils/collatedIterator comparator iterator-1 iterator-2))
  ([^java.util.Comparator comparator ^java.util.Iterator iterators]
    (IteratorUtils/collatedIterator comparator iterators)))

(defn *to-list
  "Gets a list based on an iterator.

   As the wrapped Iterator is traversed, an ArrayList of its values is
   created. At the end, the list is returned.

  iterator - the iterator to use, not null - `java.util.Iterator`
  estimated-size - the initial size of the ArrayList - `int`

  returns: a list of the iterator contents - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if iterator parameter is null"
  ([^java.util.Iterator iterator ^Integer estimated-size]
    (IteratorUtils/toList iterator estimated-size))
  ([^java.util.Iterator iterator]
    (IteratorUtils/toList iterator)))

(defn *as-multiple-use-iterable
  "Gets an iterable that wraps an iterator.  The returned iterable can be
   used for multiple iterations.

  iterator - the iterator to use, may not be null - `java.util.Iterator`

  returns: a new, multiple use iterable - `<E> java.lang.Iterable<E>`

  throws: java.lang.NullPointerException - if iterator is null"
  ([^java.util.Iterator iterator]
    (IteratorUtils/asMultipleUseIterable iterator)))

(defn *for-each-but-last
  "Executes the given closure on each but the last element in the iterator.

   If the input iterator is null no change is made.

  iterator - the iterator to get the input from, may be null - `java.util.Iterator`
  closure - the closure to perform, may not be null - `org.apache.commons.collections4.Closure`

  returns: the last element in the iterator, or null if iterator is null or empty - `<E> E`

  throws: java.lang.NullPointerException - if closure is null"
  ([^java.util.Iterator iterator ^org.apache.commons.collections4.Closure closure]
    (IteratorUtils/forEachButLast iterator closure)))

(defn *peeking-iterator
  "Gets an iterator that supports one-element lookahead.

  iterator - the iterator to decorate, not null - `java.util.Iterator`

  returns: a peeking iterator - `<E> java.util.Iterator<E>`

  throws: java.lang.NullPointerException - if the iterator is null"
  ([^java.util.Iterator iterator]
    (IteratorUtils/peekingIterator iterator)))

(defn *as-iterable
  "Gets an Iterable that wraps an iterator.  The returned Iterable can be
   used for a single iteration.

  iterator - the iterator to use, may not be null - `java.util.Iterator`

  returns: a new, single use Iterable - `<E> java.lang.Iterable<E>`

  throws: java.lang.NullPointerException - if iterator is null"
  ([^java.util.Iterator iterator]
    (IteratorUtils/asIterable iterator)))

(defn *empty-list-iterator
  "Gets an empty list iterator.

   This iterator is a valid list iterator object that will iterate
   over nothing.

  returns: a list iterator over nothing - `<E> org.apache.commons.collections4.ResettableListIterator<E>`"
  ([]
    (IteratorUtils/emptyListIterator )))

(defn *bounded-iterator
  "Decorates the specified iterator to return at most the given number
   of elements, skipping all elements until the iterator reaches the
   position at offset.

   The iterator is immediately advanced until it reaches the position at
   offset, incurring O(n) time.

  iterator - the iterator to decorate - `java.util.Iterator`
  offset - the index of the first element of the decorated iterator to return - `long`
  max - the maximum number of elements returned by this iterator - `long`

  returns: a new bounded iterator - `<E> org.apache.commons.collections4.iterators.BoundedIterator<E>`

  throws: java.lang.NullPointerException - if the iterator is null"
  ([^java.util.Iterator iterator ^Long offset ^Long max]
    (IteratorUtils/boundedIterator iterator offset max))
  ([^java.util.Iterator iterator ^Long max]
    (IteratorUtils/boundedIterator iterator max)))

(defn *as-iterator
  "Gets an iterator that provides an iterator view of the given enumeration
   that will remove elements from the specified collection.

  enumeration - the enumeration to use, may not be null - `java.util.Enumeration`
  remove-collection - the collection to remove elements from, may not be null - `java.util.Collection`

  returns: a new iterator - `<E> java.util.Iterator<E>`

  throws: java.lang.NullPointerException - if enumeration or removeCollection is null"
  ([^java.util.Enumeration enumeration ^java.util.Collection remove-collection]
    (IteratorUtils/asIterator enumeration remove-collection))
  ([^java.util.Enumeration enumeration]
    (IteratorUtils/asIterator enumeration)))

(defn *zipping-iterator
  "Returns an iterator that interleaves elements from the decorated iterators.

  a - the first iterator to interleave - `java.util.Iterator`
  b - the second iterator to interleave - `java.util.Iterator`
  c - the third iterator to interleave - `java.util.Iterator`

  returns: an iterator, interleaving the decorated iterators - `<E> org.apache.commons.collections4.iterators.ZippingIterator<E>`

  throws: java.lang.NullPointerException - if any iterator is null"
  ([^java.util.Iterator a ^java.util.Iterator b ^java.util.Iterator c]
    (IteratorUtils/zippingIterator a b c))
  ([^java.util.Iterator a ^java.util.Iterator b]
    (IteratorUtils/zippingIterator a b))
  ([^java.util.Iterator iterators]
    (IteratorUtils/zippingIterator iterators)))

(defn *pushback-iterator
  "Gets an iterator that supports pushback of elements.

  iterator - the iterator to decorate, not null - `java.util.Iterator`

  returns: a pushback iterator - `<E> java.util.Iterator<E>`

  throws: java.lang.NullPointerException - if the iterator is null"
  ([^java.util.Iterator iterator]
    (IteratorUtils/pushbackIterator iterator)))

(defn *transformed-iterator
  "Gets an iterator that transforms the elements of another iterator.

   The transformation occurs during the next() method and the underlying
   iterator is unaffected by the transformation.

  iterator - the iterator to use, not null - `java.util.Iterator`
  transform - the transform to use, not null - `org.apache.commons.collections4.Transformer`

  returns: a new transforming iterator - `<I,O> java.util.Iterator<O>`

  throws: java.lang.NullPointerException - if either parameter is null"
  ([^java.util.Iterator iterator ^org.apache.commons.collections4.Transformer transform]
    (IteratorUtils/transformedIterator iterator transform)))

(defn *filtered-iterator
  "Gets an iterator that filters another iterator.

   The returned iterator will only return objects that match the specified
   filtering predicate.

  iterator - the iterator to use, not null - `java.util.Iterator`
  predicate - the predicate to use as a filter, not null - `org.apache.commons.collections4.Predicate`

  returns: a new filtered iterator - `<E> java.util.Iterator<E>`

  throws: java.lang.NullPointerException - if either parameter is null"
  ([^java.util.Iterator iterator ^org.apache.commons.collections4.Predicate predicate]
    (IteratorUtils/filteredIterator iterator predicate)))

(defn *empty-iterator
  "Gets an empty iterator.

   This iterator is a valid iterator object that will iterate over nothing.

  returns: an iterator over nothing - `<E> org.apache.commons.collections4.ResettableIterator<E>`"
  ([]
    (IteratorUtils/emptyIterator )))

(defn *node-list-iterator
  "Gets an Iterator that wraps the specified NodeList.
   The returned Iterator can be used for a single iteration.

  node-list - the node list to use, may not be null - `org.w3c.dom.NodeList`

  returns: a new, single use Iterator - `org.apache.commons.collections4.iterators.NodeListIterator`

  throws: java.lang.NullPointerException - if nodeList is null"
  (^org.apache.commons.collections4.iterators.NodeListIterator [^org.w3c.dom.NodeList node-list]
    (IteratorUtils/nodeListIterator node-list)))

(defn *empty?
  "Checks if the given iterator is empty.

   A null or empty iterator returns true.

  iterator - the Iterator to use, may be null - `java.util.Iterator`

  returns: true if the iterator is exhausted or null, false otherwise - `boolean`"
  (^Boolean [^java.util.Iterator iterator]
    (IteratorUtils/isEmpty iterator)))

(defn *size
  "Returns the number of elements contained in the given iterator.

   A null or empty iterator returns 0.

  iterator - the iterator to check, may be null - `java.util.Iterator`

  returns: the number of elements contained in the iterator - `int`"
  (^Integer [^java.util.Iterator iterator]
    (IteratorUtils/size iterator)))

(defn *index-of
  "Returns the index of the first element in the specified iterator that
   matches the given predicate.

   A null or empty iterator returns -1.

  iterator - the iterator to search, may be null - `java.util.Iterator`
  predicate - the predicate to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: the index of the first element which matches the predicate or -1 if none matches - `<E> int`

  throws: java.lang.NullPointerException - if predicate is null"
  ([^java.util.Iterator iterator ^org.apache.commons.collections4.Predicate predicate]
    (IteratorUtils/indexOf iterator predicate)))

(defn *to-array
  "Gets an array based on an iterator.

   As the wrapped Iterator is traversed, an ArrayList of its values is
   created. At the end, this is converted to an array.

  iterator - the iterator to use, not null - `java.util.Iterator`
  array-class - the class of array to create - `java.lang.Class`

  returns: an array of the iterator contents - `<E> E[]`

  throws: java.lang.NullPointerException - if iterator parameter or arrayClass is null"
  ([^java.util.Iterator iterator ^java.lang.Class array-class]
    (IteratorUtils/toArray iterator array-class))
  ([^java.util.Iterator iterator]
    (IteratorUtils/toArray iterator)))

(defn *skipping-iterator
  "Decorates the specified iterator to skip the first N elements.

  iterator - the iterator to decorate - `java.util.Iterator`
  offset - the first number of elements to skip - `long`

  returns: a new skipping iterator - `<E> org.apache.commons.collections4.iterators.SkippingIterator<E>`

  throws: java.lang.NullPointerException - if the iterator is null"
  ([^java.util.Iterator iterator ^Long offset]
    (IteratorUtils/skippingIterator iterator offset)))

(defn *unmodifiable-map-iterator
  "Gets an immutable version of a MapIterator. The returned object
   will always throw an UnsupportedOperationException for
   the Iterator.remove(), MapIterator.setValue(Object) methods.

  map-iterator - the iterator to make immutable - `org.apache.commons.collections4.MapIterator`

  returns: an immutable version of the iterator - `<K,V> org.apache.commons.collections4.MapIterator<K,V>`"
  ([^org.apache.commons.collections4.MapIterator map-iterator]
    (IteratorUtils/unmodifiableMapIterator map-iterator)))

(defn *get
  "Returns the index-th value in Iterator, throwing
   IndexOutOfBoundsException if there is no such element.

   The Iterator is advanced to index (or to the end, if
   index exceeds the number of entries) as a side effect of this method.

  iterator - the iterator to get a value from - `java.util.Iterator`
  index - the index to get - `int`

  returns: the object at the specified index - `<E> E`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^java.util.Iterator iterator ^Integer index]
    (IteratorUtils/get iterator index)))

(defn *looping-list-iterator
  "Gets an iterator that loops continuously over the supplied list.

   The iterator will only stop looping if the remove method is called
   enough times to empty the list, or if the list is empty to start with.

  list - the list to iterate over, not null - `java.util.List`

  returns: a new looping iterator - `<E> org.apache.commons.collections4.ResettableListIterator<E>`

  throws: java.lang.NullPointerException - if the list is null"
  ([^java.util.List list]
    (IteratorUtils/loopingListIterator list)))

(defn *filtered-list-iterator
  "Gets a list iterator that filters another list iterator.

   The returned iterator will only return objects that match the specified
   filtering predicate.

  list-iterator - the list iterator to use, not null - `java.util.ListIterator`
  predicate - the predicate to use as a filter, not null - `org.apache.commons.collections4.Predicate`

  returns: a new filtered iterator - `<E> java.util.ListIterator<E>`

  throws: java.lang.NullPointerException - if either parameter is null"
  ([^java.util.ListIterator list-iterator ^org.apache.commons.collections4.Predicate predicate]
    (IteratorUtils/filteredListIterator list-iterator predicate)))

(defn *singleton-list-iterator
  "Gets a singleton list iterator.

   This iterator is a valid list iterator object that will iterate over
   the specified object.

  object - the single object over which to iterate - `E`

  returns: a singleton list iterator over the object - `<E> java.util.ListIterator<E>`"
  ([object]
    (IteratorUtils/singletonListIterator object)))

(defn *to-list-iterator
  "Gets a list iterator based on a simple iterator.

   As the wrapped Iterator is traversed, a LinkedList of its values is
   cached, permitting all required operations of ListIterator.

  iterator - the iterator to use, may not be null - `java.util.Iterator`

  returns: a new iterator - `<E> java.util.ListIterator<E>`

  throws: java.lang.NullPointerException - if iterator parameter is null"
  ([^java.util.Iterator iterator]
    (IteratorUtils/toListIterator iterator)))

(defn *first
  "Shortcut for get(iterator, 0).

   Returns the first value in Iterator, throwing
   IndexOutOfBoundsException if there is no such element.


   The Iterator is advanced to 0 (or to the end, if
   0 exceeds the number of entries) as a side effect of this method.

  iterator - the iterator to get a value from - `java.util.Iterator`

  returns: the first object - `<E> E`

  throws: java.lang.IndexOutOfBoundsException - if the request is invalid"
  ([^java.util.Iterator iterator]
    (IteratorUtils/first iterator)))

