(ns org.apache.commons.collections4.map.TransformedSortedMap
  "Decorates another SortedMap  to transform objects that are added.

  The Map put methods and Map.Entry setValue method are affected by this class.
  Thus objects must be removed or searched for using their transformed form.
  For example, if the transformation converts Strings to Integers, you must
  use the Integer form to remove objects.


  Note that TransformedSortedMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedSortedMap(java.util.SortedMap<K, V>). This class may throw
  exceptions when accessed by concurrent threads without synchronization.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map TransformedSortedMap]))

(defn *transforming-sorted-map
  "Factory method to create a transforming sorted map.

   If there are any elements already in the map being decorated, they are NOT transformed.
   Contrast this with transformedSortedMap(SortedMap, Transformer, Transformer).

  map - the map to decorate, must not be null - `java.util.SortedMap`
  key-transformer - the predicate to validate the keys, null means no transformation - `org.apache.commons.collections4.Transformer`
  value-transformer - the predicate to validate to values, null means no transformation - `org.apache.commons.collections4.Transformer`

  returns: a new transformed sorted map - `<K,V> org.apache.commons.collections4.map.TransformedSortedMap<K,V>`

  throws: java.lang.NullPointerException - if the map is null"
  ([^java.util.SortedMap map ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.Transformer value-transformer]
    (TransformedSortedMap/transformingSortedMap map key-transformer value-transformer)))

(defn *transformed-sorted-map
  "Factory method to create a transforming sorted map that will transform
   existing contents of the specified map.

   If there are any elements already in the map being decorated, they
   will be transformed by this method.
   Contrast this with transformingSortedMap(SortedMap, Transformer, Transformer).

  map - the map to decorate, must not be null - `java.util.SortedMap`
  key-transformer - the transformer to use for key conversion, null means no transformation - `org.apache.commons.collections4.Transformer`
  value-transformer - the transformer to use for value conversion, null means no transformation - `org.apache.commons.collections4.Transformer`

  returns: a new transformed sorted map - `<K,V> org.apache.commons.collections4.map.TransformedSortedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.SortedMap map ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.Transformer value-transformer]
    (TransformedSortedMap/transformedSortedMap map key-transformer value-transformer)))

(defn first-key
  "returns: `K`"
  ([^TransformedSortedMap this]
    (-> this (.firstKey))))

(defn last-key
  "returns: `K`"
  ([^TransformedSortedMap this]
    (-> this (.lastKey))))

(defn comparator
  "returns: `java.util.Comparator<? super K>`"
  ([^TransformedSortedMap this]
    (-> this (.comparator))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^TransformedSortedMap this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^TransformedSortedMap this to-key]
    (-> this (.headMap to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^TransformedSortedMap this from-key]
    (-> this (.tailMap from-key))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^TransformedSortedMap this]
    (-> this (.entrySet))))

