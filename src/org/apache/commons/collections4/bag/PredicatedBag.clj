(ns org.apache.commons.collections4.bag.PredicatedBag
  "Decorates another Bag to validate that additions
  match a specified predicate.

  This bag exists to provide validation for the decorated bag.
  It is normally created to decorate an empty bag.
  If an object cannot be added to the bag, an IllegalArgumentException is thrown.


  One usage would be to ensure that no null entries are added to the bag.



  Bag bag = PredicatedBag.predicatedBag(new HashBag(), NotNullPredicate.INSTANCE);

  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag PredicatedBag]))

(defn *predicated-bag
  "Factory method to create a predicated (validating) bag.

   If there are any elements already in the bag being decorated, they
   are validated.

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.Bag`
  predicate - the predicate to use for validation, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a new predicated Bag - `<E> org.apache.commons.collections4.bag.PredicatedBag<E>`

  throws: java.lang.NullPointerException - if bag or predicate is null"
  ([^org.apache.commons.collections4.Bag bag ^org.apache.commons.collections4.Predicate predicate]
    (PredicatedBag/predicatedBag bag predicate)))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PredicatedBag this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PredicatedBag this]
    (-> this (.hashCode))))

(defn add
  "Description copied from interface: Bag

  object - the object to add - `E`
  count - the number of copies to add - `int`

  returns: true if the object was not already in the uniqueSet - `boolean`"
  (^Boolean [^PredicatedBag this object ^Integer count]
    (-> this (.add object count))))

(defn remove
  "Description copied from interface: Bag

  object - the object to remove - `java.lang.Object`
  count - the number of copies to remove - `int`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^PredicatedBag this ^java.lang.Object object ^Integer count]
    (-> this (.remove object count))))

(defn unique-set
  "Description copied from interface: Bag

  returns: the Set of unique Bag elements - `java.util.Set<E>`"
  (^java.util.Set [^PredicatedBag this]
    (-> this (.uniqueSet))))

(defn get-count
  "Description copied from interface: Bag

  object - the object to search for - `java.lang.Object`

  returns: the number of occurrences of the object, zero if not found - `int`"
  (^Integer [^PredicatedBag this ^java.lang.Object object]
    (-> this (.getCount object))))

