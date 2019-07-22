(ns org.apache.commons.collections4.Unmodifiable
  "Marker interface for collections, maps and iterators that are unmodifiable.

  This interface enables testing such as:



  if (coll instanceof Unmodifiable) {
    coll = new ArrayList(coll);
  }
  // now we know coll is modifiable
  Of course all this only works if you use the Unmodifiable classes defined
  in this library. If you use the JDK unmodifiable class via java.util Collections
  then the interface won't be there."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4 Unmodifiable]))

