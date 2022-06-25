public class Constructors3 {
    Constructors3(Constructors3 b) { } // works, a constructor can take its own type as a parameter
//    Constructors3 Constructors3( ) { } // this is a method, not a constructor
//    private final Constructors3( ) { } // a constructor cannot be final, static, or abstract
//void Constructors3( ) { } //  this is a method without a return statement.
//    public static void Constructors3(String args[ ] ) { } // this is a method, not a constructor
}
/*
Given a class named Test, which of these would be valid definitions for a constructor for the class?
Answered Incorrectly

You had to select 1 option(s)
Test(Test b) { }
The constructor can take the same type as a parameter.
Test Test( ) { }
A constructor cannot return anything.
private final Test( ) { }
A constructor cannot be final, static or abstract.
void Test( ) { }
A constructor cannot return anything. Not even void.
public static void Test(String args[ ] ) { }
A constructor cannot be final, static or abstract.




You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/RgYKmt9p40k
 */

