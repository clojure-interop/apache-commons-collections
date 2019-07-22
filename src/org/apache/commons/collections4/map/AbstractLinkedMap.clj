(ns org.apache.commons.collections4.map.AbstractLinkedMap
  "An abstract implementation of a hash-based map that links entries to create an
  ordered map and which provides numerous points for subclasses to override.

  This class implements all the features necessary for a subclass linked
  hash-based map. Key-value entries are stored in instances of the
  LinkEntry class which can be overridden and replaced.
  The iterators can similarly be replaced, without the need to replace the KeySet,
  EntrySet and Values view classes.


  Overridable methods are provided to change the default hashing behaviour, and
  to change how entries are added to and removed from the map. Hopefully, all you
  need for unusual subclasses is here.


  This implementation maintains order by original insertion, but subclasses
  may work differently. The OrderedMap interface is implemented
  to provide access to bidirectional iteration and extra convenience methods.


  The orderedMapIterator() method provides direct access to a
  bidirectional iterator. The iterators from the other views can also be cast
  to OrderedIterator if required.


  All the available iterators can be reset back to the start by casting to
  ResettableIterator and calling reset().


  The implementation is also designed to be subclassed, with lots of useful
  methods exposed."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractLinkedMap]))

(defn contains-value
  "Checks whether the map contains the specified value.

  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the value - `boolean`"
  (^Boolean [^AbstractLinkedMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn clear
  "Clears the map, resetting the size to zero and nullifying references
   to avoid garbage collection issues."
  ([^AbstractLinkedMap this]
    (-> this (.clear))))

(defn first-key
  "Gets the first key in the map, which is the first inserted.

  returns: the eldest key - `K`"
  ([^AbstractLinkedMap this]
    (-> this (.firstKey))))

(defn last-key
  "Gets the last key in the map, which is the most recently inserted.

  returns: the most recently inserted key - `K`"
  ([^AbstractLinkedMap this]
    (-> this (.lastKey))))

(defn next-key
  "Gets the next key in sequence.

  key - the key to get after - `java.lang.Object`

  returns: the next key - `K`"
  ([^AbstractLinkedMap this ^java.lang.Object key]
    (-> this (.nextKey key))))

(defn previous-key
  "Gets the previous key in sequence.

  key - the key to get before - `java.lang.Object`

  returns: the previous key - `K`"
  ([^AbstractLinkedMap this ^java.lang.Object key]
    (-> this (.previousKey key))))

(defn map-iterator
  "Gets an iterator over the map.
   Changes made to the iterator affect this map.

   A MapIterator returns the keys in the map. It also provides convenient
   methods to get the key and value, and set the value.
   It avoids the need to create an entrySet/keySet/values object.
   It also avoids creating the Map.Entry object.

  returns: the map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^AbstractLinkedMap this]
    (-> this (.mapIterator))))

