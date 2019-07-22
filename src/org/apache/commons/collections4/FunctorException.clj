(ns org.apache.commons.collections4.FunctorException
  "Runtime exception thrown from functors.
  If required, a root cause error can be wrapped within this one."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 FunctorException]))

(defn ->functor-exception
  "Constructor.

  Constructs a new FunctorException with specified
   detail message and nested Throwable root cause.

  msg - the error message. - `java.lang.String`
  root-cause - the exception or error that caused this exception to be thrown. - `java.lang.Throwable`"
  (^FunctorException [^java.lang.String msg ^java.lang.Throwable root-cause]
    (new FunctorException msg root-cause))
  (^FunctorException [^java.lang.String msg]
    (new FunctorException msg))
  (^FunctorException []
    (new FunctorException )))

