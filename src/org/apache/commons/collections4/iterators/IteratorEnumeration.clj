(ns org.apache.commons.collections4.iterators.IteratorEnumeration
  "Adapter to make an Iterator instance appear to be an
  Enumeration instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators IteratorEnumeration]))

(defn ->iterator-enumeration
  "Constructor.

  Constructs a new IteratorEnumeration that will use the given
   iterator.

  iterator - the iterator to use - `java.util.Iterator`"
  (^IteratorEnumeration [^java.util.Iterator iterator]
    (new IteratorEnumeration iterator))
  (^IteratorEnumeration []
    (new IteratorEnumeration )))

(defn has-more-elements?
  "Returns true if the underlying iterator has more elements.

  returns: true if the underlying iterator has more elements - `boolean`"
  (^Boolean [^IteratorEnumeration this]
    (-> this (.hasMoreElements))))

(defn next-element
  "Returns the next element from the underlying iterator.

  returns: the next element from the underlying iterator. - `E`

  throws: java.util.NoSuchElementException - if the underlying iterator has no more elements"
  ([^IteratorEnumeration this]
    (-> this (.nextElement))))

(defn get-iterator
  "Returns the underlying iterator.

  returns: the underlying iterator - `java.util.Iterator<? extends E>`"
  ([^IteratorEnumeration this]
    (-> this (.getIterator))))

(defn set-iterator
  "Sets the underlying iterator.

  iterator - the new underlying iterator - `java.util.Iterator`"
  ([^IteratorEnumeration this ^java.util.Iterator iterator]
    (-> this (.setIterator iterator))))

