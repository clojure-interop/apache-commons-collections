(ns org.apache.commons.collections4.trie.KeyAnalyzer
  "Defines the interface to analyze Trie keys on a bit level.
  KeyAnalyzer's methods return the length of the key in bits, whether or not a bit is set,
  and bits per element in the key.

  Additionally, a method determines if a key is a prefix of another
  key and returns the bit index where one key is different from another
  key (if the key and found key are equal than the return value is
  EQUAL_BIT_KEY)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.trie KeyAnalyzer]))

(defn ->key-analyzer
  "Constructor."
  (^KeyAnalyzer []
    (new KeyAnalyzer )))

(def *-null-bit-key
  "Static Constant.

  Returned by bitIndex(Object, int, int, Object, int, int)
   if key's bits are all 0.

  type: int"
  KeyAnalyzer/NULL_BIT_KEY)

(def *-equal-bit-key
  "Static Constant.

  Returned by bitIndex(Object, int, int, Object, int, int) if key and found key are equal.
   This is a very very specific case and shouldn't happen on a regular basis.

  type: int"
  KeyAnalyzer/EQUAL_BIT_KEY)

(def *-out-of-bounds-bit-key
  "Static Constant.

  type: int"
  KeyAnalyzer/OUT_OF_BOUNDS_BIT_KEY)

(defn bits-per-element
  "Returns the number of bits per element in the key.
   This is only useful for variable-length keys, such as Strings.

  returns: the number of bits per element - `int`"
  (^Integer [^KeyAnalyzer this]
    (-> this (.bitsPerElement))))

(defn length-in-bits
  "Returns the length of the Key in bits.

  key - the key - `K`

  returns: the bit length of the key - `int`"
  (^Integer [^KeyAnalyzer this key]
    (-> this (.lengthInBits key))))

(defn bit-set?
  "Returns whether or not a bit is set.

  key - the key to check, may not be null - `K`
  bit-index - the bit index to check - `int`
  length-in-bits - the maximum key length in bits to check - `int`

  returns: true if the bit is set in the given key and
     bitIndex < lengthInBits, false otherwise. - `boolean`"
  (^Boolean [^KeyAnalyzer this key ^Integer bit-index ^Integer length-in-bits]
    (-> this (.isBitSet key bit-index length-in-bits))))

(defn bit-index
  "Returns the n-th different bit between key and other. This starts the comparison in
   key at 'offsetInBits' and goes for 'lengthInBits' bits, and compares to the other key starting
   at 'otherOffsetInBits' and going for 'otherLengthInBits' bits.

  key - the key to use - `K`
  offset-in-bits - the bit offset in the key - `int`
  length-in-bits - the maximum key length in bits to use - `int`
  other - the other key to use - `K`
  other-offset-in-bits - the bit offset in the other key - `int`
  other-length-in-bits - the maximum key length in bits for the other key - `int`

  returns: the bit index where the key and other first differ - `int`"
  (^Integer [^KeyAnalyzer this key ^Integer offset-in-bits ^Integer length-in-bits other ^Integer other-offset-in-bits ^Integer other-length-in-bits]
    (-> this (.bitIndex key offset-in-bits length-in-bits other other-offset-in-bits other-length-in-bits))))

(defn prefix?
  "Determines whether or not the given prefix (from offset to length) is a prefix of the given key.

  prefix - the prefix to check - `K`
  offset-in-bits - the bit offset in the key - `int`
  length-in-bits - the maximum key length in bits to use - `int`
  key - the key to check - `K`

  returns: true if this is a valid prefix for the given key - `boolean`"
  (^Boolean [^KeyAnalyzer this prefix ^Integer offset-in-bits ^Integer length-in-bits key]
    (-> this (.isPrefix prefix offset-in-bits length-in-bits key))))

(defn compare
  "o-1 - `K`
  o-2 - `K`

  returns: `int`"
  (^Integer [^KeyAnalyzer this o-1 o-2]
    (-> this (.compare o-1 o-2))))

