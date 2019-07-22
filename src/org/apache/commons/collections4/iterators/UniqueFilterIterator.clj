(ns org.apache.commons.collections4.iterators.UniqueFilterIterator
  "A FilterIterator which only returns \"unique\" Objects.  Internally,
  the Iterator maintains a Set of objects it has already encountered,
  and duplicate Objects are skipped."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators UniqueFilterIterator]))

(defn ->unique-filter-iterator
  "Constructor.

  Constructs a new UniqueFilterIterator.

  iterator - the iterator to use - `java.util.Iterator`"
  (^UniqueFilterIterator [^java.util.Iterator iterator]
    (new UniqueFilterIterator iterator)))

