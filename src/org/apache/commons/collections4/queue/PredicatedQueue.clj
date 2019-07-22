(ns org.apache.commons.collections4.queue.PredicatedQueue
  "Decorates another Queue to validate that additions
  match a specified predicate.

  This queue exists to provide validation for the decorated queue.
  It is normally created to decorate an empty queue.
  If an object cannot be added to the queue, an IllegalArgumentException is thrown.


  One usage would be to ensure that no null entries are added to the queue.



 Queue queue = PredicatedQueue.predicatedQueue(new UnboundedFifoQueue(), NotNullPredicate.INSTANCE);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.queue PredicatedQueue]))

(defn *predicated-queue
  "Factory method to create a predicated (validating) queue.

   If there are any elements already in the queue being decorated, they
   are validated.

  queue - the queue to decorate, must not be null - `java.util.Queue`
  predicate - the predicate to use for validation, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a new predicated queue - `<E> org.apache.commons.collections4.queue.PredicatedQueue<E>`

  throws: java.lang.NullPointerException - if queue or predicate is null"
  ([^java.util.Queue queue ^org.apache.commons.collections4.Predicate predicate]
    (PredicatedQueue/predicatedQueue queue predicate)))

(defn offer
  "Override to validate the object being added to ensure it matches
   the predicate.

  object - the object being added - `E`

  returns: the result of adding to the underlying queue - `boolean`

  throws: java.lang.IllegalArgumentException - if the add is invalid"
  (^Boolean [^PredicatedQueue this object]
    (-> this (.offer object))))

(defn poll
  "returns: `E`"
  ([^PredicatedQueue this]
    (-> this (.poll))))

(defn peek
  "returns: `E`"
  ([^PredicatedQueue this]
    (-> this (.peek))))

(defn element
  "returns: `E`"
  ([^PredicatedQueue this]
    (-> this (.element))))

(defn remove
  "returns: `E`"
  ([^PredicatedQueue this]
    (-> this (.remove))))

