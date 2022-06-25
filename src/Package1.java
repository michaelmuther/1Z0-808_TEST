//import java.util.*;
//package test; the package declaration cannot be after the import statements
// It will not compile

public class Package1 {
    public OtherClass oc = new OtherClass();
}
class OtherClass{
    int value;
}
/*
Answered Incorrectly

You had to select 1 option(s)
The class will fail to compile, since the class OtherClass is used before it is defined.
There is no problem with the code.
The class will fail to compile, since the class OtherClass must be defined in a file called OtherClass.java
This is not needed because OtherClass is not public. The class & file name must match only if the class is public.
The class will fail to compile .
The package declaration can never occur after an import statement.
None of the above.


The order is:
package statement.
import statements
class/ interface definitions.
Important point to note here is YOU MUST READ THE QUESTIONS VERY CAREFULLY.

You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/gZVBScKDnks
 */
