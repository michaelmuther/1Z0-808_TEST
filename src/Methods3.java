public class Methods3 {
}
/*
Which of the following statements are true?
Answered Correctly

You had to select 2 option(s)
private keyword can never be applied to a class.
private, protected and public can be applied to a nested class.

Although not too important for the exam, you should still know the following terminology: A top level class is a class that is not a nested class. A nested class is any class whose declaration occurs within the body of another class or interface.
synchronized keyword can never be applied to a class.
synchronized keyword may be applied to a non-primitive variable.
It can only be applied to a method or a block.
final keyword can never be applied to a class.
It can be applied to class, variable and methods.
A final variable can be hidden in a subclass.
If the class declares a field (static or instance) with a certain name, then the declaration of that field is said to
hide any and all accessible declarations of fields with the same name in superclasses, and superinterfaces of the class.
For example,
class Base{
   int i=10;
   static int x = 30;
}
class Sub extends Base{
  int i=20; //This i hides Base's i.
  static int x = 40; //This x hides Base's x.
}
...
Sub s = new Sub();
int k = s.i; //assigns 20 to k.

k = ((Base)s).i;//assigns 10 to k. The cast is used to show the Base's i.

Base b = new Sub();
k = b.i;//assigns 10 to k because which field is accessed depends
//on the class of the variable and not on the class of the actual object.
//The same rule applies to static methods but the opposite is true
//for instance methods.

It is possible for a subclass to hide fields defined in a super class even if the fields are declared final.


final keyword when applied to a class means the class cannot be subclassed, when applied to a method means the method
cannot be overridden (it can be overloaded though) and when applied to a variable means that the variable is a constant.
MM:
FINAL FOR VARIABLE: VARIABLE IS A CONSTANT
FINAL FOR METHOD: METHOD CANNOT BE OVERRIDDEN
FINAL FOR CLASS: CLASS CANNOT BE SUBCLASSED

 */
