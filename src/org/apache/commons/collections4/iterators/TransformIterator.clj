(ns org.apache.commons.collections4.iterators.TransformIterator
  "Decorates an iterator such that each element returned is transformed."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators TransformIterator]))

(defn ->transform-iterator
  "Constructor.

  Constructs a new TransformIterator that will use the
   given iterator and transformer.  If the given transformer is null,
   then objects will not be transformed.

  iterator - the iterator to use - `java.util.Iterator`
  transformer - the transformer to use - `org.apache.commons.collections4.Transformer`"
  (^TransformIterator [^java.util.Iterator iterator ^org.apache.commons.collections4.Transformer transformer]
    (new TransformIterator iterator transformer))
  (^TransformIterator [^java.util.Iterator iterator]
    (new TransformIterator iterator))
  (^TransformIterator []
    (new TransformIterator )))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^TransformIterator this]
    (-> this (.hasNext))))

(defn next
  "Gets the next object from the iteration, transforming it using the
   current transformer. If the transformer is null, no transformation
   occurs and the object from the iterator is returned directly.

  returns: the next object - `O`

  throws: java.util.NoSuchElementException - if there are no more elements"
  ([^TransformIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^TransformIterator this]
    (-> this (.remove))))

(defn get-iterator
  "Gets the iterator this iterator is using.

  returns: the iterator. - `java.util.Iterator<? extends I>`"
  ([^TransformIterator this]
    (-> this (.getIterator))))

(defn set-iterator
  "Sets the iterator for this iterator to use.
   If iteration has started, this effectively resets the iterator.

  iterator - the iterator to use - `java.util.Iterator`"
  ([^TransformIterator this ^java.util.Iterator iterator]
    (-> this (.setIterator iterator))))

(defn get-transformer
  "Gets the transformer this iterator is using.

  returns: the transformer. - `org.apache.commons.collections4.Transformer<? super I,? extends O>`"
  ([^TransformIterator this]
    (-> this (.getTransformer))))

(defn set-transformer
  "Sets the transformer this the iterator to use.
   A null transformer is a no-op transformer.

  transformer - the transformer to use - `org.apache.commons.collections4.Transformer`"
  ([^TransformIterator this ^org.apache.commons.collections4.Transformer transformer]
    (-> this (.setTransformer transformer))))

