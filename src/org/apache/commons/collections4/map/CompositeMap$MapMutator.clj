(ns org.apache.commons.collections4.map.CompositeMap$MapMutator
  "This interface allows definition for all of the indeterminate
  mutators in a CompositeMap, as well as providing a hook for
  callbacks on key collisions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map CompositeMap$MapMutator]))

(defn resolve-collision
  "Called when adding a new Composited Map results in a
   key collision.

  composite - the CompositeMap with the collision - `org.apache.commons.collections4.map.CompositeMap`
  existing - the Map already in the composite which contains the offending key - `java.util.Map`
  added - the Map being added - `java.util.Map`
  intersect - the intersection of the keysets of the existing and added maps - `java.util.Collection`"
  ([^CompositeMap$MapMutator this ^org.apache.commons.collections4.map.CompositeMap composite ^java.util.Map existing ^java.util.Map added ^java.util.Collection intersect]
    (-> this (.resolveCollision composite existing added intersect))))

(defn put
  "Called when the CompositeMap.put() method is invoked.

  map - the CompositeMap which is being modified - `org.apache.commons.collections4.map.CompositeMap`
  composited - array of Maps in the CompositeMap being modified - `java.util.Map[]`
  key - key with which the specified value is to be associated. - `K`
  value - value to be associated with the specified key. - `V`

  returns: previous value associated with specified key, or null
           if there was no mapping for key.  A null return can
           also indicate that the map previously associated null
           with the specified key, if the implementation supports
           null values. - `V`

  throws: java.lang.UnsupportedOperationException - if not defined"
  ([^CompositeMap$MapMutator this ^org.apache.commons.collections4.map.CompositeMap map composited key value]
    (-> this (.put map composited key value))))

(defn put-all
  "Called when the CompositeMap.putAll() method is invoked.

  map - the CompositeMap which is being modified - `org.apache.commons.collections4.map.CompositeMap`
  composited - array of Maps in the CompositeMap being modified - `java.util.Map[]`
  map-to-add - Mappings to be stored in this CompositeMap - `java.util.Map`

  throws: java.lang.UnsupportedOperationException - if not defined"
  ([^CompositeMap$MapMutator this ^org.apache.commons.collections4.map.CompositeMap map composited ^java.util.Map map-to-add]
    (-> this (.putAll map composited map-to-add))))

