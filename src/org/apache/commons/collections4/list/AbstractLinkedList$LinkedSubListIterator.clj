(ns org.apache.commons.collections4.list.AbstractLinkedList$LinkedSubListIterator
  "A list iterator over the linked sub list."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list AbstractLinkedList$LinkedSubListIterator]))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^AbstractLinkedList$LinkedSubListIterator this]
    (-> this (.hasNext))))

(defn has-previous?
  "Description copied from interface: OrderedIterator

  returns: true if the iterator has a previous element - `boolean`"
  (^Boolean [^AbstractLinkedList$LinkedSubListIterator this]
    (-> this (.hasPrevious))))

(defn next-index
  "returns: `int`"
  (^Integer [^AbstractLinkedList$LinkedSubListIterator this]
    (-> this (.nextIndex))))

(defn add
  "obj - `E`"
  ([^AbstractLinkedList$LinkedSubListIterator this obj]
    (-> this (.add obj))))

(defn remove
  ""
  ([^AbstractLinkedList$LinkedSubListIterator this]
    (-> this (.remove))))

