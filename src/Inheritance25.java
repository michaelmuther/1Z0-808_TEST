public class Inheritance25 {

    public static void main(String[] args) {
        Teacher test = new Prof();
    }

}

class Teacher{
    void teach(String student){
        /* lots of code */
    }
}

class Prof extends Teacher{
//    public void teach() throws Exception {} // OK, this overloads instead of overrides teach()

//    private void teach(int i) throws Exception{} // OK, this overloads instead of overrides teach()
//    private void teach(String i) throws Exception{} // NOT OK, this overrides and tries to apply private to subclass method where superclass method is package-private
//    void teach(String i) throws Exception{} // NOT OK, an overriding method cannot throw an exception if the superlass method does not.
    void teach(String i) {} // OK, basic override.

//    protected void teach(String s){} // OK, this overrides and has more visibility, not less.  It cannot be private.
    // MM NOTE: SUBCLASS CAN HAVE MORE VISIBILITY, NOT LESS.


//    public final void teach(String s){} // OK, overriding method may be made final.  A final method cannot be overridden, however.

//    public abstract void teach(String s); // NOT OK, you cannot have an abstract method in a non-abstract class.
    //1
}

/*
Which of the following methods can be inserted at line //1 ?
Answered Incorrectly

You had to select 4 option(s)
public void teach() throws Exception
It overloads the teach() method instead of overriding it.
private void teach(int i) throws Exception
It overloads the teach() method instead of overriding it.
protected void teach(String s)
This overrides Teacher's teach method. The overriding method can have more visibility. (It cannot have less. Here, it cannot be private.)
public final void teach(String s)
Overriding method may be made final.
public abstract void teach(String s)
This is wrong because class Prof has not been declared as abstract. Note that otherwise it is OK to override a method by an abstract method.


Note that 'protected' is less restrictive than default 'no modifier'. So choice 3 is valid.
"public abstract void teach(String s)" would have been valid if class Prof had been declared abstract.
 */