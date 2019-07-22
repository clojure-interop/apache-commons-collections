(ns org.apache.commons.collections4.iterators.PermutationIterator
  "This iterator creates permutations of an input collection, using the
  Steinhaus-Johnson-Trotter algorithm (also called plain changes).

  The iterator will return exactly n! permutations of the input collection.
  The remove() operation is not supported, and will throw an
  UnsupportedOperationException.

  NOTE: in case an empty collection is provided, the iterator will
  return exactly one empty list as result, as 0! = 1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators PermutationIterator]))

(defn ->permutation-iterator
  "Constructor.

  Standard constructor for this class.

  coll - the collection to generate permutations for - `java.util.Collection`

  throws: java.lang.NullPointerException - if coll is null"
  (^PermutationIterator [^java.util.Collection coll]
    (new PermutationIterator coll)))

(defn has-next?
  "Indicates if there are more permutation available.

  returns: true if there are more permutations, otherwise false - `boolean`"
  (^Boolean [^PermutationIterator this]
    (-> this (.hasNext))))

(defn next
  "Returns the next permutation of the input collection.

  returns: a list of the permutator's elements representing a permutation - `java.util.List<E>`

  throws: java.util.NoSuchElementException - if there are no more permutations"
  (^java.util.List [^PermutationIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^PermutationIterator this]
    (-> this (.remove))))

