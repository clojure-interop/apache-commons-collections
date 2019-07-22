(ns org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer
  "An KeyAnalyzer for Strings."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.trie.analyzer StringKeyAnalyzer]))

(defn ->string-key-analyzer
  "Constructor."
  (^StringKeyAnalyzer []
    (new StringKeyAnalyzer )))

(def *-instance
  "Static Constant.

  A singleton instance of StringKeyAnalyzer.

  type: org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer"
  StringKeyAnalyzer/INSTANCE)

(def *-length
  "Static Constant.

  The number of bits per Character.

  type: int"
  StringKeyAnalyzer/LENGTH)

(defn bits-per-element
  "Description copied from class: KeyAnalyzer

  returns: the number of bits per element - `int`"
  (^Integer [^StringKeyAnalyzer this]
    (-> this (.bitsPerElement))))

(defn length-in-bits
  "Description copied from class: KeyAnalyzer

  key - the key - `java.lang.String`

  returns: the bit length of the key - `int`"
  (^Integer [^StringKeyAnalyzer this ^java.lang.String key]
    (-> this (.lengthInBits key))))

(defn bit-index
  "Description copied from class: KeyAnalyzer

  key - the key to use - `java.lang.String`
  offset-in-bits - the bit offset in the key - `int`
  length-in-bits - the maximum key length in bits to use - `int`
  other - the other key to use - `java.lang.String`
  other-offset-in-bits - the bit offset in the other key - `int`
  other-length-in-bits - the maximum key length in bits for the other key - `int`

  returns: the bit index where the key and other first differ - `int`"
  (^Integer [^StringKeyAnalyzer this ^java.lang.String key ^Integer offset-in-bits ^Integer length-in-bits ^java.lang.String other ^Integer other-offset-in-bits ^Integer other-length-in-bits]
    (-> this (.bitIndex key offset-in-bits length-in-bits other other-offset-in-bits other-length-in-bits))))

(defn bit-set?
  "Description copied from class: KeyAnalyzer

  key - the key to check, may not be null - `java.lang.String`
  bit-index - the bit index to check - `int`
  length-in-bits - the maximum key length in bits to check - `int`

  returns: true if the bit is set in the given key and
     bitIndex < lengthInBits, false otherwise. - `boolean`"
  (^Boolean [^StringKeyAnalyzer this ^java.lang.String key ^Integer bit-index ^Integer length-in-bits]
    (-> this (.isBitSet key bit-index length-in-bits))))

(defn prefix?
  "Description copied from class: KeyAnalyzer

  prefix - the prefix to check - `java.lang.String`
  offset-in-bits - the bit offset in the key - `int`
  length-in-bits - the maximum key length in bits to use - `int`
  key - the key to check - `java.lang.String`

  returns: true if this is a valid prefix for the given key - `boolean`"
  (^Boolean [^StringKeyAnalyzer this ^java.lang.String prefix ^Integer offset-in-bits ^Integer length-in-bits ^java.lang.String key]
    (-> this (.isPrefix prefix offset-in-bits length-in-bits key))))

