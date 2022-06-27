public class Methods7 {
}

class XXX{
    public void m() throws Exception{
        throw new Exception();
    }
}
class YYY extends XXX{
    public void m(){ }

    public static void main(String[] args) {
//        ________  obj = new ______();
//        XXX obj = new XXX(); // unhandled exception; does not compile
//        XXX obj = new YYY(); // unhandled exception; does not compile
//        YYY obj = new XXX(); // all XXXs are not YYYs; this does not compile.  Going up the inheritance tree...
        YYY obj = new YYY(); // This compiles fine.

        obj.m();
    }
}
