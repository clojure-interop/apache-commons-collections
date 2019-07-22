(ns org.apache.commons.collections4.set.AbstractSetDecorator
  "Decorates another Set to provide additional behaviour.

  Methods are forwarded directly to the decorated set."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set AbstractSetDecorator]))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractSetDecorator this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractSetDecorator this]
    (-> this (.hashCode))))

