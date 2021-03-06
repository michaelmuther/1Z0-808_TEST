public class Exceptions3 {
}
/*
What can be the type of a catch argument?
(Select the best option.)
Answered Incorrectly

You had to select 1 option(s)
Any class that extends java.lang.Exception // FALSE

Any class that extends java.lang.Exception except any class that extends java.lang.RuntimeException // FALSE

Any class that is-a Throwable. // TRUE
The catch argument type declares the type of exception that the handler can handle and must be the name of a class that extends Throwable or Throwable itself.

Any Object // FALSE

Any class that extends Error // FALSE



You must remember the hierarchy of exception classes:

The base class of all exceptions is java.lang.Throwable. java.lang.Error and java.lang.Exception are the only two subclasses of Throwable.

Error is used by the JVM to throw exception that have nothing to do with the program code as such but occur because of environment. For example, OutOfMemoryError. It indicates serious problems that a reasonable application should not try to catch. Most such errors are abnormal conditions. Error and its subclasses are regarded as unchecked exceptions for the purposes of compile-time checking of exceptions.


Exception is used by the programmer as well as the JVM when it encounters exceptional situation in the program. Exception and its subclasses (except RuntimeException) are called Checked Exceptions. Checked exceptions need to be declared in a method or constructor's throws clause if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary. For example, java.io.IOException.

RuntimeException extends Exception, which is used to report exceptional situations that cannot be predetermined at compile time. For example, IndexOutOfBoundsException or NullPointerException. RuntimeException and its subclasses are unchecked exceptions. Unchecked exceptions do not need to be declared in a method or constructor's throws clause.
 */
