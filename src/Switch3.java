public class Switch3 {
}
/*
Which of the following statements concerning the switch construct are true?
Answered Incorrectly

You had to select 3 option(s)
A character literal can be used as a value for a case label. // TRUE
boolean, long, float and double cannot be used.

A 'long' cannot be used as a switch variable. // TRUE
boolean, long, float and double cannot be used.

An empty switch block is a valid construct. // TRUE

A switch block must have a default label. // FALSE

If present, the default label must be the last of all the labels. // FALSE
Any order is valid.


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