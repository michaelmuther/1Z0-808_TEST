public class String4 {
    public static void main(String[] args) {
//        System.out.println(null + true); //1
//        System.out.println(true + null); //2
//        System.out.println(null + null); //3
        System.out.println(null + "true"); //1 These all compile and run fine nulltrue
        System.out.println(true + "null"); //2 truenull
        System.out.println(null + "null"); //3 nullnull
        // IT DOES NOT MATTER WHICH COMES FIRST IF ONE IS A STRING
        System.out.println(5 + 5 + "string"); // 10string as the string conversion happens after the addition
    }
}
/*
Which of the following statements are correct?
Answered Incorrectly

You had to select 1 option(s)
None of the 3 lines will compile. // TRUE!  None of the parameters are String so conversion to String will not happen.

All the 3 lines will compile and print nulltrue, truenull and nullnull respectively. // FALSE

Line 1 and 2 won't compile but line 3 will print nullnull. // FALSE

Line 3 won't compile but line 1 and 2 will print nulltrue and truenull respectively. // FALSE

None of the above. // FALSE


Note that none of the parameters is a String so conversion to String will not happen. The following are the error
messages given by the compiler.

C:\works\nbtestproject\src\TestClass.java:46: operator + cannot be applied to <nulltype>,boolean
   System.out.println(null + true); //1
C:\works\nbtestproject\src\TestClass.java:46: reference to println is ambiguous, both method println(char[]) in
java.io.PrintStream and method println(java.lang.String) in java.io.PrintStream match
   System.out.println(null + true); //1
C:\works\nbtestproject\src\TestClass.java:47: operator + cannot be applied to boolean,<nulltype>
   System.out.println(true + null); //2
C:\works\nbtestproject\src\TestClass.java:47: reference to println is ambiguous, both method println(char[]) in
java.io.PrintStream and method println(java.lang.String) in java.io.PrintStream match
   System.out.println(true + null); //2
C:\works\nbtestproject\src\TestClass.java:48: operator + cannot be applied to <nulltype>,<nulltype>
   System.out.println(null + null); //3
C:\works\nbtestproject\src\TestClass.java:48: reference to println is ambiguous, both method println(char[]) in
java.io.PrintStream and method println(java.lang.String) in java.io.PrintStream match
   System.out.println(null + null); //3
6 errors

  If one operand expression is of type String, then string conversion is performed on the other operand to produce a
  String at run time. The result is a reference to a newly created String object that is the concatenation of the two
  Strings. The characters of the left-hand operand precede the characters of the right-hand operand in the newly created
  string.
  Any type may be converted to type String by string conversion.
  A value x of primitive type T is first converted to a reference value as if by giving it as an argument to an
  appropriate class instance creation expression e.g. if T is boolean, then use new Boolean(x) .
  toString() is defined by the primordial class Object; many classes override it, notably Boolean, Character, Integer,
  Long, Float, Double, and String.

Note that had there been a method like String getString() { return null; }, println( getString() + true ) etc. would
have compiled fine and would have printed "nulltrue".
 */
