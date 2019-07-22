(ns org.apache.commons.collections4.list.CursorableLinkedList$SubCursor
  "A cursor for the sublist based on LinkedSubListIterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list CursorableLinkedList$SubCursor]))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^CursorableLinkedList$SubCursor this]
    (-> this (.hasNext))))

(defn has-previous?
  "Description copied from interface: OrderedIterator

  returns: true if the iterator has a previous element - `boolean`"
  (^Boolean [^CursorableLinkedList$SubCursor this]
    (-> this (.hasPrevious))))

(defn next-index
  "Description copied from class: CursorableLinkedList.Cursor

  returns: the next index - `int`"
  (^Integer [^CursorableLinkedList$SubCursor this]
    (-> this (.nextIndex))))

(defn add
  "Description copied from class: CursorableLinkedList.Cursor

  obj - the object to add - `E`"
  ([^CursorableLinkedList$SubCursor this obj]
    (-> this (.add obj))))

(defn remove
  "Description copied from class: CursorableLinkedList.Cursor"
  ([^CursorableLinkedList$SubCursor this]
    (-> this (.remove))))

