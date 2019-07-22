(ns org.apache.commons.collections4.sequence.ReplacementsFinder
  "This class handles sequences of replacements resulting from a comparison.

  The comparison of two objects sequences leads to the identification of common
  parts and parts which only belong to the first or to the second sequence. The
  common parts appear in the edit script in the form of keep commands,
  they can be considered as synchronization objects between the two sequences.
  These synchronization objects split the two sequences in synchronized
  sub-sequences. The first sequence can be transformed into the second one by
  replacing each synchronized sub-sequence of the first sequence by the
  corresponding sub-sequence of the second sequence. This is a synthetic way to
  see an edit script, replacing individual
  delete, keep and
  insert commands by fewer replacements acting on
  complete sub-sequences.


  This class is devoted to perform this interpretation. It visits an
  edit script (because it implements the
  CommandVisitor interface) and calls a user-supplied
  handler implementing the ReplacementsHandler
  interface to process the sub-sequences."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.sequence ReplacementsFinder]))

(defn ->replacements-finder
  "Constructor.

  Simple constructor. Creates a new instance of ReplacementsFinder.

  handler - handler to call when synchronized sequences are found - `org.apache.commons.collections4.sequence.ReplacementsHandler`"
  (^ReplacementsFinder [^org.apache.commons.collections4.sequence.ReplacementsHandler handler]
    (new ReplacementsFinder handler)))

(defn visit-insert-command
  "Add an object to the pending insertions set.

  object - object to insert - `T`"
  ([^ReplacementsFinder this object]
    (-> this (.visitInsertCommand object))))

(defn visit-keep-command
  "Handle a synchronization object.

   When a synchronization object is identified, the pending insertions and
   pending deletions sets are provided to the user handler as subsequences.

  object - synchronization object detected - `T`"
  ([^ReplacementsFinder this object]
    (-> this (.visitKeepCommand object))))

(defn visit-delete-command
  "Add an object to the pending deletions set.

  object - object to delete - `T`"
  ([^ReplacementsFinder this object]
    (-> this (.visitDeleteCommand object))))

