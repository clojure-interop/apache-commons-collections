(ns org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator
  "Provides basic behaviour for decorating an ordered map iterator with extra functionality.

  All methods are forwarded to the decorated map iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators AbstractOrderedMapIteratorDecorator]))

(defn ->abstract-ordered-map-iterator-decorator
  "Constructor.

  Constructor that decorates the specified iterator.

  iterator - the iterator to decorate, must not be null - `org.apache.commons.collections4.OrderedMapIterator`

  throws: java.lang.NullPointerException - if the iterator is null"
  (^AbstractOrderedMapIteratorDecorator [^org.apache.commons.collections4.OrderedMapIterator iterator]
    (new AbstractOrderedMapIteratorDecorator iterator)))

(defn has-next?
  "Checks to see if there are more entries still to be iterated.

  returns: true if the iterator has more elements - `boolean`"
  (^Boolean [^AbstractOrderedMapIteratorDecorator this]
    (-> this (.hasNext))))

(defn next
  "Gets the next key from the Map.

  returns: the next key in the iteration - `K`"
  ([^AbstractOrderedMapIteratorDecorator this]
    (-> this (.next))))

(defn has-previous?
  "Checks to see if there is a previous entry that can be iterated to.

  returns: true if the iterator has a previous element - `boolean`"
  (^Boolean [^AbstractOrderedMapIteratorDecorator this]
    (-> this (.hasPrevious))))

(defn previous
  "Gets the previous key from the Map.

  returns: the previous key in the iteration - `K`"
  ([^AbstractOrderedMapIteratorDecorator this]
    (-> this (.previous))))

(defn remove
  "Removes the last returned key from the underlying Map (optional operation).

   This method can be called once per call to next()."
  ([^AbstractOrderedMapIteratorDecorator this]
    (-> this (.remove))))

(defn get-key
  "Gets the current key, which is the key returned by the last call
   to next().

  returns: the current key - `K`"
  ([^AbstractOrderedMapIteratorDecorator this]
    (-> this (.getKey))))

(defn get-value
  "Gets the current value, which is the value associated with the last key
   returned by next().

  returns: the current value - `V`"
  ([^AbstractOrderedMapIteratorDecorator this]
    (-> this (.getValue))))

(defn set-value
  "Sets the value associated with the current key (optional operation).

  obj - the new value - `V`

  returns: the previous value - `V`"
  ([^AbstractOrderedMapIteratorDecorator this obj]
    (-> this (.setValue obj))))

