(ns org.apache.commons.collections4.sequence.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[org.apache.commons.collections4.sequence.CommandVisitor])
(require '[org.apache.commons.collections4.sequence.DeleteCommand])
(require '[org.apache.commons.collections4.sequence.EditCommand])
(require '[org.apache.commons.collections4.sequence.EditScript])
(require '[org.apache.commons.collections4.sequence.InsertCommand])
(require '[org.apache.commons.collections4.sequence.KeepCommand])
(require '[org.apache.commons.collections4.sequence.ReplacementsFinder])
(require '[org.apache.commons.collections4.sequence.ReplacementsHandler])
(require '[org.apache.commons.collections4.sequence.SequencesComparator])
