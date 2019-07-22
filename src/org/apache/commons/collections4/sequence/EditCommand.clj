(ns org.apache.commons.collections4.sequence.EditCommand
  "Abstract base class for all commands used to transform an objects sequence
  into another one.

  When two objects sequences are compared through the
  SequencesComparator.getScript method,
  the result is provided has a script containing the commands
  that progressively transform the first sequence into the second one.


  There are only three types of commands, all of which are subclasses of this
  abstract class. Each command is associated with one object belonging to at
  least one of the sequences. These commands are InsertCommand which correspond to an object of the second sequence being
  inserted into the first sequence, DeleteCommand which
  correspond to an object of the first sequence being removed and
  KeepCommand which correspond to an object of the first
  sequence which equals an object in the second sequence. It is
  guaranteed that comparison is always performed this way (i.e. the
  equals method of the object from the first sequence is used and
  the object passed as an argument comes from the second sequence) ; this can
  be important if subclassing is used for some elements in the first sequence
  and the equals method is specialized."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.sequence EditCommand]))

(defn accept
  "Accept a visitor.

   This method is invoked for each commands belonging to
   an EditScript, in order to implement the visitor design pattern

  visitor - the visitor to be accepted - `org.apache.commons.collections4.sequence.CommandVisitor`"
  ([^EditCommand this ^org.apache.commons.collections4.sequence.CommandVisitor visitor]
    (-> this (.accept visitor))))

