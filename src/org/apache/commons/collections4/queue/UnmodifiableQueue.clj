(ns org.apache.commons.collections4.queue.UnmodifiableQueue
  "Decorates another Queue to ensure it can't be altered.

  Attempts to modify it will result in an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.queue UnmodifiableQueue]))

(defn *unmodifiable-queue
  "Factory method to create an unmodifiable queue.

   If the queue passed in is already unmodifiable, it is returned.

  queue - the queue to decorate, must not be null - `java.util.Queue`

  returns: an unmodifiable Queue - `<E> java.util.Queue<E>`

  throws: java.lang.NullPointerException - if queue is null"
  ([^java.util.Queue queue]
    (UnmodifiableQueue/unmodifiableQueue queue)))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableQueue this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn offer
  "obj - `E`

  returns: `boolean`"
  (^Boolean [^UnmodifiableQueue this obj]
    (-> this (.offer obj))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^UnmodifiableQueue this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^UnmodifiableQueue this]
    (-> this (.iterator))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UnmodifiableQueue this ^java.lang.Object object]
    (-> this (.remove object)))
  ([^UnmodifiableQueue this]
    (-> this (.remove))))

(defn poll
  "returns: `E`"
  ([^UnmodifiableQueue this]
    (-> this (.poll))))

(defn add
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UnmodifiableQueue this ^java.lang.Object object]
    (-> this (.add object))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableQueue this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^UnmodifiableQueue this]
    (-> this (.clear))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^UnmodifiableQueue this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

