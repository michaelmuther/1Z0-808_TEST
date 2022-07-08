public class Switch6 {

    public static void switchTest(byte x){
        switch(x){
            case 'b':   // 1
            default :   // 2
            case -2:    // 3
            case 80:    // 4
        }
    }

    public static void main(String[] args) {
        switchTest((byte) 3);
    }
}

/*
The following types can be used as a switch variable:

byte, char, short, int, String, and enums. Wrapper classes Byte, Character, Short, and Integer are allowed as well.
Note that long, float, double, and boolean are not allowed.

All the case constants should be assignable to the switch variable type. i.e. had there been a case label of 128 ( case
128 : //some code ), it would not have compiled. Because the range of a byte is from -128 to 127 and so 128 is not
assignable to 'x'.

The integral value of 'b' is 98, which is less than 127 so Line //1 is fine.

Note: Although it is not required for the exam to know the integral values of characters, it is good to know that all
English letters (upper case as well as lower case) as well as 0-9 are below 127 and so are assignable to byte.

You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/NHiZz_WYimY
 */
