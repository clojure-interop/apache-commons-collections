(ns org.apache.commons.collections4.iterators.ObjectGraphIterator
  "An Iterator that can traverse multiple iterators down an object graph.

  This iterator can extract multiple objects from a complex tree-like object graph.
  The iteration starts from a single root object.
  It uses a Transformer to extract the iterators and elements.
  Its main benefit is that no intermediate List is created.

  For example, consider an object graph:


                  |- Branch -- Leaf
                  |         \\- Leaf
          |- Tree |         /- Leaf
          |       |- Branch -- Leaf
   Forest |                 \\- Leaf
          |       |- Branch -- Leaf
          |       |         \\- Leaf
          |- Tree |         /- Leaf
                  |- Branch -- Leaf
                  |- Branch -- Leaf
  The following Transformer, used in this class, will extract all
  the Leaf objects without creating a combined intermediate list:


  public Object transform(Object input) {
    if (input instanceof Forest) {
      return ((Forest) input).treeIterator();
    }
    if (input instanceof Tree) {
      return ((Tree) input).branchIterator();
    }
    if (input instanceof Branch) {
      return ((Branch) input).leafIterator();
    }
    if (input instanceof Leaf) {
      return input;
    }
    throw new ClassCastException();
  }

  Internally, iteration starts from the root object. When next is called,
  the transformer is called to examine the object. The transformer will return
  either an iterator or an object. If the object is an Iterator, the next element
  from that iterator is obtained and the process repeats. If the element is an object
  it is returned.

  Under many circumstances, linking Iterators together in this manner is
  more efficient (and convenient) than using nested for loops to extract a list."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators ObjectGraphIterator]))

(defn ->object-graph-iterator
  "Constructor.

  Constructs an ObjectGraphIterator using a root object and transformer.

   The root object can be an iterator, in which case it will be immediately
   looped around.

  root - the root object, null will result in an empty iterator - `E`
  transformer - the transformer to use, null will use a no effect transformer - `org.apache.commons.collections4.Transformer`"
  (^ObjectGraphIterator [root ^org.apache.commons.collections4.Transformer transformer]
    (new ObjectGraphIterator root transformer))
  (^ObjectGraphIterator [^java.util.Iterator root-iterator]
    (new ObjectGraphIterator root-iterator)))

(defn has-next?
  "Checks whether there are any more elements in the iteration to obtain.

  returns: true if elements remain in the iteration - `boolean`"
  (^Boolean [^ObjectGraphIterator this]
    (-> this (.hasNext))))

(defn next
  "Gets the next element of the iteration.

  returns: the next element from the iteration - `E`

  throws: java.util.NoSuchElementException - if all the Iterators are exhausted"
  ([^ObjectGraphIterator this]
    (-> this (.next))))

(defn remove
  "Removes from the underlying collection the last element returned.

   This method calls remove() on the underlying Iterator and it may
   throw an UnsupportedOperationException if the underlying Iterator
   does not support this method.

  throws: java.lang.UnsupportedOperationException - if the remove operator is not supported by the underlying Iterator"
  ([^ObjectGraphIterator this]
    (-> this (.remove))))

