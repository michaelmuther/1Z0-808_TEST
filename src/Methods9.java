
public class Methods9
{
//    String url = "jdbc://derby://localhost:1527//mydb"; // Will return NPE when run
    static String url = "jdbc://derby://localhost:1527//mydb"; // Because this is static, the JVM does not care that there is no actual object created to retrieve the url
    static Methods9 getDatabase()
    {
        System.out.println("Getting DB");
        return null;
    }
    public static void main(String[ ] args)
    {
        System.out.println( getDatabase().url );
    }
}
/*
It will print Getting DB and jdbc://derby://localhost:1527//mydb without throwing an exception. // TRUE
It will throw a NullpointerException at Runtime. // FALSE
It will print jdbc://derby://localhost:1527//mydb but will NOT print Getting DB. // FALSE
It will print Getting DB and then throw a NullPointerException. // FALSE, would do this if the url String is not static
It will print nothing. // FALSE
 */


/*
Note the method signature. It returns a reference to an object of class DatabaseWrapper. Thus, getDatabase().url means
we are accessing url field of the object returned by the method. Now, since the class of the object returned by the
method is DatabaseWrapper and the field url is a static field of the class, the compiler creates the instruction for
the JVM to access this field directly using the class reference instead of the object reference returned by the method
at runtime. Thus, the JVM does not need to depend on the actual object returned by the method at run time to access url.
So even if the method returns null at run time, it doesn't matter because the JVM doesn't even access the reference
returned by the method.
 */
