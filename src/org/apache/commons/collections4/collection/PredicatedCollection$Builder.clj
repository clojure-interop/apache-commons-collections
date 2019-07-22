(ns org.apache.commons.collections4.collection.PredicatedCollection$Builder
  "Builder for creating predicated collections.

  Create a Builder with a predicate to validate elements against, then add any elements
  to the builder. Elements that fail the predicate will be added to a rejected list.
  Finally create or decorate a collection using the createPredicated[List,Set,Bag,Queue] methods.

  An example:


    Predicate<String> predicate = NotNullPredicate.notNullPredicate();
    PredicatedCollectionBuilder<String> builder = PredicatedCollection.builder(predicate);
    builder.add(\"item1\");
    builder.add(null);
    builder.add(\"item2\");
    List<String> predicatedList = builder.createPredicatedList();

  At the end of the code fragment above predicatedList is protected by the predicate supplied
  to the builder and it contains item1 and item2.

  More elements can be added to the builder once a predicated collection has been created,
  but these elements will not be reflected in already created collections."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.collection PredicatedCollection$Builder]))

(defn ->builder
  "Constructor.

  Constructs a PredicatedCollectionBuilder with the specified Predicate.

  predicate - the predicate to use - `org.apache.commons.collections4.Predicate`

  throws: java.lang.NullPointerException - if predicate is null"
  (^PredicatedCollection$Builder [^org.apache.commons.collections4.Predicate predicate]
    (new PredicatedCollection$Builder predicate)))

(defn add
  "Adds the item to the builder.

   If the predicate is true, it is added to the list of accepted elements,
   otherwise it is added to the rejected list.

  item - the element to add - `E`

  returns: the PredicatedCollectionBuilder. - `org.apache.commons.collections4.collection.PredicatedCollection$Builder<E>`"
  (^org.apache.commons.collections4.collection.PredicatedCollection$Builder [^PredicatedCollection$Builder this item]
    (-> this (.add item))))

(defn add-all
  "Adds all elements from the given collection to the builder.

   All elements for which the predicate evaluates to true will be added to the
   list of accepted elements, otherwise they are added to the rejected list.

  items - the elements to add to the builder - `java.util.Collection`

  returns: the PredicatedCollectionBuilder. - `org.apache.commons.collections4.collection.PredicatedCollection$Builder<E>`"
  (^org.apache.commons.collections4.collection.PredicatedCollection$Builder [^PredicatedCollection$Builder this ^java.util.Collection items]
    (-> this (.addAll items))))

(defn create-predicated-list
  "Decorates the given list with validating behavior using the predicate. All accepted elements
   are appended to the list. If the list already contains elements, they are validated.

   The builder is not modified by this method, so it is possible to create more collections
   or add more elements afterwards. Further changes will not propagate to the returned list.

  list - the List to decorate, must not be null - `java.util.List`

  returns: the decorated list. - `java.util.List<E>`

  throws: java.lang.NullPointerException - if list is null"
  (^java.util.List [^PredicatedCollection$Builder this ^java.util.List list]
    (-> this (.createPredicatedList list)))
  (^java.util.List [^PredicatedCollection$Builder this]
    (-> this (.createPredicatedList))))

(defn create-predicated-set
  "Decorates the given list with validating behavior using the predicate. All accepted elements
   are appended to the set. If the set already contains elements, they are validated.

   The builder is not modified by this method, so it is possible to create more collections
   or add more elements afterwards. Further changes will not propagate to the returned set.

  set - the set to decorate, must not be null - `java.util.Set`

  returns: the decorated set. - `java.util.Set<E>`

  throws: java.lang.NullPointerException - if set is null"
  (^java.util.Set [^PredicatedCollection$Builder this ^java.util.Set set]
    (-> this (.createPredicatedSet set)))
  (^java.util.Set [^PredicatedCollection$Builder this]
    (-> this (.createPredicatedSet))))

(defn create-predicated-multi-set
  "Decorates the given multiset with validating behavior using the predicate. All accepted elements
   are appended to the multiset. If the multiset already contains elements, they are validated.

   The builder is not modified by this method, so it is possible to create more collections
   or add more elements afterwards. Further changes will not propagate to the returned multiset.

  multiset - the multiset to decorate, must not be null - `org.apache.commons.collections4.MultiSet`

  returns: the decorated multiset. - `org.apache.commons.collections4.MultiSet<E>`

  throws: java.lang.NullPointerException - if multiset is null"
  (^org.apache.commons.collections4.MultiSet [^PredicatedCollection$Builder this ^org.apache.commons.collections4.MultiSet multiset]
    (-> this (.createPredicatedMultiSet multiset)))
  (^org.apache.commons.collections4.MultiSet [^PredicatedCollection$Builder this]
    (-> this (.createPredicatedMultiSet))))

(defn create-predicated-bag
  "Decorates the given bag with validating behavior using the predicate. All accepted elements
   are appended to the bag. If the bag already contains elements, they are validated.

   The builder is not modified by this method, so it is possible to create more collections
   or add more elements afterwards. Further changes will not propagate to the returned bag.

  bag - the bag to decorate, must not be null - `org.apache.commons.collections4.Bag`

  returns: the decorated bag. - `org.apache.commons.collections4.Bag<E>`

  throws: java.lang.NullPointerException - if bag is null"
  (^org.apache.commons.collections4.Bag [^PredicatedCollection$Builder this ^org.apache.commons.collections4.Bag bag]
    (-> this (.createPredicatedBag bag)))
  (^org.apache.commons.collections4.Bag [^PredicatedCollection$Builder this]
    (-> this (.createPredicatedBag))))

(defn create-predicated-queue
  "Decorates the given queue with validating behavior using the predicate. All accepted elements
   are appended to the queue. If the queue already contains elements, they are validated.

   The builder is not modified by this method, so it is possible to create more collections
   or add more elements afterwards. Further changes will not propagate to the returned queue.

  queue - the queue to decorate, must not be null - `java.util.Queue`

  returns: the decorated queue. - `java.util.Queue<E>`

  throws: java.lang.NullPointerException - if queue is null"
  (^java.util.Queue [^PredicatedCollection$Builder this ^java.util.Queue queue]
    (-> this (.createPredicatedQueue queue)))
  (^java.util.Queue [^PredicatedCollection$Builder this]
    (-> this (.createPredicatedQueue))))

(defn rejected-elements
  "Returns an unmodifiable collection containing all rejected elements.

  returns: an unmodifiable collection - `java.util.Collection<E>`"
  (^java.util.Collection [^PredicatedCollection$Builder this]
    (-> this (.rejectedElements))))

