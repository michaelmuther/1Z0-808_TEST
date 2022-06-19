public class String1 {
}
/*
In Java, Strings are immutable. A direct implication of this is...
Answered Correctly

You had to select 2 option(s)
you cannot call methods like "1234".replace('1', '9'); and expect to change the original String. // TRUE
calling such methods do not change this object. They create a new String object.

you cannot change a String object, once it is created. // TRUE

you can change a String object only by the means of its methods. // FALSE

you cannot extend String class. // FALSE
That's because it is final, not because it is immutable. You can have a final class whose objects are mutable.

you cannot compare String objects. // FALSE
String class implements Comparable interface.
 */
