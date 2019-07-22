(ns org.apache.commons.collections4.set.UnmodifiableNavigableSet
  "Decorates another NavigableSet to ensure it can't be altered.

  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set UnmodifiableNavigableSet]))

(defn *unmodifiable-navigable-set
  "Factory method to create an unmodifiable set.

  set - the set to decorate, must not be null - `java.util.NavigableSet`

  returns: a new unmodifiable NavigableSet - `<E> java.util.NavigableSet<E>`

  throws: java.lang.NullPointerException - if set is null"
  ([^java.util.NavigableSet set]
    (UnmodifiableNavigableSet/unmodifiableNavigableSet set)))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableNavigableSet this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn tail-set
  "from-element - `E`
  inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^UnmodifiableNavigableSet this from-element ^Boolean inclusive]
    (-> this (.tailSet from-element inclusive)))
  (^java.util.SortedSet [^UnmodifiableNavigableSet this from-element]
    (-> this (.tailSet from-element))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^UnmodifiableNavigableSet this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^UnmodifiableNavigableSet this]
    (-> this (.iterator))))

(defn descending-set
  "returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^UnmodifiableNavigableSet this]
    (-> this (.descendingSet))))

(defn sub-set
  "from-element - `E`
  from-inclusive - `boolean`
  to-element - `E`
  to-inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^UnmodifiableNavigableSet this from-element ^Boolean from-inclusive to-element ^Boolean to-inclusive]
    (-> this (.subSet from-element from-inclusive to-element to-inclusive)))
  (^java.util.SortedSet [^UnmodifiableNavigableSet this from-element to-element]
    (-> this (.subSet from-element to-element))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UnmodifiableNavigableSet this ^java.lang.Object object]
    (-> this (.remove object))))

(defn add
  "object - `E`

  returns: `boolean`"
  (^Boolean [^UnmodifiableNavigableSet this object]
    (-> this (.add object))))

(defn descending-iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^UnmodifiableNavigableSet this]
    (-> this (.descendingIterator))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableNavigableSet this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn head-set
  "to-element - `E`
  inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^UnmodifiableNavigableSet this to-element ^Boolean inclusive]
    (-> this (.headSet to-element inclusive)))
  (^java.util.SortedSet [^UnmodifiableNavigableSet this to-element]
    (-> this (.headSet to-element))))

(defn clear
  ""
  ([^UnmodifiableNavigableSet this]
    (-> this (.clear))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableNavigableSet this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

