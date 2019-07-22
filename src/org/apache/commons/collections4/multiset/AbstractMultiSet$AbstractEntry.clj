(ns org.apache.commons.collections4.multiset.AbstractMultiSet$AbstractEntry
  "Inner class AbstractEntry."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.multiset AbstractMultiSet$AbstractEntry]))

(defn equals
  "Description copied from interface: MultiSet.Entry

  object - object to be compared for equality with this multiset entry - `java.lang.Object`

  returns: true if the specified object is equal to this multiset entry - `boolean`"
  (^Boolean [^AbstractMultiSet$AbstractEntry this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "Description copied from interface: MultiSet.Entry

  returns: the hash code value for this multiset entry - `int`"
  (^Integer [^AbstractMultiSet$AbstractEntry this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractMultiSet$AbstractEntry this]
    (-> this (.toString))))

