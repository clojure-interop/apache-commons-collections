(ns org.apache.commons.collections4.SplitMapUtils
  "Utilities for working with \"split maps:\" objects that implement Put
  and/or Get but not Map."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 SplitMapUtils]))

(defn *readable-map
  "Get the specified Get as an instance of IterableMap.
   If get implements IterableMap directly, no conversion will take place.
   If get implements Map but not IterableMap it will be decorated.
   Otherwise an Unmodifiable IterableMap will be returned.

  get - to wrap, must not be null - `org.apache.commons.collections4.Get`

  returns: IterableMap - `<K,V> org.apache.commons.collections4.IterableMap<K,V>`

  throws: java.lang.NullPointerException - if the argument is null"
  ([^org.apache.commons.collections4.Get get]
    (SplitMapUtils/readableMap get)))

(defn *writable-map
  "Get the specified Put as an instanceof Map.
   If put implements Map directly, no conversion will take place.
   Otherwise a write-only Map will be returned.  On such a Map
   it is recommended that the result of #put(K, V) be discarded as it likely will not
   match V at runtime.

  put - to wrap, must not be null - `org.apache.commons.collections4.Put`

  returns: Map - `<K,V> java.util.Map<K,V>`

  throws: java.lang.NullPointerException - if the argument is null"
  ([^org.apache.commons.collections4.Put put]
    (SplitMapUtils/writableMap put)))

