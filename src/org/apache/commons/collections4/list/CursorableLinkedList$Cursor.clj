(ns org.apache.commons.collections4.list.CursorableLinkedList$Cursor
  "An extended ListIterator that allows concurrent changes to
  the underlying list."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list CursorableLinkedList$Cursor]))

(defn remove
  "Removes the item last returned by this iterator.

   There may have been subsequent alterations to the list
   since you obtained this item, however you can still remove it.
   You can even remove it if the item is no longer in the main list.
   However, you can't call this method on the same iterator more
   than once without calling next() or previous().

  throws: java.lang.IllegalStateException - if there is no item to remove"
  ([^CursorableLinkedList$Cursor this]
    (-> this (.remove))))

(defn add
  "Adds an object to the list.
   The object added here will be the new 'previous' in the iterator.

  obj - the object to add - `E`"
  ([^CursorableLinkedList$Cursor this obj]
    (-> this (.add obj))))

(defn next-index
  "Gets the index of the next element to be returned.

  returns: the next index - `int`"
  (^Integer [^CursorableLinkedList$Cursor this]
    (-> this (.nextIndex))))

(defn close
  "Mark this cursor as no longer being needed. Any resources
   associated with this cursor are immediately released.
   In previous versions of this class, it was mandatory to close
   all cursor objects to avoid memory leaks. It is no longer
   necessary to call this close method; an instance of this class
   can now be treated exactly like a normal iterator."
  ([^CursorableLinkedList$Cursor this]
    (-> this (.close))))

