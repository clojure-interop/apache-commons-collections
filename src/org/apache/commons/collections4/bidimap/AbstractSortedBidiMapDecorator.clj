(ns org.apache.commons.collections4.bidimap.AbstractSortedBidiMapDecorator
  "Provides a base decorator that enables additional functionality to be added
  to a SortedBidiMap via decoration.

  Methods are forwarded directly to the decorated map.


  This implementation does not perform any special processing with the map views.
  Instead it simply returns the inverse from the wrapped map. This may be
  undesirable, for example if you are trying to write a validating implementation
  it would provide a loophole around the validation.
  But, you might want that loophole, so this class is kept simple."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.bidimap AbstractSortedBidiMapDecorator]))

(defn ->abstract-sorted-bidi-map-decorator
  "Constructor.

  Constructor that wraps (not copies).

  map - the map to decorate, must not be null - `org.apache.commons.collections4.SortedBidiMap`

  throws: java.lang.NullPointerException - if the collection is null"
  (^AbstractSortedBidiMapDecorator [^org.apache.commons.collections4.SortedBidiMap map]
    (new AbstractSortedBidiMapDecorator map)))

(defn inverse-bidi-map
  "Description copied from interface: BidiMap

  returns: an inverted bidirectional map - `org.apache.commons.collections4.SortedBidiMap<V,K>`"
  (^org.apache.commons.collections4.SortedBidiMap [^AbstractSortedBidiMapDecorator this]
    (-> this (.inverseBidiMap))))

(defn comparator
  "returns: `java.util.Comparator<? super K>`"
  ([^AbstractSortedBidiMapDecorator this]
    (-> this (.comparator))))

(defn value-comparator
  "Description copied from interface: SortedBidiMap

  returns: Comparator<? super V> - `java.util.Comparator<? super V>`"
  ([^AbstractSortedBidiMapDecorator this]
    (-> this (.valueComparator))))

(defn sub-map
  "from-key - `K`
  to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^AbstractSortedBidiMapDecorator this from-key to-key]
    (-> this (.subMap from-key to-key))))

(defn head-map
  "to-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^AbstractSortedBidiMapDecorator this to-key]
    (-> this (.headMap to-key))))

(defn tail-map
  "from-key - `K`

  returns: `java.util.SortedMap<K,V>`"
  (^java.util.SortedMap [^AbstractSortedBidiMapDecorator this from-key]
    (-> this (.tailMap from-key))))

