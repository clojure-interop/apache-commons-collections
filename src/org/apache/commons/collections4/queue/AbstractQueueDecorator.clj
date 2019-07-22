(ns org.apache.commons.collections4.queue.AbstractQueueDecorator
  "Decorates another Queue to provide additional behaviour.

  Methods are forwarded directly to the decorated queue.


  This implementation does not forward the hashCode and equals methods through
  to the backing object, but relies on Object's implementation. This is
  necessary as some Queue implementations, e.g. LinkedList, have custom a
  equals implementation for which symmetry can not be preserved.
  See class javadoc of AbstractCollectionDecorator for more information."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.queue AbstractQueueDecorator]))

(defn offer
  "obj - `E`

  returns: `boolean`"
  (^Boolean [^AbstractQueueDecorator this obj]
    (-> this (.offer obj))))

(defn poll
  "returns: `E`"
  ([^AbstractQueueDecorator this]
    (-> this (.poll))))

(defn peek
  "returns: `E`"
  ([^AbstractQueueDecorator this]
    (-> this (.peek))))

(defn element
  "returns: `E`"
  ([^AbstractQueueDecorator this]
    (-> this (.element))))

(defn remove
  "returns: `E`"
  ([^AbstractQueueDecorator this]
    (-> this (.remove))))

