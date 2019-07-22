(ns org.apache.commons.collections4.list.TreeList
  "A List implementation that is optimised for fast insertions and
  removals at any index in the list.

  This list implementation utilises a tree structure internally to ensure that
  all insertions and removals are O(log n). This provides much faster performance
  than both an ArrayList and a LinkedList where elements
  are inserted and removed repeatedly from anywhere in the list.


  The following relative performance statistics are indicative of this class:



               get  add  insert  iterate  remove
  TreeList       3    5       1       2       1
  ArrayList      1    1      40       1      40
  LinkedList  5800    1     350       2     325

  ArrayList is a good general purpose list implementation.
  It is faster than TreeList for most operations except inserting
  and removing in the middle of the list. ArrayList also uses less
  memory as TreeList uses one object per entry.


  LinkedList is rarely a good choice of implementation.
  TreeList is almost always a good replacement for it, although it
  does use slightly more memory."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list TreeList]))

(defn ->tree-list
  "Constructor.

  Constructs a new empty list that copies the specified collection.

  coll - the collection to copy - `java.util.Collection`

  throws: java.lang.NullPointerException - if the collection is null"
  (^TreeList [^java.util.Collection coll]
    (new TreeList coll))
  (^TreeList []
    (new TreeList )))

(defn add-all
  "Appends all of the elements in the specified collection to the end of this list,
   in the order that they are returned by the specified collection's Iterator.

   This method runs in O(n  log m) time, where m is
   the size of this list and n is the size of c.

  c - the collection to be added to this list - `java.util.Collection`

  returns: true if this list changed as a result of the call - `boolean`

  throws: java.lang.NullPointerException"
  (^Boolean [^TreeList this ^java.util.Collection c]
    (-> this (.addAll c))))

(defn contains
  "Searches for the presence of an object in the list.

  object - the object to check - `java.lang.Object`

  returns: true if the object is found - `boolean`"
  (^Boolean [^TreeList this ^java.lang.Object object]
    (-> this (.contains object))))

(defn list-iterator
  "Gets a ListIterator over the list.

  from-index - the index to start from - `int`

  returns: the new iterator - `java.util.ListIterator<E>`"
  (^java.util.ListIterator [^TreeList this ^Integer from-index]
    (-> this (.listIterator from-index)))
  (^java.util.ListIterator [^TreeList this]
    (-> this (.listIterator))))

(defn iterator
  "Gets an iterator over the list.

  returns: an iterator over the list - `java.util.Iterator<E>`"
  (^java.util.Iterator [^TreeList this]
    (-> this (.iterator))))

(defn remove
  "Removes the element at the specified index.

  index - the index to remove - `int`

  returns: the previous object at that index - `E`"
  ([^TreeList this ^Integer index]
    (-> this (.remove index))))

(defn add
  "Adds a new element to the list.

  index - the index to add before - `int`
  obj - the element to add - `E`"
  ([^TreeList this ^Integer index obj]
    (-> this (.add index obj))))

(defn set
  "Sets the element at the specified index.

  index - the index to set - `int`
  obj - the object to store at the specified index - `E`

  returns: the previous object at that index - `E`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^TreeList this ^Integer index obj]
    (-> this (.set index obj))))

(defn size
  "Gets the current size of the list.

  returns: the current size - `int`"
  (^Integer [^TreeList this]
    (-> this (.size))))

(defn clear
  "Clears the list, removing all entries."
  ([^TreeList this]
    (-> this (.clear))))

(defn index-of
  "Searches for the index of an object in the list.

  object - the object to search - `java.lang.Object`

  returns: the index of the object, -1 if not found - `int`"
  (^Integer [^TreeList this ^java.lang.Object object]
    (-> this (.indexOf object))))

(defn to-array
  "Converts the list into an array.

  returns: the list as an array - `java.lang.Object[]`"
  ([^TreeList this]
    (-> this (.toArray))))

(defn get
  "Gets the element at the specified index.

  index - the index to retrieve - `int`

  returns: the element at the specified index - `E`"
  ([^TreeList this ^Integer index]
    (-> this (.get index))))

