public class StringBuilder1 {
    public static void main(String args[ ] ){
        StringBuilder sb = new StringBuilder("12345678");
        sb.setLength(5);
        sb.setLength(10);
        System.out.println(sb.length());
        System.out.println(sb);

        String a = "hello";
//        StringBuilder b = "hello";
        StringBuilder b = new StringBuilder("hello");
    }
}
/*
What will be the result of attempting to compile and run the following program?

public class TestClass{
   public static void main(String args[ ] ){
      StringBuilder sb = new StringBuilder("12345678");
      sb.setLength(5);
      sb.setLength(10);
      System.out.println(sb.length());
   }
}
Answered Correctly

You had to select 1 option(s)
It will print 5. // FALSE
Although it truncates the string to length 5 but setLength(10) will append 5 spaces (actually null chars i.e. \u0000).

It will print 10. // TRUE

It will print 8. // FALSE

Compilation error. // FALSE

None of the above. // FALSE
The program will compile without error and will print 10 when run.


If you do System.out.println(sb); it will indeed print "12345     " (without quotes) but the length will be 10.

From javadocs:

public void setLength(int newLength)
Sets the length of the character sequence. The sequence is changed to a new character sequence whose length is specified by the argument. For every nonnegative index k less than newLength, the character at index k in the new character sequence is the same as the character at index k in the old sequence if k is less than the length of the old character sequence; otherwise, it is the null character '\u0000'. In other words, if the newLength argument is less than the current length, the length is changed to the specified length.
If the newLength argument is greater than or equal to the current length, sufficient null characters ('\u0000') are appended so that length becomes the newLength argument.

The newLength argument must be greater than or equal to 0.

Parameters:
newLength - the new length
Throws:
IndexOutOfBoundsException - if the newLength argument is negative.
 */