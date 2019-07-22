(ns org.apache.commons.collections4.functors.AbstractQuantifierPredicate
  "Abstract base class for quantification predicates, e.g. All, Any, None."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors AbstractQuantifierPredicate]))

(defn ->abstract-quantifier-predicate
  "Constructor.

  Constructor that performs no validation.

  predicates - the predicates to check, not cloned, not null - `org.apache.commons.collections4.Predicate`"
  (^AbstractQuantifierPredicate [^org.apache.commons.collections4.Predicate predicates]
    (new AbstractQuantifierPredicate predicates)))

(defn get-predicates
  "Gets the predicates.

  returns: a copy of the predicates - `org.apache.commons.collections4.Predicate<? super T>[]`"
  ([^AbstractQuantifierPredicate this]
    (-> this (.getPredicates))))

