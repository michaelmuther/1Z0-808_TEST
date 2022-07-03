public class Inheritance24 {
}
/*
Consider the following class hierarchy


class A{
   public void m1() {   }
}
class B extends A{
   public void m1() {   }
}
class C extends B{
   public void m1(){
      //  //1
      ... lot of code.

   }
           }

           Answered Correctly

           You had to select 2 option(s)
        You cannot access class A's m1() from class C for the same object ( i.e. this). // TRUE

        You can access class B's m1() using super.m1() from class C. // TRUE

        You can access class A's m1() using ( (A) this ).m1() from class C. // FALSE
        Note that selection of method to be executed depends upon the actual object class. So no matter what you do, in
        class C you can only access C's m1() even by casting this to B or A. So, this option will not work.

        You can access class A's m1() using super.super.m1() from class C. // FALSE


        super.super is an invalid construct. So, there is no way you can access m1() of A from C.
 */