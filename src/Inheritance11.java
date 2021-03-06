public class Inheritance11 {
}
/*
Which of the following are true about the "default" constructor?
Answered Incorrectly

You had to select 1 option(s)
It is provided by the compiler only if the class and any of its super classes does not define any constructor. // FALSE
It is provided by the compiler if the class does not define any constructor. It is immaterial if the super class provides a constructor or not.

It takes no arguments. // TRUE

A default constructor is used to return a default value. // FALSE
A constructor does not return any value at all. It is meant to initialize the state of an object.

To define a default constructor, you must use the default keyword. // FALSE

It is always public. // FALSE
The access type of a default constructor is same as the access type of the class. Thus, if a class is public, the default constructor will be public.


The default constructor is provided by the compiler only when a class does not define ANY constructor explicitly. For example,

public class A{
  public A()  //This constructor is automatically inserted by the compiler
//because there is no other constructor defined by the programmer explicitly.
  {
    super();  //Note that it calls the super class's default no-args constructor.
  }
}
public class A{
  //Compiler will not generate any constructor
//because the programmer has defined a constructor.
  public A(int i){
     //do something
  }
}



You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/qMAGnCZUmX4
 */
