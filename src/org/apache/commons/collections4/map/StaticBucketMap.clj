(ns org.apache.commons.collections4.map.StaticBucketMap
  "A StaticBucketMap is an efficient, thread-safe implementation of
  java.util.Map that performs well in in a highly
  thread-contentious environment.  The map supports very efficient
  get, put,
  remove and containsKey
  operations, assuming (approximate) uniform hashing and
  that the number of entries does not exceed the number of buckets.  If the
  number of entries exceeds the number of buckets or if the hash codes of the
  objects are not uniformly distributed, these operations have a worst case
  scenario that is proportional to the number of elements in the map
  (O(n)).

  Each bucket in the hash table has its own monitor, so two threads can
  safely operate on the map at the same time, often without incurring any
  monitor contention.  This means that you don't have to wrap instances
  of this class with Collections.synchronizedMap(Map);
  instances are already thread-safe.  Unfortunately, however, this means
  that this map implementation behaves in ways you may find disconcerting.
  Bulk operations, such as putAll or the
  retainAll operation in collection
  views, are not atomic.  If two threads are simultaneously
  executing



    staticBucketMapInstance.putAll(map);

  and



    staticBucketMapInstance.entrySet().removeAll(map.entrySet());

  then the results are generally random.  Those two statement could cancel
  each other out, leaving staticBucketMapInstance essentially
  unchanged, or they could leave some random subset of map in
  staticBucketMapInstance.

  Also, much like an encyclopedia, the results of size() and
  isEmpty() are out-of-date as soon as they are produced.

  The iterators returned by the collection views of this class are not
  fail-fast.  They will never raise a
  ConcurrentModificationException.  Keys and values
  added to the map after the iterator is created do not necessarily appear
  during iteration.  Similarly, the iterator does not necessarily fail to
  return keys and values that were removed after the iterator was created.

  Finally, unlike HashMap-style implementations, this
  class never rehashes the map.  The number of buckets is fixed
  at construction time and never altered.  Performance may degrade if
  you do not allocate enough buckets upfront.

  The atomic(Runnable) method is provided to allow atomic iterations
  and bulk operations; however, overuse of atomic
  will basically result in a map that's slower than an ordinary synchronized
  HashMap.

  Use this class if you do not require reliable bulk operations and
  iterations, or if you can make your own guarantees about how bulk
  operations will affect the map."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map StaticBucketMap]))

(defn ->static-bucket-map
  "Constructor.

  Initializes the map with a specified number of buckets.  The number
   of buckets is never below 17, and is always an odd number (StaticBucketMap
   ensures this). The number of buckets is inversely proportional to the
   chances for thread contention.  The fewer buckets, the more chances for
   thread contention.  The more buckets the fewer chances for thread
   contention.

  num-buckets - the number of buckets for this map - `int`"
  (^StaticBucketMap [^Integer num-buckets]
    (new StaticBucketMap num-buckets))
  (^StaticBucketMap []
    (new StaticBucketMap )))

(defn values
  "Gets the values.

  returns: the values - `java.util.Collection<V>`"
  (^java.util.Collection [^StaticBucketMap this]
    (-> this (.values))))

(defn put-all
  "Puts all the entries from the specified map into this map.
   This operation is not atomic and may have undesired effects.

  map - the map of entries to add - `java.util.Map`"
  ([^StaticBucketMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "Puts a new key value mapping into the map.

  key - the key to use - `K`
  value - the value to use - `V`

  returns: the previous mapping for the key - `V`"
  ([^StaticBucketMap this key value]
    (-> this (.put key value))))

(defn entry-set
  "Gets the entry set.

  returns: the entry set - `java.util.Set<java.util.Map$Entry<K,V>>`"
  (^java.util.Set [^StaticBucketMap this]
    (-> this (.entrySet))))

(defn contains-value
  "Checks if the map contains the specified value.

  value - the value to check - `java.lang.Object`

  returns: true if found - `boolean`"
  (^Boolean [^StaticBucketMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "Removes the specified key from the map.

  key - the key to remove - `java.lang.Object`

  returns: the previous value at this key - `V`"
  ([^StaticBucketMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "Gets the key set.

  returns: the key set - `java.util.Set<K>`"
  (^java.util.Set [^StaticBucketMap this]
    (-> this (.keySet))))

(defn hash-code
  "Gets the hash code, as per the Map specification.

  returns: the hash code - `int`"
  (^Integer [^StaticBucketMap this]
    (-> this (.hashCode))))

(defn empty?
  "Checks if the size is currently zero.

  returns: true if empty - `boolean`"
  (^Boolean [^StaticBucketMap this]
    (-> this (.isEmpty))))

(defn size
  "Gets the current size of the map.
   The value is computed fresh each time the method is called.

  returns: the current size - `int`"
  (^Integer [^StaticBucketMap this]
    (-> this (.size))))

(defn atomic
  "Prevents any operations from occurring on this map while the
    given Runnable executes.  This method can be used, for
    instance, to execute a bulk operation atomically:



      staticBucketMapInstance.atomic(new Runnable() {
          public void run() {
              staticBucketMapInstance.putAll(map);
          }
      });

    It can also be used if you need a reliable iterator:



      staticBucketMapInstance.atomic(new Runnable() {
          public void run() {
              Iterator iterator = staticBucketMapInstance.iterator();
              while (iterator.hasNext()) {
                  foo(iterator.next();
              }
          }
      });

    Implementation note: This method requires a lot of time
    and a ton of stack space.  Essentially a recursive algorithm is used
    to enter each bucket's monitor.  If you have twenty thousand buckets
    in your map, then the recursive method will be invoked twenty thousand
    times.  You have been warned.

  r - the code to execute atomically - `java.lang.Runnable`"
  ([^StaticBucketMap this ^java.lang.Runnable r]
    (-> this (.atomic r))))

(defn clear
  "Clears the map of all entries."
  ([^StaticBucketMap this]
    (-> this (.clear))))

(defn contains-key
  "Checks if the map contains the specified key.

  key - the key to check - `java.lang.Object`

  returns: true if found - `boolean`"
  (^Boolean [^StaticBucketMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "Gets the value associated with the key.

  key - the key to retrieve - `java.lang.Object`

  returns: the associated value - `V`"
  ([^StaticBucketMap this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "Compares this map to another, as per the Map specification.

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^StaticBucketMap this ^java.lang.Object obj]
    (-> this (.equals obj))))

