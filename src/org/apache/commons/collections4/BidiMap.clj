(ns org.apache.commons.collections4.BidiMap
  "Defines a map that allows bidirectional lookup between key and values.

  This extended Map represents a mapping where a key may
  lookup a value and a value may lookup a key with equal ease.
  This interface extends Map and so may be used anywhere a map
  is required. The interface provides an inverse map view, enabling
  full access to both directions of the BidiMap.


  Implementations should allow a value to be looked up from a key and
  a key to be looked up from a value with equal performance.


  This map enforces the restriction that there is a 1:1 relation between
  keys and values, meaning that multiple keys cannot map to the same value.
  This is required so that \"inverting\" the map results in a map without
  duplicate keys. See the put(K, V) method description for more information."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 BidiMap]))

(defn put
  "Puts the key-value pair into the map, replacing any previous pair.

   When adding a key-value pair, the value may already exist in the map
   against a different key. That mapping is removed, to ensure that the
   value only occurs once in the inverse map.



    BidiMap map1 = new DualHashBidiMap();
    map.put(\"A\",\"B\");  // contains A mapped to B, as per Map
    map.put(\"A\",\"C\");  // contains A mapped to C, as per Map

    BidiMap map2 = new DualHashBidiMap();
    map.put(\"A\",\"B\");  // contains A mapped to B, as per Map
    map.put(\"C\",\"B\");  // contains C mapped to B, key A is removed

  key - the key to store - `K`
  value - the value to store - `V`

  returns: the previous value mapped to this key - `V`

  throws: java.lang.UnsupportedOperationException - if the put method is not supported"
  ([^BidiMap this key value]
    (-> this (.put key value))))

(defn get-key
  "Gets the key that is currently mapped to the specified value.

   If the value is not contained in the map, null is returned.


   Implementations should seek to make this method perform equally as well
   as get(Object).

  value - the value to find the key for - `java.lang.Object`

  returns: the mapped key, or null if not found - `K`

  throws: java.lang.ClassCastException - (optional) if the map limits the type of the value and the specified value is inappropriate"
  ([^BidiMap this ^java.lang.Object value]
    (-> this (.getKey value))))

(defn remove-value
  "Removes the key-value pair that is currently mapped to the specified
   value (optional operation).

   If the value is not contained in the map, null is returned.


   Implementations should seek to make this method perform equally as well
   as remove(Object).

  value - the value to find the key-value pair for - `java.lang.Object`

  returns: the key that was removed, null if nothing removed - `K`

  throws: java.lang.ClassCastException - (optional) if the map limits the type of the value and the specified value is inappropriate"
  ([^BidiMap this ^java.lang.Object value]
    (-> this (.removeValue value))))

(defn inverse-bidi-map
  "Gets a view of this map where the keys and values are reversed.

   Changes to one map will be visible in the other and vice versa.
   This enables both directions of the map to be accessed as a Map.


   Implementations should seek to avoid creating a new object every time this
   method is called. See AbstractMap.values() etc. Calling this
   method on the inverse map should return the original.

  returns: an inverted bidirectional map - `org.apache.commons.collections4.BidiMap<V,K>`"
  (^org.apache.commons.collections4.BidiMap [^BidiMap this]
    (-> this (.inverseBidiMap))))

(defn values
  "Returns a Set view of the values contained in this map.
   The set is backed by the map, so changes to the map are reflected
   in the set, and vice-versa.  If the map is modified while an iteration
   over the set is in progress (except through the iterator's own
   remove operation), the results of the iteration are undefined.
   The set supports element removal, which removes the corresponding
   mapping from the map, via the Iterator.remove,
   Collection.remove, removeAll,
   retainAll and clear operations.  It does not
   support the add or addAll operations.

  returns: a set view of the values contained in this map - `java.util.Set<V>`"
  (^java.util.Set [^BidiMap this]
    (-> this (.values))))

