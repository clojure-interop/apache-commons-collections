(ns org.apache.commons.collections4.map.AbstractHashedMap$KeySetIterator
  "KeySet iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractHashedMap$KeySetIterator]))

(defn next
  "returns: `K`"
  ([^AbstractHashedMap$KeySetIterator this]
    (-> this (.next))))

