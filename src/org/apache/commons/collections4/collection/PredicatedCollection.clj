(ns org.apache.commons.collections4.collection.PredicatedCollection
  "Decorates another Collection to validate that additions
  match a specified predicate.

  This collection exists to provide validation for the decorated collection.
  It is normally created to decorate an empty collection.
  If an object cannot be added to the collection, an IllegalArgumentException is thrown.


  One usage would be to ensure that no null entries are added to the collection:



  Collection coll = PredicatedCollection.predicatedCollection(new ArrayList(), NotNullPredicate.INSTANCE);

  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.collection PredicatedCollection]))

(defn *builder
  "Returns a Builder with the given predicate.

  predicate - the predicate to use - `org.apache.commons.collections4.Predicate`

  returns: a new Builder for predicated collections - `<E> org.apache.commons.collections4.collection.PredicatedCollection$Builder<E>`"
  ([^org.apache.commons.collections4.Predicate predicate]
    (PredicatedCollection/builder predicate)))

(defn *not-null-builder
  "Returns a Builder with a NotNullPredicate.

  returns: a new Builder for predicated collections that ignores null values. - `<E> org.apache.commons.collections4.collection.PredicatedCollection$Builder<E>`"
  ([]
    (PredicatedCollection/notNullBuilder )))

(defn *predicated-collection
  "Factory method to create a predicated (validating) collection.

   If there are any elements already in the collection being decorated, they
   are validated.

  coll - the collection to decorate, must not be null - `java.util.Collection`
  predicate - the predicate to use for validation, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a new predicated collection - `<T> org.apache.commons.collections4.collection.PredicatedCollection<T>`

  throws: java.lang.NullPointerException - if collection or predicate is null"
  ([^java.util.Collection coll ^org.apache.commons.collections4.Predicate predicate]
    (PredicatedCollection/predicatedCollection coll predicate)))

(defn add
  "Override to validate the object being added to ensure it matches
   the predicate.

  object - the object being added - `E`

  returns: the result of adding to the underlying collection - `boolean`

  throws: java.lang.IllegalArgumentException - if the add is invalid"
  (^Boolean [^PredicatedCollection this object]
    (-> this (.add object))))

(defn add-all
  "Override to validate the objects being added to ensure they match
   the predicate. If any one fails, no update is made to the underlying
   collection.

  coll - the collection being added - `java.util.Collection`

  returns: the result of adding to the underlying collection - `boolean`

  throws: java.lang.IllegalArgumentException - if the add is invalid"
  (^Boolean [^PredicatedCollection this ^java.util.Collection coll]
    (-> this (.addAll coll))))

