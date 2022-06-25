public class Operators6 {
    public static void main(String args[ ] ){
        int i = 0 ;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool  = false;
        System.out.println(bool2);
        bool = (bool2 &  method1("1"));  //1 // does not short circuit
        System.out.println(bool2);
        bool = (bool2 && method1("2"));  //2 // short circits
        bool = (bool1 |  method1("3"));  //3 // does not short circuit
        bool = (bool1 || method1("4"));  //4 // short circuits

        boolean test1 = true;
        boolean test2 = false;
        boolean test3 = (test1 & test1); // true & true equals true
        System.out.println(test3);
        boolean test4 = (test1 & test2); // true & false equals false
        System.out.println(test4);
        boolean test5 = (test2 & test1); // false & true equals false
        System.out.println(test5);
        boolean test6 = (test2 & test2); // false & false = false
        System.out.println(test6);
        boolean test7 = (test1 | test1); // true | true equals true
        System.out.println(test7);
        boolean test8 = (test1 | test2); // true | false equals ture
        System.out.println(test8);
        boolean test9 = (test2 | test1); // false | true equals true
        System.out.println(test9);
        boolean test10 = (test2 | test2); // false | false = false
        System.out.println(test10);
    }
    public static boolean method1(String str){
        System.out.println(str);
        return true;
    }
}
// MM notes from SO:
/*
Short circuit does not throw exception:
The canonical example is foo != null && foo.hasBar()

| does not do short-circuit evaluation in boolean expressions. || will stop evaluating if the first operand is true,
but | won't.

In addition, | can be used to perform the bitwise-OR operation on byte/short/int/long values. || cannot.

If you use the || and && forms, rather than the | and & forms of these operators, Java will not bother to evaluate the right-hand operand alone.

It's a matter of if you want to short-circuit the evaluation or not -- most of the time you want to.

A good way to illustrate the benefits of short-circuiting would be to consider the following example.

Boolean b = true;
if(b || foo.timeConsumingCall())
{
   //we entered without calling timeConsumingCall()
}

Another benefit, as Jeremy and Peter mentioned, for short-circuiting is the null reference check:

if(string != null && string.isEmpty())
{
    //we check for string being null before calling isEmpty()
}

 */


/*
1 will be the part of the output. // FALSE
& (unlike &&), when used as a logical operator, does not short circuit the expression, which means it always evaluates
both the operands even if the result of the whole expression can be known by just evaluating the left operand.

2 will be the part of the output. // FALSE

3 will be the part of the output. // TRUE
& and | (unlike && and ||), when used as logical operators, do not short circuit the expression, which means they always
evaluate both the operands even if the result of the whole expression can be known by just evaluating the left operand.

4 will be the part of the output. // FALSE

None of the above // FALSE


& and | do not short circuit the expression. The value of all the expressions ( 1 through 4) can be determined just by
looking at the first part.
&& and || do not evaluate the rest of the expression if the result of the whole expression can be known by just
evaluating the left operand, so method1() is not called for 2 and 4.
 */