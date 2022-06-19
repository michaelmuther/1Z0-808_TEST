public abstract class Inheritance5 {

    abstract int absMethod(int param) throws Exception; // TRUE
//    abstract native int absMethod(int param) throws Exception; // FALSE, native method cannot be abstract
//    float native getVariance() throws Exception; // FALSE, return type should be on the left of the method name
//    abstract private int absMethod(int param) throws Exception; // FALSE, a private method cannot be abstract

}

/*
Which of the following are valid declarations in a class?
Answered Incorrectly

You had to select 1 option(s)
abstract int absMethod(int param) throws Exception;
abstract native int absMethod(int param) throws Exception;
native method cannot be abstract.
float native getVariance() throws Exception;
return type should always be on the immediate left of method name.
abstract private int absMethod(int param) throws Exception;
private method cannot be abstract. A private method is not inherited so how can a subclass implement it?
 */