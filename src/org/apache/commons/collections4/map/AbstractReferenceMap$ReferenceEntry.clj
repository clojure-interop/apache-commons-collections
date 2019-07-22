(ns org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntry
  "A MapEntry implementation for the map.

  If getKey() or getValue() returns null, it means
  the mapping is stale and should be removed."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map AbstractReferenceMap$ReferenceEntry]))

(defn ->reference-entry
  "Constructor.

  Creates a new entry object for the ReferenceMap.

  parent - the parent map - `org.apache.commons.collections4.map.AbstractReferenceMap`
  next - the next entry in the hash bucket - `org.apache.commons.collections4.map.AbstractHashedMap$HashEntry`
  hash-code - the hash code of the key - `int`
  key - the key - `K`
  value - the value - `V`"
  (^AbstractReferenceMap$ReferenceEntry [^org.apache.commons.collections4.map.AbstractReferenceMap parent ^org.apache.commons.collections4.map.AbstractHashedMap$HashEntry next ^Integer hash-code key value]
    (new AbstractReferenceMap$ReferenceEntry parent next hash-code key value)))

(defn get-key
  "Gets the key from the entry.
   This method dereferences weak and soft keys and thus may return null.

  returns: the key, which may be null if it was garbage collected - `K`"
  ([^AbstractReferenceMap$ReferenceEntry this]
    (-> this (.getKey))))

(defn get-value
  "Gets the value from the entry.
   This method dereferences weak and soft value and thus may return null.

  returns: the value, which may be null if it was garbage collected - `V`"
  ([^AbstractReferenceMap$ReferenceEntry this]
    (-> this (.getValue))))

(defn set-value
  "Sets the value of the entry.

  obj - the object to store - `V`

  returns: the previous value - `V`"
  ([^AbstractReferenceMap$ReferenceEntry this obj]
    (-> this (.setValue obj))))

(defn equals
  "Compares this map entry to another.

   This implementation uses isEqualKey and
   isEqualValue on the main map for comparison.

  obj - the other map entry to compare to - `java.lang.Object`

  returns: true if equal, false if not - `boolean`"
  (^Boolean [^AbstractReferenceMap$ReferenceEntry this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Gets the hashcode of the entry using temporary hard references.

   This implementation uses hashEntry on the main map.

  returns: the hashcode of the entry - `int`"
  (^Integer [^AbstractReferenceMap$ReferenceEntry this]
    (-> this (.hashCode))))

