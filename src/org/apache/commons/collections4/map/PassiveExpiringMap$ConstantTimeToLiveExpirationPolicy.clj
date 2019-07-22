(ns org.apache.commons.collections4.map.PassiveExpiringMap$ConstantTimeToLiveExpirationPolicy
  "A ExpirationPolicy
  that returns a expiration time that is a
  constant about of time in the future from the current time."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.map PassiveExpiringMap$ConstantTimeToLiveExpirationPolicy]))

(defn ->constant-time-to-live-expiration-policy
  "Constructor.

  Construct a policy with the given time-to-live constant measured in
   the given time unit of measure.

  time-to-live - the constant amount of time an entry is available before it expires. A negative value results in entries that NEVER expire. A zero value results in entries that ALWAYS expire. - `long`
  time-unit - the unit of time for the timeToLive parameter, must not be null. - `java.util.concurrent.TimeUnit`

  throws: java.lang.NullPointerException - if the time unit is null."
  (^PassiveExpiringMap$ConstantTimeToLiveExpirationPolicy [^Long time-to-live ^java.util.concurrent.TimeUnit time-unit]
    (new PassiveExpiringMap$ConstantTimeToLiveExpirationPolicy time-to-live time-unit))
  (^PassiveExpiringMap$ConstantTimeToLiveExpirationPolicy [^Long time-to-live-millis]
    (new PassiveExpiringMap$ConstantTimeToLiveExpirationPolicy time-to-live-millis))
  (^PassiveExpiringMap$ConstantTimeToLiveExpirationPolicy []
    (new PassiveExpiringMap$ConstantTimeToLiveExpirationPolicy )))

(defn expiration-time
  "Determine the expiration time for the given key-value entry.

  key - the key for the entry (ignored). - `K`
  value - the value for the entry (ignored). - `V`

  returns: if timeToLiveMillis ≥ 0, an expiration time of
           timeToLiveMillis
           System.currentTimeMillis() is returned. Otherwise, -1
           is returned indicating the entry never expires. - `long`"
  (^Long [^PassiveExpiringMap$ConstantTimeToLiveExpirationPolicy this key value]
    (-> this (.expirationTime key value))))

