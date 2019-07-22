(ns org.apache.commons.collections4.set.CompositeSet$SetMutator
  "Define callbacks for mutation operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set CompositeSet$SetMutator]))

(defn add
  "Called when an object is to be added to the composite.

  composite - the CompositeSet being changed - `org.apache.commons.collections4.set.CompositeSet`
  sets - all of the Set instances in this CompositeSet - `java.util.List`
  obj - the object being added - `E`

  returns: true if the collection is changed - `boolean`

  throws: java.lang.UnsupportedOperationException - if add is unsupported"
  (^Boolean [^CompositeSet$SetMutator this ^org.apache.commons.collections4.set.CompositeSet composite ^java.util.List sets obj]
    (-> this (.add composite sets obj))))

(defn add-all
  "Called when a collection is to be added to the composite.

  composite - the CompositeSet being changed - `org.apache.commons.collections4.set.CompositeSet`
  sets - all of the Set instances in this CompositeSet - `java.util.List`
  coll - the collection being added - `java.util.Collection`

  returns: true if the collection is changed - `boolean`

  throws: java.lang.UnsupportedOperationException - if add is unsupported"
  (^Boolean [^CompositeSet$SetMutator this ^org.apache.commons.collections4.set.CompositeSet composite ^java.util.List sets ^java.util.Collection coll]
    (-> this (.addAll composite sets coll))))

(defn resolve-collision
  "Called when a Set is added to the CompositeSet and there is a
   collision between existing and added sets.

   If added and existing still have any intersects
   after this method returns an IllegalArgumentException will be thrown.

  comp - the CompositeSet being modified - `org.apache.commons.collections4.set.CompositeSet`
  existing - the Set already existing in the composite - `java.util.Set`
  added - the Set being added to the composite - `java.util.Set`
  intersects - the intersection of the existing and added sets - `java.util.Collection`"
  ([^CompositeSet$SetMutator this ^org.apache.commons.collections4.set.CompositeSet comp ^java.util.Set existing ^java.util.Set added ^java.util.Collection intersects]
    (-> this (.resolveCollision comp existing added intersects))))

