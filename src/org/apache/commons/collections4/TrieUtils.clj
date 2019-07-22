(ns org.apache.commons.collections4.TrieUtils
  "A collection of Trie utilities."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 TrieUtils]))

(defn *unmodifiable-trie
  "Returns an unmodifiable instance of a Trie

  trie - the trie to make unmodifiable, must not be null - `org.apache.commons.collections4.Trie`

  returns: an unmodifiable trie backed by the given trie - `<K,V> org.apache.commons.collections4.Trie<K,V>`

  throws: java.lang.NullPointerException - if trie is null"
  ([^org.apache.commons.collections4.Trie trie]
    (TrieUtils/unmodifiableTrie trie)))

