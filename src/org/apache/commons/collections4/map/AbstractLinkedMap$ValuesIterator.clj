(ns org.apache.commons.collections4.map.AbstractLinkedMap$ValuesIterator
  "Values iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractLinkedMap$ValuesIterator]))

(defn next
  "returns: `V`"
  ([^AbstractLinkedMap$ValuesIterator this]
    (-> this (.next))))

(defn previous
  "Description copied from interface: OrderedIterator

  returns: the previous element in the iteration - `V`"
  ([^AbstractLinkedMap$ValuesIterator this]
    (-> this (.previous))))

