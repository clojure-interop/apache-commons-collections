(ns org.apache.commons.collections4.MapIterator
  "Defines an iterator that operates over a Map.

  This iterator is a special version designed for maps. It can be more
  efficient to use this rather than an entry set iterator where the option
  is available, and it is certainly more convenient.


  A map that provides this interface may not hold the data internally using
  Map Entry objects, thus this interface can avoid lots of object creation.


  In use, this iterator iterates through the keys in the map. After each call
  to next(), the getValue() method provides direct
  access to the value. The value can also be set using setValue().



  MapIterator<String,Integer> it = map.mapIterator();
  while (it.hasNext()) {
    String key = it.next();
    Integer value = it.getValue();
    it.setValue(value  1);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 MapIterator]))

(defn has-next?
  "Checks to see if there are more entries still to be iterated.

  returns: true if the iterator has more elements - `boolean`"
  (^Boolean [^MapIterator this]
    (-> this (.hasNext))))

(defn next
  "Gets the next key from the Map.

  returns: the next key in the iteration - `K`

  throws: java.util.NoSuchElementException - if the iteration is finished"
  ([^MapIterator this]
    (-> this (.next))))

(defn get-key
  "Gets the current key, which is the key returned by the last call
   to next().

  returns: the current key - `K`

  throws: java.lang.IllegalStateException - if next() has not yet been called"
  ([^MapIterator this]
    (-> this (.getKey))))

(defn get-value
  "Gets the current value, which is the value associated with the last key
   returned by next().

  returns: the current value - `V`

  throws: java.lang.IllegalStateException - if next() has not yet been called"
  ([^MapIterator this]
    (-> this (.getValue))))

(defn remove
  "Removes the last returned key from the underlying Map (optional operation).

   This method can be called once per call to next().

  throws: java.lang.UnsupportedOperationException - if remove is not supported by the map"
  ([^MapIterator this]
    (-> this (.remove))))

(defn set-value
  "Sets the value associated with the current key (optional operation).

  value - the new value - `V`

  returns: the previous value - `V`

  throws: java.lang.UnsupportedOperationException - if setValue is not supported by the map"
  ([^MapIterator this value]
    (-> this (.setValue value))))

