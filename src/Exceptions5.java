public class Exceptions5 {
}
/*
A Java programmer is developing a desktop application. Which of the following exceptions would be appropriate for him to throw explicitly from his code?
Answered Correctly

You had to select 1 option(s)
NullPointerException
ClassCastException
ArrayIndexOutOfBoundsException
Exception // TRUE
NoClassDefFoundError
NoClassDefFoundError is thrown by the JVM when it attempts to load a class and is unable to find the class file.
Note that it extends java.lang.Error and Errors are always thrown by the JVM. A programmer should never throw an Error explicitly.


Observe that all the exceptions given in the options other than Exception and NoClassDefFoundError are RuntimeExceptions.
These are usually thrown implicitly. A programmer should not throw these exceptions explicitly. java.lang.Exception and
its subclasses (except RuntimeException) should be used by the programmer to reflect known exceptional situations, while
RuntimeExceptions are used to reflect unforseen or unrecoverable exceptional situations.

Note: There is no hard and fast rule that says RuntimeExceptions (such as the ones mentioned in this questions)  must
not be thrown explicitly. It is ok to throw these exceptions explicitly in certain situations. For example,
framework/library classes such as Struts, Spring, and Hibernate, and standard JDK classes throw these exceptions
explicitly. But for the purpose of the exam, it is a good way to determine if a given application should be thrown
explicitly by the programmer or not.
 */