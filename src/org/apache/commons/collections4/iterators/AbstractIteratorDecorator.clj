(ns org.apache.commons.collections4.iterators.AbstractIteratorDecorator
  "Provides basic behaviour for decorating an iterator with extra functionality.

  All methods are forwarded to the decorated iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators AbstractIteratorDecorator]))

(defn next
  "returns: `E`"
  ([^AbstractIteratorDecorator this]
    (-> this (.next))))

