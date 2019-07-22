(ns org.apache.commons.collections4.set.ListOrderedSet
  "Decorates another Set to ensure that the order of addition is
  retained and used by the iterator.

  If an object is added to the set for a second time, it will remain in the
  original position in the iteration. The order can be observed from the set
  via the iterator or toArray methods.


  The ListOrderedSet also has various useful direct methods. These include many
  from List, such as get(int),
  remove(int) and indexOf(int). An unmodifiable
  List view of the set can be obtained via asList().


  This class cannot implement the List interface directly as
  various interface methods (notably equals/hashCode) are incompatible with a
  set.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set ListOrderedSet]))

(defn ->list-ordered-set
  "Constructor.

  Constructs a new empty ListOrderedSet using a
   HashSet and an ArrayList internally."
  (^ListOrderedSet []
    (new ListOrderedSet )))

(defn *list-ordered-set
  "Factory method to create an ordered set specifying the list and set to use.

   The list and set must both be empty.

  set - the set to decorate, must be empty and not null - `java.util.Set`
  list - the list to decorate, must be empty and not null - `java.util.List`

  returns: a new ordered set - `<E> org.apache.commons.collections4.set.ListOrderedSet<E>`

  throws: java.lang.NullPointerException - if set or list is null"
  ([^java.util.Set set ^java.util.List list]
    (ListOrderedSet/listOrderedSet set list))
  ([^java.util.Set set]
    (ListOrderedSet/listOrderedSet set)))

(defn add-all
  "Inserts all elements in the specified collection not yet contained in the
   ordered set at the specified position (optional operation). Shifts the
   element currently at the position and all subsequent elements to the
   right.

  index - the position to insert the elements - `int`
  coll - the collection containing the elements to be inserted - `java.util.Collection`

  returns: true if this ordered set changed as a result of the call - `boolean`"
  (^Boolean [^ListOrderedSet this ^Integer index ^java.util.Collection coll]
    (-> this (.addAll index coll)))
  (^Boolean [^ListOrderedSet this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^ListOrderedSet this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn as-list
  "Gets an unmodifiable view of the order of the Set.

  returns: an unmodifiable list view - `java.util.List<E>`"
  (^java.util.List [^ListOrderedSet this]
    (-> this (.asList))))

(defn to-string
  "Uses the underlying List's toString so that order is achieved. This means
   that the decorated Set's toString is not used, so any custom toStrings
   will be ignored.

  returns: a string representation of the ordered set - `java.lang.String`"
  (^java.lang.String [^ListOrderedSet this]
    (-> this (.toString))))

(defn iterator
  "returns: `org.apache.commons.collections4.OrderedIterator<E>`"
  (^org.apache.commons.collections4.OrderedIterator [^ListOrderedSet this]
    (-> this (.iterator))))

(defn remove
  "Removes the element at the specified position from the ordered set.
   Shifts any subsequent elements to the left.

  index - the index of the element to be removed - `int`

  returns: the element that has been remove from the ordered set - `E`"
  ([^ListOrderedSet this ^Integer index]
    (-> this (.remove index))))

(defn add
  "Inserts the specified element at the specified position if it is not yet
   contained in this ordered set (optional operation). Shifts the element
   currently at this position and any subsequent elements to the right.

  index - the index at which the element is to be inserted - `int`
  object - the element to be inserted - `E`"
  ([^ListOrderedSet this ^Integer index object]
    (-> this (.add index object)))
  (^Boolean [^ListOrderedSet this object]
    (-> this (.add object))))

(defn retain-all
  "This implementation iterates over the elements of this set, checking
   each element in turn to see if it's contained in coll.
   If it's not contained, it's removed from this set. As a consequence,
   it is advised to use a collection type for coll that provides
   a fast (e.g. O(1)) implementation of Collection.contains(Object).

  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^ListOrderedSet this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^ListOrderedSet this]
    (-> this (.clear))))

(defn index-of
  "Returns the index of the first occurrence of the specified element in
   ordered set.

  object - the element to search for - `java.lang.Object`

  returns: the index of the first occurrence of the object, or -1 if
           this ordered set does not contain this object - `int`"
  (^Integer [^ListOrderedSet this ^java.lang.Object object]
    (-> this (.indexOf object))))

(defn to-array
  "a - `T[]`

  returns: `<T> T[]`"
  ([^ListOrderedSet this a]
    (-> this (.toArray a)))
  ([^ListOrderedSet this]
    (-> this (.toArray))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^ListOrderedSet this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn get
  "Returns the element at the specified position in this ordered set.

  index - the position of the element in the ordered Set. - `int`

  returns: the element at position index - `E`"
  ([^ListOrderedSet this ^Integer index]
    (-> this (.get index))))

