(ns org.apache.commons.collections4.keyvalue.MultiKey
  "A MultiKey allows multiple map keys to be merged together.

  The purpose of this class is to avoid the need to write code to handle
  maps of maps. An example might be the need to look up a file name by
  key and locale. The typical solution might be nested maps. This class
  can be used instead by creating an instance passing in the key and locale.


  Example usage:



  // populate map with data mapping key+locale to localizedText
  Map map = new HashMap();
  MultiKey multiKey = new MultiKey(key, locale);
  map.put(multiKey, localizedText);

  // later retrieve the localized text
  MultiKey multiKey = new MultiKey(key, locale);
  String localizedText = (String) map.get(multiKey);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.keyvalue MultiKey]))

(defn ->multi-key
  "Constructor.

  Constructor taking five keys.

   The keys should be immutable
   If they are not then they must not be changed after adding to the MultiKey.

  key-1 - the first key - `K`
  key-2 - the second key - `K`
  key-3 - the third key - `K`
  key-4 - the fourth key - `K`
  key-5 - the fifth key - `K`"
  (^MultiKey [key-1 key-2 key-3 key-4 key-5]
    (new MultiKey key-1 key-2 key-3 key-4 key-5))
  (^MultiKey [key-1 key-2 key-3 key-4]
    (new MultiKey key-1 key-2 key-3 key-4))
  (^MultiKey [key-1 key-2 key-3]
    (new MultiKey key-1 key-2 key-3))
  (^MultiKey [key-1 key-2]
    (new MultiKey key-1 key-2))
  (^MultiKey [keys]
    (new MultiKey keys)))

(defn get-keys
  "Gets a clone of the array of keys.

   The keys should be immutable
   If they are not then they must not be changed.

  returns: the individual keys - `K[]`"
  ([^MultiKey this]
    (-> this (.getKeys))))

(defn get-key
  "Gets the key at the specified index.

   The key should be immutable.
   If it is not then it must not be changed.

  index - the index to retrieve - `int`

  returns: the key at the index - `K`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^MultiKey this ^Integer index]
    (-> this (.getKey index))))

(defn size
  "Gets the size of the list of keys.

  returns: the size of the list of keys - `int`"
  (^Integer [^MultiKey this]
    (-> this (.size))))

(defn equals
  "Compares this object to another.

   To be equal, the other object must be a MultiKey with the
   same number of keys which are also equal.

  other - the other object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^MultiKey this ^java.lang.Object other]
    (-> this (.equals other))))

(defn hash-code
  "Gets the combined hash code that is computed from all the keys.

   This value is computed once and then cached, so elements should not
   change their hash codes once created (note that this is the same
   constraint that would be used if the individual keys elements were
   themselves Map keys.

  returns: the hash code - `int`"
  (^Integer [^MultiKey this]
    (-> this (.hashCode))))

(defn to-string
  "Gets a debugging string version of the key.

  returns: a debugging string - `java.lang.String`"
  (^java.lang.String [^MultiKey this]
    (-> this (.toString))))

