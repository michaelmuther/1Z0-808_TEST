
class Super28 { static String ID = "QBANK"; }

class Sub28 extends Super28{
    static { System.out.print("In Sub"); } // A static block in a class is run when the object is instantiated.
}
public class Inheritance28{
    public static void main(String[] args){
        System.out.println(Sub28.ID);
//        Sub28 test = new Sub28();
        /*
        A reference to a static field (§8.3.1.1) causes initialization of
        only the class or interface that actually declares it,
        even though it might be referred to through the name of a subclass, a
        subinterface, or a class that implements an interface.
         */
    }
}
/*
As per Section 12.4.1 given here: http://docs.oracle.com/javase/specs/jls/se7/html/jls-12.html

A class or interface type T will be initialized immediately before the first occurrence of any one of the following:

T is a class and an instance of T is created.

T is a class and a static method declared by T is invoked.

A static field declared by T is assigned.

A static field declared by T is used and the field is not a constant variable (§4.12.4).

T is a top level class (§7.6), and an assert statement (§14.10) lexically nested within T (§8.1.3) is executed.

A reference to a static field (§8.3.1.1) causes initialization of only the class or interface that actually declares it,
even though it might be referred to through the name of a subclass, a subinterface, or a class that implements an interface.

Invocation of certain reflective methods in class Class and in package java.lang.reflect also causes class or interface
initialization.

A class or interface will not be initialized under any other circumstance.

You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/X4kfeG5VktE
 */