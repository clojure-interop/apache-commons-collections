(ns org.apache.commons.collections4.functors.PredicateDecorator
  "Defines a predicate that decorates one or more other predicates.

  This interface enables tools to access the decorated predicates."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors PredicateDecorator]))

(defn get-predicates
  "Gets the predicates being decorated as an array.

   The array may be the internal data structure of the predicate and thus
   should not be altered.

  returns: the predicates being decorated - `org.apache.commons.collections4.Predicate<? super T>[]`"
  ([^PredicateDecorator this]
    (-> this (.getPredicates))))

