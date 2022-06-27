import java.util.*;
public class DataTypes6 {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> al = new ArrayList<>();

//        al.add(111); // FALSE
        al.add(111.0); // TRUE
//        You cannot box an int into a Double object, but you can box a double into a Double object

        System.out.println(al.indexOf(1.0)); // TRUE
//        indexOf's accepts Object as a parameter. Although 1.0 is not an object, it will be boxed into a Double object.

        System.out.println(al.contains("string")); // TRUE

//        Double d = al.get(al.length); // FALSE
//        ArrayList does not have a field named length. It does have a method named size() though. So you can do:
//        Double d = al.get(al.size()); It will compile but will throw IndexOutOfBoundsException at run time in this case because al.size() will return 0 and al.get(0) will try to get the first element in the list.
//
//
//        Note that al is declared as ArrayList<Double>, therefore the add method is typed to accept only a Double.
    }
}
