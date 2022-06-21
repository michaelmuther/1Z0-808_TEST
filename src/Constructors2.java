public class Constructors2 {
    public static void main(String[] args) {
        System.out.println("test");
    }
}

abstract class Bang{
//    abstract void f();  //(0) WILL NOT COMPILE f() is not implemented in BigBang
    final    void g(){}
//    final    void h(){} //(1) WILL NOT COMPILE h() here is final; cannot be overridden below
    protected static int i;
    private int j;
}

final class BigBang extends Bang{
//    BigBang(int n) { m = n; } //(2) WILL NOT COMPILE mc below is declared with the noargs constructor; there is no noargs constructor if this one is declared
    public static void main(String args[]){
        Bang mc = new BigBang();
    }
    void h(){}
    void k(){ i++; } //(3) WILL COMPILE!
//    void l(){ j++; } //(4) WILL NOT COMPILE as j is private in superclass so it is not inherited
    int m;
}