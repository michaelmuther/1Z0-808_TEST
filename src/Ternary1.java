public class Ternary1 {

    public static void main(String[] args) {
        int i = 10;
        System.out.println( i<20 ? out1() : out2() ); // this is OK
//        System.out.println( i<20 ? out3() : out4() ); // ternary cannot return void method.
//        i<20 ? out1() : out2(); // can't do this with with ternary
//        10 < 20 ? 10 : 20; // not a statement
    }

    public static byte out1(){return 1;};
    public static byte out2(){return 1;};
    public static void out3(){};
    public static void out4(){};

}
