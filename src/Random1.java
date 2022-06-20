import java.util.Random;

public class Random1 {
    public static void main(String[] args) {

        int x = 10;

        for (int i = 0; i < 100; i++) {
//            Random r = new Random(x); // 1 FALSE
//            int d = r.nextInt();

            Random r = new Random(); // 2 TRUE
            int d = r.nextInt(2);

//            Random r = new Random(x); //  3 TRUE
//            int d = r.nextInt(x);

//            Random r = new Random(x); // 4 FALSE, does not compile
//            int d = (int) r.next()*10;

//            Random r = new Random(); // FALSE, does not compile
//            r.setSeed(x);
//            int d = (int) r.next()*10;

//            Random r = new Random(x); // TRUE
//            r.setSeed(x);
//            int d = r.nextInt(x);

            System.out.println(d);
        }
    }
}
/*
java.util.Random class has two constructors:

Random(): Creates a new random number generator.
Random(long seed): Creates a new random number generator using a single long seed.

The Random(long seed) constructor is equivatent to doing Random r = new Random(); r.setSeed(long seed);

Random class has the following two methods that return an int:

int nextInt():
Returns the next pseudorandom, uniformly distributed int value from this random number generator's sequence.  All 2^32 possible int values are produced with (approximately) equal probability.

int nextInt(int bound)
Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.


Please go through JavaDoc API description of java.util.Random class.
 */