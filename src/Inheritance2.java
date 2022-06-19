public class Inheritance2 {
    public static void main(String[] args) {
        TwoWheeler twoW = new TwoWheeler();
    }
}

interface Automobile { String describe(); }
class FourWheeler implements Automobile{
    String name;
    public String describe(){ return " 4 Wheeler " + name; }
}

class TwoWheeler extends FourWheeler{
    String name;
    public String describe(){ return " 2 Wheeler " + name; }
}

/*
Answered Incorrectly

You had to select 3 option(s)
An instance of TwoWheeler is also an instance of FourWheeler. // TRUE

An instance of TwoWheeler is a valid instance of Automobile. // TRUE

The use of inheritance is not justified here because a TwoWheeler is not really a FourWheeler in the real world that the
code is trying to model. // TRUE

The code will compile only if name is removed from TwoWheeler. // FALSE

The code will fail to compile. // FALSE

The use of inheritance in this code is not justifiable, since conceptually, a TwoWheeler is-not-a FourWheeler.
 */