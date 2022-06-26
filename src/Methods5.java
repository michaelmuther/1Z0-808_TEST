public class Methods5 {
    public static void printSum(int a, int b){
        System.out.println("In int "+(a+b));
    }

    public static void printSum(Integer a, Integer b){
        System.out.println("In Integer "+(a+b));
    }

    public static void printSum(double a, double b){
        System.out.println("In double "+(a+b));
    }

    public static void main(String[] args) {
        printSum(1, 2);
    }
}
/*
What will be printed?
Answered Incorrectly

You had to select 1 option(s)
In int 3 // TRUE
In Integer 3 // FALSE
In double 3.0 // FALSE
In double 3 // FALSE
It will not compile. // FALSE


The call to printSum(1, 2) will be bound to printSum(int, int) because 1 and 2 are ints, which are exact match to int, int.

Note that if printSum(int, int) method were not there in the code, printSum(double, double) would have been invoked
instead of printSum(Integer, Integer) because widening is preferred over boxing/unboxing.

We advise you to run this program and try out various combinations. The exam has questions on this pattern.

You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/-qCbQThU40M
 */