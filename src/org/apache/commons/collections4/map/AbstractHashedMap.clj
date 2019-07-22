(ns org.apache.commons.collections4.map.AbstractHashedMap
  "An abstract implementation of a hash-based map which provides numerous points for
  subclasses to override.

  This class implements all the features necessary for a subclass hash-based map.
  Key-value entries are stored in instances of the HashEntry class,
  which can be overridden and replaced. The iterators can similarly be replaced,
  without the need to replace the KeySet, EntrySet and Values view classes.

  Overridable methods are provided to change the default hashing behaviour, and
  to change how entries are added to and removed from the map. Hopefully, all you
  need for unusual subclasses is here.

  NOTE: From Commons Collections 3.1 this class extends AbstractMap.
  This is to provide backwards compatibility for ReferenceMap between v3.0 and v3.1.
  This extends clause will be removed in v5.0."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractHashedMap]))

(defn values
  "Gets the values view of the map.
   Changes made to the view affect this map.
   To simply iterate through the values, use mapIterator().

  returns: the values view - `java.util.Collection<V>`"
  (^java.util.Collection [^AbstractHashedMap this]
    (-> this (.values))))

(defn map-iterator
  "Gets an iterator over the map.
   Changes made to the iterator affect this map.

   A MapIterator returns the keys in the map. It also provides convenient
   methods to get the key and value, and set the value.
   It avoids the need to create an entrySet/keySet/values object.
   It also avoids creating the Map.Entry object.

  returns: the map iterator - `org.apache.commons.collections4.MapIterator<K,V>`"
  (^org.apache.commons.collections4.MapIterator [^AbstractHashedMap this]
    (-> this (.mapIterator))))

(defn put-all
  "Puts all the values from the specified map into this map.

   This implementation iterates around the specified map and
   uses put(Object, Object).

  map - the map to add - `java.util.Map`

  throws: java.lang.NullPointerException - if the map is null"
  ([^AbstractHashedMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Puts a key-value mapping into this map.

  key - the key to add - `K`
  value - the value to add - `V`

  returns: the value previously mapped to this key, null if none - `V`"
  ([^AbstractHashedMap this key value]
    (-> this (.put key value))))

(defn entry-set
  "Gets the entrySet view of the map.
   Changes made to the view affect this map.
   To simply iterate through the entries, use mapIterator().

  returns: the entrySet view - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^AbstractHashedMap this]
    (-> this (.entrySet))))

(defn to-string
  "Gets the map as a String.

  returns: a string version of the map - `java.lang.String`"
  (^java.lang.String [^AbstractHashedMap this]
    (-> this (.toString))))

(defn contains-value
  "Checks whether the map contains the specified value.

  value - the value to search for - `java.lang.Object`

  returns: true if the map contains the value - `boolean`"
  (^Boolean [^AbstractHashedMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "Removes the specified mapping from this map.

  key - the mapping to remove - `java.lang.Object`

  returns: the value mapped to the removed key, null if key not in map - `V`"
  ([^AbstractHashedMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Gets the keySet view of the map.
   Changes made to the view affect this map.
   To simply iterate through the keys, use mapIterator().

  returns: the keySet view - `java.util.Set<K>`"
  (^java.util.Set [^AbstractHashedMap this]
    (-> this (.keySet))))

(defn hash-code
  "Gets the standard Map hashCode.

  returns: the hash code defined in the Map interface - `int`"
  (^Integer [^AbstractHashedMap this]
    (-> this (.hashCode))))

(defn empty?
  "Checks whether the map is currently empty.

  returns: true if the map is currently size zero - `boolean`"
  (^Boolean [^AbstractHashedMap this]
    (-> this (.isEmpty))))

(defn size
  "Gets the size of the map.

  returns: the size - `int`"
  (^Integer [^AbstractHashedMap this]
    (-> this (.size))))

(defn clear
  "Clears the map, resetting the size to zero and nullifying references
   to avoid garbage collection issues."
  ([^AbstractHashedMap this]
    (-> this (.clear))))

(defn contains-key
  "Checks whether the map contains the specified key.

  key - the key to search for - `java.lang.Object`

  returns: true if the map contains the key - `boolean`"
  (^Boolean [^AbstractHashedMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "Gets the value mapped to the key specified.

  key - the key - `java.lang.Object`

  returns: the mapped value, null if no match - `V`"
  ([^AbstractHashedMap this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "Compares this map with another.

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^AbstractHashedMap this ^java.lang.Object obj]
    (-> this (.equals obj))))

