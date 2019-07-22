(ns org.apache.commons.collections4.iterators.ReverseListIterator
  "Iterates backwards through a List, starting with the last element
  and continuing to the first. This is useful for looping around
  a list in reverse order without needing to actually reverse the list.

  The first call to next() will return the last element
  from the list, and so on. The hasNext() method works
  in concert with the next() method as expected.
  However, the nextIndex() method returns the correct
  index in the list, thus it starts high and reduces as the iteration
  continues. The previous methods work similarly."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.iterators ReverseListIterator]))

(defn ->reverse-list-iterator
  "Constructor.

  Constructor that wraps a list.

  list - the list to create a reversed iterator for - `java.util.List`

  throws: java.lang.NullPointerException - if the list is null"
  (^ReverseListIterator [^java.util.List list]
    (new ReverseListIterator list)))

(defn next
  "Gets the next element.
   The next element is the previous in the list.

  returns: the next element in the iterator - `E`"
  ([^ReverseListIterator this]
    (-> this (.next))))

(defn reset
  "Resets the iterator back to the start (which is the
   end of the list as this is a reversed iterator)"
  ([^ReverseListIterator this]
    (-> this (.reset))))

(defn has-previous?
  "Checks whether there is a previous element.

  returns: true if there is a previous element - `boolean`"
  (^Boolean [^ReverseListIterator this]
    (-> this (.hasPrevious))))

(defn previous-index
  "Gets the index of the previous element.

  returns: the index of the previous element in the iterator - `int`"
  (^Integer [^ReverseListIterator this]
    (-> this (.previousIndex))))

(defn previous
  "Gets the previous element.
   The next element is the previous in the list.

  returns: the previous element in the iterator - `E`"
  ([^ReverseListIterator this]
    (-> this (.previous))))

(defn remove
  "Removes the last returned element.

  throws: java.lang.UnsupportedOperationException - if the list is unmodifiable"
  ([^ReverseListIterator this]
    (-> this (.remove))))

(defn has-next?
  "Checks whether there is another element.

  returns: true if there is another element - `boolean`"
  (^Boolean [^ReverseListIterator this]
    (-> this (.hasNext))))

(defn add
  "Adds a new element to the list between the next and previous elements.

  obj - the object to add - `E`

  throws: java.lang.UnsupportedOperationException - if the list is unmodifiable"
  ([^ReverseListIterator this obj]
    (-> this (.add obj))))

(defn set
  "Replaces the last returned element.

  obj - the object to set - `E`

  throws: java.lang.UnsupportedOperationException - if the list is unmodifiable"
  ([^ReverseListIterator this obj]
    (-> this (.set obj))))

(defn next-index
  "Gets the index of the next element.

  returns: the index of the next element in the iterator - `int`"
  (^Integer [^ReverseListIterator this]
    (-> this (.nextIndex))))

