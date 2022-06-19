public class JavaBasics4 {
}
/*
How can you declare a method someMethod() such that an instance of the class is not needed to access it and all the
members of the same package have access to it.
Answered Incorrectly

You had to select 3 option(s)
public static void someMethod() // TRUE

static void someMethod() // TRUE

protected static void someMethod() // TRUE

void someMethod() // FALSE

protected void someMethod() // FALSE

public abstract static void someMethod() // FALSE
static methods can't be abstract.


Since the question says, "...an instance of the class is not needed...", the method has to be static.
Also, as the question does not say that other packages should not have access to the method so public or protected is
also correct.
 */
