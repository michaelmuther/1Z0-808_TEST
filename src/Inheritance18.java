public class Inheritance18 {
}


class A1{ }
class B1 extends A1{ }
class C3 extends B1{ }

class X{
    B1 getB(){ return new B1(); }
}

class Y extends X{
//    public C3 getB(){ return new B1(); } // B1 is not a C3, this will not compile
//    protected B1 getB(){ return new C3(); } // C is a B; this will compile
//    C3 getB(){ return new C3(); } // C is a subclass of B, this will compile
//    A1 getB(){ return new A1(); } // overriding method cannot return a superclass; this does not work
}
/*
Which of the following methods can be inserted in class Y?
Answered Incorrectly

You had to select 2 option(s)
public C getB(){ return new B(); } // FALSE, every B is not a C
Its return type is specified as C, but it is actually returning an object of type B. Since B is NOT a C, this will not compile.

protected B getB(){ return new C(); } // TRUE, every C is a B, so this is OK
Since C is-a B, this is valid. Also, an overriding method can be made less restrictive. protected is less restrictive than 'default' access.

C getB(){ return new C(); } // TRUE, covariant returns (subtype can be returned)
Covariant returns are allowed in Java 1.5, which means that an overriding method can change the return type of the overridden method to a subclass of the original return type. Here, C is a subclass of B. So this is valid.

A getB(){ return new A(); } // FALSE, the supertype is not a possible return
An overriding method cannot return a superclass object of the return type defined in the overridden method. A subclass is allowed in Java 1.5.




You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/Zvu4NPYFr-k
 */
