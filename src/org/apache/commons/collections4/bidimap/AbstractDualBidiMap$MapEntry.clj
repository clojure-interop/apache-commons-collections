(ns org.apache.commons.collections4.bidimap.AbstractDualBidiMap$MapEntry
  "Inner class MapEntry."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractDualBidiMap$MapEntry]))

(defn set-value
  "value - `V`

  returns: `V`"
  ([^AbstractDualBidiMap$MapEntry this value]
    (-> this (.setValue value))))

