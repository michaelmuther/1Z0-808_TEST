public class Inheritance21 {
    public static void main(String[] args) {
/*
MM NOTES!
Interfaces extend other interfaces
An interface can redefine a default method and also make it abstract
An interface can redeclare a default method and provide a different implementation
Every static method must have curly brackets
Static methods can never be abstract in a class or interface
Default and static methods must have a method body including curly brackets
A static method cannot override or be overridden by a non-static method.

 */
    }
}

interface Account{
    public default String getId(){
        return "0000";
    }
}

interface PremiumAccount extends Account{
//    static String getId(){ // DOES NOT COMPILE: static method cannot override instance method in Account
//        return "1111";
//    }
//    String getId(); // COMPILES AND RUNS
//    default String getId(){ // COMPILES AND RUNS
//        return "1111";
//    }
//    abstract static String getName();// DOES NOT COMPILE; abstract and static are an illegal combination of modifiers
//    static String getName(); // DOES NOT COMPILE; static methods in interfaces should have a body.
//    default String getName(); // DOES NOT COMPILE; extension method should have a body.
}
/*
Answered Incorrectly

You had to select 2 option(s)
static String getId(){
  return "1111";
}
Trying to override a static method with a non-static method (and vice-versa) in a class will result in a compilation error. Even in case of interfaces, a subinterface cannot override a default method with a static method.

You can, however, have a default method in a subinterface with the same signature as a static method of its super interface because a static method of an interface can only be called using that interface's name.
Example:
interface I{
   public default void invalid(){ }
   public static void valid(){ } //Can be called only using I.valid();
}
interface I2 extends I{
   public static void invalid(){ } //WILL NOT COMPILE
   public default void valid(){ } //this is ok.
}
String getId();
An interface can redeclare a default method and also make it abstract.
default String getId(){
   return "1111";
}
An interface can redeclare a default method and provide a different implementation.
abstract static String getName();
1. static methods can never be abstract (neither in an interface nor in a class).
2. An interface can have a static method but the method must have a body.
static String getName();
An interface can have a static method but the method must have a body.
default String getName();
A default method must have a body.
 */

