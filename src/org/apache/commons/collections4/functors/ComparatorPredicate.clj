(ns org.apache.commons.collections4.functors.ComparatorPredicate
  "Predicate that compares the input object with the one stored in the predicate using a comparator.
  In addition, the comparator result can be evaluated in accordance to a supplied criterion value.

  In order to demonstrate the use of the predicate, the following variables are declared:



  Integer ONE = Integer.valueOf(1);
  Integer TWO = Integer.valueOf(2);

  Comparator comparator = new Comparator() {

      public int compare(Object first, Object second) {
          return ((Integer) second) - ((Integer) first);
      }

  };

  Using the declared variables, the ComparatorPredicate can be used used in the
  following way:



  ComparatorPredicate.comparatorPredicate(ONE, comparator).evaluate(TWO);

  The input variable TWO in compared to the stored variable ONE using
  the supplied comparator. This is the default usage of the predicate and will return
  true if the underlying comparator returns 0. In addition to the default
  usage of the predicate, it is possible to evaluate the comparator's result in several ways. The
  following ComparatorPredicate.Criterion enumeration values are provided by the predicate:



      EQUAL
      GREATER
      GREATER_OR_EQUAL
      LESS
      LESS_OR_EQUAL


  The following examples demonstrates how these constants can be used in order to manipulate the
  evaluation of a comparator result.



  ComparatorPredicate.comparatorPredicate(ONE, comparator,ComparatorPredicate.Criterion.GREATER).evaluate(TWO);

  The input variable TWO is compared to the stored variable ONE using the supplied comparator
  using the GREATER evaluation criterion constant. This instructs the predicate to
  return true if the comparator returns a value greater than 0."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ComparatorPredicate]))

(defn ->comparator-predicate
  "Constructor.

  Constructor that performs no validation.
   Use comparatorPredicate if you want that.

  object - the object to compare to - `T`
  comparator - the comparator to use for comparison - `java.util.Comparator`
  criterion - the criterion to use to evaluate comparison - `org.apache.commons.collections4.functors.ComparatorPredicate$Criterion`"
  (^ComparatorPredicate [object ^java.util.Comparator comparator ^org.apache.commons.collections4.functors.ComparatorPredicate$Criterion criterion]
    (new ComparatorPredicate object comparator criterion)))

(defn *comparator-predicate
  "Factory to create the comparator predicate

  object - the object to compare to - `T`
  comparator - the comparator to use for comparison - `java.util.Comparator`
  criterion - the criterion to use to evaluate comparison - `org.apache.commons.collections4.functors.ComparatorPredicate$Criterion`

  returns: the predicate - `<T> org.apache.commons.collections4.Predicate<T>`

  throws: java.lang.NullPointerException - if comparator or criterion is null"
  ([object ^java.util.Comparator comparator ^org.apache.commons.collections4.functors.ComparatorPredicate$Criterion criterion]
    (ComparatorPredicate/comparatorPredicate object comparator criterion))
  ([object ^java.util.Comparator comparator]
    (ComparatorPredicate/comparatorPredicate object comparator)))

(defn evaluate
  "Evaluates the predicate. The predicate evaluates to true in the following cases:


   comparator.compare(object, input) == 0 && criterion == EQUAL
   comparator.compare(object, input) < 0 && criterion == LESS
   comparator.compare(object, input) > 0 && criterion == GREATER
   comparator.compare(object, input) >= 0 && criterion == GREATER_OR_EQUAL
   comparator.compare(object, input) <= 0 && criterion == LESS_OR_EQUAL

  target - the target object to compare to - `T`

  returns: true if the comparison succeeds according to the selected criterion - `boolean`

  throws: java.lang.IllegalStateException - if the criterion is invalid (really not possible)"
  (^Boolean [^ComparatorPredicate this target]
    (-> this (.evaluate target))))

