class Game1 {
    public void play() throws Exception   {
        System.out.println("Playing...");
    }
}

class Soccer extends Game1 {
    public void play(String ball)    {
        System.out.println("Playing Soccer with "+ball);
    }
}

public class Inheritance23 {
    public static void main(String[] args) throws Exception  {
        Game1 g = new Soccer();
        // 1
        g.play();
        g.play();
//        g.play("cosco");
        Soccer s = (Soccer) g; //at runtime, g is a reference to a Soccer object; this cast is correct. Otherwise,
        // it would be a ClassCastException at runtime
        // 2
        s.play("cosco");
        s.play();
        s.play("cosco");
    }
    // MM NOTE: the reference type determines the methods you can call.
}
/*
Answered Incorrectly

You had to select 2 option(s)
It will not compile as it is.
There is no problem with the existing code.
It will throw an Exception at runtime if it is run as it is.
Soccer s = (Soccer) g; is a valid because g does refer to an object of class Soccer at run time. So there will be no
exception at run time.
g.play(); at //1 and s.play("cosco"); at //2
This is valid because g is of type Game, which has the no-args play method and s is of type Soccer, which has defined
play(String ) method.
g.play(); at //1 and s.play(); at //2
This is valid because g is of type Game, which has the no-args play method and s is of type Soccer, which inherits that
method.
g.play("cosco"); at //1 and s.play("cosco"); at //2
g.play("cosco") is not valid because even though the object referred to by g is of class Soccer, the reference type of
g is Game, which does not have play(String ) method.




You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/EhaU2egTQmE
 */
