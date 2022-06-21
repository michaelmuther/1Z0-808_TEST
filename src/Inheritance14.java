class Game{
    public void play() throws Exception{
        System.out.println("Playing...");
    }
}

public class Inheritance14 extends Game{
    public void play() {
        System.out.println("Playing Soccer...");
    }
//    public static void main(String[] args) throws Exception{ // One possibility as the exception will get kicked up here
    public static void main(String[] args) {
//        Game g = new Inheritance14();
        Inheritance14 g = new Inheritance14(); // Another possibility is to declare this an Inheritance14 rather than a Game
        g.play();
    }
}

/*
Observe that play() in Game declares Exception in its throws clause. Further, class Soccer overrides the play() method
without any throws clause. This is valid because a list of no exception is a valid subset of a list of exceptions thrown
by the superclass method.
Now, even though the actual object referred to by 'g' is of class Soccer, the class of the variable g is of class Game.
Therefore, at compile time, compiler assumes that g.play() might throw an exception, because Game's play method declares
it, and thus expects this call to be either wrapped in a try-catch or the main method to have a throws clause for the
main() method.
 */
