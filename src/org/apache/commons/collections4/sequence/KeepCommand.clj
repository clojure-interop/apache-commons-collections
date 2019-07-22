(ns org.apache.commons.collections4.sequence.KeepCommand
  "Command representing the keeping of one object present in both sequences.

  When one object of the first sequence equals another objects in
  the second sequence at the right place, the edit script
  transforming the first sequence into the second sequence uses an instance of
  this class to represent the keeping of this object. The objects embedded in
  these type of commands always come from the first sequence."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.sequence KeepCommand]))

(defn ->keep-command
  "Constructor.

  Simple constructor. Creates a new instance of KeepCommand

  object - the object belonging to both sequences (the object is a reference to the instance in the first sequence which is known to be equal to an instance in the second sequence) - `T`"
  (^KeepCommand [object]
    (new KeepCommand object)))

(defn accept
  "Accept a visitor. When a KeepCommand accepts a visitor, it
   calls its visitKeepCommand method.

  visitor - the visitor to be accepted - `org.apache.commons.collections4.sequence.CommandVisitor`"
  ([^KeepCommand this ^org.apache.commons.collections4.sequence.CommandVisitor visitor]
    (-> this (.accept visitor))))

