(ns org.apache.commons.collections4.trie.AbstractBitwiseTrie
  "This class provides some basic Trie functionality and
  utility methods for actual bitwise Trie implementations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.trie AbstractBitwiseTrie]))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractBitwiseTrie this]
    (-> this (.toString))))

