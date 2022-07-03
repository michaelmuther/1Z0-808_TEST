class Baap{
    public int h = 4;
    public int getH(){
        System.out.println("Baap "+h); return h;
    }
}

public class Inheritance26 extends Baap{
    public int h = 44;
    public int getH(){
        System.out.println("Beta "+h); return h;
    }
    public static void main(String[] args) {
        Baap b = new Inheritance26();
        System.out.println(b.h+" "+b.getH()); // this println will be stacked until the return from getH is delivered
        Inheritance26 bb = (Inheritance26) b;
        System.out.println(bb.h+" "+bb.getH());
    }
}
// Answer info:
//Always remember: Instance methods are overridden and variables (and static methods) are hidden. Which instance method
// is invoked depends on the class of the actual object, while which field (and static method) is accessed depends on
// the class of the variable.
//Beta 44
//4 44
//Beta 44
//44 44


// My first thought: the reference determines which method is called.  The object determines the fields. // I HAD IT BACKWARDS!
// So always 44 would be returned when called b.h.  4 would be returned when b.getH() called from Baap.
// Call to b.getH() would println b.getH() before the call in psvm, I think
// 44 is never before 4 in the answers; it looks like the call to b.h from the Baap reference calls its own version of h.
// Baap 44
// 4 44
// Beta 44
// 44 44
