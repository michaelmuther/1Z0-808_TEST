public class DataTypes2 {

    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        int b = -a;
        System.out.println( a+ "   "+b);
    }
}

/*
Answered Correctly

You had to select 1 option(s)
It throws an OverFlowException. // FALSE
It will print two same negative numbers. // TRUE
It will print two different negative numbers.  // FALSE
It will print one negative and one positive number of same magnitude. // FALSE
It will print one negative and one positive number of different magnitude. // FALSE


Note: The following discussion about bit patterns and two's complement is not required for the exam but is useful for building the basic understanding.

It prints: -2147483648   -2147483648

This happens because negative integers are stored in 2's complement form (complement the bits and add 1). For example:

Integer 1 in binary is  00000000 00000000 00000000 00000001  (32 bits)

So -1 in binary would be (complement the bits for 1 and add 1) :

Step 1 (complement the bits of 1): 11111111 11111111 11111111 11111110
Step 2 (add 1 to step 1): 11111111 11111111 11111111 11111111.

Now, let's see what happens in this question:

a = Integer.MIN_VALUE = 10000000 00000000 00000000 00000000

To get -a, apply the above two steps:

Step 1  (complement the bits): 01111111 11111111 11111111 11111111
Step 2 (add 1) : 10000000 00000000 00000000 00000000

So you got the exact same value that you started with!

(Note that you can see the binary form of an integer using Integer.toBinaryString(i) method.)
 */
