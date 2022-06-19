public class Operators4 {

    boolean test = false & true;
    int test1 = 1 & 2;
//    boolean test2 = 1 && 2;
//    boolean test3 = ~true;
    int test4 = ~10;
}
/*
Which of the following statements are true?
Answered Correctly

You had to select 2 option(s)
The modulus operator % can only be used with integer operands. // FALSE
It can be used on floating points operands also. For example, 5.5 % 3 = 2.5

& can have integral as well as boolean operands. // TRUE
unlike &&, & will not "short circuit" the expression if used on boolean parameters.

The arithmetic operators *, / and % have the same level of precedence. // TRUE

&& can have integer as well as boolean operands. // FALSE
!, && and || operate only on booleans.

~ can have integer as well as boolean operands. // FALSE
~ Operates only on integral types


Note :
integral types means byte, short, int, long, and char


As per Section 4.1 of JLS 8 -

The integral types are byte, short, int, and long, whose values are 8-bit, 16-bit, 32-bit and 64-bit signed
two's-complement integers, respectively, and char, whose
values are 16-bit unsigned integers representing UTF-16 code units.
 */
