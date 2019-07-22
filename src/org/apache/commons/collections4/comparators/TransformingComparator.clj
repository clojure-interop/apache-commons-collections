(ns org.apache.commons.collections4.comparators.TransformingComparator
  "Decorates another Comparator with transformation behavior. That is, the
  return value from the transform operation will be passed to the decorated
  compare method.

  This class is Serializable from Commons Collections 4.0."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.comparators TransformingComparator]))

(defn ->transforming-comparator
  "Constructor.

  Constructs an instance with the given Transformer and Comparator.

  transformer - what will transform the arguments to compare - `org.apache.commons.collections4.Transformer`
  decorated - the decorated Comparator - `java.util.Comparator`"
  (^TransformingComparator [^org.apache.commons.collections4.Transformer transformer ^java.util.Comparator decorated]
    (new TransformingComparator transformer decorated))
  (^TransformingComparator [^org.apache.commons.collections4.Transformer transformer]
    (new TransformingComparator transformer)))

(defn compare
  "Returns the result of comparing the values from the transform operation.

  obj-1 - the first object to transform then compare - `I`
  obj-2 - the second object to transform then compare - `I`

  returns: negative if obj1 is less, positive if greater, zero if equal - `int`"
  (^Integer [^TransformingComparator this obj-1 obj-2]
    (-> this (.compare obj-1 obj-2))))

(defn hash-code
  "Implement a hash code for this comparator that is consistent with
   equals.

  returns: a hash code for this comparator. - `int`"
  (^Integer [^TransformingComparator this]
    (-> this (.hashCode))))

(defn equals
  "Returns true iff that Object is
   is a Comparator whose ordering is known to be
   equivalent to mine.

   This implementation returns true
   iff that is a TransformingComparator
   whose attributes are equal to mine.

  object - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^TransformingComparator this ^java.lang.Object object]
    (-> this (.equals object))))

