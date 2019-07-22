(ns org.apache.commons.collections4.functors.CatchAndRethrowClosure
  "Closure that catches any checked exception and re-throws it as a
  FunctorException runtime exception. Example usage:



  // Create a catch and re-throw closure via anonymous subclass
  CatchAndRethrowClosure<String> writer = new ThrowingClosure() {
      private java.io.Writer out = // some writer

      protected void executeAndThrow(String input) throws IOException {
          out.write(input); // throwing of IOException allowed
      }
  };

  // use catch and re-throw closure
  java.util.List<String> strList = // some list
  try {
      CollectionUtils.forAllDo(strList, writer);
  } catch (FunctorException ex) {
      Throwable originalError = ex.getCause();
      // handle error
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.collections4.functors CatchAndRethrowClosure]))

(defn ->catch-and-rethrow-closure
  "Constructor."
  (^CatchAndRethrowClosure []
    (new CatchAndRethrowClosure )))

(defn execute
  "Execute this closure on the specified input object.

  input - the input to execute on - `E`

  throws: org.apache.commons.collections4.FunctorException - (runtime) if the closure execution resulted in a checked exception."
  ([^CatchAndRethrowClosure this input]
    (-> this (.execute input))))

