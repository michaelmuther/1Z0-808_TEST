public class DataTypes8{
    // .equals first checks if the objects are the same class; if not, then false.
    public static void main(String args[]){
        Integer i = new Integer(1) ;
        Long m = new Long(1);
        if( i.equals(m)) System.out.println("equal");   // 1
        else System.out.println("not equal");
    }
}
/*
Answered Incorrectly

You had to select 1 option(s)
equal
not equal // TRUE
Compile time error at //1
Runtime error at //1
None of the above.


Signature of equals method is : boolean equals(Object o); So it can take any object.
The equals methods of all wrapper classes first check if the two object are of same class or not. If not, they
immediately return false. Hence it will print not equal.
 */