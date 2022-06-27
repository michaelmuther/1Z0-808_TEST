public class Inheritance19 {
    public static void main(String[] args) {

    }
}

interface T1{
}
interface T2{
    int VALUE = 10; //interface variables are automatically public, static, and final by default.
    void m1();
}

interface T3 extends T1, T2{
    public void m1();
    public void m1(int x);
}
/*
Answered Incorrectly

You had to select 1 option(s)
T3 cannot implement both T1 and T2 because it leads to ambiguity. // FALSE
There is nothing wrong with the code. // TRUE
The code will work fine only if VALUE is removed from T2 interface. // FALSE
The code will work fine only if m1() is removed from either T2 or T3. // FALSE
None of the above. // FALSE


Having ambiguous fields or methods does not cause any problem by itself (except in the case of default methods) but
referring to such fields or methods in an ambiguous way will cause a compile time error.
Having m1() in T3 is also fine because even though m1() is declared in T2 as well as T3 , the definition to both
resolves unambiguously to only one m1(). Explicit cast is not required for calling the method m1() : ( ( T2) t).m1();

m1(int x) is valid because it is a totally independent method declared by T3.

You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/i8OJ71bbulU

 */