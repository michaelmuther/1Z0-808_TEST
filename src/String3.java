public class String3 {

    // String Buffer, String Builder, java.lang.System, and all wrappers
    // are final classes; these cannot be extended.
}

//class MyString extends String{ // Cannot inherit from String
//    MyString(){ super(); }
//}

/*
Consider the following class...

class MyString extends String{
   MyString(){ super(); }
}


The above code will not compile.
Answered Incorrectly

You had to select 1 option(s)
True
False


This will not compile because String is a final class and final classes cannot be extended.
There are questions on this aspect in the exam and so you should remember that StringBuffer and StringBuilder are also
final. All Primitive wrappers are also final (i.e. Boolean, Integer, Byte etc).
java.lang.System is also final.
 */