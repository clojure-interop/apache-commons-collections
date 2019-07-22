(ns org.apache.commons.collections4.properties.SortedProperties
  "A drop-in replacement for Properties for sorting keys.

  Overrides Hashtable.keys() to sort keys. Allows other methods on the superclass to work with sorted keys."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.properties SortedProperties]))

