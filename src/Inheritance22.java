
class AAAA{
    public int i = 10;
//    int i = 10;
//    private int j = 20; // If this is declared public, it does not cause a compile error in //3
    public int j = 20;

}

class BBBB extends AAAA{
//    private int i = 30; //1 // This is call hiding; the variable in the subclass hides the one in the superclass.
    public int i = 30; //1 //  If is this declared public, line //2 does not create a compile error.
//    int i = 30; //1
    public int k = 40;

}

class CCCC extends BBBB{
}

public class Inheritance22{
    public static void main(String args[]){
        CCCC c = new CCCC();
        System.out.println(c.i); //2 // i is private in BBBB
        System.out.println(c.j); //3 // is private in AAAA
        System.out.println(c.k);
    }
}
/*
Answered Incorrectly

You had to select 1 option(s)
The code will print 10 and 40 if //3 is commented out. // FALSE

The code will print 40 if //2 and //3 are commented out. // TRUE

The code will not compile because of //1. // FALSE

The code will compile if the line marked //2 is commented out. // FALSE
Just commenting out //2 is not enough. It will still fail compilation because of //3.

None of these. // FALSE


You cannot access c.i because i is private in B. But you can access ( (A)c).i because i is public in A. Remember that member variables are hidden and not overridden. So, B's i hides A's i and since B's i is private, you can't access A's i unless you cast the reference to A.
You cannot access c.j because j is private in A.


You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/pSR21iqtmfc
 */