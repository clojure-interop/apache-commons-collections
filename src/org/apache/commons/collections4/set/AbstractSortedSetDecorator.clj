(ns org.apache.commons.collections4.set.AbstractSortedSetDecorator
  "Decorates another SortedSet to provide additional behaviour.

  Methods are forwarded directly to the decorated set."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set AbstractSortedSetDecorator]))

(defn sub-set
  "from-element - `E`
  to-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^AbstractSortedSetDecorator this from-element to-element]
    (-> this (.subSet from-element to-element))))

(defn head-set
  "to-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^AbstractSortedSetDecorator this to-element]
    (-> this (.headSet to-element))))

(defn tail-set
  "from-element - `E`

  returns: `java.util.SortedSet<E>`"
  (^java.util.SortedSet [^AbstractSortedSetDecorator this from-element]
    (-> this (.tailSet from-element))))

(defn first
  "returns: `E`"
  ([^AbstractSortedSetDecorator this]
    (-> this (.first))))

(defn last
  "returns: `E`"
  ([^AbstractSortedSetDecorator this]
    (-> this (.last))))

(defn comparator
  "returns: `java.util.Comparator<? super E>`"
  ([^AbstractSortedSetDecorator this]
    (-> this (.comparator))))

