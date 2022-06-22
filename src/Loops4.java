public class Loops4 {
}
/*
Which of these statements are valid when occurring by themselves in a method?
Answered Correctly

You had to select 3 option(s)
while ( ) break ; // FALSE
The condition expression in a while header is required.

do { break ; } while (true) ; // TRUE

if (true) { break ; } (When not inside a switch block or a loop) // FALSE
You cannot have break or continue in an 'if' or 'else' block without being inside a loop. Note that the problem
statement mentions, "...occuring by themselves". This implies that the given statement is not wrapped within any other
block.
Note: break with a label is possible in an if/else statement without a loop:
     label: if(true){
         System.out.println("break label");
         break label; //this is valid
      }

switch (1) { default : break; } // TRUE
You can use a constant in switch(...);

for ( ; true ; ) break ; // TRUE


It is not possible to break out of an if statement. But if the if statement is placed within a switch statement or a
loop construct, the usage of break in option 3 would be valid.
 */