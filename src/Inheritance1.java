public class Inheritance1 {
    class A{
        int i;
    }
    class B extends A{
        int j;
    }
}
/*
Given the following code, which statements are true?

Answered Correctly

You had to select 3 option(s)

Class B extends class A. // TRUE

Class B is the superclass of class A. // FALSE
A is the super class of B.

Class A inherits from class B. // FALSE
B inherits from A

Class B is a subclass of class A. // TRUE
Class B is a subclass of class A. Given the declaration "class B extends A" we can conclude that class B extends class A. Other ways to say the same thing are -  class A is the superclass of class B, class B is a subclass of class A, and class B inherits from class A.

Objects of class B will always have a member variable named i . // TRUE
Note that 'i' is not public or protected.  It has "default" access. Since, as per the code given in the question, both the classes belong to the same package, B does inherit i.

But remember that a member with default access is inherited only if both the classes are in same package.


Here are a few good words from the Java Language Specification:
Members of a class that are declared private are not inherited by subclasses of that class. Only members of a class that are declared protected or public are inherited by subclasses declared in a package other than the one in which the class is declared.
Constructors and static initializers are not members and therefore are not inherited.
 */