(ns org.apache.commons.collections4.map.AbstractLinkedMap$EntrySetIterator
  "EntrySet iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractLinkedMap$EntrySetIterator]))

(defn next
  "returns: `java.util.Map$Entry<K,V>`"
  (^java.util.Map$Entry [^AbstractLinkedMap$EntrySetIterator this]
    (-> this (.next))))

(defn previous
  "Description copied from interface: OrderedIterator

  returns: the previous element in the iteration - `java.util.Map$Entry<K,V>`"
  (^java.util.Map$Entry [^AbstractLinkedMap$EntrySetIterator this]
    (-> this (.previous))))

