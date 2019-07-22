(ns org.apache.commons.collections4.iterators.UnmodifiableListIterator
  "Decorates a list iterator such that it cannot be modified.

  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators UnmodifiableListIterator]))

(defn *umodifiable-list-iterator
  "Decorates the specified iterator such that it cannot be modified.

  iterator - the iterator to decorate - `java.util.ListIterator`

  returns: a new unmodifiable list iterator - `<E> java.util.ListIterator<E>`

  throws: java.lang.NullPointerException - if the iterator is null"
  ([^java.util.ListIterator iterator]
    (UnmodifiableListIterator/umodifiableListIterator iterator)))

(defn next
  "returns: `E`"
  ([^UnmodifiableListIterator this]
    (-> this (.next))))

(defn has-previous?
  "returns: `boolean`"
  (^Boolean [^UnmodifiableListIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "returns: `int`"
  (^Integer [^UnmodifiableListIterator this]
    (-> this (.previousIndex))))

(defn previous
  "returns: `E`"
  ([^UnmodifiableListIterator this]
    (-> this (.previous))))

(defn remove
  ""
  ([^UnmodifiableListIterator this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UnmodifiableListIterator this]
    (-> this (.hasNext))))

(defn add
  "obj - `E`"
  ([^UnmodifiableListIterator this obj]
    (-> this (.add obj))))

(defn set
  "obj - `E`"
  ([^UnmodifiableListIterator this obj]
    (-> this (.set obj))))

(defn next-index
  "returns: `int`"
  (^Integer [^UnmodifiableListIterator this]
    (-> this (.nextIndex))))

