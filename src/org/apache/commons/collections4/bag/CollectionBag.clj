(ns org.apache.commons.collections4.bag.CollectionBag
  "Decorates another Bag to comply with the Collection contract.

  By decorating an existing Bag instance with a CollectionBag,
  it can be safely passed on to methods that require Collection types that
  are fully compliant with the Collection contract.


  The method javadoc highlights the differences compared to the original Bag interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag CollectionBag]))

(defn ->collection-bag
  "Constructor.

  Constructor that wraps (not copies).

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.Bag`

  throws: java.lang.NullPointerException - if bag is null"
  (^CollectionBag [^org.apache.commons.collections4.Bag bag]
    (new CollectionBag bag)))

(defn *collection-bag
  "Factory method to create a bag that complies to the Collection contract.

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.Bag`

  returns: a Bag that complies to the Collection contract - `<E> org.apache.commons.collections4.Bag<E>`

  throws: java.lang.NullPointerException - if bag is null"
  ([^org.apache.commons.collections4.Bag bag]
    (CollectionBag/collectionBag bag)))

(defn contains-all
  "(Change)
   Returns true if the bag contains all elements in
   the given collection, not respecting cardinality. That is,
   if the given collection coll contains at least one of
   every object contained in this object.

  coll - the collection to check against - `java.util.Collection`

  returns: true if the Bag contains at least one of every object in the collection - `boolean`"
  (^Boolean [^CollectionBag this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

(defn add
  "(Change)
   Adds count copies of the specified object to the Bag.

   Since this method always increases the size of the bag, it
   will always return true.

  object - the object to add - `E`
  count - the number of copies to add - `int`

  returns: true, always - `boolean`"
  (^Boolean [^CollectionBag this object ^Integer count]
    (-> this (.add object count)))
  (^Boolean [^CollectionBag this object]
    (-> this (.add object))))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^CollectionBag this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove
  "(Change)
   Removes the first occurrence of the given object from the bag.

   This will also remove the object from the AbstractBagDecorator.uniqueSet() if the
   bag contains no occurrence anymore of the object after this operation.

  object - the object to remove - `java.lang.Object`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^CollectionBag this ^java.lang.Object object]
    (-> this (.remove object))))

(defn remove-all
  "(Change)
   Remove all elements represented in the given collection,
   not respecting cardinality. That is, remove all
   occurrences of every object contained in the given collection.

  coll - the collection to remove - `java.util.Collection`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^CollectionBag this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn retain-all
  "(Change)
   Remove any members of the bag that are not in the given collection,
   not respecting cardinality. That is, any object in the given
   collection coll will be retained in the bag with the same
   number of copies prior to this operation. All other objects will be
   completely removed from this bag.

   This implementation iterates over the elements of this bag, checking
   each element in turn to see if it's contained in coll.
   If it's not contained, it's removed from this bag. As a consequence,
   it is advised to use a collection type for coll that provides
   a fast (e.g. O(1)) implementation of Collection.contains(Object).

  coll - the collection to retain - `java.util.Collection`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^CollectionBag this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

