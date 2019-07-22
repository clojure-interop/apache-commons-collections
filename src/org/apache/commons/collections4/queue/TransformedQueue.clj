(ns org.apache.commons.collections4.queue.TransformedQueue
  "Decorates another Queue to transform objects that are added.

  The add/offer methods are affected by this class.
  Thus objects must be removed or searched for using their transformed form.
  For example, if the transformation converts Strings to Integers, you must
  use the Integer form to remove objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.queue TransformedQueue]))

(defn *transforming-queue
  "Factory method to create a transforming queue.

   If there are any elements already in the queue being decorated, they
   are NOT transformed.
   Contrast this with transformedQueue(Queue, Transformer).

  queue - the queue to decorate, must not be null - `java.util.Queue`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed Queue - `<E> org.apache.commons.collections4.queue.TransformedQueue<E>`

  throws: java.lang.NullPointerException - if queue or transformer is null"
  ([^java.util.Queue queue ^org.apache.commons.collections4.Transformer transformer]
    (TransformedQueue/transformingQueue queue transformer)))

(defn *transformed-queue
  "Factory method to create a transforming queue that will transform
   existing contents of the specified queue.

   If there are any elements already in the queue being decorated, they
   will be transformed by this method.
   Contrast this with transformingQueue(Queue, Transformer).

  queue - the queue to decorate, must not be null - `java.util.Queue`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed Queue - `<E> org.apache.commons.collections4.queue.TransformedQueue<E>`

  throws: java.lang.NullPointerException - if queue or transformer is null"
  ([^java.util.Queue queue ^org.apache.commons.collections4.Transformer transformer]
    (TransformedQueue/transformedQueue queue transformer)))

(defn offer
  "obj - `E`

  returns: `boolean`"
  (^Boolean [^TransformedQueue this obj]
    (-> this (.offer obj))))

(defn poll
  "returns: `E`"
  ([^TransformedQueue this]
    (-> this (.poll))))

(defn peek
  "returns: `E`"
  ([^TransformedQueue this]
    (-> this (.peek))))

(defn element
  "returns: `E`"
  ([^TransformedQueue this]
    (-> this (.element))))

(defn remove
  "returns: `E`"
  ([^TransformedQueue this]
    (-> this (.remove))))

