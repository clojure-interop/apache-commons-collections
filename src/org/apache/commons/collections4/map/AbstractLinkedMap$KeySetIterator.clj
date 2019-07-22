(ns org.apache.commons.collections4.map.AbstractLinkedMap$KeySetIterator
  "KeySet iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractLinkedMap$KeySetIterator]))

(defn next
  "returns: `K`"
  ([^AbstractLinkedMap$KeySetIterator this]
    (-> this (.next))))

(defn previous
  "Description copied from interface: OrderedIterator

  returns: the previous element in the iteration - `K`"
  ([^AbstractLinkedMap$KeySetIterator this]
    (-> this (.previous))))

