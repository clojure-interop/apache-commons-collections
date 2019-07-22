(ns org.apache.commons.collections4.comparators.FixedOrderComparator
  "A Comparator which imposes a specific order on a specific set of Objects.
  Objects are presented to the FixedOrderComparator in a specified order and
  subsequent calls to compare yield that order.
  For example:


  String[] planets = {\"Mercury\", \"Venus\", \"Earth\", \"Mars\"};
  FixedOrderComparator distanceFromSun = new FixedOrderComparator(planets);
  Arrays.sort(planets);                     // Sort to alphabetical order
  Arrays.sort(planets, distanceFromSun);    // Back to original order

  Once compare has been called, the FixedOrderComparator is locked
  and attempts to modify it yield an UnsupportedOperationException.


  Instances of FixedOrderComparator are not synchronized.  The class is not
  thread-safe at construction time, but it is thread-safe to perform
  multiple comparisons  after all the setup operations are complete.


  This class is Serializable from Commons Collections 4.0."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.comparators FixedOrderComparator]))

(defn ->fixed-order-comparator
  "Constructor.

  Constructs a FixedOrderComparator which uses the order of the given array
   to compare the objects.

   The array is copied, so later changes will not affect the comparator.

  items - the items that the comparator can compare in order - `T`

  throws: java.lang.NullPointerException - if the array is null"
  (^FixedOrderComparator [items]
    (new FixedOrderComparator items))
  (^FixedOrderComparator []
    (new FixedOrderComparator )))

(defn locked?
  "Returns true if modifications cannot be made to the FixedOrderComparator.
   FixedOrderComparators cannot be modified once they have performed a comparison.

  returns: true if attempts to change the FixedOrderComparator yield an
    UnsupportedOperationException, false if it can be changed. - `boolean`"
  (^Boolean [^FixedOrderComparator this]
    (-> this (.isLocked))))

(defn get-unknown-object-behavior
  "Gets the behavior for comparing unknown objects.

  returns: FixedOrderComparator.UnknownObjectBehavior - `org.apache.commons.collections4.comparators.FixedOrderComparator$UnknownObjectBehavior`"
  (^org.apache.commons.collections4.comparators.FixedOrderComparator$UnknownObjectBehavior [^FixedOrderComparator this]
    (-> this (.getUnknownObjectBehavior))))

(defn set-unknown-object-behavior
  "Sets the behavior for comparing unknown objects.

  unknown-object-behavior - the flag for unknown behaviour - UNKNOWN_AFTER, UNKNOWN_BEFORE or UNKNOWN_THROW_EXCEPTION - `org.apache.commons.collections4.comparators.FixedOrderComparator$UnknownObjectBehavior`

  throws: java.lang.UnsupportedOperationException - if a comparison has been performed"
  ([^FixedOrderComparator this ^org.apache.commons.collections4.comparators.FixedOrderComparator$UnknownObjectBehavior unknown-object-behavior]
    (-> this (.setUnknownObjectBehavior unknown-object-behavior))))

(defn add
  "Adds an item, which compares as after all items known to the Comparator.
   If the item is already known to the Comparator, its old position is
   replaced with the new position.

  obj - the item to be added to the Comparator. - `T`

  returns: true if obj has been added for the first time, false if
    it was already known to the Comparator. - `boolean`

  throws: java.lang.UnsupportedOperationException - if a comparison has already been made"
  (^Boolean [^FixedOrderComparator this obj]
    (-> this (.add obj))))

(defn add-as-equal
  "Adds a new item, which compares as equal to the given existing item.

  existing-obj - an item already in the Comparator's set of known objects - `T`
  new-obj - an item to be added to the Comparator's set of known objects - `T`

  returns: true if newObj has been added for the first time, false if
    it was already known to the Comparator. - `boolean`

  throws: java.lang.IllegalArgumentException - if existingObject is not in the Comparator's set of known objects."
  (^Boolean [^FixedOrderComparator this existing-obj new-obj]
    (-> this (.addAsEqual existing-obj new-obj))))

(defn compare
  "Compares two objects according to the order of this Comparator.

   It is important to note that this class will throw an IllegalArgumentException
   in the case of an unrecognized object. This is not specified in the
   Comparator interface, but is the most appropriate exception.

  obj-1 - the first object to compare - `T`
  obj-2 - the second object to compare - `T`

  returns: negative if obj1 is less, positive if greater, zero if equal - `int`

  throws: java.lang.IllegalArgumentException - if obj1 or obj2 are not known to this Comparator and an alternative behavior has not been set via setUnknownObjectBehavior(UnknownObjectBehavior)."
  (^Integer [^FixedOrderComparator this obj-1 obj-2]
    (-> this (.compare obj-1 obj-2))))

(defn hash-code
  "Implement a hash code for this comparator that is consistent with
   equals.

  returns: a hash code for this comparator. - `int`"
  (^Integer [^FixedOrderComparator this]
    (-> this (.hashCode))))

(defn equals
  "Returns true iff that Object is
   is a Comparator whose ordering is known to be
   equivalent to mine.

   This implementation returns true
   iff that is a FixedOrderComparator
   whose attributes are equal to mine.

  object - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^FixedOrderComparator this ^java.lang.Object object]
    (-> this (.equals object))))

