(ns org.apache.commons.collections4.set.PredicatedNavigableSet
  "Decorates another NavigableSet to validate that all additions
  match a specified predicate.

  This set exists to provide validation for the decorated set.
  It is normally created to decorate an empty set.
  If an object cannot be added to the set, an IllegalArgumentException is thrown.


  One usage would be to ensure that no null entries are added to the set.



  NavigableSet set =
    PredicatedSortedSet.predicatedNavigableSet(new TreeSet(),
                                               NotNullPredicate.notNullPredicate());"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set PredicatedNavigableSet]))

(defn *predicated-navigable-set
  "Factory method to create a predicated (validating) navigable set.

   If there are any elements already in the set being decorated, they
   are validated.

  set - the set to decorate, must not be null - `java.util.NavigableSet`
  predicate - the predicate to use for validation, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a new predicated navigable set. - `<E> org.apache.commons.collections4.set.PredicatedNavigableSet<E>`

  throws: java.lang.NullPointerException - if set or predicate is null"
  ([^java.util.NavigableSet set ^org.apache.commons.collections4.Predicate predicate]
    (PredicatedNavigableSet/predicatedNavigableSet set predicate)))

(defn floor
  "e - `E`

  returns: `E`"
  ([^PredicatedNavigableSet this e]
    (-> this (.floor e))))

(defn tail-set
  "from-element - `E`
  inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^PredicatedNavigableSet this from-element ^Boolean inclusive]
    (-> this (.tailSet from-element inclusive))))

(defn descending-set
  "returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^PredicatedNavigableSet this]
    (-> this (.descendingSet))))

(defn sub-set
  "from-element - `E`
  from-inclusive - `boolean`
  to-element - `E`
  to-inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^PredicatedNavigableSet this from-element ^Boolean from-inclusive to-element ^Boolean to-inclusive]
    (-> this (.subSet from-element from-inclusive to-element to-inclusive))))

(defn poll-last
  "returns: `E`"
  ([^PredicatedNavigableSet this]
    (-> this (.pollLast))))

(defn poll-first
  "returns: `E`"
  ([^PredicatedNavigableSet this]
    (-> this (.pollFirst))))

(defn higher
  "e - `E`

  returns: `E`"
  ([^PredicatedNavigableSet this e]
    (-> this (.higher e))))

(defn lower
  "e - `E`

  returns: `E`"
  ([^PredicatedNavigableSet this e]
    (-> this (.lower e))))

(defn descending-iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^PredicatedNavigableSet this]
    (-> this (.descendingIterator))))

(defn head-set
  "to-element - `E`
  inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^PredicatedNavigableSet this to-element ^Boolean inclusive]
    (-> this (.headSet to-element inclusive))))

(defn ceiling
  "e - `E`

  returns: `E`"
  ([^PredicatedNavigableSet this e]
    (-> this (.ceiling e))))

