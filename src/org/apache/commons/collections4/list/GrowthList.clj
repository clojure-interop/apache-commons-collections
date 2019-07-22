(ns org.apache.commons.collections4.list.GrowthList
  "Decorates another List to make it seamlessly grow when
  indices larger than the list size are used on add and set,
  avoiding most IndexOutOfBoundsExceptions.

  This class avoids errors by growing when a set or add method would
  normally throw an IndexOutOfBoundsException.
  Note that IndexOutOfBoundsException IS returned for invalid negative indices.


  Trying to set or add to an index larger than the size will cause the list
  to grow (using null elements). Clearly, care must be taken
  not to use excessively large indices, as the internal list will grow to
  match.


  Trying to use any method other than add or set with an invalid index will
  call the underlying list and probably result in an IndexOutOfBoundsException.


  Take care when using this list with null values, as
  null is the value added when growing the list.


  All sub-lists will access the underlying list directly, and will throw
  IndexOutOfBoundsExceptions.


  This class differs from LazyList because here growth occurs on
  set and add, where LazyList grows on get. However, they
  can be used together by decorating twice."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list GrowthList]))

(defn ->growth-list
  "Constructor.

  Constructor that uses an ArrayList internally.

  initial-size - the initial size of the ArrayList - `int`

  throws: java.lang.IllegalArgumentException - if initial size is invalid"
  (^GrowthList [^Integer initial-size]
    (new GrowthList initial-size))
  (^GrowthList []
    (new GrowthList )))

(defn *growth-list
  "Factory method to create a growth list.

  list - the list to decorate, must not be null - `java.util.List`

  returns: a new growth list - `<E> org.apache.commons.collections4.list.GrowthList<E>`

  throws: java.lang.NullPointerException - if list is null"
  ([^java.util.List list]
    (GrowthList/growthList list)))

(defn add
  "Decorate the add method to perform the growth behaviour.

   If the requested index is greater than the current size, the list will
   grow to the new size. Indices between the old size and the requested
   size will be filled with null.

   If the index is less than the current size, the value will be added to
   the underlying list directly.
   If the index is less than zero, the underlying list is called, which
   will probably throw an IndexOutOfBoundsException.

  index - the index to add at - `int`
  element - the object to add at the specified index - `E`

  throws: java.lang.UnsupportedOperationException - if the underlying list doesn't implement set"
  ([^GrowthList this ^Integer index element]
    (-> this (.add index element))))

(defn add-all
  "Decorate the addAll method to perform the growth behaviour.

   If the requested index is greater than the current size, the list will
   grow to the new size. Indices between the old size and the requested
   size will be filled with null.

   If the index is less than the current size, the values will be added to
   the underlying list directly.
   If the index is less than zero, the underlying list is called, which
   will probably throw an IndexOutOfBoundsException.

  index - the index to add at - `int`
  coll - the collection to add at the specified index - `java.util.Collection`

  returns: true if the list changed - `boolean`

  throws: java.lang.UnsupportedOperationException - if the underlying list doesn't implement set"
  (^Boolean [^GrowthList this ^Integer index ^java.util.Collection coll]
    (-> this (.addAll index coll))))

(defn set
  "Decorate the set method to perform the growth behaviour.

   If the requested index is greater than the current size, the list will
   grow to the new size. Indices between the old size and the requested
   size will be filled with null.

   If the index is less than the current size, the value will be set onto
   the underlying list directly.
   If the index is less than zero, the underlying list is called, which
   will probably throw an IndexOutOfBoundsException.

  index - the index to set - `int`
  element - the object to set at the specified index - `E`

  returns: the object previously at that index - `E`

  throws: java.lang.UnsupportedOperationException - if the underlying list doesn't implement set"
  ([^GrowthList this ^Integer index element]
    (-> this (.set index element))))

