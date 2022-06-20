public class Methods2 {
}
/*
What is the correct declaration for an abstract method 'add' in a class that is accessible to any class, takes no
arguments and returns nothing?
Answered Incorrectly

You had to select 1 option(s)
public void add(); // FALSE
An abstract method must have the abstract keyword and must not have a method body i.e. { }.

abstract add(); // FALSE
A method that is not supposed to return anything must specify void as its return type.

abstract null add(); // FALSE
A method that is not supposed to return anything must specify void as its return type. null is not a  type, though it
is a valid return value for any reference type.

abstract public void add(){ } // FALSE
It is invalid because has a method body i.e. { }.

abstract public void add() throws Exception; // TRUE
 */
