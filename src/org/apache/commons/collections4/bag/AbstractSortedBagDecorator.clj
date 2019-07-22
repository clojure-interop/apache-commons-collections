(ns org.apache.commons.collections4.bag.AbstractSortedBagDecorator
  "Decorates another SortedBag to provide additional behaviour.

  Methods are forwarded directly to the decorated bag."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag AbstractSortedBagDecorator]))

(defn first
  "Description copied from interface: SortedBag

  returns: the first element in the sorted bag - `E`"
  ([^AbstractSortedBagDecorator this]
    (-> this (.first))))

(defn last
  "Description copied from interface: SortedBag

  returns: the last element in the sorted bag - `E`"
  ([^AbstractSortedBagDecorator this]
    (-> this (.last))))

(defn comparator
  "Description copied from interface: SortedBag

  returns: the comparator in use, or null if natural ordering - `java.util.Comparator<? super E>`"
  ([^AbstractSortedBagDecorator this]
    (-> this (.comparator))))

