(ns org.apache.commons.collections4.QueueUtils
  "Provides utility methods and decorators for Queue instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 QueueUtils]))

(def *-empty-queue
  "Static Constant.

  An empty unmodifiable queue.

  type: java.util.Queue"
  QueueUtils/EMPTY_QUEUE)

(defn *synchronized-queue
  "Returns a synchronized (thread-safe) queue backed by the given queue.
   In order to guarantee serial access, it is critical that all access to the
   backing queue is accomplished through the returned queue.

   It is imperative that the user manually synchronize on the returned queue
   when iterating over it:



   Queue queue = QueueUtils.synchronizedQueue(new CircularFifoQueue());
   ...
   synchronized(queue) {
       Iterator i = queue.iterator(); // Must be in synchronized block
       while (i.hasNext())
           foo(i.next());
       }
   }

   Failure to follow this advice may result in non-deterministic behavior.

  queue - the queue to synchronize, must not be null - `java.util.Queue`

  returns: a synchronized queue backed by that queue - `<E> java.util.Queue<E>`

  throws: java.lang.NullPointerException - if the queue is null"
  ([^java.util.Queue queue]
    (QueueUtils/synchronizedQueue queue)))

(defn *unmodifiable-queue
  "Returns an unmodifiable queue backed by the given queue.

  queue - the queue to make unmodifiable, must not be null - `java.util.Queue`

  returns: an unmodifiable queue backed by that queue - `<E> java.util.Queue<E>`

  throws: java.lang.NullPointerException - if the queue is null"
  ([^java.util.Queue queue]
    (QueueUtils/unmodifiableQueue queue)))

(defn *predicated-queue
  "Returns a predicated (validating) queue backed by the given queue.

   Only objects that pass the test in the given predicate can be added to the queue.
   Trying to add an invalid object results in an IllegalArgumentException.
   It is important not to use the original queue after invoking this method,
   as it is a backdoor for adding invalid objects.

  queue - the queue to predicate, must not be null - `java.util.Queue`
  predicate - the predicate used to evaluate new elements, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a predicated queue - `<E> java.util.Queue<E>`

  throws: java.lang.NullPointerException - if the queue or predicate is null"
  ([^java.util.Queue queue ^org.apache.commons.collections4.Predicate predicate]
    (QueueUtils/predicatedQueue queue predicate)))

(defn *transforming-queue
  "Returns a transformed queue backed by the given queue.

   Each object is passed through the transformer as it is added to the
   Queue. It is important not to use the original queue after invoking this
   method, as it is a backdoor for adding untransformed objects.

   Existing entries in the specified queue will not be transformed.
   If you want that behaviour, see TransformedQueue.transformedQueue(java.util.Queue<E>, org.apache.commons.collections4.Transformer<? super E, ? extends E>).

  queue - the queue to predicate, must not be null - `java.util.Queue`
  transformer - the transformer for the queue, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a transformed queue backed by the given queue - `<E> java.util.Queue<E>`

  throws: java.lang.NullPointerException - if the queue or transformer is null"
  ([^java.util.Queue queue ^org.apache.commons.collections4.Transformer transformer]
    (QueueUtils/transformingQueue queue transformer)))

(defn *empty-queue
  "Get an empty Queue.

  returns: an empty Queue - `<E> java.util.Queue<E>`"
  ([]
    (QueueUtils/emptyQueue )))

