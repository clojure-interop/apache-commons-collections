(ns org.apache.commons.collections4.IterableMap
  "Defines a map that can be iterated directly without needing to create an entry set.

  A map iterator is an efficient way of iterating over maps.
  There is no need to access the entry set or use Map Entry objects.



  IterableMap<String,Integer> map = new HashedMap<String,Integer>();
  MapIterator<String,Integer> it = map.mapIterator();
  while (it.hasNext()) {
    String key = it.next();
    Integer value = it.getValue();
    it.setValue(value  1);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 IterableMap]))

