(ns org.apache.commons.collections4.sequence.DeleteCommand
  "Command representing the deletion of one object of the first sequence.

  When one object of the first sequence has no corresponding object in the
  second sequence at the right place, the edit script
  transforming the first sequence into the second sequence uses an instance of
  this class to represent the deletion of this object. The objects embedded in
  these type of commands always come from the first sequence."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.sequence DeleteCommand]))

(defn ->delete-command
  "Constructor.

  Simple constructor. Creates a new instance of DeleteCommand.

  object - the object of the first sequence that should be deleted - `T`"
  (^DeleteCommand [object]
    (new DeleteCommand object)))

(defn accept
  "Accept a visitor. When a DeleteCommand accepts a visitor, it calls
   its visitDeleteCommand method.

  visitor - the visitor to be accepted - `org.apache.commons.collections4.sequence.CommandVisitor`"
  ([^DeleteCommand this ^org.apache.commons.collections4.sequence.CommandVisitor visitor]
    (-> this (.accept visitor))))

