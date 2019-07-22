(ns org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator
  "Provides basic behaviour for decorating an iterator with extra functionality
  without committing the generic type of the Iterator implementation.

  All methods are forwarded to the decorated iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators AbstractUntypedIteratorDecorator]))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^AbstractUntypedIteratorDecorator this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^AbstractUntypedIteratorDecorator this]
    (-> this (.remove))))

