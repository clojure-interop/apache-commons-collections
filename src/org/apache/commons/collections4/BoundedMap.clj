(ns org.apache.commons.collections4.BoundedMap
  "Defines a map that is bounded in size.

  The size of the map can vary, but it can never exceed a preset
  maximum number of elements. This interface allows the querying of details
  associated with the maximum number of elements."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 BoundedMap]))

(defn full?
  "Returns true if this map is full and no new elements can be added.

  returns: true if the map is full - `boolean`"
  (^Boolean [^BoundedMap this]
    (-> this (.isFull))))

(defn max-size
  "Gets the maximum size of the map (the bound).

  returns: the maximum number of elements the map can hold - `int`"
  (^Integer [^BoundedMap this]
    (-> this (.maxSize))))

