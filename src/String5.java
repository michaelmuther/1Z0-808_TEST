public class String5 {
    public static void main(String[] args) {
        System.out.println("hello world".equals("hello world")); // TRUE
        System.out.println("HELLO world".equalsIgnoreCase("hello world")); // TRUE
        System.out.println("hello".concat(" world").trim().equals("hello world")); // TRUE
        System.out.println("hello world".compareTo("Hello world") < 0); // FALSE
        System.out.println("Hello world".compareTo("hello world") < 0); // TRUE
        System.out.println("Hello world".toLowerCase( ).equals("hello world")); // TRUE
    }
}

/*
Which of these expressions will return true?
Answered Correctly

You had to select 4 option(s)
"hello world".equals("hello world") // TRUE

"HELLO world".equalsIgnoreCase("hello world") // TRUE
equalsIgnoreCase() method treats both cases (upper and lower) as same.

"hello".concat(" world").trim().equals("hello world") // TRUE
"hello".concat(" world") will return "hello world" and trim() won't do any change because there is no space at the
beginning or end of the string.

"hello world".compareTo("Hello world") < 0 // FALSE
Notice that the Strings differ at the first position. The value returned by compareTo is (Unicode value of the left hand
side - Unicode value of the right hand side).
Although not required for the exam, it is good to know that for English alphabets, the unicode value of any lower case
letter is always 32 more than the unicode value of the same letter in upper case. So, 'a' - 'A' or 'h' - 'H' is 32.
Note that int value of ASCII 'a' is 97, while that of 'A' is 65.

"Hello world".toLowerCase( ).equals("hello world") // TRUE
toLowerCase() converts all uppercase letters to lower case.

compareTo() does a lexicographical (like a dictionary) comparison. It stops at the first place where the strings have
different letters.
If left hand side is bigger, it returns a positive number otherwise it returns a negative number. The value is equal to
the difference of their unicode values.
If there is no difference then it returns zero. In this case,  it will return ( 'h' - 'H') which is 32.
 */