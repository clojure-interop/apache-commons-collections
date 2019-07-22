(ns org.apache.commons.collections4.IterableGet
  "The \"read\" subset of the Map interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 IterableGet]))

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
  (^org.apache.commons.collections4.MapIterator [^IterableGet this]
    (-> this (.mapIterator))))

