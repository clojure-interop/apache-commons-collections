(ns org.apache.commons.collections4.list.CursorableLinkedList
  "A List implementation with a ListIterator that
  allows concurrent modifications to the underlying list.

  This implementation supports all of the optional List operations.
  It extends AbstractLinkedList and thus provides the
  stack/queue/dequeue operations available in LinkedList.


  The main feature of this class is the ability to modify the list and the
  iterator at the same time. Both the listIterator() and cursor()
  methods provides access to a Cursor instance which extends
  ListIterator. The cursor allows changes to the list concurrent
  with changes to the iterator. Note that the iterator() method and
  sublists do not provide this cursor behaviour.


  The Cursor class is provided partly for backwards compatibility
  and partly because it allows the cursor to be directly closed. Closing the
  cursor is optional because references are held via a WeakReference.
  For most purposes, simply modify the iterator and list at will, and then let
  the garbage collector to the rest.


  Note that this implementation is not synchronized."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list CursorableLinkedList]))

(defn ->cursorable-linked-list
  "Constructor.

  Constructor that copies the specified collection

  coll - the collection to copy - `java.util.Collection`"
  (^CursorableLinkedList [^java.util.Collection coll]
    (new CursorableLinkedList coll))
  (^CursorableLinkedList []
    (new CursorableLinkedList )))

(defn iterator
  "Returns an iterator that does not support concurrent modification.

   If the underlying list is modified while iterating using this iterator
   a ConcurrentModificationException will occur.
   The cursor behaviour is available via listIterator().

  returns: a new iterator that does not support concurrent modification - `java.util.Iterator<E>`"
  (^java.util.Iterator [^CursorableLinkedList this]
    (-> this (.iterator))))

(defn list-iterator
  "Returns a cursor iterator that allows changes to the underlying list in parallel.

   The cursor enables iteration and list changes to occur in any order without
   invalidating the iterator (from one thread). When elements are added to the
   list, an event is fired to all active cursors enabling them to adjust to the
   change in the list.

   When the \"current\" (i.e., last returned by ListIterator.next()
   or ListIterator.previous()) element of the list is removed,
   the cursor automatically adjusts to the change (invalidating the
   last returned value such that it cannot be removed).

  from-index - the index to start from - `int`

  returns: a new cursor iterator - `java.util.ListIterator<E>`"
  (^java.util.ListIterator [^CursorableLinkedList this ^Integer from-index]
    (-> this (.listIterator from-index)))
  (^java.util.ListIterator [^CursorableLinkedList this]
    (-> this (.listIterator))))

(defn cursor
  "Returns a CursorableLinkedList.Cursor for iterating through the elements of this list
   starting from a specified index.

   A Cursor is a ListIterator with an additional
   close() method. Calling this method immediately discards the
   references to the cursor. If it is not called, then the garbage collector
   will still remove the reference as it is held via a WeakReference.

   The cursor enables iteration and list changes to occur in any order without
   invalidating the iterator (from one thread). When elements are added to the
   list, an event is fired to all active cursors enabling them to adjust to the
   change in the list.

   When the \"current\" (i.e., last returned by ListIterator.next()
   or ListIterator.previous()) element of the list is removed,
   the cursor automatically adjusts to the change (invalidating the
   last returned value such that it cannot be removed).

   The listIterator(int) method returns the same as this method, and can
   be cast to a Cursor if the close method is required.

  from-index - the index to start from - `int`

  returns: a new cursor iterator - `org.apache.commons.collections4.list.CursorableLinkedList$Cursor<E>`

  throws: java.lang.IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())."
  (^org.apache.commons.collections4.list.CursorableLinkedList$Cursor [^CursorableLinkedList this ^Integer from-index]
    (-> this (.cursor from-index)))
  (^org.apache.commons.collections4.list.CursorableLinkedList$Cursor [^CursorableLinkedList this]
    (-> this (.cursor))))

