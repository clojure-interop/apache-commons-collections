(ns org.apache.commons.collections4.multimap.AbstractListValuedMap
  "Abstract implementation of the ListValuedMap interface to simplify
  the creation of subclass implementations.

  Subclasses specify a Map implementation to use as the internal storage and
  the List implementation to use as values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multimap AbstractListValuedMap]))

(defn get
  "Gets the list of values associated with the specified key. This would
   return an empty list in case the mapping is not present

  key - the key to retrieve - `K`

  returns: the List of values, will return an empty List for no mapping - `java.util.List<V>`"
  (^java.util.List [^AbstractListValuedMap this key]
    (-> this (.get key))))

(defn remove
  "Removes all values associated with the specified key.

   A subsequent get(Object) would return an empty list.

  key - the key to remove values from - `java.lang.Object`

  returns: the List of values removed, will return an empty,
     unmodifiable list for no mapping found. - `java.util.List<V>`"
  (^java.util.List [^AbstractListValuedMap this ^java.lang.Object key]
    (-> this (.remove key))))

