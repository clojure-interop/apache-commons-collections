(ns org.apache.commons.collections4.Equator
  "An equation function, which determines equality between objects of type T.

  It is the functional sibling of Comparator; Equator is to
  Object as Comparator is to Comparable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 Equator]))

(defn equate
  "Evaluates the two arguments for their equality.

  o-1 - the first object to be equated. - `T`
  o-2 - the second object to be equated. - `T`

  returns: whether the two objects are equal. - `boolean`"
  (^Boolean [^Equator this o-1 o-2]
    (-> this (.equate o-1 o-2))))

(defn hash
  "Calculates the hash for the object, based on the method of equality used in the equate
   method. This is used for classes that delegate their equals(Object) method to an
   Equator (and so must also delegate their hashCode() method), or for implementations
   of HashedMap that use an Equator for the key objects.

  o - the object to calculate the hash for. - `T`

  returns: the hash of the object. - `int`"
  (^Integer [^Equator this o]
    (-> this (.hash o))))

