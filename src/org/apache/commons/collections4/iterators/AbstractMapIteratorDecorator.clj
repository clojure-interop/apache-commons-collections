(ns org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator
  "Provides basic behaviour for decorating a map iterator with extra functionality.

  All methods are forwarded to the decorated map iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators AbstractMapIteratorDecorator]))

(defn ->abstract-map-iterator-decorator
  "Constructor.

  Constructor that decorates the specified iterator.

  iterator - the iterator to decorate, must not be null - `org.apache.commons.collections4.MapIterator`

  throws: java.lang.NullPointerException - if the iterator is null"
  (^AbstractMapIteratorDecorator [^org.apache.commons.collections4.MapIterator iterator]
    (new AbstractMapIteratorDecorator iterator)))

(defn has-next?
  "Checks to see if there are more entries still to be iterated.

  returns: true if the iterator has more elements - `boolean`"
  (^Boolean [^AbstractMapIteratorDecorator this]
    (-> this (.hasNext))))

(defn next
  "Gets the next key from the Map.

  returns: the next key in the iteration - `K`"
  ([^AbstractMapIteratorDecorator this]
    (-> this (.next))))

(defn remove
  "Removes the last returned key from the underlying Map (optional operation).

   This method can be called once per call to next()."
  ([^AbstractMapIteratorDecorator this]
    (-> this (.remove))))

(defn get-key
  "Gets the current key, which is the key returned by the last call
   to next().

  returns: the current key - `K`"
  ([^AbstractMapIteratorDecorator this]
    (-> this (.getKey))))

(defn get-value
  "Gets the current value, which is the value associated with the last key
   returned by next().

  returns: the current value - `V`"
  ([^AbstractMapIteratorDecorator this]
    (-> this (.getValue))))

(defn set-value
  "Sets the value associated with the current key (optional operation).

  obj - the new value - `V`

  returns: the previous value - `V`"
  ([^AbstractMapIteratorDecorator this obj]
    (-> this (.setValue obj))))

