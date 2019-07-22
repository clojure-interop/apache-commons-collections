(ns org.apache.commons.collections4.map.AbstractHashedMap$HashIterator
  "Base Iterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractHashedMap$HashIterator]))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^AbstractHashedMap$HashIterator this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^AbstractHashedMap$HashIterator this]
    (-> this (.remove))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractHashedMap$HashIterator this]
    (-> this (.toString))))

