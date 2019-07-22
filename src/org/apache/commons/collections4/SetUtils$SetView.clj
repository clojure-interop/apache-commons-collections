(ns org.apache.commons.collections4.SetUtils$SetView
  "An unmodifiable view of a set that may be backed by other sets.

  If the decorated sets change, this view will change as well. The contents
  of this view can be transferred to another instance via the copyInto(Set)
  and toSet() methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 SetUtils$SetView]))

(defn ->set-view
  "Constructor."
  (^SetUtils$SetView []
    (new SetUtils$SetView )))

(defn copy-into
  "Copies the contents of this view into the provided set.

  set - the set for copying the contents - `S`

  returns: `<S extends java.util.Set<E>> void`"
  ([^SetUtils$SetView this set]
    (-> this (.copyInto set))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^SetUtils$SetView this]
    (-> this (.iterator))))

(defn size
  "returns: `int`"
  (^Integer [^SetUtils$SetView this]
    (-> this (.size))))

(defn to-set
  "Returns a new set containing the contents of this view.

  returns: a new set containing all elements of this view - `java.util.Set<E>`"
  (^java.util.Set [^SetUtils$SetView this]
    (-> this (.toSet))))

