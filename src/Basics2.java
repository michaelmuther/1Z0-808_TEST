

public class Basics2 {




    public static void main(String[] args) {





    }
}

/*

    int a;
    int b = 0;
    static int c;
    public void m(){
        int d;
        int e = 0;
        a++;
//        Here, 'a' is an instance variable of type int. Therefore, it will be given a default value of Zero and so it need not be initialized explicitly.
        b++;
        c++;
//        Here 'c' is a class variable (also called as static variable) of type int so it will be given a default value of Zero and so it need not be initialized explicitly.
//        d++;
//        This will not compile because 'd' is not initialized. Note that automatic variables (also called as method local variables i.e. variables declared within a method) have to be explicitly initialized.
        e++;


        List<Integer> list = new ArrayList<>();
        list.add(21); list.add(13);
        list.add(30); list.add(11);
        list.add(2);
//        list.removeIf(e -> e % 2 != 0); // remove if it is odd
        list.removeIf(e -> e % 2 == 0); // remove if it is even

//        list.remove(e -> e % 2 != 0); // no parameter for a lambda in list.remove
        System.out.println(list);


//        System.out.println(new LocalTime().now()); // does not compile, LocalTime does not have a constructor
//        System.out.println(new LocalTime()); // does not compile, LocalTime does not have a constructor
        System.out.println(LocalTime.now()); // does not compile, LocalTime does not have a constructor
//        System.out.println(LocalTime.today()); // does not compile, LocalTime does not have a constructor
        LocalDate date = LocalDate.of(2015, 3, 26);
        Period p = Period.ofDays(1);
        System.out.println(date.plus(p));

        final String BEGIN = "1Z0";
        final String END = "-808";

        StringBuilder sb = new StringBuilder(BEGIN);
        String s = BEGIN;

//        sb.concat(END); // there is no concat method with StringBuilder
        sb.append(END); // append updates the StringBuilder object
        System.out.println(sb);

        s = s.concat(END); // concat does not update the string.  BIG DIFFERENCE!
        System.out.println(s);


//        Integer number = Integer.valueOf("808.1"); // Number format exception
//        Integer number = Integer.valueOf("808"); // compiles and runs


        String s = "a"; // simple a default Capital A - will cascade as there are no "break" statements
//        String s = "A"; // Capital A - the default is ignored if there is a match regardless of position
        // Also, the switch is case-sensitive.
//        String s = "B"; // default Capital A

        switch(s) {
            case "a":
                System.out.print("simple a ");
            default:
                System.out.print("default ");
            case "A":
                System.out.print("Capital A ");


//        Double number = Double.valueOf("120D"); // 120.0
//        Double number = Double.valueOf("120d"); // 120.0
//        Double number = Double.valueOf("120F"); // 120.0
//        Double number = Double.valueOf("120f"); // 120.0
//        Double number = Double.valueOf("120L"); // Number format exception
//        Double number = Double.valueOf("120l"); // Number format exception
//        Double number = Double.valueOf("120B"); // Number format exception
//        Double number = Double.valueOf("120b"); // Number format exception
//        Double number = Double.valueOf("120E"); // Number format exception
//        Double number = Double.valueOf("120"); // 120.0
//        System.out.println(number);

//        int array[] = new int[-2]; // compiles and throws NegativeArraySizeException

        int sum = 0;
        int x;
        for (x = 0; x < 11; x++)
            sum += x;
//            sum += x; // for loop does not need brackets; only the next statement is included. Similar to an "if" statement.
//            sum +=x; y = x; // assumes brackets only around one statement, not one line.

        System.out.println("Sum for 0 to " + x);
        System.out.println("= " + sum);
 */