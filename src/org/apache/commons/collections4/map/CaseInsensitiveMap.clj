(ns org.apache.commons.collections4.map.CaseInsensitiveMap
  "A case-insensitive Map.

  Before keys are added to the map or compared to other existing keys, they are converted
  to all lowercase in a locale-independent fashion by using information from the Unicode
  data file.


  Null keys are supported.


  The keySet() method returns all lowercase keys, or nulls.


  Example:



   Map<String, String> map = new CaseInsensitiveMap<String, String>();
   map.put(\"One\", \"One\");
   map.put(\"Two\", \"Two\");
   map.put(null, \"Three\");
   map.put(\"one\", \"Four\");

  The example above creates a CaseInsensitiveMap with three entries.


  map.get(null) returns \"Three\" and map.get(\"ONE\")
  returns \"Four\".  The Set returned by keySet()
  equals {\"one\", \"two\", null}.


  This map will violate the detail of various Map and map view contracts.
  As a general rule, don't compare this map to other maps. In particular, you can't
  use decorators like ListOrderedMap on it, which silently assume that these
  contracts are fulfilled.


  Note that CaseInsensitiveMap is not synchronized and is not thread-safe.
  If you wish to use this map from multiple threads concurrently, you must use
  appropriate synchronization. The simplest approach is to wrap this map
  using Collections.synchronizedMap(Map). This class may throw
  exceptions when accessed by concurrent threads without synchronization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map CaseInsensitiveMap]))

(defn ->case-insensitive-map
  "Constructor.

  Constructs a new, empty map with the specified initial capacity and
   load factor.

  initial-capacity - the initial capacity - `int`
  load-factor - the load factor - `float`

  throws: java.lang.IllegalArgumentException - if the load factor is less than zero"
  (^CaseInsensitiveMap [^Integer initial-capacity ^Float load-factor]
    (new CaseInsensitiveMap initial-capacity load-factor))
  (^CaseInsensitiveMap [^Integer initial-capacity]
    (new CaseInsensitiveMap initial-capacity))
  (^CaseInsensitiveMap []
    (new CaseInsensitiveMap )))

(defn clone
  "Clones the map without cloning the keys or values.

  returns: a shallow clone - `org.apache.commons.collections4.map.CaseInsensitiveMap<K,V>`"
  (^org.apache.commons.collections4.map.CaseInsensitiveMap [^CaseInsensitiveMap this]
    (-> this (.clone))))

