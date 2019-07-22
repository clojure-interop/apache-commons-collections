(ns org.apache.commons.collections4.map.AbstractHashedMap$EntrySetIterator
  "EntrySet iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractHashedMap$EntrySetIterator]))

(defn next
  "returns: `java.util.Map$Entry<K,V>`"
  (^java.util.Map$Entry [^AbstractHashedMap$EntrySetIterator this]
    (-> this (.next))))

