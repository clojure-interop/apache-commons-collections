(ns org.apache.commons.collections4.iterators.NodeListIterator
  "An Iterator over a NodeList.

  This iterator does not support remove() as a NodeList does not support
  removal of items."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators NodeListIterator]))

(defn ->node-list-iterator
  "Constructor.

  Convenience constructor, which creates a new NodeListIterator from
   the specified node's childNodes.

  node - Node, who's child nodes are wrapped by this class. Must not be null - `org.w3c.dom.Node`

  throws: java.lang.NullPointerException - if node is null"
  (^NodeListIterator [^org.w3c.dom.Node node]
    (new NodeListIterator node)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^NodeListIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.w3c.dom.Node`"
  (^org.w3c.dom.Node [^NodeListIterator this]
    (-> this (.next))))

(defn remove
  "Throws UnsupportedOperationException.

  throws: java.lang.UnsupportedOperationException - always"
  ([^NodeListIterator this]
    (-> this (.remove))))

