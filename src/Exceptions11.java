
public class Exceptions11 {


    String global = "111";

    public int parse(String arg){
        int value = 0;
        try{
            String global = arg;
            value = Integer.parseInt(global);
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        System.out.print(global+" "+value+" ");
        return value;
    }
    public static void main(String[] args) {
        Exceptions11 ct = new Exceptions11();
        System.out.println(ct.parse("333"));
        System.out.println(ct.parse("3f3"));
    }

}
