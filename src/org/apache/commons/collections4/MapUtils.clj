(ns org.apache.commons.collections4.MapUtils
  "Provides utility methods and decorators for
  Map and SortedMap instances.

  It contains various type safe methods
  as well as other useful features like deep copying.


  It also provides the following decorators:



   fixedSizeMap(Map)
   fixedSizeSortedMap(SortedMap)
   lazyMap(Map,Factory)
   lazyMap(Map,Transformer)
   lazySortedMap(SortedMap,Factory)
   lazySortedMap(SortedMap,Transformer)
   predicatedMap(Map,Predicate,Predicate)
   predicatedSortedMap(SortedMap,Predicate,Predicate)
   transformedMap(Map, Transformer, Transformer)
   transformedSortedMap(SortedMap, Transformer, Transformer)
   multiValueMap( Map )
   multiValueMap( Map, Class )
   multiValueMap( Map, Factory )"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 MapUtils]))

(def *-empty-sorted-map
  "Static Constant.

  An empty unmodifiable sorted map.
   This is not provided in the JDK.

  type: java.util.SortedMap"
  MapUtils/EMPTY_SORTED_MAP)

(defn *get-byte
  "Looks up the given key in the given map, converting the result into
   a byte, using the default value if the conversion fails.

  map - the map whose value to look up - `java.util.Map`
  key - the key of the value to look up in that map - `K`
  default-value - what to return if the value is null or if the conversion fails - `java.lang.Byte`

  returns: the value in the map as a number, or defaultValue if the
     original value is null, the map is null or the number conversion fails - `<K> java.lang.Byte`"
  ([^java.util.Map map key ^java.lang.Byte default-value]
    (MapUtils/getByte map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getByte map key)))

(defn *get-short-value
  "Gets a short from a Map in a null-safe manner,
   using the default value if the conversion fails.

   The short is obtained from the results of getNumber(Map,Object).

  map - the map to use - `java.util.Map`
  key - the key to look up - `K`
  default-value - return if the value is null or if the conversion fails - `short`

  returns: the value in the Map as a short, defaultValue if null map input - `<K> short`"
  ([^java.util.Map map key ^Short default-value]
    (MapUtils/getShortValue map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getShortValue map key)))

(defn *fixed-size-map
  "Returns a fixed-sized map backed by the given map.
   Elements may not be added or removed from the returned map, but
   existing elements can be changed (for instance, via the
   Map.put(Object,Object) method).

  map - the map whose size to fix, must not be null - `java.util.Map`

  returns: a fixed-size map backed by that map - `<K,V> org.apache.commons.collections4.IterableMap<K,V>`

  throws: java.lang.NullPointerException - if the Map is null"
  ([^java.util.Map map]
    (MapUtils/fixedSizeMap map)))

(defn *iterable-sorted-map
  "Get the specified SortedMap as an IterableSortedMap.

  sorted-map - to wrap if necessary - `java.util.SortedMap`

  returns: IterableSortedMap<K, V> - `<K,V> org.apache.commons.collections4.IterableSortedMap<K,V>`

  throws: java.lang.NullPointerException - if sortedMap is null"
  ([^java.util.SortedMap sorted-map]
    (MapUtils/iterableSortedMap sorted-map)))

(defn *put-all
  "Puts all the keys and values from the specified array into the map.

   This method is an alternative to the Map.putAll(java.util.Map)
   method and constructors. It allows you to build a map from an object array
   of various possible styles.

   If the first entry in the object array implements Map.Entry
   or KeyValue then the key and value are added from that object.
   If the first entry in the object array is an object array itself, then
   it is assumed that index 0 in the sub-array is the key and index 1 is the value.
   Otherwise, the array is treated as keys and values in alternate indices.

   For example, to create a color map:


   Map colorMap = MapUtils.putAll(new HashMap(), new String[][] {
       {\"RED\", \"#FF0000\"},
       {\"GREEN\", \"#00FF00\"},
       {\"BLUE\", \"#0000FF\"}
   });
   or:


   Map colorMap = MapUtils.putAll(new HashMap(), new String[] {
       \"RED\", \"#FF0000\",
       \"GREEN\", \"#00FF00\",
       \"BLUE\", \"#0000FF\"
   });
   or:


   Map colorMap = MapUtils.putAll(new HashMap(), new Map.Entry[] {
       new DefaultMapEntry(\"RED\", \"#FF0000\"),
       new DefaultMapEntry(\"GREEN\", \"#00FF00\"),
       new DefaultMapEntry(\"BLUE\", \"#0000FF\")
   });

  map - the map to populate, must not be null - `java.util.Map`
  array - an array to populate from, null ignored - `java.lang.Object[]`

  returns: the input map - `<K,V> java.util.Map<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.Map map array]
    (MapUtils/putAll map array)))

(defn *get-map
  "Looks up the given key in the given map, converting the result into
   a map, using the default value if the conversion fails.

  map - the map whose value to look up - `java.util.Map`
  key - the key of the value to look up in that map - `K`
  default-value - what to return if the value is null or if the conversion fails - `java.util.Map`

  returns: the value in the map as a number, or defaultValue if the
     original value is null, the map is null or the map conversion fails - `<K> java.util.Map<?,?>`"
  ([^java.util.Map map key ^java.util.Map default-value]
    (MapUtils/getMap map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getMap map key)))

(defn *get-string
  "Looks up the given key in the given map, converting the result into
   a string, using the default value if the conversion fails.

  map - the map whose value to look up - `java.util.Map`
  key - the key of the value to look up in that map - `K`
  default-value - what to return if the value is null or if the conversion fails - `java.lang.String`

  returns: the value in the map as a string, or defaultValue if the
     original value is null, the map is null or the string conversion fails - `<K> java.lang.String`"
  ([^java.util.Map map key ^java.lang.String default-value]
    (MapUtils/getString map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getString map key)))

(defn *get-number
  "Looks up the given key in the given map, converting the result into
   a number, using the default value if the conversion fails.

  map - the map whose value to look up - `java.util.Map`
  key - the key of the value to look up in that map - `K`
  default-value - what to return if the value is null or if the conversion fails - `java.lang.Number`

  returns: the value in the map as a number, or defaultValue if the
     original value is null, the map is null or the number conversion fails - `<K> java.lang.Number`"
  ([^java.util.Map map key ^java.lang.Number default-value]
    (MapUtils/getNumber map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getNumber map key)))

(defn *synchronized-sorted-map
  "Returns a synchronized sorted map backed by the given sorted map.

   You must manually synchronize on the returned buffer's iterator to
   avoid non-deterministic behavior:



   Map m = MapUtils.synchronizedSortedMap(myMap);
   Set s = m.keySet();  // outside synchronized block
   synchronized (m) {  // synchronized on MAP!
       Iterator i = s.iterator();
       while (i.hasNext()) {
           process (i.next());
       }
   }

   This method uses the implementation in Collections.

  map - the map to synchronize, must not be null - `java.util.SortedMap`

  returns: a synchronized map backed by the given map - `<K,V> java.util.SortedMap<K,V>`

  throws: java.lang.NullPointerException - if the map is null"
  ([^java.util.SortedMap map]
    (MapUtils/synchronizedSortedMap map)))

(defn *get-long-value
  "Gets a long from a Map in a null-safe manner,
   using the default value if the conversion fails.

   The long is obtained from the results of getNumber(Map,Object).

  map - the map to use - `java.util.Map`
  key - the key to look up - `K`
  default-value - return if the value is null or if the conversion fails - `long`

  returns: the value in the Map as a long, defaultValue if null map input - `<K> long`"
  ([^java.util.Map map key ^Long default-value]
    (MapUtils/getLongValue map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getLongValue map key)))

(defn *get-short
  "Looks up the given key in the given map, converting the result into
   a short, using the default value if the conversion fails.

  map - the map whose value to look up - `java.util.Map`
  key - the key of the value to look up in that map - `K`
  default-value - what to return if the value is null or if the conversion fails - `java.lang.Short`

  returns: the value in the map as a number, or defaultValue if the
     original value is null, the map is null or the number conversion fails - `<K> java.lang.Short`"
  ([^java.util.Map map key ^java.lang.Short default-value]
    (MapUtils/getShort map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getShort map key)))

(defn *ordered-map
  "Returns a map that maintains the order of keys that are added
   backed by the given map.

   If a key is added twice, the order is determined by the first add.
   The order is observed through the keySet, values and entrySet.

  map - the map to order, must not be null - `java.util.Map`

  returns: an ordered map backed by the given map - `<K,V> org.apache.commons.collections4.OrderedMap<K,V>`

  throws: java.lang.NullPointerException - if the Map is null"
  ([^java.util.Map map]
    (MapUtils/orderedMap map)))

(defn *get-float-value
  "Gets a float from a Map in a null-safe manner,
   using the default value if the conversion fails.

   The float is obtained from the results of getNumber(Map,Object).

  map - the map to use - `java.util.Map`
  key - the key to look up - `K`
  default-value - return if the value is null or if the conversion fails - `float`

  returns: the value in the Map as a float, defaultValue if null map input - `<K> float`"
  ([^java.util.Map map key ^Float default-value]
    (MapUtils/getFloatValue map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getFloatValue map key)))

(defn *get-object
  "Looks up the given key in the given map, converting null into the
   given default value.

  map - the map whose value to look up - `java.util.Map`
  key - the key of the value to look up in that map - `K`
  default-value - what to return if the value is null - `V`

  returns: the value in the map, or defaultValue if the original value
     is null or the map is null - `<K,V> V`"
  ([^java.util.Map map key default-value]
    (MapUtils/getObject map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getObject map key)))

(defn *get-long
  "Looks up the given key in the given map, converting the result into
   a long, using the default value if the conversion fails.

  map - the map whose value to look up - `java.util.Map`
  key - the key of the value to look up in that map - `K`
  default-value - what to return if the value is null or if the conversion fails - `java.lang.Long`

  returns: the value in the map as a number, or defaultValue if the
     original value is null, the map is null or the number conversion fails - `<K> java.lang.Long`"
  ([^java.util.Map map key ^java.lang.Long default-value]
    (MapUtils/getLong map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getLong map key)))

(defn *predicated-map
  "Returns a predicated (validating) map backed by the given map.

   Only objects that pass the tests in the given predicates can be added to the map.
   Trying to add an invalid object results in an IllegalArgumentException.
   Keys must pass the key predicate, values must pass the value predicate.
   It is important not to use the original map after invoking this method,
   as it is a backdoor for adding invalid objects.

  map - the map to predicate, must not be null - `java.util.Map`
  key-pred - the predicate for keys, null means no check - `org.apache.commons.collections4.Predicate`
  value-pred - the predicate for values, null means no check - `org.apache.commons.collections4.Predicate`

  returns: a predicated map backed by the given map - `<K,V> org.apache.commons.collections4.IterableMap<K,V>`

  throws: java.lang.NullPointerException - if the Map is null"
  ([^java.util.Map map ^org.apache.commons.collections4.Predicate key-pred ^org.apache.commons.collections4.Predicate value-pred]
    (MapUtils/predicatedMap map key-pred value-pred)))

(defn *to-properties
  "Gets a new Properties object initialised with the values from a Map.
   A null input will return an empty properties object.

   A Properties object may only store non-null keys and values, thus if
   the provided map contains either a key or value which is null,
   a NullPointerException will be thrown.

  map - the map to convert to a Properties object - `java.util.Map`

  returns: the properties object - `<K,V> java.util.Properties`

  throws: java.lang.NullPointerException - if a key or value in the provided map is null"
  ([^java.util.Map map]
    (MapUtils/toProperties map)))

(defn *empty-if-null
  "Returns an immutable empty map if the argument is null,
   or the argument itself otherwise.

  map - the map, possibly null - `java.util.Map`

  returns: an empty map if the argument is null - `<K,V> java.util.Map<K,V>`"
  ([^java.util.Map map]
    (MapUtils/emptyIfNull map)))

(defn *predicated-sorted-map
  "Returns a predicated (validating) sorted map backed by the given map.

   Only objects that pass the tests in the given predicates can be added to the map.
   Trying to add an invalid object results in an IllegalArgumentException.
   Keys must pass the key predicate, values must pass the value predicate.
   It is important not to use the original map after invoking this method,
   as it is a backdoor for adding invalid objects.

  map - the map to predicate, must not be null - `java.util.SortedMap`
  key-pred - the predicate for keys, null means no check - `org.apache.commons.collections4.Predicate`
  value-pred - the predicate for values, null means no check - `org.apache.commons.collections4.Predicate`

  returns: a predicated map backed by the given map - `<K,V> java.util.SortedMap<K,V>`

  throws: java.lang.NullPointerException - if the SortedMap is null"
  ([^java.util.SortedMap map ^org.apache.commons.collections4.Predicate key-pred ^org.apache.commons.collections4.Predicate value-pred]
    (MapUtils/predicatedSortedMap map key-pred value-pred)))

(defn *not-empty?
  "Null-safe check if the specified map is not empty.

   Null returns false.

  map - the map to check, may be null - `java.util.Map`

  returns: true if non-null and non-empty - `boolean`"
  (^Boolean [^java.util.Map map]
    (MapUtils/isNotEmpty map)))

(defn *iterable-map
  "Get the specified Map as an IterableMap.

  map - to wrap if necessary. - `java.util.Map`

  returns: IterableMap<K, V> - `<K,V> org.apache.commons.collections4.IterableMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^java.util.Map map]
    (MapUtils/iterableMap map)))

(defn *unmodifiable-map
  "Returns an unmodifiable map backed by the given map.

   This method uses the implementation in the decorators subpackage.

  map - the map to make unmodifiable, must not be null - `java.util.Map`

  returns: an unmodifiable map backed by the given map - `<K,V> java.util.Map<K,V>`

  throws: java.lang.NullPointerException - if the map is null"
  ([^java.util.Map map]
    (MapUtils/unmodifiableMap map)))

(defn *transformed-map
  "Returns a transformed map backed by the given map.

   This method returns a new map (decorating the specified map) that
   will transform any new entries added to it.
   Existing entries in the specified map will not be transformed.
   If you want that behaviour, see TransformedMap.transformedMap(java.util.Map<K, V>, org.apache.commons.collections4.Transformer<? super K, ? extends K>, org.apache.commons.collections4.Transformer<? super V, ? extends V>).

   Each object is passed through the transformers as it is added to the
   Map. It is important not to use the original map after invoking this
   method, as it is a backdoor for adding untransformed objects.

   If there are any elements already in the map being decorated, they
   are NOT transformed.

  map - the map to transform, must not be null, typically empty - `java.util.Map`
  key-transformer - the transformer for the map keys, null means no transformation - `org.apache.commons.collections4.Transformer`
  value-transformer - the transformer for the map values, null means no transformation - `org.apache.commons.collections4.Transformer`

  returns: a transformed map backed by the given map - `<K,V> org.apache.commons.collections4.IterableMap<K,V>`

  throws: java.lang.NullPointerException - if the Map is null"
  ([^java.util.Map map ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.Transformer value-transformer]
    (MapUtils/transformedMap map key-transformer value-transformer)))

(defn *to-map
  "Creates a new HashMap using data copied from a ResourceBundle.

  resource-bundle - the resource bundle to convert, may not be null - `java.util.ResourceBundle`

  returns: the hashmap containing the data - `java.util.Map<java.lang.String,java.lang.Object>`

  throws: java.lang.NullPointerException - if the bundle is null"
  (^java.util.Map [^java.util.ResourceBundle resource-bundle]
    (MapUtils/toMap resource-bundle)))

(defn *get-integer
  "Looks up the given key in the given map, converting the result into
   an integer, using the default value if the conversion fails.

  map - the map whose value to look up - `java.util.Map`
  key - the key of the value to look up in that map - `K`
  default-value - what to return if the value is null or if the conversion fails - `java.lang.Integer`

  returns: the value in the map as a number, or defaultValue if the
     original value is null, the map is null or the number conversion fails - `<K> java.lang.Integer`"
  ([^java.util.Map map key ^java.lang.Integer default-value]
    (MapUtils/getInteger map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getInteger map key)))

(defn *lazy-sorted-map
  "Returns a \"lazy\" sorted map whose values will be created on demand.

   When the key passed to the returned map's Map.get(Object)
   method is not present in the map, then the factory will be used
   to create a new object and that object will become the value
   associated with that key.

   For instance:



   Factory factory = new Factory() {
       public Object create() {
           return new Date();
       }
   }
   SortedMap lazy = MapUtils.lazySortedMap(new TreeMap(), factory);
   Object obj = lazy.get(\"test\");

   After the above code is executed, obj will contain
   a new Date instance.  Furthermore, that Date
   instance is the value for the \"test\" key.

  map - the map to make lazy, must not be null - `java.util.SortedMap`
  factory - the factory for creating new objects, must not be null - `org.apache.commons.collections4.Factory`

  returns: a lazy map backed by the given map - `<K,V> java.util.SortedMap<K,V>`

  throws: java.lang.NullPointerException - if the SortedMap or Factory is null"
  ([^java.util.SortedMap map ^org.apache.commons.collections4.Factory factory]
    (MapUtils/lazySortedMap map factory)))

(defn *get-double-value
  "Gets a double from a Map in a null-safe manner,
   using the default value if the conversion fails.

   The double is obtained from the results of getNumber(Map,Object).

  map - the map to use - `java.util.Map`
  key - the key to look up - `K`
  default-value - return if the value is null or if the conversion fails - `double`

  returns: the value in the Map as a double, defaultValue if null map input - `<K> double`"
  ([^java.util.Map map key ^Double default-value]
    (MapUtils/getDoubleValue map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getDoubleValue map key)))

(defn *get-boolean-value
  "Gets a boolean from a Map in a null-safe manner,
   using the default value if the conversion fails.

   If the value is a Boolean its value is returned.
   If the value is a String and it equals 'true' ignoring case
   then true is returned, otherwise false.
   If the value is a Number an integer zero value returns
   false and non-zero returns true.
   Otherwise, defaultValue is returned.

  map - the map to use - `java.util.Map`
  key - the key to look up - `K`
  default-value - return if the value is null or if the conversion fails - `boolean`

  returns: the value in the Map as a Boolean, defaultValue if null map input - `<K> boolean`"
  ([^java.util.Map map key ^Boolean default-value]
    (MapUtils/getBooleanValue map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getBooleanValue map key)))

(defn *get-byte-value
  "Gets a byte from a Map in a null-safe manner,
   using the default value if the conversion fails.

   The byte is obtained from the results of getNumber(Map,Object).

  map - the map to use - `java.util.Map`
  key - the key to look up - `K`
  default-value - return if the value is null or if the conversion fails - `byte`

  returns: the value in the Map as a byte, defaultValue if null map input - `<K> byte`"
  ([^java.util.Map map key ^Byte default-value]
    (MapUtils/getByteValue map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getByteValue map key)))

(defn *lazy-map
  "Returns a \"lazy\" map whose values will be created on demand.

   When the key passed to the returned map's Map.get(Object)
   method is not present in the map, then the factory will be used
   to create a new object and that object will become the value
   associated with that key.

   For instance:


   Factory factory = new Factory() {
       public Object create() {
           return new Date();
       }
   }
   Map lazyMap = MapUtils.lazyMap(new HashMap(), factory);
   Object obj = lazyMap.get(\"test\");

   After the above code is executed, obj will contain
   a new Date instance.  Furthermore, that Date
   instance is the value for the \"test\" key in the map.

  map - the map to make lazy, must not be null - `java.util.Map`
  factory - the factory for creating new objects, must not be null - `org.apache.commons.collections4.Factory`

  returns: a lazy map backed by the given map - `<K,V> org.apache.commons.collections4.IterableMap<K,V>`

  throws: java.lang.NullPointerException - if the Map or Factory is null"
  ([^java.util.Map map ^org.apache.commons.collections4.Factory factory]
    (MapUtils/lazyMap map factory)))

(defn *invert-map
  "Inverts the supplied map returning a new HashMap such that the keys of
   the input are swapped with the values.

   This operation assumes that the inverse mapping is well defined.
   If the input map had multiple entries with the same value mapped to
   different keys, the returned map will map one of those keys to the
   value, but the exact key which will be mapped is undefined.

  map - the map to invert, may not be null - `java.util.Map`

  returns: a new HashMap containing the inverted data - `<K,V> java.util.Map<V,K>`

  throws: java.lang.NullPointerException - if the map is null"
  ([^java.util.Map map]
    (MapUtils/invertMap map)))

(defn *transformed-sorted-map
  "Returns a transformed sorted map backed by the given map.

   This method returns a new sorted map (decorating the specified map) that
   will transform any new entries added to it.
   Existing entries in the specified map will not be transformed.
   If you want that behaviour, see TransformedSortedMap.transformedSortedMap(java.util.SortedMap<K, V>, org.apache.commons.collections4.Transformer<? super K, ? extends K>, org.apache.commons.collections4.Transformer<? super V, ? extends V>).

   Each object is passed through the transformers as it is added to the
   Map. It is important not to use the original map after invoking this
   method, as it is a backdoor for adding untransformed objects.

   If there are any elements already in the map being decorated, they
   are NOT transformed.

  map - the map to transform, must not be null, typically empty - `java.util.SortedMap`
  key-transformer - the transformer for the map keys, null means no transformation - `org.apache.commons.collections4.Transformer`
  value-transformer - the transformer for the map values, null means no transformation - `org.apache.commons.collections4.Transformer`

  returns: a transformed map backed by the given map - `<K,V> java.util.SortedMap<K,V>`

  throws: java.lang.NullPointerException - if the SortedMap is null"
  ([^java.util.SortedMap map ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.Transformer value-transformer]
    (MapUtils/transformedSortedMap map key-transformer value-transformer)))

(defn *populate-map
  "Populates a Map using the supplied Transformers to transform the elements
   into keys and values.

  map - the Map to populate. - `java.util.Map`
  elements - the Iterable containing the input values for the map. - `java.lang.Iterable`
  key-transformer - the Transformer used to transform the element into a key value - `org.apache.commons.collections4.Transformer`
  value-transformer - the Transformer used to transform the element into a value - `org.apache.commons.collections4.Transformer`

  returns: `<K,V,E> void`

  throws: java.lang.NullPointerException - if the map, elements or transformers are null"
  ([^java.util.Map map ^java.lang.Iterable elements ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.Transformer value-transformer]
    (MapUtils/populateMap map elements key-transformer value-transformer))
  ([^java.util.Map map ^java.lang.Iterable elements ^org.apache.commons.collections4.Transformer key-transformer]
    (MapUtils/populateMap map elements key-transformer)))

(defn *get-boolean
  "Looks up the given key in the given map, converting the result into
   a boolean, using the default value if the conversion fails.

  map - the map whose value to look up - `java.util.Map`
  key - the key of the value to look up in that map - `K`
  default-value - what to return if the value is null or if the conversion fails - `java.lang.Boolean`

  returns: the value in the map as a boolean, or defaultValue if the
     original value is null, the map is null or the boolean conversion fails - `<K> java.lang.Boolean`"
  ([^java.util.Map map key ^java.lang.Boolean default-value]
    (MapUtils/getBoolean map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getBoolean map key)))

(defn *get-int-value
  "Gets an int from a Map in a null-safe manner,
   using the default value if the conversion fails.

   The int is obtained from the results of getNumber(Map,Object).

  map - the map to use - `java.util.Map`
  key - the key to look up - `K`
  default-value - return if the value is null or if the conversion fails - `int`

  returns: the value in the Map as an int, defaultValue if null map input - `<K> int`"
  ([^java.util.Map map key ^Integer default-value]
    (MapUtils/getIntValue map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getIntValue map key)))

(defn *empty?
  "Null-safe check if the specified map is empty.

   Null returns true.

  map - the map to check, may be null - `java.util.Map`

  returns: true if empty or null - `boolean`"
  (^Boolean [^java.util.Map map]
    (MapUtils/isEmpty map)))

(defn *size
  "Gets the given map size or 0 if the map is null

  map - a Map or null - `java.util.Map`

  returns: the given map size or 0 if the map is null - `int`"
  (^Integer [^java.util.Map map]
    (MapUtils/size map)))

(defn *safe-add-to-map
  "Protects against adding null values to a map.

   This method checks the value being added to the map, and if it is null
   it is replaced by an empty string.

   This could be useful if the map does not accept null values, or for
   receiving data from a source that may provide null or empty string
   which should be held in the same way in the map.

   Keys are not validated.
   Note that this method can be used to circumvent the map's
   value type at runtime.

  map - the map to add to, may not be null - `java.util.Map`
  key - the key - `K`
  value - the value, null converted to \"\" - `java.lang.Object`

  returns: `<K> void`

  throws: java.lang.NullPointerException - if the map is null"
  ([^java.util.Map map key ^java.lang.Object value]
    (MapUtils/safeAddToMap map key value)))

(defn *verbose-print
  "Prints the given map with nice line breaks.

   This method prints a nicely formatted String describing the Map.
   Each map entry will be printed with key and value.
   When the value is a Map, recursive behaviour occurs.

   This method is NOT thread-safe in any special way. You must manually
   synchronize on either this class or the stream as required.

  out - the stream to print to, must not be null - `java.io.PrintStream`
  label - The label to be used, may be null. If null, the label is not output. It typically represents the name of the property in a bean or similar. - `java.lang.Object`
  map - The map to print, may be null. If null, the text 'null' is output. - `java.util.Map`

  throws: java.lang.NullPointerException - if the stream is null"
  ([^java.io.PrintStream out ^java.lang.Object label ^java.util.Map map]
    (MapUtils/verbosePrint out label map)))

(defn *unmodifiable-sorted-map
  "Returns an unmodifiable sorted map backed by the given sorted map.

   This method uses the implementation in the decorators subpackage.

  map - the sorted map to make unmodifiable, must not be null - `java.util.SortedMap`

  returns: an unmodifiable map backed by the given map - `<K,V> java.util.SortedMap<K,V>`

  throws: java.lang.NullPointerException - if the map is null"
  ([^java.util.SortedMap map]
    (MapUtils/unmodifiableSortedMap map)))

(defn *get-float
  "Looks up the given key in the given map, converting the result into
   a float, using the default value if the conversion fails.

  map - the map whose value to look up - `java.util.Map`
  key - the key of the value to look up in that map - `K`
  default-value - what to return if the value is null or if the conversion fails - `java.lang.Float`

  returns: the value in the map as a number, or defaultValue if the
     original value is null, the map is null or the number conversion fails - `<K> java.lang.Float`"
  ([^java.util.Map map key ^java.lang.Float default-value]
    (MapUtils/getFloat map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getFloat map key)))

(defn *get-double
  "Looks up the given key in the given map, converting the result into
   a double, using the default value if the conversion fails.

  map - the map whose value to look up - `java.util.Map`
  key - the key of the value to look up in that map - `K`
  default-value - what to return if the value is null or if the conversion fails - `java.lang.Double`

  returns: the value in the map as a number, or defaultValue if the
     original value is null, the map is null or the number conversion fails - `<K> java.lang.Double`"
  ([^java.util.Map map key ^java.lang.Double default-value]
    (MapUtils/getDouble map key default-value))
  ([^java.util.Map map key]
    (MapUtils/getDouble map key)))

(defn *multi-value-map
  "Deprecated. since 4.1, use MultiValuedMap instead

  map - the map to decorate - `java.util.Map`
  collection-class - the type of collections to return from the map (must contain public no-arg constructor and extend Collection) - `java.lang.Class`

  returns: a multi-value map backed by the given map which returns collections of the specified type - `<K,V,C extends java.util.Collection<V>> org.apache.commons.collections4.map.MultiValueMap<K,V>`"
  ([^java.util.Map map ^java.lang.Class collection-class]
    (MapUtils/multiValueMap map collection-class))
  ([^java.util.Map map]
    (MapUtils/multiValueMap map)))

(defn *fixed-size-sorted-map
  "Returns a fixed-sized sorted map backed by the given sorted map.
   Elements may not be added or removed from the returned map, but
   existing elements can be changed (for instance, via the
   Map.put(Object,Object) method).

  map - the map whose size to fix, must not be null - `java.util.SortedMap`

  returns: a fixed-size map backed by that map - `<K,V> java.util.SortedMap<K,V>`

  throws: java.lang.NullPointerException - if the SortedMap is null"
  ([^java.util.SortedMap map]
    (MapUtils/fixedSizeSortedMap map)))

(defn *synchronized-map
  "Returns a synchronized map backed by the given map.

   You must manually synchronize on the returned buffer's iterator to
   avoid non-deterministic behavior:



   Map m = MapUtils.synchronizedMap(myMap);
   Set s = m.keySet();  // outside synchronized block
   synchronized (m) {  // synchronized on MAP!
       Iterator i = s.iterator();
       while (i.hasNext()) {
           process (i.next());
       }
   }

   This method uses the implementation in Collections.

  map - the map to synchronize, must not be null - `java.util.Map`

  returns: a synchronized map backed by the given map - `<K,V> java.util.Map<K,V>`"
  ([^java.util.Map map]
    (MapUtils/synchronizedMap map)))

(defn *debug-print
  "Prints the given map with nice line breaks.

   This method prints a nicely formatted String describing the Map.
   Each map entry will be printed with key, value and value classname.
   When the value is a Map, recursive behaviour occurs.

   This method is NOT thread-safe in any special way. You must manually
   synchronize on either this class or the stream as required.

  out - the stream to print to, must not be null - `java.io.PrintStream`
  label - The label to be used, may be null. If null, the label is not output. It typically represents the name of the property in a bean or similar. - `java.lang.Object`
  map - The map to print, may be null. If null, the text 'null' is output. - `java.util.Map`

  throws: java.lang.NullPointerException - if the stream is null"
  ([^java.io.PrintStream out ^java.lang.Object label ^java.util.Map map]
    (MapUtils/debugPrint out label map)))

