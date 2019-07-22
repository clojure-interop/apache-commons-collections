(ns org.apache.commons.collections4.sequence.ReplacementsHandler
  "This interface is devoted to handle synchronized replacement sequences."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.sequence ReplacementsHandler]))

(defn handle-replacement
  "Handle two synchronized sequences.

   This method is called by a ReplacementsFinder
   instance when it has synchronized two sub-sequences of object arrays
   being compared, and at least one of the sequences is non-empty. Since the
   sequences are synchronized, the objects before the two sub-sequences are
   equals (if they exist). This property also holds for the objects after
   the two sub-sequences.

   The replacement is defined as replacing the from
   sub-sequence into the to sub-sequence.

  skipped - number of tokens skipped since the last call (i.e. number of tokens that were in both sequences), this number should be strictly positive except on the very first call where it can be zero (if the first object of the two sequences are different) - `int`
  from - sub-sequence of objects coming from the first sequence - `java.util.List`
  to - sub-sequence of objects coming from the second sequence - `java.util.List`"
  ([^ReplacementsHandler this ^Integer skipped ^java.util.List from ^java.util.List to]
    (-> this (.handleReplacement skipped from to))))

