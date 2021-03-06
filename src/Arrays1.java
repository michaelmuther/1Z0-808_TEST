public class Arrays1 {
}
/*
Is it possible to create arrays of length zero?
Answered Correctly

You had to select 1 option(s)
Yes, you can create arrays of any type with length zero.
Java allows arrays of length zero to be created.  Here is an example:
int[] zeroLengthArray1 = new int[0];
System.out.println(zeroLengthArray1.length); //will print 0
String[] zeroLengthArray2 = new String[0];
System.out.println(zeroLengthArray2.length);  //will print 0
Yes, but only for primitive datatypes.
Yes, but only for arrays of object references.
Yes, and it is same as a null Array.
A null pointer is different from an array of length zero. A reference being null or pointing to null means it is not
pointing to anything at all. But an array of length zero is a valid object. Thus, a reference pointing to such an array
is not pointing to null.

For example, if you have int[] intArr = new int[0]; then (intArr == null) is false.
No, arrays of length zero do not exist in Java.


Example: When a Java program is run without any program arguments, the String[] args argument to main() gets an array of
length Zero.
 */