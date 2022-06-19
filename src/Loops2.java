public class Loops2 {
}
/*
Consider the following code written by a new developer:

while(true){
        //additional valid code
        if(isDone()) break;
}

What can be done to make this code more readable?
Answered Correctly

You had to select 1 option(s)
Use a for loop
The following is how it can be done using a for loop:
for(;!isDone();) {  //  INTERESTING!  for(;!isDone();) {} is the same as the above loop (wouldn't it be a while loop?  meaning it does not enter the loop if isDone() is true
//additional valid code
}
Use the enhanced for loop
use do-while instead of while.
In the current state, the actual loop breaker condition is coded far away from the while condition. This reduces readability because it isn't immediately known when the loop breaks. Therefore, it should be changed to:
do{
} while( !isDone() );
Use continue instead of break.
*/