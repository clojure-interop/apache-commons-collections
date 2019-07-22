(ns org.apache.commons.collections4.map.PassiveExpiringMap$ExpirationPolicy
  "A policy to determine the expiration time for key-value entries."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map PassiveExpiringMap$ExpirationPolicy]))

(defn expiration-time
  "Determine the expiration time for the given key-value entry.

  key - the key for the entry. - `K`
  value - the value for the entry. - `V`

  returns: the expiration time value measured in milliseconds. A
           negative return value indicates the entry never expires. - `long`"
  (^Long [^PassiveExpiringMap$ExpirationPolicy this key value]
    (-> this (.expirationTime key value))))

