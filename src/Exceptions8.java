public class Exceptions8 {

    public static void main(String[] args) {
        Exceptions8 e = new Exceptions8();
//        System.out.println(e.parseFloat("0.1"));
//        System.out.println(e.parseFloat("0x.1"));
//        System.out.println(e.parseFloat("1"));
        System.out.println(e.parseFloat("0x1"));

    }

    public float parseFloat(String s){
        float f = 0.0f;
        try{
            f = Float.valueOf(s).floatValue();
            return f ;
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input " + s);
            f = Float.NaN ;
            return f;
        }
        finally { System.out.println("finally");  }
//        return f ;
    }


}
