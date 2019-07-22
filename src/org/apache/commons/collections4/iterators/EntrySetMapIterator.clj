(ns org.apache.commons.collections4.iterators.EntrySetMapIterator
  "Implements a MapIterator using a Map entrySet.
  Reverse iteration is not supported.


  MapIterator it = map.mapIterator();
  while (it.hasNext()) {
    Object key = it.next();
    Object value = it.getValue();
    it.setValue(newValue);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators EntrySetMapIterator]))

(defn ->entry-set-map-iterator
  "Constructor.

  Constructor.

  map - the map to iterate over - `java.util.Map`"
  (^EntrySetMapIterator [^java.util.Map map]
    (new EntrySetMapIterator map)))

(defn has-next?
  "Checks to see if there are more entries still to be iterated.

  returns: true if the iterator has more elements - `boolean`"
  (^Boolean [^EntrySetMapIterator this]
    (-> this (.hasNext))))

(defn next
  "Gets the next key from the Map.

  returns: the next key in the iteration - `K`

  throws: java.util.NoSuchElementException - if the iteration is finished"
  ([^EntrySetMapIterator this]
    (-> this (.next))))

(defn remove
  "Removes the last returned key from the underlying Map.

   This method can be called once per call to next().

  throws: java.lang.UnsupportedOperationException - if remove is not supported by the map"
  ([^EntrySetMapIterator this]
    (-> this (.remove))))

(defn get-key
  "Gets the current key, which is the key returned by the last call
   to next().

  returns: the current key - `K`

  throws: java.lang.IllegalStateException - if next() has not yet been called"
  ([^EntrySetMapIterator this]
    (-> this (.getKey))))

(defn get-value
  "Gets the current value, which is the value associated with the last key
   returned by next().

  returns: the current value - `V`

  throws: java.lang.IllegalStateException - if next() has not yet been called"
  ([^EntrySetMapIterator this]
    (-> this (.getValue))))

(defn set-value
  "Sets the value associated with the current key.

  value - the new value - `V`

  returns: the previous value - `V`

  throws: java.lang.UnsupportedOperationException - if setValue is not supported by the map"
  ([^EntrySetMapIterator this value]
    (-> this (.setValue value))))

(defn reset
  "Resets the state of the iterator."
  ([^EntrySetMapIterator this]
    (-> this (.reset))))

(defn to-string
  "Gets the iterator as a String.

  returns: a string version of the iterator - `java.lang.String`"
  (^java.lang.String [^EntrySetMapIterator this]
    (-> this (.toString))))

