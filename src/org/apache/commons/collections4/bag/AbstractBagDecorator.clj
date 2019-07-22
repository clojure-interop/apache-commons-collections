(ns org.apache.commons.collections4.bag.AbstractBagDecorator
  "Decorates another Bag to provide additional behaviour.

  Methods are forwarded directly to the decorated bag."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bag AbstractBagDecorator]))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractBagDecorator this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractBagDecorator this]
    (-> this (.hashCode))))

(defn get-count
  "Description copied from interface: Bag

  object - the object to search for - `java.lang.Object`

  returns: the number of occurrences of the object, zero if not found - `int`"
  (^Integer [^AbstractBagDecorator this ^java.lang.Object object]
    (-> this (.getCount object))))

(defn add
  "Description copied from interface: Bag

  object - the object to add - `E`
  count - the number of copies to add - `int`

  returns: true if the object was not already in the uniqueSet - `boolean`"
  (^Boolean [^AbstractBagDecorator this object ^Integer count]
    (-> this (.add object count))))

(defn remove
  "Description copied from interface: Bag

  object - the object to remove - `java.lang.Object`
  count - the number of copies to remove - `int`

  returns: true if this call changed the collection - `boolean`"
  (^Boolean [^AbstractBagDecorator this ^java.lang.Object object ^Integer count]
    (-> this (.remove object count))))

(defn unique-set
  "Description copied from interface: Bag

  returns: the Set of unique Bag elements - `java.util.Set<E>`"
  (^java.util.Set [^AbstractBagDecorator this]
    (-> this (.uniqueSet))))

