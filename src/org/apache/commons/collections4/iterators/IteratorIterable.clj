(ns org.apache.commons.collections4.iterators.IteratorIterable
  "Adapter to make an Iterator instance appear to be an
  Iterable instance.  The iterable can be constructed in one
  of two variants:  single use, multiple use.


  In the single use iterable case, the iterable is only usable for one
  iterative operation over the source iterator.  Subsequent iterative
  operations use the same, exhausted source iterator.  To create a single use
  iterable, construct a new IteratorIterable using a Iterator
  that is NOT a ResettableIterator iterator:




    Iterator<Integer> iterator = // some non-resettable iterator
    Iterable<Integer> iterable = new IteratorIterable<Integer>(iterator);


  In the multiple use iterable case, the iterable is usable for any number of
  iterative operations over the source iterator.  Of special note, even though
  the iterable supports multiple iterations, it does not support concurrent
  iterations. To implicitly create a multiple use iterable, construct a new
  IteratorIterable using a ResettableIterator iterator:




    Integer[] array = {Integer.valueOf(1),Integer.valueOf(2),Integer.valueOf(3)};
    Iterator<Integer> iterator = IteratorUtils.arrayIterator(array); // a resettable iterator
    Iterable<Integer> iterable = new IteratorIterable<Integer>(iterator);


  A multiple use iterable can also be explicitly constructed using any
  Iterator and specifying true for the
  multipleUse flag:




    Iterator<Integer> iterator = // some non-resettable iterator
    Iterable<Integer> iterable = new IteratorIterable<Integer>(iterator, true);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators IteratorIterable]))

(defn ->iterator-iterable
  "Constructor.

  Constructs a new IteratorIterable that will use the given
   iterator.

  iterator - the iterator to use. - `java.util.Iterator`
  multiple-use - true if the new iterable can be used in multiple iterations - `boolean`"
  (^IteratorIterable [^java.util.Iterator iterator ^Boolean multiple-use]
    (new IteratorIterable iterator multiple-use))
  (^IteratorIterable [^java.util.Iterator iterator]
    (new IteratorIterable iterator)))

(defn iterator
  "Gets the iterator wrapped by this iterable.

  returns: the iterator - `java.util.Iterator<E>`"
  (^java.util.Iterator [^IteratorIterable this]
    (-> this (.iterator))))

