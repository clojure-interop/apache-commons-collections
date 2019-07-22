(ns org.apache.commons.collections4.map.TransformedMap
  "Decorates another Map to transform objects that are added.

  The Map put methods and Map.Entry setValue method are affected by this class.
  Thus objects must be removed or searched for using their transformed form.
  For example, if the transformation converts Strings to Integers, you must
  use the Integer form to remove objects.


  Note that TransformedMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  exceptions when accessed by concurrent threads without synchronization.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map TransformedMap]))

(defn *transforming-map
  "Factory method to create a transforming map.

   If there are any elements already in the map being decorated, they
   are NOT transformed.
   Contrast this with transformedMap(Map, Transformer, Transformer).

  map - the map to decorate, must not be null - `java.util.Map`
  key-transformer - the transformer to use for key conversion, null means no transformation - `org.apache.commons.collections4.Transformer`
  value-transformer - the transformer to use for value conversion, null means no transformation - `org.apache.commons.collections4.Transformer`

  returns: a new transformed map - `<K,V> org.apache.commons.collections4.map.TransformedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.Map map ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.Transformer value-transformer]
    (TransformedMap/transformingMap map key-transformer value-transformer)))

(defn *transformed-map
  "Factory method to create a transforming map that will transform
   existing contents of the specified map.

   If there are any elements already in the map being decorated, they
   will be transformed by this method.
   Contrast this with transformingMap(Map, Transformer, Transformer).

  map - the map to decorate, must not be null - `java.util.Map`
  key-transformer - the transformer to use for key conversion, null means no transformation - `org.apache.commons.collections4.Transformer`
  value-transformer - the transformer to use for value conversion, null means no transformation - `org.apache.commons.collections4.Transformer`

  returns: a new transformed map - `<K,V> org.apache.commons.collections4.map.TransformedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.Map map ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.Transformer value-transformer]
    (TransformedMap/transformedMap map key-transformer value-transformer)))

(defn put
  "Description copied from interface: Put

  key - key with which the specified value is to be associated - `K`
  value - value to be associated with the specified key - `V`

  returns: the previous value associated with key, or
           null if there was no mapping for key.
           (A null return can also indicate that the map
           previously associated null with key,
           if the implementation supports null values.) - `V`"
  ([^TransformedMap this key value]
    (-> this (.put key value))))

(defn put-all
  "map-to-copy - mappings to be stored in this map - `java.util.Map`"
  ([^TransformedMap this ^java.util.Map map-to-copy]
    (-> this (.putAll map-to-copy))))

(defn entry-set
  "returns: a set view of the mappings contained in this map - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^TransformedMap this]
    (-> this (.entrySet))))

