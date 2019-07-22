(ns org.apache.commons.collections4.map.AbstractIterableMap
  "Provide a basic IterableMap implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractIterableMap]))

(defn ->abstract-iterable-map
  "Constructor."
  (^AbstractIterableMap []
    (new AbstractIterableMap )))

(defn map-iterator
  "Obtains a MapIterator over the map.

   A map iterator is an efficient way of iterating over maps.
   There is no need to access the entry set or use Map Entry objects.


   IterableMap<String,Integer> map = new HashedMap<String,Integer>();
   MapIterator<String,Integer> it = map.mapIterator();
   while (it.hasNext()) {
     String key = it.next();
     Integer value = it.getValue();
     it.setValue(value  1);
   }

  returns: a map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^AbstractIterableMap this]
    (-> this (.mapIterator))))

