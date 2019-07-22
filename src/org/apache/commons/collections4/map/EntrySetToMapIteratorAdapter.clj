(ns org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter
  "Adapts a Map entrySet to the MapIterator interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map EntrySetToMapIteratorAdapter]))

(defn ->entry-set-to-map-iterator-adapter
  "Constructor.

  Create a new EntrySetToMapIteratorAdapter.

  entry-set - the entrySet to adapt - `java.util.Set`"
  (^EntrySetToMapIteratorAdapter [^java.util.Set entry-set]
    (new EntrySetToMapIteratorAdapter entry-set)))

(defn get-key
  "Gets the current key, which is the key returned by the last call
   to next().

  returns: the current key - `K`"
  ([^EntrySetToMapIteratorAdapter this]
    (-> this (.getKey))))

(defn get-value
  "Gets the current value, which is the value associated with the last key
   returned by next().

  returns: the current value - `V`"
  ([^EntrySetToMapIteratorAdapter this]
    (-> this (.getValue))))

(defn set-value
  "Sets the value associated with the current key (optional operation).

  value - the new value - `V`

  returns: the previous value - `V`"
  ([^EntrySetToMapIteratorAdapter this value]
    (-> this (.setValue value))))

(defn has-next?
  "Checks to see if there are more entries still to be iterated.

  returns: true if the iterator has more elements - `boolean`"
  (^Boolean [^EntrySetToMapIteratorAdapter this]
    (-> this (.hasNext))))

(defn next
  "Gets the next key from the Map.

  returns: the next key in the iteration - `K`"
  ([^EntrySetToMapIteratorAdapter this]
    (-> this (.next))))

(defn reset
  "Resets the iterator back to the position at which the iterator
   was created."
  ([^EntrySetToMapIteratorAdapter this]
    (-> this (.reset))))

(defn remove
  "Removes the last returned key from the underlying Map (optional operation).

   This method can be called once per call to next()."
  ([^EntrySetToMapIteratorAdapter this]
    (-> this (.remove))))

