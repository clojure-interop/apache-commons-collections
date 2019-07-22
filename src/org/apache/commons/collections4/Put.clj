(ns org.apache.commons.collections4.Put
  "The \"write\" subset of the Map interface.

  NOTE: in the original Map interface, Map.put(Object, Object) is known
  to have the same return type as Map.get(Object), namely V. Put
  makes no assumptions in this regard (there is no association with, nor even knowledge
  of, a \"reading\" interface) and thus defines put(Object, Object) as returning
  Object."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 Put]))

(defn clear
  ""
  ([^Put this]
    (-> this (.clear))))

(defn put
  "Note that the return type is Object, rather than V as in the Map interface.
   See the class Javadoc for further info.

  key - key with which the specified value is to be associated - `K`
  value - value to be associated with the specified key - `V`

  returns: the previous value associated with key, or
           null if there was no mapping for key.
           (A null return can also indicate that the map
           previously associated null with key,
           if the implementation supports null values.) - `java.lang.Object`"
  (^java.lang.Object [^Put this key value]
    (-> this (.put key value))))

(defn put-all
  "t - mappings to be stored in this map - `java.util.Map`"
  ([^Put this ^java.util.Map t]
    (-> this (.putAll t))))

