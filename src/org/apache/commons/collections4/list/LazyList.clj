(ns org.apache.commons.collections4.list.LazyList
  "Decorates another List to create objects in the list on demand.

  When the get(int) method is called with an index greater than
  the size of the list, the list will automatically grow in size and return
  a new object from the specified factory or transformer. The gaps will be
  filled by null. If a get method call encounters a null, it will be replaced
  with a new object from the factory. Thus this list is unsuitable for
  storing null objects.


  For instance:




  Factory<Date> factory = new Factory<Date>() {
      public Date create() {
          return new Date();
      }
  }
  List<Date> lazy = LazyList.decorate(new ArrayList<Date>(), factory);
  Date date = lazy.get(3);


  After the above code is executed, date will contain
  a new Date instance.  Furthermore, that Date
  instance is the fourth element in the list.  The first, second,
  and third element are all set to null.


  This class differs from GrowthList because here growth occurs on
  get, where GrowthList grows on set and add. However, they
  could easily be used together by decorating twice.


  This class is Serializable from Commons Collections 3.1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.list LazyList]))

(defn *lazy-list
  "Factory method to create a lazily instantiating list.

  list - the list to decorate, must not be null - `java.util.List`
  factory - the factory to use for creation, must not be null - `org.apache.commons.collections4.Factory`

  returns: a new lazy list - `<E> org.apache.commons.collections4.list.LazyList<E>`

  throws: java.lang.NullPointerException - if list or factory is null"
  ([^java.util.List list ^org.apache.commons.collections4.Factory factory]
    (LazyList/lazyList list factory)))

(defn get
  "Decorate the get method to perform the lazy behaviour.

   If the requested index is greater than the current size, the list will
   grow to the new size and a new object will be returned from the factory
   or transformer. Indexes in-between the old size and the requested size
   are left with a placeholder that is replaced with a factory or
   transformer object when requested.

  index - the index to retrieve - `int`

  returns: the element at the given index - `E`"
  ([^LazyList this ^Integer index]
    (-> this (.get index))))

(defn sub-list
  "from-index - `int`
  to-index - `int`

  returns: `java.util.List<E>`"
  (^java.util.List [^LazyList this ^Integer from-index ^Integer to-index]
    (-> this (.subList from-index to-index))))

