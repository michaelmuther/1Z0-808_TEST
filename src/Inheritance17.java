

public class Inheritance17 {

    public static void main(String[] args){
        Based b = new Base2();
        System.out.println(b.getValue()); //3
    }
}

class Based{
    public Object getValue(){ return new Object(); } //1
//    public String getValue(){ return "hello"; } // flipped the overridden methods
    // the above does not work as the overridden method returns an object higher up the inheritance tree
}

class Base2 extends Based{
    public String getValue(){ return "hello"; } //2
//    public Object getValue(){ return new Object(); } //1
}
/*

class Base{
   public Object getValue(){ return new Object(); } //1
}

class Base2 extends Base{
   public String getValue(){ return "hello"; } //2
}

public class TestClass{
   public static void main(String[] args){
      Base b = new Base2();
      System.out.println(b.getValue()); //3
   }
}

It will print the hash code of the object. // FALSE

It will print hello. // TRUE
Covariant returns are allowed since Java 1.5, which means that an overriding method can change the return type to a
subclass of the return type declared in the overridden method. But remember than covarient returns does not apply to
primitives.

Compile time error at //1. // FALSE

Compile time error at //2. // FALSE

Compile time error at //3. //FALSE


Observe that at run time b points to an object of class Base2. Further, Base2 overrides getValue(). Therefore, Base2's getValue() will be invoked and it will return hello.

You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/ycQobqjyMG8
 */
