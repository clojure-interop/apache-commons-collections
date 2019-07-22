(ns org.apache.commons.collections4.splitmap.TransformedSplitMap
  "Decorates another Map to transform objects that are added.

  The Map put methods and Map.Entry setValue method are affected by this class.
  Thus objects must be removed or searched for using their transformed form.
  For example, if the transformation converts Strings to Integers, you must use
  the Integer form to remove objects.


  Note that TransformedMap is not synchronized and is not
  thread-safe. If you wish to use this map from multiple threads
  concurrently, you must use appropriate synchronization. The simplest approach
  is to wrap this map using Collections.synchronizedMap(Map).
  This class may throw exceptions when accessed by concurrent threads without
  synchronization.


  The \"put\" and \"get\" type constraints of this class are mutually independent;
  contrast with TransformedMap which,
  by virtue of its implementing Map<K, V>, must be constructed in such
  a way that its read and write parameters are generalized to a common (super-)type.
  In practice this would often mean >Object, Object>, defeating
  much of the usefulness of having parameterized types.


  On the downside, this class is not drop-in compatible with Map
  but is intended to be worked with either directly or by Put and
  Get generalizations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.splitmap TransformedSplitMap]))

(defn *transforming-map
  "Factory method to create a transforming map.

   If there are any elements already in the map being decorated, they are
   NOT transformed.

  map - the map to decorate, must not be null - `java.util.Map`
  key-transformer - the transformer to use for key conversion, must not be null - `org.apache.commons.collections4.Transformer`
  value-transformer - the transformer to use for value conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed map - `<J,K,U,V> org.apache.commons.collections4.splitmap.TransformedSplitMap<J,K,U,V>`

  throws: java.lang.NullPointerException - if map or either of the transformers is null"
  ([^java.util.Map map ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.Transformer value-transformer]
    (TransformedSplitMap/transformingMap map key-transformer value-transformer)))

(defn put
  "Description copied from interface: Put

  key - key with which the specified value is to be associated - `J`
  value - value to be associated with the specified key - `U`

  returns: the previous value associated with key, or
           null if there was no mapping for key.
           (A null return can also indicate that the map
           previously associated null with key,
           if the implementation supports null values.) - `V`"
  ([^TransformedSplitMap this key value]
    (-> this (.put key value))))

(defn put-all
  "map-to-copy - mappings to be stored in this map - `java.util.Map`"
  ([^TransformedSplitMap this ^java.util.Map map-to-copy]
    (-> this (.putAll map-to-copy))))

(defn clear
  ""
  ([^TransformedSplitMap this]
    (-> this (.clear))))

