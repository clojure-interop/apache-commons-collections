(ns org.apache.commons.collections4.EnumerationUtils
  "Provides utility methods for Enumeration instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 EnumerationUtils]))

(defn *get
  "Returns the index-th value in the Enumeration, throwing
   IndexOutOfBoundsException if there is no such element.

   The Enumeration is advanced to index (or to the end, if
   index exceeds the number of entries) as a side effect of this method.

  e - the enumeration to get a value from - `java.util.Enumeration`
  index - the index to get - `int`

  returns: the object at the specified index - `<T> T`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  ([^java.util.Enumeration e ^Integer index]
    (EnumerationUtils/get e index)))

(defn *to-list
  "Creates a list based on an enumeration.

   As the enumeration is traversed, an ArrayList of its values is
   created. The new list is returned.

  enumeration - the enumeration to traverse, which should not be null. - `java.util.Enumeration`

  returns: a list containing all elements of the given enumeration - `<E> java.util.List<E>`

  throws: java.lang.NullPointerException - if the enumeration parameter is null."
  ([^java.util.Enumeration enumeration]
    (EnumerationUtils/toList enumeration)))

