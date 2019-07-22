(ns org.apache.commons.collections4.queue.SynchronizedQueue
  "Decorates another Queue to synchronize its behaviour for a multi-threaded environment.

  Methods are synchronized, then forwarded to the decorated queue. Iterators must be separately synchronized around the
  loop."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.queue SynchronizedQueue]))

