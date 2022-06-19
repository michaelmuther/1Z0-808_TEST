public class DataTypes1 {
}
/*
Which statements concerning conversion are true?
Answered Correctly

You had to select 4 option(s)
Conversion from char to long does not need a cast. // TRUE

Conversion from byte to short does not need a cast. // TRUE

Conversion from short to char needs a cast. // TRUE
The reverse is also true. Because their ranges are not compatible.

Conversion from int to float needs a cast. // FALSE
It does not need a cast because a float can hold any int value. Note that the opposite is not true.

Conversion from byte, char or short to int, long or float does not need a cast. // TRUE
Because int, long or float are bigger that byte char or short.
 */

/*
Think of it as transferring contents of one bucket into another. You can always transfer the contents of a smaller bucket to a bigger one. But the opposite is not always possible. You can transfer the contents of the bigger bucket into the smaller bucket only if the actual content in the bigger bucket can fit into the smaller one. Otherwise, it will spill.

It is the same with integral types as well. byte is smaller than short or int. So you can assign a byte to an int (or an int to a float, or a float to a double) without any cast. But for the reverse you need to assure the compiler that the actual contents in my int will be smaller than a byte so let me assign this int to a byte. This is achieved by the cast.
int i = 10;
byte b = 20;
b = i;//will not compile because byte is smaller than int
b = (byte) i; //OK


Further, if you have a final variable and its value fits into a smaller type, then you can assign it without a cast because compiler already knows its value and realizes that it can fit into the smaller type. This is called implicit narrowing and is allowed between byte, int, char, and, short but not for long, float, and double.


final int k = 10;
b = k; //Okay because k is final and 10 fits into a byte

final float f = 10.0;//will not compile
//because 10.0 is a double even though the value 10.0 fits into a float
i = f;//will not compile.
 */
