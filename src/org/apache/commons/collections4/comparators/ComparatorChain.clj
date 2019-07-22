(ns org.apache.commons.collections4.comparators.ComparatorChain
  "A ComparatorChain is a Comparator that wraps one or more Comparators in
  sequence. The ComparatorChain calls each Comparator in sequence until either
  1) any single Comparator returns a non-zero result (and that result is then
  returned), or 2) the ComparatorChain is exhausted (and zero is returned).
  This type of sorting is very similar to multi-column sorting in SQL, and this
  class allows Java classes to emulate that kind of behaviour when sorting a
  List.

  To further facilitate SQL-like sorting, the order of any single Comparator in
  the list can be reversed.


  Calling a method that adds new Comparators or changes the ascend/descend sort
  after compare(Object, Object) has been called will result in an
  UnsupportedOperationException. However, take care to not alter the
  underlying List of Comparators or the BitSet that defines the sort order.


  Instances of ComparatorChain are not synchronized. The class is not
  thread-safe at construction time, but it is thread-safe to perform
  multiple comparisons after all the setup operations are complete."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.comparators ComparatorChain]))

(defn ->comparator-chain
  "Constructor.

  Construct a Comparator chain with a single Comparator,
   sorting in the given order

  comparator - First Comparator in the ComparatorChain - `java.util.Comparator`
  reverse - false = forward sort; true = reverse sort - `boolean`"
  (^ComparatorChain [^java.util.Comparator comparator ^Boolean reverse]
    (new ComparatorChain comparator reverse))
  (^ComparatorChain [^java.util.Comparator comparator]
    (new ComparatorChain comparator))
  (^ComparatorChain []
    (new ComparatorChain )))

(defn compare
  "Perform comparisons on the Objects as per
   Comparator.compare(o1,o2).

  o-1 - the first object to compare - `E`
  o-2 - the second object to compare - `E`

  returns: -1, 0, or 1 - `int`

  throws: java.lang.UnsupportedOperationException - if the ComparatorChain does not contain at least one Comparator"
  (^Integer [^ComparatorChain this o-1 o-2]
    (-> this (.compare o-1 o-2))))

(defn locked?
  "Determine if modifications can still be made to the
   ComparatorChain.  ComparatorChains cannot be modified
   once they have performed a comparison.

  returns: true = ComparatorChain cannot be modified; false =
           ComparatorChain can still be modified. - `boolean`"
  (^Boolean [^ComparatorChain this]
    (-> this (.isLocked))))

(defn set-comparator
  "Replace the Comparator at the given index in the
   ComparatorChain, using the given sort order

  index - index of the Comparator to replace - `int`
  comparator - Comparator to set - `java.util.Comparator`
  reverse - false = forward sort order; true = reverse sort order - `boolean`"
  ([^ComparatorChain this ^Integer index ^java.util.Comparator comparator ^Boolean reverse]
    (-> this (.setComparator index comparator reverse)))
  ([^ComparatorChain this ^Integer index ^java.util.Comparator comparator]
    (-> this (.setComparator index comparator))))

(defn add-comparator
  "Add a Comparator to the end of the chain using the
   given sort order

  comparator - Comparator to add to the end of the chain - `java.util.Comparator`
  reverse - false = forward sort order; true = reverse sort order - `boolean`"
  ([^ComparatorChain this ^java.util.Comparator comparator ^Boolean reverse]
    (-> this (.addComparator comparator reverse)))
  ([^ComparatorChain this ^java.util.Comparator comparator]
    (-> this (.addComparator comparator))))

(defn hash-code
  "Implement a hash code for this comparator that is consistent with
   equals.

  returns: a suitable hash code - `int`"
  (^Integer [^ComparatorChain this]
    (-> this (.hashCode))))

(defn size
  "Number of Comparators in the current ComparatorChain.

  returns: Comparator count - `int`"
  (^Integer [^ComparatorChain this]
    (-> this (.size))))

(defn set-forward-sort
  "Change the sort order at the given index in the
   ComparatorChain to a forward sort.

  index - Index of the ComparatorChain - `int`"
  ([^ComparatorChain this ^Integer index]
    (-> this (.setForwardSort index))))

(defn set-reverse-sort
  "Change the sort order at the given index in the
   ComparatorChain to a reverse sort.

  index - Index of the ComparatorChain - `int`"
  ([^ComparatorChain this ^Integer index]
    (-> this (.setReverseSort index))))

(defn equals
  "Returns true iff that Object is
   is a Comparator whose ordering is known to be
   equivalent to mine.

   This implementation returns true
   iff object.getClass()
   equals this.getClass(), and the underlying
   comparators and order bits are equal.
   Subclasses may want to override this behavior to remain consistent
   with the Comparator.equals(Object) contract.

  object - the object to compare with - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^ComparatorChain this ^java.lang.Object object]
    (-> this (.equals object))))

