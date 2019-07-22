(ns org.apache.commons.collections4.MultiSet$Entry
  "An unmodifiable entry for an element and its occurrence as contained in a MultiSet.

  The MultiSet.entrySet() method returns a view of the multiset whose elements
  implements this interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 MultiSet$Entry]))

(defn get-element
  "Returns the element corresponding to this entry.

  returns: the element corresponding to this entry - `E`"
  ([^MultiSet$Entry this]
    (-> this (.getElement))))

(defn get-count
  "Returns the number of occurrences for the element of this entry.

  returns: the number of occurrences of the element - `int`"
  (^Integer [^MultiSet$Entry this]
    (-> this (.getCount))))

(defn equals
  "Compares the specified object with this entry for equality.
   Returns true if the given object is also a multiset entry
   and the two entries represent the same element with the same
   number of occurrences.

   More formally, two entries e1 and e2 represent
   the same mapping if


       (e1.getElement()==null ? e2.getElement()==null
                              : e1.getElement().equals(e2.getElement())) &&
       (e1.getCount()==e2.getCount())

  o - object to be compared for equality with this multiset entry - `java.lang.Object`

  returns: true if the specified object is equal to this multiset entry - `boolean`"
  (^Boolean [^MultiSet$Entry this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "Returns the hash code value for this multiset entry.

   The hash code of a multiset entry e is defined to be:


        (e==null ? 0 : e.hashCode()) ^ noOccurances)

  returns: the hash code value for this multiset entry - `int`"
  (^Integer [^MultiSet$Entry this]
    (-> this (.hashCode))))

