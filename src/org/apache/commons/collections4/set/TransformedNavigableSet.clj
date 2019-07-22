(ns org.apache.commons.collections4.set.TransformedNavigableSet
  "Decorates another NavigableSet to transform objects that are added.

  The add methods are affected by this class.
  Thus objects must be removed or searched for using their transformed form.
  For example, if the transformation converts Strings to Integers, you must
  use the Integer form to remove objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.set TransformedNavigableSet]))

(defn *transforming-navigable-set
  "Factory method to create a transforming navigable set.

   If there are any elements already in the set being decorated, they
   are NOT transformed.
   Contrast this with transformedNavigableSet(NavigableSet, Transformer).

  set - the set to decorate, must not be null - `java.util.NavigableSet`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed NavigableSet - `<E> org.apache.commons.collections4.set.TransformedNavigableSet<E>`

  throws: java.lang.NullPointerException - if set or transformer is null"
  ([^java.util.NavigableSet set ^org.apache.commons.collections4.Transformer transformer]
    (TransformedNavigableSet/transformingNavigableSet set transformer)))

(defn *transformed-navigable-set
  "Factory method to create a transforming navigable set that will transform
   existing contents of the specified navigable set.

   If there are any elements already in the set being decorated, they
   will be transformed by this method.
   Contrast this with transformingNavigableSet(NavigableSet, Transformer).

  set - the set to decorate, must not be null - `java.util.NavigableSet`
  transformer - the transformer to use for conversion, must not be null - `org.apache.commons.collections4.Transformer`

  returns: a new transformed NavigableSet - `<E> org.apache.commons.collections4.set.TransformedNavigableSet<E>`

  throws: java.lang.NullPointerException - if set or transformer is null"
  ([^java.util.NavigableSet set ^org.apache.commons.collections4.Transformer transformer]
    (TransformedNavigableSet/transformedNavigableSet set transformer)))

(defn floor
  "e - `E`

  returns: `E`"
  ([^TransformedNavigableSet this e]
    (-> this (.floor e))))

(defn tail-set
  "from-element - `E`
  inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^TransformedNavigableSet this from-element ^Boolean inclusive]
    (-> this (.tailSet from-element inclusive))))

(defn descending-set
  "returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^TransformedNavigableSet this]
    (-> this (.descendingSet))))

(defn sub-set
  "from-element - `E`
  from-inclusive - `boolean`
  to-element - `E`
  to-inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^TransformedNavigableSet this from-element ^Boolean from-inclusive to-element ^Boolean to-inclusive]
    (-> this (.subSet from-element from-inclusive to-element to-inclusive))))

(defn poll-last
  "returns: `E`"
  ([^TransformedNavigableSet this]
    (-> this (.pollLast))))

(defn poll-first
  "returns: `E`"
  ([^TransformedNavigableSet this]
    (-> this (.pollFirst))))

(defn higher
  "e - `E`

  returns: `E`"
  ([^TransformedNavigableSet this e]
    (-> this (.higher e))))

(defn lower
  "e - `E`

  returns: `E`"
  ([^TransformedNavigableSet this e]
    (-> this (.lower e))))

(defn descending-iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^TransformedNavigableSet this]
    (-> this (.descendingIterator))))

(defn head-set
  "to-element - `E`
  inclusive - `boolean`

  returns: `java.util.NavigableSet<E>`"
  (^java.util.NavigableSet [^TransformedNavigableSet this to-element ^Boolean inclusive]
    (-> this (.headSet to-element inclusive))))

(defn ceiling
  "e - `E`

  returns: `E`"
  ([^TransformedNavigableSet this e]
    (-> this (.ceiling e))))

