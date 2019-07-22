(ns org.apache.commons.collections4.SetValuedMap
  "Defines a map that holds a set of values against each key.

  A SetValuedMap is a Map with slightly different semantics:


    Putting a value into the map will add the value to a Set at that key.
    Getting a value will return a Set, holding all the values put to that key."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 SetValuedMap]))

(defn get
  "Gets the set of values associated with the specified key.

   Implementations typically return an empty Set if no values
   have been mapped to the key.

  key - the key to retrieve - `K`

  returns: the Set of values, implementations should return an
     empty Set for no mapping - `java.util.Set<V>`

  throws: java.lang.NullPointerException - if the key is null and null keys are invalid"
  (^java.util.Set [^SetValuedMap this key]
    (-> this (.get key))))

(defn remove
  "Removes all values associated with the specified key.

   The returned set may be modifiable, but updates will not be
   propagated to this set-valued map. In case no mapping was stored for the
   specified key, an empty, unmodifiable set will be returned.

  key - the key to remove values from - `java.lang.Object`

  returns: the Set of values removed, implementations should
     return null for no mapping found, but may return an empty collection - `java.util.Set<V>`

  throws: java.lang.UnsupportedOperationException - if the map is unmodifiable"
  (^java.util.Set [^SetValuedMap this ^java.lang.Object key]
    (-> this (.remove key))))

