(ns org.apache.commons.collections4.list.NodeCachingLinkedList
  "A List implementation that stores a cache of internal Node objects
  in an effort to reduce wasteful object creation.

  A linked list creates one Node for each item of data added. This can result in
  a lot of object creation and garbage collection. This implementation seeks to
  avoid that by maintaining a store of cached nodes.


  This implementation is suitable for long-lived lists where both add and remove
  are used. Short-lived lists, or lists which only grow will have worse performance
  using this class.


  Note that this implementation is not synchronized."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list NodeCachingLinkedList]))

(defn ->node-caching-linked-list
  "Constructor.

  Constructor that copies the specified collection

  coll - the collection to copy - `java.util.Collection`"
  (^NodeCachingLinkedList [^java.util.Collection coll]
    (new NodeCachingLinkedList coll))
  (^NodeCachingLinkedList []
    (new NodeCachingLinkedList )))

