public class Operators1 {
}

/*
Which of the following are also known as "short circuiting logical operators"?
Answered Correctly

You had to select 2 option(s)
&  // FALSE
|| // IS A SHORT-CIRCUITING OPERATOR
&& // IS A SHORT-CIRCUITING OPERATOR
|  // FALSE
^  // FALSE


|| and && are called short circuiting operators because if, while evaluating a logical expression, at any stage, the
value of the whole expression can be determined without evaluating the rest of the expression, then the remaining sub-expressions are not evaluated.


Consider this:
boolean bool  = true; int k = 10;
if( bool == false && ( (k = 3) == 5 )  ) { .....}
System.out.println(k);             // this will print 10.

Because the value of the whole expression can be determined just by looking at bool == false.
So k = 3 is never executed. The big expression was short circuited by &&.

Had the expression been if( bool == false & ( (k = 3) == 5 )  ) { .....}  /* notice single & instead of &&
then it would have printed 3 because k = 3 will be executed. Even though the value of the expression is known immediately after evaluating bool == false, the rest of the expression is still evaluated. Thus, & is not a short circuiting operator.

        Same thing happens with || and | as well.
 */
