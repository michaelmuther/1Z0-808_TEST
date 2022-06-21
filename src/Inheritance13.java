public class Inheritance13 {
}
/*
Which of the following statements is/are true?
Answered Incorrectly

You had to select 1 option(s)
Subclasses must define all the abstract methods that the superclass defines. // FALSE
Not if the subclass is also defined abstract!

A class implementing an interface must define all the methods of that interface. // FALSE
Not if the class is defined abstract. Further, Java 8 allows an interface to have default and static methods, which
need not be implemented by a non-abstract class that says it implements that interface.

A class cannot override the super class's constructor. // TRUE
Because constructors are not inherited.

It is possible for two classes to be the superclass of each other. // FALSE

An interface can implement multiple interfaces. // FALSE
Interface cannot "implement" another interfaces. It can extend multiple interfaces. The following is a valid declaration :
interface I1 extends I2, I3, I4 { }
MM: AN INTERFACE ONLY EXTENDS OTHER INTERFACES!
 */
