(ns org.apache.commons.collections4.list.SetUniqueList
  "Decorates a List to ensure that no duplicates are present much
  like a Set.

  The List interface makes certain assumptions/requirements. This
  implementation breaks these in certain ways, but this is merely the result of
  rejecting duplicates. Each violation is explained in the method, but it
  should not affect you. Bear in mind that Sets require immutable objects to
  function correctly.


  The ListOrderedSet
  class provides an alternative approach, by wrapping an existing Set and
  retaining insertion order in the iterator.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list SetUniqueList]))

(defn *set-unique-list
  "Factory method to create a SetList using the supplied list to retain order.

   If the list contains duplicates, these are removed (first indexed one
   kept). A HashSet is used for the set behaviour.

  list - the list to decorate, must not be null - `java.util.List`

  returns: a new SetUniqueList - `<E> org.apache.commons.collections4.list.SetUniqueList<E>`

  throws: java.lang.NullPointerException - if list is null"
  ([^java.util.List list]
    (SetUniqueList/setUniqueList list)))

(defn add-all
  "Adds a collection of objects a specific index in the list avoiding
   duplicates.

   Only elements that are not already in this list will be added, and
   duplicates from the specified collection will be ignored.

   (Violation) The List interface makes the assumption
   that the elements are always inserted. This may not happen with this
   implementation.

  index - the index to insert at - `int`
  coll - the collection to add in iterator order - `java.util.Collection`

  returns: true if this collection changed - `boolean`"
  (^Boolean [^SetUniqueList this ^Integer index ^java.util.Collection coll]
    (-> this (.addAll index coll)))
  (^Boolean [^SetUniqueList this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^SetUniqueList this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn contains
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SetUniqueList this ^java.lang.Object object]
    (-> this (.contains object))))

(defn as-set
  "Gets an unmodifiable view as a Set.

  returns: an unmodifiable set view - `java.util.Set<E>`"
  (^java.util.Set [^SetUniqueList this]
    (-> this (.asSet))))

(defn list-iterator
  "index - `int`

  returns: `java.util.ListIterator<E>`"
  (^java.util.ListIterator [^SetUniqueList this ^Integer index]
    (-> this (.listIterator index)))
  (^java.util.ListIterator [^SetUniqueList this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^SetUniqueList this]
    (-> this (.iterator))))

(defn sub-list
  "NOTE: from 4.0, an unmodifiable list will be returned, as changes to the
   subList can invalidate the parent list.

  from-index - `int`
  to-index - `int`

  returns: `java.util.List<E>`"
  (^java.util.List [^SetUniqueList this ^Integer from-index ^Integer to-index]
    (-> this (.subList from-index to-index))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SetUniqueList this ^java.lang.Object object]
    (-> this (.remove object))))

(defn add
  "Adds an element to a specific index in the list if it is not already
   present.

   (Violation) The List interface makes the assumption
   that the element is always inserted. This may not happen with this
   implementation.

  index - the index to insert at - `int`
  object - the object to add - `E`"
  ([^SetUniqueList this ^Integer index object]
    (-> this (.add index object)))
  (^Boolean [^SetUniqueList this object]
    (-> this (.add object))))

(defn set
  "Sets the value at the specified index avoiding duplicates.

   The object is set into the specified index. Afterwards, any previous
   duplicate is removed. If the object is not already in the list then a
   normal set occurs. If it is present, then the old version is removed.

  index - the index to insert at - `int`
  object - the object to set - `E`

  returns: the previous object - `E`"
  ([^SetUniqueList this ^Integer index object]
    (-> this (.set index object))))

(defn retain-all
  "This implementation iterates over the elements of this list, checking
   each element in turn to see if it's contained in coll.
   If it's not contained, it's removed from this list. As a consequence,
   it is advised to use a collection type for coll that provides
   a fast (e.g. O(1)) implementation of Collection.contains(Object).

  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^SetUniqueList this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^SetUniqueList this]
    (-> this (.clear))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^SetUniqueList this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn contains-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^SetUniqueList this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

