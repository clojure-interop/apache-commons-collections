(ns org.apache.commons.collections4.collection.AbstractCollectionDecorator
  "Decorates another Collection to provide additional behaviour.

  Each method call made on this Collection is forwarded to the
  decorated Collection. This class is used as a framework on which
  to build to extensions such as synchronized and unmodifiable behaviour. The
  main advantage of decoration is that one decorator can wrap any implementation
  of Collection, whereas sub-classing requires a new class to be
  written for each implementation.


  This implementation does not perform any special processing with
  iterator(). Instead it simply returns the value from the
  wrapped collection. This may be undesirable, for example if you are trying
  to write an unmodifiable implementation it might provide a loophole.


  This implementation does not forward the hashCode and equals methods through
  to the backing object, but relies on Object's implementation. This is necessary
  to preserve the symmetry of equals. Custom definitions of equality are usually
  based on an interface, such as Set or List, so that the implementation of equals
  can cast the object being tested for equality to the custom interface.
  AbstractCollectionDecorator does not implement such custom interfaces directly;
  they are implemented only in subclasses. Therefore, forwarding equals would break
  symmetry, as the forwarding object might consider itself equal to the object being
  tested, but the reverse could not be true. This behavior is consistent with the
  JDK's collection wrappers, such as Collections.unmodifiableCollection(Collection).
  Use an interface-specific subclass of AbstractCollectionDecorator, such as
  AbstractListDecorator, to preserve equality behavior, or override equals directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.collection AbstractCollectionDecorator]))

(defn add-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractCollectionDecorator this ^java.util.Collection coll]
    (-> this (.addAll coll))))

(defn remove-if
  "filter - `java.util.function.Predicate`

  returns: `boolean`"
  (^Boolean [^AbstractCollectionDecorator this ^java.util.function.Predicate filter]
    (-> this (.removeIf filter))))

(defn contains
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractCollectionDecorator this ^java.lang.Object object]
    (-> this (.contains object))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractCollectionDecorator this]
    (-> this (.toString))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^AbstractCollectionDecorator this]
    (-> this (.iterator))))

(defn remove
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractCollectionDecorator this ^java.lang.Object object]
    (-> this (.remove object))))

(defn add
  "object - `E`

  returns: `boolean`"
  (^Boolean [^AbstractCollectionDecorator this object]
    (-> this (.add object))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^AbstractCollectionDecorator this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^AbstractCollectionDecorator this]
    (-> this (.size))))

(defn retain-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractCollectionDecorator this ^java.util.Collection coll]
    (-> this (.retainAll coll))))

(defn clear
  ""
  ([^AbstractCollectionDecorator this]
    (-> this (.clear))))

(defn to-array
  "object - `T[]`

  returns: `<T> T[]`"
  ([^AbstractCollectionDecorator this object]
    (-> this (.toArray object)))
  ([^AbstractCollectionDecorator this]
    (-> this (.toArray))))

(defn remove-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractCollectionDecorator this ^java.util.Collection coll]
    (-> this (.removeAll coll))))

(defn contains-all
  "coll - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractCollectionDecorator this ^java.util.Collection coll]
    (-> this (.containsAll coll))))

