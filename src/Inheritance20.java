
class AA {
}

class AAA extends AA { // All AAAs are AAs; not all AAs are AAAs.
}


public class Inheritance20 {
    public static void main(String[] args) throws Exception {
        AA aa = new AA();
        AAA aaa = new AAA();
        aa = aaa; // AA cannot be converted to AAA; AAA can be converted to AA though
        System.out.println("aa = "+aa.getClass());
        System.out.println("aaa = "+aaa.getClass());
    }
}
