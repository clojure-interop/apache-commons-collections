(ns org.apache.commons.collections4.iterators.AbstractListIteratorDecorator
  "Provides basic behaviour for decorating a list iterator with extra functionality.

  All methods are forwarded to the decorated list iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators AbstractListIteratorDecorator]))

(defn ->abstract-list-iterator-decorator
  "Constructor.

  Constructor that decorates the specified iterator.

  iterator - the iterator to decorate, must not be null - `java.util.ListIterator`

  throws: java.lang.NullPointerException - if the iterator is null"
  (^AbstractListIteratorDecorator [^java.util.ListIterator iterator]
    (new AbstractListIteratorDecorator iterator)))

(defn next
  "returns: `E`"
  ([^AbstractListIteratorDecorator this]
    (-> this (.next))))

(defn has-previous?
  "returns: `boolean`"
  (^Boolean [^AbstractListIteratorDecorator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "returns: `int`"
  (^Integer [^AbstractListIteratorDecorator this]
    (-> this (.previousIndex))))

(defn previous
  "returns: `E`"
  ([^AbstractListIteratorDecorator this]
    (-> this (.previous))))

(defn remove
  ""
  ([^AbstractListIteratorDecorator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^AbstractListIteratorDecorator this]
    (-> this (.hasNext))))

(defn add
  "obj - `E`"
  ([^AbstractListIteratorDecorator this obj]
    (-> this (.add obj))))

(defn set
  "obj - `E`"
  ([^AbstractListIteratorDecorator this obj]
    (-> this (.set obj))))

(defn next-index
  "returns: `int`"
  (^Integer [^AbstractListIteratorDecorator this]
    (-> this (.nextIndex))))

