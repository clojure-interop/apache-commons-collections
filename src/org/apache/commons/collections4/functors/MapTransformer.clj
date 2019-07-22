(ns org.apache.commons.collections4.functors.MapTransformer
  "Transformer implementation that returns the value held in a specified map
  using the input parameter as a key."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors MapTransformer]))

(defn *map-transformer
  "Factory to create the transformer.

   If the map is null, a transformer that always returns null is returned.

  map - the map, not cloned - `java.util.Map`

  returns: the transformer - `<I,O> org.apache.commons.collections4.Transformer<I,O>`"
  ([^java.util.Map map]
    (MapTransformer/mapTransformer map)))

(defn transform
  "Transforms the input to result by looking it up in a Map.

  input - the input object to transform - `I`

  returns: the transformed result - `O`"
  ([^MapTransformer this input]
    (-> this (.transform input))))

(defn get-map
  "Gets the map to lookup in.

  returns: the map - `java.util.Map<? super I,? extends O>`"
  ([^MapTransformer this]
    (-> this (.getMap))))

