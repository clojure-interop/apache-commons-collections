(ns org.apache.commons.collections4.functors.ForClosure
  "Closure implementation that calls another closure n times, like a for loop.

  WARNING: from v4.1 onwards this class will not be serializable anymore
  in order to prevent potential remote code execution exploits. Please refer to
  COLLECTIONS-580
  for more details."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ForClosure]))

(defn ->for-closure
  "Constructor.

  Constructor that performs no validation.
   Use forClosure if you want that.

  count - the number of times to execute the closure - `int`
  closure - the closure to execute, not null - `org.apache.commons.collections4.Closure`"
  (^ForClosure [^Integer count ^org.apache.commons.collections4.Closure closure]
    (new ForClosure count closure)))

(defn *for-closure
  "Factory method that performs validation.

   A null closure or zero count returns the NOPClosure.
   A count of one returns the specified closure.

  count - the number of times to execute the closure - `int`
  closure - the closure to execute, not null - `org.apache.commons.collections4.Closure`

  returns: the for closure - `<E> org.apache.commons.collections4.Closure<E>`"
  ([^Integer count ^org.apache.commons.collections4.Closure closure]
    (ForClosure/forClosure count closure)))

(defn execute
  "Executes the closure count times.

  input - the input object - `E`"
  ([^ForClosure this input]
    (-> this (.execute input))))

(defn get-closure
  "Gets the closure.

  returns: the closure - `org.apache.commons.collections4.Closure<? super E>`"
  ([^ForClosure this]
    (-> this (.getClosure))))

(defn get-count
  "Gets the count.

  returns: the count - `int`"
  (^Integer [^ForClosure this]
    (-> this (.getCount))))

