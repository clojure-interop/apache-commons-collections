(ns org.apache.commons.collections4.set.AbstractNavigableSetDecorator
  "Decorates another NavigableSet to provide additional behaviour.

  Methods are forwarded directly to the decorated set."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set AbstractNavigableSetDecorator]))

(defn floor
  "e - `E`

  returns: `E`"
  ([^AbstractNavigableSetDecorator this e]
    (-> this (.floor e))))

(defn tail-set
  "from-element - `E`
  inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^AbstractNavigableSetDecorator this from-element ^Boolean inclusive]
    (-> this (.tailSet from-element inclusive))))

(defn descending-set
  "returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^AbstractNavigableSetDecorator this]
    (-> this (.descendingSet))))

(defn sub-set
  "from-element - `E`
  from-inclusive - `boolean`
  to-element - `E`
  to-inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^AbstractNavigableSetDecorator this from-element ^Boolean from-inclusive to-element ^Boolean to-inclusive]
    (-> this (.subSet from-element from-inclusive to-element to-inclusive))))

(defn poll-last
  "returns: `E`"
  ([^AbstractNavigableSetDecorator this]
    (-> this (.pollLast))))

(defn poll-first
  "returns: `E`"
  ([^AbstractNavigableSetDecorator this]
    (-> this (.pollFirst))))

(defn higher
  "e - `E`

  returns: `E`"
  ([^AbstractNavigableSetDecorator this e]
    (-> this (.higher e))))

(defn lower
  "e - `E`

  returns: `E`"
  ([^AbstractNavigableSetDecorator this e]
    (-> this (.lower e))))

(defn descending-iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^AbstractNavigableSetDecorator this]
    (-> this (.descendingIterator))))

(defn head-set
  "to-element - `E`
  inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^AbstractNavigableSetDecorator this to-element ^Boolean inclusive]
    (-> this (.headSet to-element inclusive))))

(defn ceiling
  "e - `E`

  returns: `E`"
  ([^AbstractNavigableSetDecorator this e]
    (-> this (.ceiling e))))

