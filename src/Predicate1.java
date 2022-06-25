import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate1 {

    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(2); i.add(4); i.add(7); i.add(9);
        Predicate<Integer> test = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 5;
            }
        };

        for(Integer j : i) {
            System.out.print(j + " ");
        }
        i.removeIf(test);
        System.out.println();
        for(Integer j : i) {
            System.out.print(j + " ");
        }
    }
}
/*
P -> condition; condition must be a boolean
 */
