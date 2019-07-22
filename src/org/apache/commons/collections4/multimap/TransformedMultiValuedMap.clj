(ns org.apache.commons.collections4.multimap.TransformedMultiValuedMap
  "Decorates another MultiValuedMap to transform objects that are added.

  This class affects the MultiValuedMap put methods. Thus objects must be
  removed or searched for using their transformed form. For example, if the
  transformation converts Strings to Integers, you must use the Integer form to
  remove objects.


  Note that TransformedMultiValuedMap is not synchronized and is not thread-safe."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multimap TransformedMultiValuedMap]))

(defn *transforming-map
  "Factory method to create a transforming MultiValuedMap.

   If there are any elements already in the map being decorated, they are
   NOT transformed. Contrast this with
   transformedMap(MultiValuedMap, Transformer, Transformer).

  map - the MultiValuedMap to decorate, may not be null - `org.apache.commons.collections4.MultiValuedMap`
  key-transformer - the transformer to use for key conversion, null means no conversion - `org.apache.commons.collections4.Transformer`
  value-transformer - the transformer to use for value conversion, null means no conversion - `org.apache.commons.collections4.Transformer`

  returns: a new transformed MultiValuedMap - `<K,V> org.apache.commons.collections4.multimap.TransformedMultiValuedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^org.apache.commons.collections4.MultiValuedMap map ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.Transformer value-transformer]
    (TransformedMultiValuedMap/transformingMap map key-transformer value-transformer)))

(defn *transformed-map
  "Factory method to create a transforming MultiValuedMap that will
   transform existing contents of the specified map.

   If there are any elements already in the map being decorated, they will
   be transformed by this method. Contrast this with
   transformingMap(MultiValuedMap, Transformer, Transformer).

  map - the MultiValuedMap to decorate, may not be null - `org.apache.commons.collections4.MultiValuedMap`
  key-transformer - the transformer to use for key conversion, null means no conversion - `org.apache.commons.collections4.Transformer`
  value-transformer - the transformer to use for value conversion, null means no conversion - `org.apache.commons.collections4.Transformer`

  returns: a new transformed MultiValuedMap - `<K,V> org.apache.commons.collections4.multimap.TransformedMultiValuedMap<K,V>`

  throws: java.lang.NullPointerException - if map is null"
  ([^org.apache.commons.collections4.MultiValuedMap map ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.Transformer value-transformer]
    (TransformedMultiValuedMap/transformedMap map key-transformer value-transformer)))

(defn put
  "Description copied from interface: MultiValuedMap

  key - the key to store against - `K`
  value - the value to add to the collection at the key - `V`

  returns: true if the map changed as a result of this put operation, or false
     if the map already contained the key-value mapping and the collection
     type does not allow duplicate values, e.g. when using a Set - `boolean`"
  (^Boolean [^TransformedMultiValuedMap this key value]
    (-> this (.put key value))))

(defn put-all
  "Description copied from interface: MultiValuedMap

  key - the key to store against - `K`
  values - the values to add to the collection at the key, may not be null - `java.lang.Iterable`

  returns: true if the map changed as a result of this operation - `boolean`"
  (^Boolean [^TransformedMultiValuedMap this key ^java.lang.Iterable values]
    (-> this (.putAll key values)))
  (^Boolean [^TransformedMultiValuedMap this ^java.util.Map map]
    (-> this (.putAll map))))

