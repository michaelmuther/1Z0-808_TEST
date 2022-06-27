public class Switch4 {

    public void switchString(String input){
        switch(input){
            case "a" : System.out.println( "apple" );
            case "b" : System.out.println( "bat" );
                break;
            case "c" : System.out.println( "cat" );
            default : System.out.println( "none" );
        }
    }

    public static void main(String[] args) throws Exception {
        Switch4 tc = new Switch4();
        tc.switchString("c");
    }
}
/*
Answered Correctly

You had to select 1 option(s)
apple
cat
none
apple
cat
cat
none
Since there is a case condition that matches the input string "c", that case statement will be executed directly. This prints "cat". Since there is no break after this case statement and the next case statement, the control will fall through the next one (which is default : ) and so "none" will be printed as well.
cat


In the JDK 7 release, you can use a String object in the expression of a switch statement:

public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
     String typeOfDay;
     switch (dayOfWeekArg) {
         case "Monday":
             typeOfDay = "Start of work week";
             break;
         case "Tuesday":
         case "Wednesday":
         case "Thursday":
             typeOfDay = "Midweek";
             break;
         case "Friday":
             typeOfDay = "End of work week";
             break;
         case "Saturday":
         case "Sunday":
             typeOfDay = "Weekend";
             break;
         default:
             throw new IllegalArgumentException("Invalid day of the week: "
          + dayOfWeekArg);
     }
     return typeOfDay;
}

The switch statement compares the String object in its expression with the expressions associated with each case label
as if it were using the String.equals method; consequently, the comparison of String objects in switch statements is
case sensitive. The Java compiler generates generally more efficient bytecode from switch statements that use String
objects than from chained if-then-else statements.
 */
