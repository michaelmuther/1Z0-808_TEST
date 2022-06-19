public class JavaBasics1 {
}
/*
What is the correct parameter specification for the standard main method?
Answered Correctly

You had to select 2 option(s)
void // FALSE
String[ ] args // TRUE
Strings args[ ] // FALSE
String args // FALSE
String args[ ] // TRUE


There is a no difference for args whether it is defined as String[] args or String args[]. However, there is an important difference in the way it is defined as illustrated by the following:

1. String[] sa1, sa2;
Here, both - sa1 and sa2 are String arrays.

2. String sa1[], sa2;
Here, only sa1 is a String array. sa2 is just a String.
MM note: this is the reason both are possible; you can in one line declare a String variable and a String array reference.
 */