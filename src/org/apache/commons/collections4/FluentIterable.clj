(ns org.apache.commons.collections4.FluentIterable
  "A FluentIterable provides a powerful yet simple API for manipulating
  Iterable instances in a fluent manner.

  A FluentIterable can be created either from an Iterable or from a set
  of elements. The following types of methods are provided:


    fluent methods which return a new FluentIterable instance,
        providing a view of the original iterable (e.g. filter(Predicate));
    conversion methods which copy the FluentIterable's contents into a
        new collection or array (e.g. toList());
    utility methods which answer questions about the FluentIterable's
        contents (e.g. size(), anyMatch(Predicate)).



  The following example outputs the first 3 even numbers in the range [1, 10]
  into a list:



  List<String> result =
    FluentIterable
        .of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .filter(new Predicate<Integer>() {
                    public boolean evaluate(Integer number) {
                         return number % 2 == 0;
                    }
               )
        .transform(TransformerUtils.stringValueTransformer())
        .limit(3)
        .toList();
  The resulting list will contain the following elements:


 [2, 4, 6]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 FluentIterable]))

(defn *empty
  "Creates a new empty FluentIterable.

  returns: a new empty FluentIterable - `<T> org.apache.commons.collections4.FluentIterable<T>`"
  ([]
    (FluentIterable/empty )))

(defn *of
  "Creates a new FluentIterable of the single provided element.

   The returned iterable's iterator does not support remove().

  singleton - the singleton element - `T`

  returns: a new FluentIterable containing the singleton - `<T> org.apache.commons.collections4.FluentIterable<T>`"
  ([singleton]
    (FluentIterable/of singleton)))

(defn skip
  "Returns a new FluentIterable whose iterator will skip the first
   N elements from this iterable.

  elements-to-skip - the number of elements to skip - `long`

  returns: a new iterable, providing a view of this iterable by skipping
     the first N elements - `org.apache.commons.collections4.FluentIterable<E>`

  throws: java.lang.IllegalArgumentException - if elementsToSkip is negative"
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this ^Long elements-to-skip]
    (-> this (.skip elements-to-skip))))

(defn unmodifiable
  "Returns a new FluentIterable whose iterator will return an unmodifiable
   view of this iterable.

  returns: a new iterable, providing an unmodifiable view of this iterable - `org.apache.commons.collections4.FluentIterable<E>`"
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this]
    (-> this (.unmodifiable))))

(defn unique
  "Returns a new FluentIterable whose iterator will return a unique view
   of this iterable.

  returns: a new iterable, providing a unique view of this iterable - `org.apache.commons.collections4.FluentIterable<E>`"
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this]
    (-> this (.unique))))

(defn loop
  "Returns a new FluentIterable whose iterator will loop infinitely
   over the elements from this iterable.

  returns: a new iterable, providing a looping view of this iterable - `org.apache.commons.collections4.FluentIterable<E>`"
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this]
    (-> this (.loop))))

(defn for-each
  "Applies the closure to all elements contained in this iterable.

  closure - the closure to apply to each element, may not be null - `org.apache.commons.collections4.Closure`

  throws: java.lang.NullPointerException - if closure is null"
  ([^FluentIterable this ^org.apache.commons.collections4.Closure closure]
    (-> this (.forEach closure))))

(defn collate
  "Returns a new FluentIterable whose iterator will traverse the
   elements of the current and provided iterable according to the
   ordering defined by an comparator.

   Example: descending order

     this contains elements [7, 5, 3, 1]
     other contains elements [8, 6, 4, 2]


   The returned iterable will traverse the elements in the following
   order: [8, 7, 6, 5, 4, 3, 2, 1]

  other - the other iterable to collate, may not be null - `java.lang.Iterable`
  comparator - the comparator to define an ordering, may be null, in which case natural ordering will be used - `java.util.Comparator`

  returns: a new iterable, collating this iterable with the other in natural order - `org.apache.commons.collections4.FluentIterable<E>`

  throws: java.lang.NullPointerException - if other is null"
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this ^java.lang.Iterable other ^java.util.Comparator comparator]
    (-> this (.collate other comparator)))
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this ^java.lang.Iterable other]
    (-> this (.collate other))))

(defn as-enumeration
  "Returns an Enumeration that will enumerate all elements contained
   in this iterable.

  returns: an Enumeration over the elements of this iterable - `java.util.Enumeration<E>`"
  (^java.util.Enumeration [^FluentIterable this]
    (-> this (.asEnumeration))))

(defn all-match
  "Checks if all elements contained in this iterable are matching the
   provided predicate.

   A null or empty iterable returns true.

  predicate - the predicate to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: true if all elements contained in this iterable match the predicate,
     false otherwise - `boolean`

  throws: java.lang.NullPointerException - if predicate is null"
  (^Boolean [^FluentIterable this ^org.apache.commons.collections4.Predicate predicate]
    (-> this (.allMatch predicate))))

(defn reverse
  "Returns a new FluentIterable whose iterator will traverse the
   elements from this iterable in reverse order.

  returns: a new iterable, providing a reversed view of this iterable - `org.apache.commons.collections4.FluentIterable<E>`"
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this]
    (-> this (.reverse))))

(defn contains
  "Checks if the object is contained in this iterable.

  object - the object to check - `java.lang.Object`

  returns: true if the object is contained in this iterable, false otherwise - `boolean`"
  (^Boolean [^FluentIterable this ^java.lang.Object object]
    (-> this (.contains object))))

(defn transform
  "Returns a new FluentIterable whose iterator will return all elements
   of this iterable transformed by the provided transformer.

  transformer - the transformer applied to each element - `org.apache.commons.collections4.Transformer`

  returns: a new iterable, providing a transformed view of this iterable - `<O> org.apache.commons.collections4.FluentIterable<O>`

  throws: java.lang.NullPointerException - if transformer is null"
  ([^FluentIterable this ^org.apache.commons.collections4.Transformer transformer]
    (-> this (.transform transformer))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FluentIterable this]
    (-> this (.toString))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^FluentIterable this]
    (-> this (.iterator))))

(defn limit
  "Returns a new FluentIterable whose iterator will return at most
   the provided maximum number of elements from this iterable.

  max-size - the maximum number of elements - `long`

  returns: a new iterable, providing a bounded view of this iterable - `org.apache.commons.collections4.FluentIterable<E>`

  throws: java.lang.IllegalArgumentException - if maxSize is negative"
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this ^Long max-size]
    (-> this (.limit max-size))))

(defn to-list
  "Returns a mutable list containing all elements of this iterable
   by traversing its iterator.

   The returned list is guaranteed to be mutable.

  returns: a list of the iterable contents - `java.util.List<E>`"
  (^java.util.List [^FluentIterable this]
    (-> this (.toList))))

(defn eval
  "This method fully traverses an iterator of this iterable and returns
   a new iterable with the same contents, but without any reference
   to the originating iterables and/or iterators.

   Calling this method is equivalent to:


     FluentIterable<E> someIterable = ...;
     FluentIterable.of(someIterable.toList());

  returns: a new iterable with the same contents as this iterable - `org.apache.commons.collections4.FluentIterable<E>`"
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this]
    (-> this (.eval))))

(defn copy-into
  "Traverses an iterator of this iterable and adds all elements
   to the provided collection.

  collection - the collection to add the elements - `java.util.Collection`

  throws: java.lang.NullPointerException - if collection is null"
  ([^FluentIterable this ^java.util.Collection collection]
    (-> this (.copyInto collection))))

(defn filter
  "Returns a new FluentIterable whose iterator will only return
   elements from this iterable matching the provided predicate.

  predicate - the predicate used to filter elements - `org.apache.commons.collections4.Predicate`

  returns: a new iterable, providing a filtered view of this iterable - `org.apache.commons.collections4.FluentIterable<E>`

  throws: java.lang.NullPointerException - if predicate is null"
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this ^org.apache.commons.collections4.Predicate predicate]
    (-> this (.filter predicate))))

(defn append
  "Returns a new FluentIterable whose iterator will first traverse
   the elements of the current iterable, followed by the provided
   elements.

  elements - the elements to append to the iterable - `E`

  returns: a new iterable, combining this iterable with the elements - `org.apache.commons.collections4.FluentIterable<E>`"
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this elements]
    (-> this (.append elements))))

(defn any-match
  "Checks if this iterable contains any element matching the provided predicate.

   A null or empty iterable returns false.

  predicate - the predicate to use, may not be null - `org.apache.commons.collections4.Predicate`

  returns: true if at least one element contained in this iterable matches the predicate,
     false otherwise - `boolean`

  throws: java.lang.NullPointerException - if predicate is null"
  (^Boolean [^FluentIterable this ^org.apache.commons.collections4.Predicate predicate]
    (-> this (.anyMatch predicate))))

(defn empty?
  "Checks if this iterable is empty.

  returns: true if this iterable does not contain any elements, false otherwise - `boolean`"
  (^Boolean [^FluentIterable this]
    (-> this (.isEmpty))))

(defn size
  "Returns the number of elements that are contained in this iterable.
   In order to determine the size, an iterator needs to be traversed.

  returns: the size of this iterable - `int`"
  (^Integer [^FluentIterable this]
    (-> this (.size))))

(defn to-array
  "Returns an array containing all elements of this iterable by traversing
   its iterator.

  array-class - the class of array to create - `java.lang.Class`

  returns: an array of the iterable contents - `E[]`

  throws: java.lang.ArrayStoreException - if arrayClass is invalid"
  ([^FluentIterable this ^java.lang.Class array-class]
    (-> this (.toArray array-class))))

(defn get
  "Returns the element at the provided position in this iterable.
   In order to return the element, an iterator needs to be traversed
   up to the requested position.

  position - the position of the element to return - `int`

  returns: the element - `E`

  throws: java.lang.IndexOutOfBoundsException - if the provided position is outside the valid range of this iterable: [0, size)"
  ([^FluentIterable this ^Integer position]
    (-> this (.get position))))

(defn zip
  "Returns a new FluentIterable whose iterator will traverse
   the elements of this iterable and the other iterable in
   alternating order.

  other - the other iterable to interleave, may not be null - `java.lang.Iterable`

  returns: a new iterable, interleaving this iterable with others - `org.apache.commons.collections4.FluentIterable<E>`

  throws: java.lang.NullPointerException - if other is null"
  (^org.apache.commons.collections4.FluentIterable [^FluentIterable this ^java.lang.Iterable other]
    (-> this (.zip other))))

