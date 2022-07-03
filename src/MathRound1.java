public class MathRound1{
    public static int getSwitch(String str){
        return (int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)) );
    }
    public static void main(String args []){
        String args0 = "--0.50";
        switch(getSwitch(args0)){
//        switch(getSwitch(args[0])){
            case 0 : System.out.print("Hello ");
            case 1 : System.out.print("World"); break;
            default : System.out.print("Good Bye");
        }
    }
}
/*
str.substring(1, str.length()-1) => "--0.50".substring(1, (6-1) ) => -0.5
Math.round(-0.5) = 0.0
so getSwitch(...) returns 0 if passed an argument of "--0.50".
Now, there is no "break" in case 0 of switch. so the control falls through to the next case ( i.e. case 1) after
printing Hello. At case 1, it prints World. And since there is a break. default is not executed.

// MM NOTE: JAVA ROUNDS UP REGARDLESS OF NEGATIVE OR POSITIVE NUMBERS:
Observe that rounding is a standard mathematical procedure where the number that lies exactly between two numbers always
rounds up to the higher one. So .5 rounds to 1 and -.5 rounds to 0.
 */