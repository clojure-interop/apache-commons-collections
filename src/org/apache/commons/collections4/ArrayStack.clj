(ns org.apache.commons.collections4.ArrayStack
  "Deprecated.
 use ArrayDeque instead (available from Java 1.6)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 ArrayStack]))

(defn ->array-stack
  "Constructor.

  Deprecated.

  initial-size - the initial size to use - `int`

  throws: java.lang.IllegalArgumentException - if the specified initial size is negative"
  (^ArrayStack [^Integer initial-size]
    (new ArrayStack initial-size))
  (^ArrayStack []
    (new ArrayStack )))

(defn empty
  "Deprecated.

  returns: true if the stack is currently empty - `boolean`"
  (^Boolean [^ArrayStack this]
    (-> this (.empty))))

(defn peek
  "Deprecated.

  n - the number of items down to go - `int`

  returns: the n'th item on the stack, zero relative - `E`

  throws: java.util.EmptyStackException - if there are not enough items on the stack to satisfy this request"
  ([^ArrayStack this ^Integer n]
    (-> this (.peek n)))
  ([^ArrayStack this]
    (-> this (.peek))))

(defn pop
  "Deprecated.

  returns: the top item on the stack - `E`

  throws: java.util.EmptyStackException - if the stack is empty"
  ([^ArrayStack this]
    (-> this (.pop))))

(defn push
  "Deprecated.

  item - the item to be added - `E`

  returns: the item just pushed - `E`"
  ([^ArrayStack this item]
    (-> this (.push item))))

(defn search
  "Deprecated.

  object - the object to be searched for - `java.lang.Object`

  returns: the 1-based depth into the stack of the object, or -1 if not found - `int`"
  (^Integer [^ArrayStack this ^java.lang.Object object]
    (-> this (.search object))))

