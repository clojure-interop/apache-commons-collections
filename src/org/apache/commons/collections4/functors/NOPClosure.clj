(ns org.apache.commons.collections4.functors.NOPClosure
  "Closure implementation that does nothing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors NOPClosure]))

(def *-instance
  "Static Constant.

  Singleton predicate instance

  type: org.apache.commons.collections4.Closure"
  NOPClosure/INSTANCE)

(defn *nop-closure
  "Factory returning the singleton instance.

  returns: the singleton instance - `<E> org.apache.commons.collections4.Closure<E>`"
  ([]
    (NOPClosure/nopClosure )))

(defn execute
  "Do nothing.

  input - the input object - `E`"
  ([^NOPClosure this input]
    (-> this (.execute input))))

