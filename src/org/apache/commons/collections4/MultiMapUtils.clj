(ns org.apache.commons.collections4.MultiMapUtils
  "Provides utility methods and decorators for MultiValuedMap instances.

  It contains various type safe and null safe methods. Additionally, it provides
  the following decorators:


    unmodifiableMultiValuedMap(MultiValuedMap)
    transformedMultiValuedMap(MultiValuedMap, Transformer, Transformer)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 MultiMapUtils]))

(def *-empty-multi-valued-map
  "Static Constant.

  An empty UnmodifiableMultiValuedMap.

  type: org.apache.commons.collections4.MultiValuedMap"
  MultiMapUtils/EMPTY_MULTI_VALUED_MAP)

(defn *empty-multi-valued-map
  "Returns immutable EMPTY_MULTI_VALUED_MAP with generic type safety.

  returns: immutable and empty MultiValuedMap - `<K,V> org.apache.commons.collections4.MultiValuedMap<K,V>`"
  ([]
    (MultiMapUtils/emptyMultiValuedMap )))

(defn *transformed-multi-valued-map
  "Returns a TransformedMultiValuedMap backed by the given map.

   This method returns a new MultiValuedMap (decorating the
   specified map) that will transform any new entries added to it. Existing
   entries in the specified map will not be transformed. If you want that
   behaviour, see TransformedMultiValuedMap.transformedMap(org.apache.commons.collections4.MultiValuedMap<K, V>, org.apache.commons.collections4.Transformer<? super K, ? extends K>, org.apache.commons.collections4.Transformer<? super V, ? extends V>).

   Each object is passed through the transformers as it is added to the Map.
   It is important not to use the original map after invoking this method,
   as it is a back door for adding untransformed objects.

   If there are any elements already in the map being decorated, they are
   NOT transformed.

  map - the MultiValuedMap to transform, must not be null, typically empty - `org.apache.commons.collections4.MultiValuedMap`
  key-transformer - the transformer for the map keys, null means no transformation - `org.apache.commons.collections4.Transformer`
  value-transformer - the transformer for the map values, null means no transformation - `org.apache.commons.collections4.Transformer`

  returns: a transformed MultiValuedMap backed by the given map - `<K,V> org.apache.commons.collections4.MultiValuedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^org.apache.commons.collections4.MultiValuedMap map ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.Transformer value-transformer]
    (MultiMapUtils/transformedMultiValuedMap map key-transformer value-transformer)))

(defn *get-values-as-bag
  "Gets a Bag from MultiValuedMap in a null-safe manner.

  map - the MultiValuedMap to use - `org.apache.commons.collections4.MultiValuedMap`
  key - the key to look up - `K`

  returns: the Collection in the MultiValuedMap as Bag, or null if input map is null - `<K,V> org.apache.commons.collections4.Bag<V>`"
  ([^org.apache.commons.collections4.MultiValuedMap map key]
    (MultiMapUtils/getValuesAsBag map key)))

(defn *get-values-as-set
  "Gets a Set from MultiValuedMap in a null-safe manner.

  map - the MultiValuedMap to use - `org.apache.commons.collections4.MultiValuedMap`
  key - the key to look up - `K`

  returns: the Collection in the MultiValuedMap as Set, or null if input map is null - `<K,V> java.util.Set<V>`"
  ([^org.apache.commons.collections4.MultiValuedMap map key]
    (MultiMapUtils/getValuesAsSet map key)))

(defn *unmodifiable-multi-valued-map
  "Returns an UnmodifiableMultiValuedMap backed by the given
   map.

  map - the MultiValuedMap to decorate, must not be null - `org.apache.commons.collections4.MultiValuedMap`

  returns: an unmodifiable MultiValuedMap backed by the provided map - `<K,V> org.apache.commons.collections4.MultiValuedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^org.apache.commons.collections4.MultiValuedMap map]
    (MultiMapUtils/unmodifiableMultiValuedMap map)))

(defn *empty-if-null
  "Returns an immutable empty MultiValuedMap if the argument is
   null, or the argument itself otherwise.

  map - the map, may be null - `org.apache.commons.collections4.MultiValuedMap`

  returns: an empty MultiValuedMap if the argument is null - `<K,V> org.apache.commons.collections4.MultiValuedMap<K,V>`"
  ([^org.apache.commons.collections4.MultiValuedMap map]
    (MultiMapUtils/emptyIfNull map)))

(defn *new-set-valued-hash-map
  "Creates a SetValuedMap with an HashSet as
   collection class to store the values mapped to a key.

  returns: a new SetValuedMap - `<K,V> org.apache.commons.collections4.SetValuedMap<K,V>`"
  ([]
    (MultiMapUtils/newSetValuedHashMap )))

(defn *empty?
  "Null-safe check if the specified MultiValuedMap is empty.

   If the provided map is null, returns true.

  map - the map to check, may be null - `org.apache.commons.collections4.MultiValuedMap`

  returns: true if the map is empty or null - `boolean`"
  (^Boolean [^org.apache.commons.collections4.MultiValuedMap map]
    (MultiMapUtils/isEmpty map)))

(defn *get-collection
  "Gets a Collection from MultiValuedMap in a null-safe manner.

  map - the MultiValuedMap to use - `org.apache.commons.collections4.MultiValuedMap`
  key - the key to look up - `K`

  returns: the Collection in the MultiValuedMap, or null if input map is null - `<K,V> java.util.Collection<V>`"
  ([^org.apache.commons.collections4.MultiValuedMap map key]
    (MultiMapUtils/getCollection map key)))

(defn *get-values-as-list
  "Gets a List from MultiValuedMap in a null-safe manner.

  map - the MultiValuedMap to use - `org.apache.commons.collections4.MultiValuedMap`
  key - the key to look up - `K`

  returns: the Collection in the MultiValuedMap as List, or null if input map is null - `<K,V> java.util.List<V>`"
  ([^org.apache.commons.collections4.MultiValuedMap map key]
    (MultiMapUtils/getValuesAsList map key)))

(defn *new-list-valued-hash-map
  "Creates a ListValuedMap with an ArrayList as
   collection class to store the values mapped to a key.

  returns: a new ListValuedMap - `<K,V> org.apache.commons.collections4.ListValuedMap<K,V>`"
  ([]
    (MultiMapUtils/newListValuedHashMap )))

