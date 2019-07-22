(ns org.apache.commons.collections4.collection.CompositeCollection$CollectionMutator
  "Pluggable strategy to handle changes to the composite."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.collection CompositeCollection$CollectionMutator]))

(defn add
  "Called when an object is to be added to the composite.

  composite - the CompositeCollection being changed - `org.apache.commons.collections4.collection.CompositeCollection`
  collections - all of the Collection instances in this CompositeCollection - `java.util.List`
  obj - the object being added - `E`

  returns: true if the collection is changed - `boolean`

  throws: java.lang.UnsupportedOperationException - if add is unsupported"
  (^Boolean [^CompositeCollection$CollectionMutator this ^org.apache.commons.collections4.collection.CompositeCollection composite ^java.util.List collections obj]
    (-> this (.add composite collections obj))))

(defn add-all
  "Called when a collection is to be added to the composite.

  composite - the CompositeCollection being changed - `org.apache.commons.collections4.collection.CompositeCollection`
  collections - all of the Collection instances in this CompositeCollection - `java.util.List`
  coll - the collection being added - `java.util.Collection`

  returns: true if the collection is changed - `boolean`

  throws: java.lang.UnsupportedOperationException - if add is unsupported"
  (^Boolean [^CompositeCollection$CollectionMutator this ^org.apache.commons.collections4.collection.CompositeCollection composite ^java.util.List collections ^java.util.Collection coll]
    (-> this (.addAll composite collections coll))))

(defn remove
  "Called when an object is to be removed to the composite.

  composite - the CompositeCollection being changed - `org.apache.commons.collections4.collection.CompositeCollection`
  collections - all of the Collection instances in this CompositeCollection - `java.util.List`
  obj - the object being removed - `java.lang.Object`

  returns: true if the collection is changed - `boolean`

  throws: java.lang.UnsupportedOperationException - if removed is unsupported"
  (^Boolean [^CompositeCollection$CollectionMutator this ^org.apache.commons.collections4.collection.CompositeCollection composite ^java.util.List collections ^java.lang.Object obj]
    (-> this (.remove composite collections obj))))

