(ns org.apache.commons.collections4.bidimap.AbstractDualBidiMap$View
  "Inner class View."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractDualBidiMap$View]))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractDualBidiMap$View this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractDualBidiMap$View this]
    (-> this (.hashCode))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^AbstractDualBidiMap$View this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractDualBidiMap$View this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn retain-all
  "This implementation iterates over the elements of this bidi map, checking each element in
   turn to see if it's contained in coll. If it's not contained, it's removed
   from this bidi map. As a consequence, it is advised to use a collection type for
   coll that provides a fast (e.g. O(1)) implementation of
   Collection.contains(Object).

  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractDualBidiMap$View this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^AbstractDualBidiMap$View this]
    (-> this (.clear))))

