(ns org.apache.commons.collections4.map.AbstractLinkedMap$LinkIterator
  "Base Iterator that iterates in link order."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractLinkedMap$LinkIterator]))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^AbstractLinkedMap$LinkIterator this]
    (-> this (.hasNext))))

(defn has-previous?
  "returns: `boolean`"
  (^Boolean [^AbstractLinkedMap$LinkIterator this]
    (-> this (.hasPrevious))))

(defn remove
  ""
  ([^AbstractLinkedMap$LinkIterator this]
    (-> this (.remove))))

(defn reset
  ""
  ([^AbstractLinkedMap$LinkIterator this]
    (-> this (.reset))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractLinkedMap$LinkIterator this]
    (-> this (.toString))))

