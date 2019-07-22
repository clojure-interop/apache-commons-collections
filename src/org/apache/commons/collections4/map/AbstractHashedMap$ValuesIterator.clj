(ns org.apache.commons.collections4.map.AbstractHashedMap$ValuesIterator
  "Values iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractHashedMap$ValuesIterator]))

(defn next
  "returns: `V`"
  ([^AbstractHashedMap$ValuesIterator this]
    (-> this (.next))))

