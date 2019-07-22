(ns org.apache.commons.collections4.list.AbstractLinkedList$LinkedListIterator
  "A list iterator over the linked list."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list AbstractLinkedList$LinkedListIterator]))

(defn next
  "returns: `E`"
  ([^AbstractLinkedList$LinkedListIterator this]
    (-> this (.next))))

(defn has-previous?
  "Description copied from interface: OrderedIterator

  returns: true if the iterator has a previous element - `boolean`"
  (^Boolean [^AbstractLinkedList$LinkedListIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "returns: `int`"
  (^Integer [^AbstractLinkedList$LinkedListIterator this]
    (-> this (.previousIndex))))

(defn previous
  "Description copied from interface: OrderedIterator

  returns: the previous element in the iteration - `E`"
  ([^AbstractLinkedList$LinkedListIterator this]
    (-> this (.previous))))

(defn remove
  ""
  ([^AbstractLinkedList$LinkedListIterator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^AbstractLinkedList$LinkedListIterator this]
    (-> this (.hasNext))))

(defn add
  "obj - `E`"
  ([^AbstractLinkedList$LinkedListIterator this obj]
    (-> this (.add obj))))

(defn set
  "obj - `E`"
  ([^AbstractLinkedList$LinkedListIterator this obj]
    (-> this (.set obj))))

(defn next-index
  "returns: `int`"
  (^Integer [^AbstractLinkedList$LinkedListIterator this]
    (-> this (.nextIndex))))

