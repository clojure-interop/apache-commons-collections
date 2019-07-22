(ns org.apache.commons.collections4.functors.DefaultEquator
  "Default Equator implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors DefaultEquator]))

(def *-instance
  "Static Constant.

  Static instance

  type: org.apache.commons.collections4.functors.DefaultEquator"
  DefaultEquator/INSTANCE)

(def *-hashcode-null
  "Static Constant.

  Hashcode used for null objects.

  type: int"
  DefaultEquator/HASHCODE_NULL)

(defn *default-equator
  "Factory returning the typed singleton instance.

  returns: the singleton instance - `<T> org.apache.commons.collections4.functors.DefaultEquator<T>`"
  ([]
    (DefaultEquator/defaultEquator )))

(defn equate
  "Evaluates the two arguments for their equality. Delegates to Object.equals(Object).

  o-1 - the first object to be equated. - `T`
  o-2 - the second object to be equated. - `T`

  returns: whether the two objects are equal. - `boolean`"
  (^Boolean [^DefaultEquator this o-1 o-2]
    (-> this (.equate o-1 o-2))))

(defn hash
  "Calculates the hash for the object, based on the method of equality used in the equate
   method. This is used for classes that delegate their equals(Object) method to an
   Equator (and so must also delegate their hashCode() method), or for implementations
   of HashedMap that use an Equator for the key objects.

  o - the object to calculate the hash for. - `T`

  returns: o.hashCode() if o is non-
           null, else HASHCODE_NULL. - `int`"
  (^Integer [^DefaultEquator this o]
    (-> this (.hash o))))

