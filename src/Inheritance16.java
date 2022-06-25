
class C {}
class C1 extends C {}
class C2 extends C {}
public class Inheritance16{
    public static void main(String args[]){
        C c = new C();
        C1 c1 = new C1();
        C2 c2 = new C2();
        // insert statement here
//        c = c1; // reference to a C can also refer to a C1
//        c1 = (C1) c;
//        c = c2; // reference to a C can also refer to a C2

//        c = c2; // reference to a C can also refer to a C2



//        c2 = c;  // reference to a C2 cannot refer to a C, compile error
//        c1 = c;  // reference to a C1 cannot refer to a C, compile error

//        c1 = (C1) c; // compiles and produces ClassCastException at runtime

//        c2 = (C2) c1; // compile error, cannot cast a C1 to a C2
//        c2 = (C2) c1; // compile error, cannot cast a C1 to a C2

//        c1 = (C) c1; // compile error, cannot cast a C1 to a C and set it equal to a C1
        c1 = (C1)(C)(C1)(C) c1; // compile error, cannot cast a C1 to a C and set it equal to a C1
//        c1 = c; // compile error, same as above.
    }
}

/*
Answered Correctly

You had to select 1 option(s)
b = b1;
There won't be a problem anytime because B1 is a B
MM note: superclass reference can refer to any subclass.  This is true for all references as all objects extend from class object.

b2 = b;
It fails at Compile time as an object referenced by b may not be a B2, so an explicit cast will be needed.
b to b2 is coming down the tree; you need a downcast.

b1 = (B1) b;
It will pass at compile time but fail at run time as the actual object referenced by b is not a B1.
By casting b to (B1), you are telling the compiler that the object referred to by b will be of class B1 at runtime. The compiler accepts that because it is possible for b to refer to an object of class B1 since B1 is-a B. However, at run time, b is pointing to an object of class B. B is not B1, so the JVM will throw a ClassCastException.

b2 = (B2) b1;
It will not compile because b1 can never point to an object of class B2.

b1 = (B) b1;
This won't compile. By casting b1 to B, you are telling the compiler that b1 points to an object of class B. But you are then trying to assign this reference to b1, which is of class B1. Compiler will complain against this assignment because there is no guarantee that an object of class B will also be of class B1. To be able to assign an object of class B to a reference of class B1, you need to confirm to the compiler that the reference will actually point to an object of class B1. Therefore, another cast is needed. i.e. b1 = (B1) (B) b1;


You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/Yv9lvuTp78s
 */
