(ns org.apache.commons.collections4.map.CompositeMap
  "Decorates a map of other maps to provide a single unified view.

  Changes made to this map will actually be made on the decorated map.
  Add and remove operations require the use of a pluggable strategy. If no
  strategy is provided then add and remove are unsupported.


  Note that CompositeMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  exceptions when accessed by concurrent threads without synchronization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map CompositeMap]))

(defn ->composite-map
  "Constructor.

  Create a new CompositeMap with two composited Map instances.

  one - the first Map to be composited - `java.util.Map`
  two - the second Map to be composited - `java.util.Map`
  mutator - MapMutator to be used for mutation operations - `org.apache.commons.collections4.map.CompositeMap$MapMutator`"
  (^CompositeMap [^java.util.Map one ^java.util.Map two ^org.apache.commons.collections4.map.CompositeMap$MapMutator mutator]
    (new CompositeMap one two mutator))
  (^CompositeMap [^java.util.Map one ^java.util.Map two]
    (new CompositeMap one two))
  (^CompositeMap [^java.util.Map composite]
    (new CompositeMap composite))
  (^CompositeMap []
    (new CompositeMap )))

(defn set-mutator
  "Specify the MapMutator to be used by mutation operations.

  mutator - the MapMutator to be used for mutation delegation - `org.apache.commons.collections4.map.CompositeMap$MapMutator`"
  ([^CompositeMap this ^org.apache.commons.collections4.map.CompositeMap$MapMutator mutator]
    (-> this (.setMutator mutator))))

(defn remove-composited
  "Remove a Map from the composite.

  map - the Map to be removed from the composite - `java.util.Map`

  returns: The removed Map or null if map is not in the composite - `java.util.Map<K,V>`"
  (^java.util.Map [^CompositeMap this ^java.util.Map map]
    (-> this (.removeComposited map))))

(defn values
  "Returns a collection view of the values contained in this map.  The
   collection is backed by the map, so changes to the map are reflected in
   the collection, and vice-versa.  If the map is modified while an
   iteration over the collection is in progress, the results of the
   iteration are undefined.  The collection supports element removal,
   which removes the corresponding mapping from the map, via the
   Iterator.remove, Collection.remove,
   removeAll, retainAll and clear operations.
   It does not support the add or addAll operations.

  returns: a collection view of the values contained in this map. - `java.util.Collection<V>`"
  (^java.util.Collection [^CompositeMap this]
    (-> this (.values))))

(defn add-composited
  "Add an additional Map to the composite.

  map - the Map to be added to the composite - `java.util.Map`

  throws: java.lang.IllegalArgumentException - if there is a key collision and there is no MapMutator set to handle it."
  ([^CompositeMap this ^java.util.Map map]
    (-> this (.addComposited map))))

(defn put-all
  "Copies all of the mappings from the specified map to this map
   (optional operation).  The effect of this call is equivalent to that
   of calling put(k, v) on this map once
   for each mapping from key k to value v in the
   specified map.  The behavior of this operation is unspecified if the
   specified map is modified while the operation is in progress.

  map - Mappings to be stored in this map. - `java.util.Map`

  throws: java.lang.UnsupportedOperationException - if the putAll method is not supported by this map."
  ([^CompositeMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Associates the specified value with the specified key in this map
   (optional operation).  If the map previously contained a mapping for
   this key, the old value is replaced by the specified value.  (A map
   m is said to contain a mapping for a key k if and only
   if m.containsKey(k) would return
   true.))

  key - key with which the specified value is to be associated. - `K`
  value - value to be associated with the specified key. - `V`

  returns: previous value associated with specified key, or null
           if there was no mapping for key.  A null return can
           also indicate that the map previously associated null
           with the specified key, if the implementation supports
           null values. - `V`

  throws: java.lang.UnsupportedOperationException - if no MapMutator has been specified"
  ([^CompositeMap this key value]
    (-> this (.put key value))))

(defn entry-set
  "Returns a set view of the mappings contained in this map.  Each element
   in the returned set is a Map.Entry.  The set is backed by the
   map, so changes to the map are reflected in the set, and vice-versa.
   If the map is modified while an iteration over the set is in progress,
   the results of the iteration are undefined.  The set supports element
   removal, which removes the corresponding mapping from the map, via the
   Iterator.remove, Set.remove, removeAll,
   retainAll and clear operations.  It does not support
   the add or addAll operations.

   This implementation returns a CompositeSet which
   composites the entry sets from all of the composited maps.

  returns: a set view of the mappings contained in this map. - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^CompositeMap this]
    (-> this (.entrySet))))

(defn contains-value
  "Returns true if this map maps one or more keys to the
   specified value.  More formally, returns true if and only if
   this map contains at least one mapping to a value v such that
   (value==null ? v==null : value.equals(v)).  This operation
   will probably require time linear in the map size for most
   implementations of the Map interface.

  value - value whose presence in this map is to be tested. - `java.lang.Object`

  returns: true if this map maps one or more keys to the
           specified value. - `boolean`

  throws: java.lang.ClassCastException - if the value is of an inappropriate type for this map (optional)."
  (^Boolean [^CompositeMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "Removes the mapping for this key from this map if it is present
   (optional operation).   More formally, if this map contains a mapping
   from key k to value v such that
   (key==null ?  k==null : key.equals(k)), that mapping
   is removed.  (The map can contain at most one such mapping.)

   Returns the value to which the map previously associated the key, or
   null if the map contained no mapping for this key.  (A
   null return can also indicate that the map previously
   associated null with the specified key if the implementation
   supports null values.)  The map will not contain a mapping for
   the specified  key once the call returns.

  key - key whose mapping is to be removed from the map. - `java.lang.Object`

  returns: previous value associated with specified key, or null
           if there was no mapping for key. - `V`

  throws: java.lang.ClassCastException - if the key is of an inappropriate type for the composited map (optional)."
  ([^CompositeMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Returns a set view of the keys contained in this map.  The set is
   backed by the map, so changes to the map are reflected in the set, and
   vice-versa.  If the map is modified while an iteration over the set is
   in progress, the results of the iteration are undefined.  The set
   supports element removal, which removes the corresponding mapping from
   the map, via the Iterator.remove, Set.remove,
   removeAll retainAll, and clear operations.
   It does not support the add or addAll operations.

   This implementation returns a CompositeSet which
   composites the key sets from all of the composited maps.

  returns: a set view of the keys contained in this map. - `java.util.Set<K>`"
  (^java.util.Set [^CompositeMap this]
    (-> this (.keySet))))

(defn hash-code
  "Gets a hash code for the Map as per the Map specification.

  returns: `int`"
  (^Integer [^CompositeMap this]
    (-> this (.hashCode))))

(defn empty?
  "Returns true if this map contains no key-value mappings.

  returns: true if this map contains no key-value mappings. - `boolean`"
  (^Boolean [^CompositeMap this]
    (-> this (.isEmpty))))

(defn size
  "Returns the number of key-value mappings in this map.  If the
   map contains more than Integer.MAX_VALUE elements, returns
   Integer.MAX_VALUE.

  returns: the number of key-value mappings in this map. - `int`"
  (^Integer [^CompositeMap this]
    (-> this (.size))))

(defn clear
  "Calls clear() on all composited Maps.

  throws: java.lang.UnsupportedOperationException - if any of the composited Maps do not support clear()"
  ([^CompositeMap this]
    (-> this (.clear))))

(defn contains-key
  "Returns true if this map contains a mapping for the specified
   key.  More formally, returns true if and only if
   this map contains at a mapping for a key k such that
   (key==null ? k==null : key.equals(k)).  (There can be
   at most one such mapping.)

  key - key whose presence in this map is to be tested. - `java.lang.Object`

  returns: true if this map contains a mapping for the specified
           key. - `boolean`

  throws: java.lang.ClassCastException - if the key is of an inappropriate type for this map (optional)."
  (^Boolean [^CompositeMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "Returns the value to which this map maps the specified key.  Returns
   null if the map contains no mapping for this key.  A return
   value of null does not necessarily indicate that the
   map contains no mapping for the key; it's also possible that the map
   explicitly maps the key to null.  The containsKey
   operation may be used to distinguish these two cases.

   More formally, if this map contains a mapping from a key
   k to a value v such that (key==null ? k==null :
   key.equals(k)), then this method returns v; otherwise
   it returns null.  (There can be at most one such mapping.)

  key - key whose associated value is to be returned. - `java.lang.Object`

  returns: the value to which this map maps the specified key, or
           null if the map contains no mapping for this key. - `V`

  throws: java.lang.ClassCastException - if the key is of an inappropriate type for this map (optional)."
  ([^CompositeMap this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "Checks if this Map equals another as per the Map specification.

  obj - the object to compare to - `java.lang.Object`

  returns: true if the maps are equal - `boolean`"
  (^Boolean [^CompositeMap this ^java.lang.Object obj]
    (-> this (.equals obj))))

