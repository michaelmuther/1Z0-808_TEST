public class Modifiers2 {
}
/*
How can you declare 'i' so that it is not visible outside the package test.


package test;
public class Test{
   XXX int i;
   /*  irrelevant code */
/*}

        Answered Incorrectly

        You had to select 2 option(s)
private // TRUE
Note that the question does not require that 'i' should be accessible from test package. So private is fine.

public // FALSE
Marking it public will make it accessible from all classes in all packages.

protected // FALSE
It will make it available to a subclass even if the subclass is in a different package.

No access modifier // TRUE

friend
There is no such modifier in Java.
 */