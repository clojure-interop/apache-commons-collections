(ns org.apache.commons.collections4.multimap.AbstractSetValuedMap
  "Abstract implementation of the SetValuedMap interface to simplify the
  creation of subclass implementations.

  Subclasses specify a Map implementation to use as the internal storage and
  the Set implementation to use as values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multimap AbstractSetValuedMap]))

(defn get
  "Gets the set of values associated with the specified key. This would
   return an empty set in case the mapping is not present

  key - the key to retrieve - `K`

  returns: the Set of values, will return an empty
     Set for no mapping - `java.util.Set<V>`"
  (^java.util.Set [^AbstractSetValuedMap this key]
    (-> this (.get key))))

(defn remove
  "Removes all values associated with the specified key.

   A subsequent get(Object) would return an empty set.

  key - the key to remove values from - `java.lang.Object`

  returns: the Set of values removed, will return an empty,
     unmodifiable set for no mapping found. - `java.util.Set<V>`"
  (^java.util.Set [^AbstractSetValuedMap this ^java.lang.Object key]
    (-> this (.remove key))))

