(ns org.apache.commons.collections4.sequence.SequencesComparator
  "This class allows to compare two objects sequences.

  The two sequences can hold any object type, as only the equals
  method is used to compare the elements of the sequences. It is guaranteed
  that the comparisons will always be done as o1.equals(o2) where
  o1 belongs to the first sequence and o2 belongs to
  the second sequence. This can be important if subclassing is used for some
  elements in the first sequence and the equals method is
  specialized.


  Comparison can be seen from two points of view: either as giving the smallest
  modification allowing to transform the first sequence into the second one, or
  as giving the longest sequence which is a subsequence of both initial
  sequences. The equals method is used to compare objects, so any
  object can be put into sequences. Modifications include deleting, inserting
  or keeping one object, starting from the beginning of the first sequence.


  This class implements the comparison algorithm, which is the very efficient
  algorithm from Eugene W. Myers

  An O(ND) Difference Algorithm and Its Variations. This algorithm produces
  the shortest possible
  edit script
  containing all the
  commands
  needed to transform the first sequence into the second one."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.sequence SequencesComparator]))

(defn ->sequences-comparator
  "Constructor.

  Simple constructor.

   Creates a new instance of SequencesComparator with a custom Equator.

   It is guaranteed that the comparisons will always be done as
   Equator.equate(o1, o2) where o1 belongs to the first
   sequence and o2 belongs to the second sequence.

  sequence-1 - first sequence to be compared - `java.util.List`
  sequence-2 - second sequence to be compared - `java.util.List`
  equator - the equator to use for testing object equality - `org.apache.commons.collections4.Equator`"
  (^SequencesComparator [^java.util.List sequence-1 ^java.util.List sequence-2 ^org.apache.commons.collections4.Equator equator]
    (new SequencesComparator sequence-1 sequence-2 equator))
  (^SequencesComparator [^java.util.List sequence-1 ^java.util.List sequence-2]
    (new SequencesComparator sequence-1 sequence-2)))

(defn get-script
  "Get the EditScript object.

   It is guaranteed that the objects embedded in the insert commands come from the second sequence and that the objects
   embedded in either the delete commands or
   keep commands come from the first sequence. This can
   be important if subclassing is used for some elements in the first
   sequence and the equals method is specialized.

  returns: the edit script resulting from the comparison of the two
           sequences - `org.apache.commons.collections4.sequence.EditScript<T>`"
  (^org.apache.commons.collections4.sequence.EditScript [^SequencesComparator this]
    (-> this (.getScript))))

