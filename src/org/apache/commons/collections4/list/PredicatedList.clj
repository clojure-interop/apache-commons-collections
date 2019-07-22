(ns org.apache.commons.collections4.list.PredicatedList
  "Decorates another List to validate that all additions
  match a specified predicate.

  This list exists to provide validation for the decorated list.
  It is normally created to decorate an empty list.
  If an object cannot be added to the list, an IllegalArgumentException is thrown.


  One usage would be to ensure that no null entries are added to the list.



  List<String> list =
    PredicatedList.predicatedList(new ArrayList<String>(), PredicateUtils.notNullPredicate());

  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list PredicatedList]))

(defn *predicated-list
  "Factory method to create a predicated (validating) list.

   If there are any elements already in the list being decorated, they
   are validated.

  list - the list to decorate, must not be null - `java.util.List`
  predicate - the predicate to use for validation, must not be null - `org.apache.commons.collections4.Predicate`

  returns: a new predicated list - `<T> org.apache.commons.collections4.list.PredicatedList<T>`

  throws: java.lang.NullPointerException - if list or predicate is null"
  ([^java.util.List list ^org.apache.commons.collections4.Predicate predicate]
    (PredicatedList/predicatedList list predicate)))

(defn add-all
  "index - `int`
  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^PredicatedList this ^Integer index ^java.util.Collection coll]
    (-> this (.addAll index coll))))

(defn list-iterator
  "i - `int`

  returns: `java.util.ListIterator<E>`"
  (^java.util.ListIterator [^PredicatedList this ^Integer i]
    (-> this (.listIterator i)))
  (^java.util.ListIterator [^PredicatedList this]
    (-> this (.listIterator))))

(defn sub-list
  "from-index - `int`
  to-index - `int`

  returns: `java.util.List<E>`"
  (^java.util.List [^PredicatedList this ^Integer from-index ^Integer to-index]
    (-> this (.subList from-index to-index))))

(defn last-index-of
  "object - `java.lang.Object`

  returns: `int`"
  (^Integer [^PredicatedList this ^java.lang.Object object]
    (-> this (.lastIndexOf object))))

(defn remove
  "index - `int`

  returns: `E`"
  ([^PredicatedList this ^Integer index]
    (-> this (.remove index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PredicatedList this]
    (-> this (.hashCode))))

(defn add
  "index - `int`
  object - `E`"
  ([^PredicatedList this ^Integer index object]
    (-> this (.add index object))))

(defn set
  "index - `int`
  object - `E`

  returns: `E`"
  ([^PredicatedList this ^Integer index object]
    (-> this (.set index object))))

(defn index-of
  "object - `java.lang.Object`

  returns: `int`"
  (^Integer [^PredicatedList this ^java.lang.Object object]
    (-> this (.indexOf object))))

(defn get
  "index - `int`

  returns: `E`"
  ([^PredicatedList this ^Integer index]
    (-> this (.get index))))

(defn equals
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PredicatedList this ^java.lang.Object object]
    (-> this (.equals object))))

