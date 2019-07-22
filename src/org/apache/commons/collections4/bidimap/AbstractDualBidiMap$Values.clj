(ns org.apache.commons.collections4.bidimap.AbstractDualBidiMap$Values
  "Inner class Values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractDualBidiMap$Values]))

(defn iterator
  "returns: `java.util.Iterator<V>`"
  (^java.util.Iterator [^AbstractDualBidiMap$Values this]
    (-> this (.iterator))))

(defn contains
  "value - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractDualBidiMap$Values this ^java.lang.Object value]
    (-> this (.contains value))))

(defn remove
  "value - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractDualBidiMap$Values this ^java.lang.Object value]
    (-> this (.remove value))))

