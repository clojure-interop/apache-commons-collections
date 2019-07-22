(ns org.apache.commons.collections4.MultiSetUtils
  "Provides utility methods and decorators for MultiSet instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 MultiSetUtils]))

(def *-empty-multiset
  "Static Constant.

  An empty unmodifiable multiset.

  type: org.apache.commons.collections4.MultiSet"
  MultiSetUtils/EMPTY_MULTISET)

(defn *synchronized-multi-set
  "Returns a synchronized (thread-safe) multiset backed by the given multiset.
   In order to guarantee serial access, it is critical that all access to the
   backing multiset is accomplished through the returned multiset.

   It is imperative that the user manually synchronize on the returned multiset
   when iterating over it:



   MultiSet multiset = MultiSetUtils.synchronizedMultiSet(new HashMultiSet());
   ...
   synchronized(multiset) {
       Iterator i = multiset.iterator(); // Must be in synchronized block
       while (i.hasNext())
           foo(i.next());
       }
   }

   Failure to follow this advice may result in non-deterministic behavior.

  multiset - the multiset to synchronize, must not be null - `org.apache.commons.collections4.MultiSet`

  returns: a synchronized multiset backed by that multiset - `<E> org.apache.commons.collections4.MultiSet<E>`

  throws: java.lang.NullPointerException - if the MultiSet is null"
  ([^org.apache.commons.collections4.MultiSet multiset]
    (MultiSetUtils/synchronizedMultiSet multiset)))

(defn *unmodifiable-multi-set
  "Returns an unmodifiable view of the given multiset. Any modification attempts
   to the returned multiset will raise an UnsupportedOperationException.

  multiset - the multiset whose unmodifiable view is to be returned, must not be null - `org.apache.commons.collections4.MultiSet`

  returns: an unmodifiable view of that multiset - `<E> org.apache.commons.collections4.MultiSet<E>`

  throws: java.lang.NullPointerException - if the MultiSet is null"
  ([^org.apache.commons.collections4.MultiSet multiset]
    (MultiSetUtils/unmodifiableMultiSet multiset)))

(defn *predicated-multi-set
  "Returns a predicated (validating) multiset backed by the given multiset.

   Only objects that pass the test in the given predicate can be added to
   the multiset. Trying to add an invalid object results in an
   IllegalArgumentException. It is important not to use the original multiset
   after invoking this method, as it is a backdoor for adding invalid
   objects.

  multiset - the multiset to predicate, must not be null - `org.apache.commons.collections4.MultiSet`
  predicate - the predicate for the multiset, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a predicated multiset backed by the given multiset - `<E> org.apache.commons.collections4.MultiSet<E>`

  throws: java.lang.NullPointerException - if the MultiSet or Predicate is null"
  ([^org.apache.commons.collections4.MultiSet multiset ^org.apache.commons.collections4.Predicate predicate]
    (MultiSetUtils/predicatedMultiSet multiset predicate)))

(defn *empty-multi-set
  "Get an empty MultiSet.

  returns: an empty MultiSet - `<E> org.apache.commons.collections4.MultiSet<E>`"
  ([]
    (MultiSetUtils/emptyMultiSet )))

