public class Switch1 {

    public static void main(String[] args) {
//        int test = 1;
//        float test = 10f; // switch expression cannot be float.
        // requires: char, byte, short, int, Character, Byte, Short, Integer, String, enum
//        byte test = 127;
        char test = 'c';
//        boolean test = true; // switch expression cannot be boolean.

        String caseString;
        switch (test) {
            case 'a': caseString = "yes"; // case char
            case 1 : caseString = "yes"; // case int
//            case 10f : caseString = "yes"; // case float, cannot be float if expression is char
            case (byte) 127 : caseString = "yes"; // case byte
//            case false : caseString = "yes"; // case boolean, does not work
        }
    }
}

/*
Which of these combinations of switch expression types and case label value types are legal within a switch statement?
Answered Incorrectly

You had to select 1 option(s)
switch expression of type int and case label value of type char. // TRUE
Note that the following is invalid though because a char cannot be assigned to an Integer:
Integer x = 1;  // int x = 1; is valid.
switch(x){
   case 'a' : System.out.println("a");
}

switch expression of type float and case label value of type int. // FALSE

switch expression of type byte and case label value of type float. // FALSE

switch expression of type char and case label value of type byte. // FALSE for SOME!
This will not work in all cases because a byte may have negative values which cannot be assigned to a char. For example, char ch = -1; does not compile. Therefore, the following does not compile either:

       char ch = 'x';
       switch(ch){

//This case will not compile because of "possible loss of precision"
          case -1 :        System.out.println("-1"); break;

          default:        System.out.println("default");
       }

switch expression of type boolean and case label value of type boolean. // FALSE


Rules for a switch statement

    Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer), and enums can be used as types of a switch variable. String is allowed since Java 7.
    The case constants must be assignable to the switch variable. For example, if your switch variable is of class String, your case labels must use Strings as well.
    The switch variable must be big enough to hold all the case constants. For example, if the switch variable is of type char, then none of the case constants can be greater than 65535 because a char's range is from 0 to 65535. For example, the following will not compile because 200 cannot be assigned to the variable b, which can only hold values from -128 to 127.

    byte b = 10;
    switch(b){
        case 100 : System.out.print(100); //OK
        case 200 :  System.out.print(200); //will not compile
    }

    All case labels should be COMPILE TIME CONSTANTS. This means, you can have literals such as 'a', 5, 10, or a final variable, the value of which is computed at compile time such as int I = 2*3; For example, the following is valid:

    int x = 10;
    final int I = 2*3;
    switch(x){
       case I : System.out.println(x); //this is valid because I is a compile time constant
    }

    No two of the case constant expressions associated with a switch statement may have the same value.
    The default label is optional and at most one default label may be associated with the same switch statement.


 */