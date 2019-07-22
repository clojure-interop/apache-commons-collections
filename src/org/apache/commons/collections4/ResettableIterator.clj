(ns org.apache.commons.collections4.ResettableIterator
  "Defines an iterator that can be reset back to an initial state.

  This interface allows an iterator to be repeatedly reused."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 ResettableIterator]))

(defn reset
  "Resets the iterator back to the position at which the iterator
   was created."
  ([^ResettableIterator this]
    (-> this (.reset))))

