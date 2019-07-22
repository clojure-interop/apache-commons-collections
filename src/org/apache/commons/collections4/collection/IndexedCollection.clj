(ns org.apache.commons.collections4.collection.IndexedCollection
  "An IndexedCollection is a Map-like view onto a Collection. It accepts a
  keyTransformer to define how the keys are converted from the values.

  Modifications made to this decorator modify the index as well as the
  decorated Collection. However, modifications to the underlying
  Collection will not update the index and it will get out of sync.


  If modification of the decorated Collection is unavoidable, then a
  call to reindex() will update the index to the current contents of
  the Collection."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.collection IndexedCollection]))

(defn ->indexed-collection
  "Constructor.

  Create a IndexedCollection.

  coll - decorated Collection - `java.util.Collection`
  key-transformer - Transformer for generating index keys - `org.apache.commons.collections4.Transformer`
  map - map to use as index - `org.apache.commons.collections4.MultiMap`
  unique-index - if the index shall enforce uniqueness of index keys - `boolean`"
  (^IndexedCollection [^java.util.Collection coll ^org.apache.commons.collections4.Transformer key-transformer ^org.apache.commons.collections4.MultiMap map ^Boolean unique-index]
    (new IndexedCollection coll key-transformer map unique-index)))

(defn *unique-indexed-collection
  "Create an IndexedCollection for a unique index.

   If an element is added, which maps to an existing key, an IllegalArgumentException
   will be thrown.

  coll - the decorated Collection. - `java.util.Collection`
  key-transformer - the Transformer for generating index keys. - `org.apache.commons.collections4.Transformer`

  returns: the created IndexedCollection. - `<K,C> org.apache.commons.collections4.collection.IndexedCollection<K,C>`"
  ([^java.util.Collection coll ^org.apache.commons.collections4.Transformer key-transformer]
    (IndexedCollection/uniqueIndexedCollection coll key-transformer)))

(defn *non-unique-indexed-collection
  "Create an IndexedCollection for a non-unique index.

  coll - the decorated Collection. - `java.util.Collection`
  key-transformer - the Transformer for generating index keys. - `org.apache.commons.collections4.Transformer`

  returns: the created IndexedCollection. - `<K,C> org.apache.commons.collections4.collection.IndexedCollection<K,C>`"
  ([^java.util.Collection coll ^org.apache.commons.collections4.Transformer key-transformer]
    (IndexedCollection/nonUniqueIndexedCollection coll key-transformer)))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^IndexedCollection this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn values
  "Get all elements associated with the given key.

  key - key to look up - `K`

  returns: a collection of elements found, or null if contains(key) == false - `java.util.Collection<C>`"
  (^java.util.Collection [^IndexedCollection this key]
    (-> this (.values key))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^IndexedCollection this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn contains
  "Note: uses the index for fast lookup

  object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IndexedCollection this ^java.lang.Object object]
    (-> this (.contains object))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IndexedCollection this ^java.lang.Object object]
    (-> this (.remove object))))

(defn add
  "object - `C`

  returns: `boolean`

  throws: java.lang.IllegalArgumentException - if the object maps to an existing key and the index enforces a uniqueness constraint"
  (^Boolean [^IndexedCollection this object]
    (-> this (.add object))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^IndexedCollection this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^IndexedCollection this]
    (-> this (.clear))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^IndexedCollection this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn get
  "Get the element associated with the given key.

   In case of a non-unique index, this method will return the first
   value associated with the given key. To retrieve all elements associated
   with a key, use values(Object).

  key - key to look up - `K`

  returns: element found - `C`"
  ([^IndexedCollection this key]
    (-> this (.get key))))

(defn reindex
  "Clears the index and re-indexes the entire decorated Collection."
  ([^IndexedCollection this]
    (-> this (.reindex))))

(defn contains-all
  "Note: uses the index for fast lookup

  coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^IndexedCollection this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

