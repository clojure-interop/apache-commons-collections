(ns org.apache.commons.collections4.functors.ConstantFactory
  "Factory implementation that returns the same constant each time.

  No check is made that the object is immutable. In general, only immutable
  objects should use the constant factory. Mutable objects should
  use the prototype factory."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors ConstantFactory]))

(defn ->constant-factory
  "Constructor.

  Constructor that performs no validation.
   Use constantFactory if you want that.

  constant-to-return - the constant to return each time - `T`"
  (^ConstantFactory [constant-to-return]
    (new ConstantFactory constant-to-return)))

(def *-null-instance
  "Static Constant.

  Returns null each time

  type: org.apache.commons.collections4.Factory"
  ConstantFactory/NULL_INSTANCE)

(defn *constant-factory
  "Factory method that performs validation.

  constant-to-return - the constant object to return each time in the factory - `T`

  returns: the constant factory. - `<T> org.apache.commons.collections4.Factory<T>`"
  ([constant-to-return]
    (ConstantFactory/constantFactory constant-to-return)))

(defn create
  "Always return constant.

  returns: the stored constant value - `T`"
  ([^ConstantFactory this]
    (-> this (.create))))

(defn get-constant
  "Gets the constant.

  returns: the constant - `T`"
  ([^ConstantFactory this]
    (-> this (.getConstant))))

