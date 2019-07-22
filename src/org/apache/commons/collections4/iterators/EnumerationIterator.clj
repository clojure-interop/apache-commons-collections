(ns org.apache.commons.collections4.iterators.EnumerationIterator
  "Adapter to make Enumeration instances appear
  to be Iterator instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators EnumerationIterator]))

(defn ->enumeration-iterator
  "Constructor.

  Constructs a new EnumerationIterator that will remove
   elements from the specified collection.

  enumeration - the enumeration to use - `java.util.Enumeration`
  collection - the collection to remove elements from - `java.util.Collection`"
  (^EnumerationIterator [^java.util.Enumeration enumeration ^java.util.Collection collection]
    (new EnumerationIterator enumeration collection))
  (^EnumerationIterator [^java.util.Enumeration enumeration]
    (new EnumerationIterator enumeration))
  (^EnumerationIterator []
    (new EnumerationIterator )))

(defn has-next?
  "Returns true if the underlying enumeration has more elements.

  returns: true if the underlying enumeration has more elements - `boolean`

  throws: java.lang.NullPointerException - if the underlying enumeration is null"
  (^Boolean [^EnumerationIterator this]
    (-> this (.hasNext))))

(defn next
  "Returns the next object from the enumeration.

  returns: the next object from the enumeration - `E`

  throws: java.lang.NullPointerException - if the enumeration is null"
  ([^EnumerationIterator this]
    (-> this (.next))))

(defn remove
  "Removes the last retrieved element if a collection is attached.

   Functions if an associated Collection is known.
   If so, the first occurrence of the last returned object from this
   iterator will be removed from the collection.

  throws: java.lang.IllegalStateException - next() not called."
  ([^EnumerationIterator this]
    (-> this (.remove))))

(defn get-enumeration
  "Returns the underlying enumeration.

  returns: the underlying enumeration - `java.util.Enumeration<? extends E>`"
  ([^EnumerationIterator this]
    (-> this (.getEnumeration))))

(defn set-enumeration
  "Sets the underlying enumeration.

  enumeration - the new underlying enumeration - `java.util.Enumeration`"
  ([^EnumerationIterator this ^java.util.Enumeration enumeration]
    (-> this (.setEnumeration enumeration))))

