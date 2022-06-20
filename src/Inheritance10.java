public class Inheritance10 {
}
/*
Which of these statements are true?
Answered Incorrectly

You had to select 2 option(s)
A super( <appropriate list of arguments> ) or this( <appropriate list of arguments> ) call must always be provided
explicitly as the first statement in the body of the constructor. // FALSE
super(); is automatically added if the sub class constructor doesn't call any of the super class's constructors.

If a subclass does not have any declared constructors, the implicit default constructor of the subclass will have a call
to super( ).  // TRUE

If neither super( ) or this( ) is declared as the first statement of the body of a constructor, then this( ) will
implicitly be inserted as the first statement. // FALSE
super() is added and not this()

super(<appropriate list of arguments>) can only be called in the first line of the constructor but this(<appropriate
list of arguments>) can be called from anywhere. // FALSE

You can either call super(<appropriate list of arguments>) or this(<appropriate list of arguments>) but not both from a
constructor. // TRUE


Note that calling super(); will not always work because if the super class has defined a constructor with arguments and
has not defined a no args constructor then no args constructor will not be provided by the compiler. It is provided only
to the class that does not define ANY constructor explicitly.
 */