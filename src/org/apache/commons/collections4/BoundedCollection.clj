(ns org.apache.commons.collections4.BoundedCollection
  "Defines a collection that is bounded in size.

  The size of the collection can vary, but it can never exceed a preset
  maximum number of elements. This interface allows the querying of details
  associated with the maximum number of elements."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 BoundedCollection]))

(defn full?
  "Returns true if this collection is full and no new elements can be added.

  returns: true if the collection is full. - `boolean`"
  (^Boolean [^BoundedCollection this]
    (-> this (.isFull))))

(defn max-size
  "Gets the maximum size of the collection (the bound).

  returns: the maximum number of elements the collection can hold. - `int`"
  (^Integer [^BoundedCollection this]
    (-> this (.maxSize))))

