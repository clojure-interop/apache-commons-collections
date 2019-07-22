(ns org.apache.commons.collections4.sequence.EditScript
  "This class gathers all the commands needed to transform
  one objects sequence into another objects sequence.

  An edit script is the most general view of the differences between two
  sequences. It is built as the result of the comparison between two sequences
  by the SequencesComparator class. The user can
  walk through it using the visitor design pattern.


  It is guaranteed that the objects embedded in the insert
  commands come from the second sequence and that the objects embedded in
  either the delete commands or keep
  commands come from the first sequence. This can be important if subclassing
  is used for some elements in the first sequence and the equals
  method is specialized."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.sequence EditScript]))

(defn ->edit-script
  "Constructor.

  Simple constructor. Creates a new empty script."
  (^EditScript []
    (new EditScript )))

(defn append
  "Add a keep command to the script.

  command - command to add - `org.apache.commons.collections4.sequence.KeepCommand`"
  ([^EditScript this ^org.apache.commons.collections4.sequence.KeepCommand command]
    (-> this (.append command))))

(defn visit
  "Visit the script. The script implements the visitor design
   pattern, this method is the entry point to which the user supplies its
   own visitor, the script will be responsible to drive it through the
   commands in order and call the appropriate method as each command is
   encountered.

  visitor - the visitor that will visit all commands in turn - `org.apache.commons.collections4.sequence.CommandVisitor`"
  ([^EditScript this ^org.apache.commons.collections4.sequence.CommandVisitor visitor]
    (-> this (.visit visitor))))

(defn get-lcs-length
  "Get the length of the Longest Common Subsequence (LCS). The length of the
   longest common subsequence is the number of keep
   commands in the script.

  returns: length of the Longest Common Subsequence - `int`"
  (^Integer [^EditScript this]
    (-> this (.getLCSLength))))

(defn get-modifications
  "Get the number of effective modifications. The number of effective
   modification is the number of delete and
   insert commands in the script.

  returns: number of effective modifications - `int`"
  (^Integer [^EditScript this]
    (-> this (.getModifications))))

