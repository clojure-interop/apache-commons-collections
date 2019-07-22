(ns org.apache.commons.collections4.Closure
  "Defines a functor interface implemented by classes that do something.

  A Closure represents a block of code which is executed from
  inside some block, function or iteration. It operates an input object.


  Standard implementations of common closures are provided by
  ClosureUtils. These include method invocation and for/while loops."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 Closure]))

(defn execute
  "Performs an action on the specified input object.

  input - the input to execute on - `T`

  throws: java.lang.ClassCastException - (runtime) if the input is the wrong class"
  ([^Closure this input]
    (-> this (.execute input))))

