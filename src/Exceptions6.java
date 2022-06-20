public class Exceptions6 {
    public static void main(String[] args) throws Exception{
//        try {
//            throw new RuntimeException("can this be done?"); // Runtime exception without throws in method or try catch is OK
            throw new Exception("can this be done?"); // Exception without throws in method or try catch is not OK unless caught or thrown from method
//        } catch (Exception e) {
//            System.out.println("e caught here");
//        }

    }
}
/*
RuntimeException comes from poor coding
Check Exceptions come from something that is outside of our control like IO
 */