(ns org.apache.commons.collections4.ListValuedMap
  "Defines a map that holds a list of values against each key.

  A ListValuedMap is a Map with slightly different semantics:


    Putting a value into the map will add the value to a List at that key.
    Getting a value will return a List, holding all the values put to that key."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 ListValuedMap]))

(defn get
  "Gets the list of values associated with the specified key.

   This method will return an empty list if
   MultiValuedMap.containsKey(Object) returns false. Changes to the
   returned list will update the underlying ListValuedMap and
   vice-versa.

  key - the key to retrieve - `K`

  returns: the List of values, implementations should return an
     empty List for no mapping - `java.util.List<V>`

  throws: java.lang.NullPointerException - if the key is null and null keys are invalid"
  (^java.util.List [^ListValuedMap this key]
    (-> this (.get key))))

(defn remove
  "Removes all values associated with the specified key.

   The returned list may be modifiable, but updates will not be
   propagated to this list-valued map. In case no mapping was stored for the
   specified key, an empty, unmodifiable list will be returned.

  key - the key to remove values from - `java.lang.Object`

  returns: the List of values removed, implementations
     typically return an empty, unmodifiable List for no mapping found - `java.util.List<V>`

  throws: java.lang.UnsupportedOperationException - if the map is unmodifiable"
  (^java.util.List [^ListValuedMap this ^java.lang.Object key]
    (-> this (.remove key))))

