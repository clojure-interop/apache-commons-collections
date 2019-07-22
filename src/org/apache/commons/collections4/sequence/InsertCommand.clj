(ns org.apache.commons.collections4.sequence.InsertCommand
  "Command representing the insertion of one object of the second sequence.

  When one object of the second sequence has no corresponding object in the
  first sequence at the right place, the edit script
  transforming the first sequence into the second sequence uses an instance of
  this class to represent the insertion of this object. The objects embedded in
  these type of commands always come from the second sequence."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.sequence InsertCommand]))

(defn ->insert-command
  "Constructor.

  Simple constructor. Creates a new instance of InsertCommand

  object - the object of the second sequence that should be inserted - `T`"
  (^InsertCommand [object]
    (new InsertCommand object)))

(defn accept
  "Accept a visitor. When an InsertCommand accepts a visitor,
   it calls its visitInsertCommand
   method.

  visitor - the visitor to be accepted - `org.apache.commons.collections4.sequence.CommandVisitor`"
  ([^InsertCommand this ^org.apache.commons.collections4.sequence.CommandVisitor visitor]
    (-> this (.accept visitor))))

