(ns org.apache.commons.collections4.map.AbstractReferenceMap
  "An abstract implementation of a hash-based map that allows the entries to
  be removed by the garbage collector.

  This class implements all the features necessary for a subclass reference
  hash-based map. Key-value entries are stored in instances of the
  ReferenceEntry class which can be overridden and replaced.
  The iterators can similarly be replaced, without the need to replace the KeySet,
  EntrySet and Values view classes.


  Overridable methods are provided to change the default hashing behaviour, and
  to change how entries are added to and removed from the map. Hopefully, all you
  need for unusual subclasses is here.


  When you construct an AbstractReferenceMap, you can specify what
  kind of references are used to store the map's keys and values.
  If non-hard references are used, then the garbage collector can remove
  mappings if a key or value becomes unreachable, or if the JVM's memory is
  running low. For information on how the different reference types behave,
  see Reference.


  Different types of references can be specified for keys and values.
  The keys can be configured to be weak but the values hard,
  in which case this class will behave like a

  WeakHashMap. However, you can also specify hard keys and
  weak values, or any other combination. The default constructor uses
  hard keys and soft values, providing a memory-sensitive cache.


  This Map implementation does not allow null elements.
  Attempting to add a null key or value to the map will raise a
  NullPointerException.


  All the available iterators can be reset back to the start by casting to
  ResettableIterator and calling reset().


  This implementation is not synchronized.
  You can use Collections.synchronizedMap(java.util.Map<K, V>) to
  provide synchronized access to a ReferenceMap."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractReferenceMap]))

(defn values
  "Returns a collection view of this map's values.

  returns: a set view of this map's values - `java.util.Collection<V>`"
  (^java.util.Collection [^AbstractReferenceMap this]
    (-> this (.values))))

(defn map-iterator
  "Gets a MapIterator over the reference map.
   The iterator only returns valid key/value pairs.

  returns: a map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^AbstractReferenceMap this]
    (-> this (.mapIterator))))

(defn put
  "Puts a key-value mapping into this map.
   Neither the key nor the value may be null.

  key - the key to add, must not be null - `K`
  value - the value to add, must not be null - `V`

  returns: the value previously mapped to this key, null if none - `V`

  throws: java.lang.NullPointerException - if either the key or value is null"
  ([^AbstractReferenceMap this key value]
    (-> this (.put key value))))

(defn entry-set
  "Returns a set view of this map's entries.
   An iterator returned entry is valid until next() is called again.
   The setValue() method on the toArray entries has no effect.

  returns: a set view of this map's entries - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^AbstractReferenceMap this]
    (-> this (.entrySet))))

(defn contains-value
  "Checks whether the map contains the specified value.

  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the value - `boolean`"
  (^Boolean [^AbstractReferenceMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "Removes the specified mapping from this map.

  key - the mapping to remove - `java.lang.Object`

  returns: the value mapped to the removed key, null if key not in map - `V`"
  ([^AbstractReferenceMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Returns a set view of this map's keys.

  returns: a set view of this map's keys - `java.util.Set<K>`"
  (^java.util.Set [^AbstractReferenceMap this]
    (-> this (.keySet))))

(defn empty?
  "Checks whether the map is currently empty.

  returns: true if the map is currently size zero - `boolean`"
  (^Boolean [^AbstractReferenceMap this]
    (-> this (.isEmpty))))

(defn size
  "Gets the size of the map.

  returns: the size - `int`"
  (^Integer [^AbstractReferenceMap this]
    (-> this (.size))))

(defn clear
  "Clears this map."
  ([^AbstractReferenceMap this]
    (-> this (.clear))))

(defn contains-key
  "Checks whether the map contains the specified key.

  key - the key to search for - `java.lang.Object`

  returns: true if the map contains the key - `boolean`"
  (^Boolean [^AbstractReferenceMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "Gets the value mapped to the key specified.

  key - the key - `java.lang.Object`

  returns: the mapped value, null if no match - `V`"
  ([^AbstractReferenceMap this ^java.lang.Object key]
    (-> this (.get key))))

