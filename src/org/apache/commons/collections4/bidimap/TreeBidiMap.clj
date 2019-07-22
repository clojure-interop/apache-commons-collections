(ns org.apache.commons.collections4.bidimap.TreeBidiMap
  "Red-Black tree-based implementation of BidiMap where all objects added
  implement the Comparable interface.

  This class guarantees that the map will be in both ascending key order
  and ascending value order, sorted according to the natural order for
  the key's and value's classes.


  This Map is intended for applications that need to be able to look
  up a key-value pairing by either key or value, and need to do so
  with equal efficiency.


  While that goal could be accomplished by taking a pair of TreeMaps
  and redirecting requests to the appropriate TreeMap (e.g.,
  containsKey would be directed to the TreeMap that maps values to
  keys, containsValue would be directed to the TreeMap that maps keys
  to values), there are problems with that implementation.
  If the data contained in the TreeMaps is large, the cost of redundant
  storage becomes significant. The DualTreeBidiMap and
  DualHashBidiMap implementations use this approach.


  This solution keeps minimizes the data storage by holding data only once.
  The red-black algorithm is based on TreeMap, but has been modified
  to simultaneously map a tree node by key and by value. This doubles the
  cost of put operations (but so does using two TreeMaps), and nearly doubles
  the cost of remove operations (there is a savings in that the lookup of the
  node to be removed only has to be performed once). And since only one node
  contains the key and value, storage is significantly less than that
  required by two TreeMaps.


  The Map.Entry instances returned by the appropriate methods will
  not allow setValue() and will throw an
  UnsupportedOperationException on attempts to call that method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap TreeBidiMap]))

(defn ->tree-bidi-map
  "Constructor.

  Constructs a new TreeBidiMap by copying an existing Map.

  map - the map to copy - `java.util.Map`

  throws: java.lang.ClassCastException - if the keys/values in the map are not Comparable or are not mutually comparable"
  (^TreeBidiMap [^java.util.Map map]
    (new TreeBidiMap map))
  (^TreeBidiMap []
    (new TreeBidiMap )))

(defn values
  "Returns a set view of the values contained in this map in key order.
   The returned object can be cast to a Set.

   The set is backed by the map, so changes to the map are reflected in
   the set, and vice-versa. If the map is modified while an iteration over
   the set is in progress, the results of the iteration are undefined.

   The set supports element removal, which removes the corresponding mapping
   from the map. It does not support the add or addAll operations.

  returns: a set view of the values contained in this map. - `java.util.Set<V>`"
  (^java.util.Set [^TreeBidiMap this]
    (-> this (.values))))

(defn map-iterator
  "Description copied from interface: IterableGet

  returns: a map iterator - `org.apache.commons.collections4.OrderedMapIterator<K,V>`"
  (^org.apache.commons.collections4.OrderedMapIterator [^TreeBidiMap this]
    (-> this (.mapIterator))))

(defn put-all
  "Puts all the mappings from the specified map into this map.

   All keys and values must implement Comparable.

  map - the map to copy from - `java.util.Map`"
  ([^TreeBidiMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Puts the key-value pair into the map, replacing any previous pair.

   When adding a key-value pair, the value may already exist in the map
   against a different key. That mapping is removed, to ensure that the
   value only occurs once in the inverse map.


    BidiMap map1 = new TreeBidiMap();
    map.put(\"A\",\"B\");  // contains A mapped to B, as per Map
    map.put(\"A\",\"C\");  // contains A mapped to C, as per Map

    BidiMap map2 = new TreeBidiMap();
    map.put(\"A\",\"B\");  // contains A mapped to B, as per Map
    map.put(\"C\",\"B\");  // contains C mapped to B, key A is removed

   Both key and value must implement Comparable.

  key - key with which the specified value is to be associated - `K`
  value - value to be associated with the specified key - `V`

  returns: the previous value for the key - `V`

  throws: java.lang.ClassCastException - if the key is of an inappropriate type"
  ([^TreeBidiMap this key value]
    (-> this (.put key value))))

(defn inverse-bidi-map
  "Gets the inverse map for comparison.

  returns: the inverse map - `org.apache.commons.collections4.OrderedBidiMap<V,K>`"
  (^org.apache.commons.collections4.OrderedBidiMap [^TreeBidiMap this]
    (-> this (.inverseBidiMap))))

(defn entry-set
  "Returns a set view of the entries contained in this map in key order.
   For simple iteration through the map, the MapIterator is quicker.

   The set is backed by the map, so changes to the map are reflected in
   the set, and vice-versa. If the map is modified while an iteration over
   the set is in progress, the results of the iteration are undefined.

   The set supports element removal, which removes the corresponding mapping
   from the map. It does not support the add or addAll operations.
   The returned MapEntry objects do not support setValue.

  returns: a set view of the values contained in this map. - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^TreeBidiMap this]
    (-> this (.entrySet))))

(defn get-key
  "Returns the key to which this map maps the specified value.
   Returns null if the map contains no mapping for this value.

   The value must implement Comparable.

  value - value whose associated key is to be returned. - `java.lang.Object`

  returns: the key to which this map maps the specified value,
    or null if the map contains no mapping for this value. - `K`

  throws: java.lang.ClassCastException - if the value is of an inappropriate type"
  ([^TreeBidiMap this ^java.lang.Object value]
    (-> this (.getKey value))))

(defn remove-value
  "Removes the mapping for this value from this map if present.

   The value must implement Comparable.

  value - value whose mapping is to be removed from the map - `java.lang.Object`

  returns: previous key associated with specified value,
    or null if there was no mapping for value. - `K`

  throws: java.lang.ClassCastException - if the value is of an inappropriate type"
  ([^TreeBidiMap this ^java.lang.Object value]
    (-> this (.removeValue value))))

(defn to-string
  "Returns a string version of this Map in standard format.

  returns: a standard format string version of the map - `java.lang.String`"
  (^java.lang.String [^TreeBidiMap this]
    (-> this (.toString))))

(defn first-key
  "Gets the first (lowest) key currently in this map.

  returns: the first (lowest) key currently in this sorted map - `K`

  throws: java.util.NoSuchElementException - if this map is empty"
  ([^TreeBidiMap this]
    (-> this (.firstKey))))

(defn contains-value
  "Checks whether this map contains the a mapping for the specified value.

   The value must implement Comparable.

  value - value whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified value - `boolean`

  throws: java.lang.ClassCastException - if the value is of an inappropriate type"
  (^Boolean [^TreeBidiMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn last-key
  "Gets the last (highest) key currently in this map.

  returns: the last (highest) key currently in this sorted map - `K`

  throws: java.util.NoSuchElementException - if this map is empty"
  ([^TreeBidiMap this]
    (-> this (.lastKey))))

(defn remove
  "Removes the mapping for this key from this map if present.

   The key must implement Comparable.

  key - key whose mapping is to be removed from the map. - `java.lang.Object`

  returns: previous value associated with specified key,
    or null if there was no mapping for key. - `V`

  throws: java.lang.ClassCastException - if the key is of an inappropriate type"
  ([^TreeBidiMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Returns a set view of the keys contained in this map in key order.

   The set is backed by the map, so changes to the map are reflected in
   the set, and vice-versa. If the map is modified while an iteration over
   the set is in progress, the results of the iteration are undefined.

   The set supports element removal, which removes the corresponding mapping
   from the map. It does not support the add or addAll operations.

  returns: a set view of the keys contained in this map. - `java.util.Set<K>`"
  (^java.util.Set [^TreeBidiMap this]
    (-> this (.keySet))))

(defn next-key
  "Gets the next key after the one specified.

   The key must implement Comparable.

  key - the key to search for next from - `K`

  returns: the next key, null if no match or at end - `K`"
  ([^TreeBidiMap this key]
    (-> this (.nextKey key))))

(defn previous-key
  "Gets the previous key before the one specified.

   The key must implement Comparable.

  key - the key to search for previous from - `K`

  returns: the previous key, null if no match or at start - `K`"
  ([^TreeBidiMap this key]
    (-> this (.previousKey key))))

(defn hash-code
  "Gets the hash code value for this map as per the API.

  returns: the hash code value for this map - `int`"
  (^Integer [^TreeBidiMap this]
    (-> this (.hashCode))))

(defn empty?
  "Checks whether the map is empty or not.

  returns: true if the map is empty - `boolean`"
  (^Boolean [^TreeBidiMap this]
    (-> this (.isEmpty))))

(defn size
  "Returns the number of key-value mappings in this map.

  returns: the number of key-value mappings in this map - `int`"
  (^Integer [^TreeBidiMap this]
    (-> this (.size))))

(defn clear
  "Removes all mappings from this map."
  ([^TreeBidiMap this]
    (-> this (.clear))))

(defn contains-key
  "Checks whether this map contains the a mapping for the specified key.

   The key must implement Comparable.

  key - key whose presence in this map is to be tested - `java.lang.Object`

  returns: true if this map contains a mapping for the specified key - `boolean`

  throws: java.lang.ClassCastException - if the key is of an inappropriate type"
  (^Boolean [^TreeBidiMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "Gets the value to which this map maps the specified key.
   Returns null if the map contains no mapping for this key.

   The key must implement Comparable.

  key - key whose associated value is to be returned - `java.lang.Object`

  returns: the value to which this map maps the specified key,
    or null if the map contains no mapping for this key - `V`

  throws: java.lang.ClassCastException - if the key is of an inappropriate type"
  ([^TreeBidiMap this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "Compares for equals as per the API.

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^TreeBidiMap this ^java.lang.Object obj]
    (-> this (.equals obj))))

