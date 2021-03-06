public class DataTypes5 {
}
/*
Assume that a, b, and c refer to instances of primitive wrapper classes. Which of the following statements are correct?
Answered Correctly

You had to select 2 option(s)
a.equals(a) will always return true.
b.equals(c) may return false even if c.equals(b) returns true.
a.equals(b) returns same as a == b.
The wrapper classes's equals() method overrides Object's equals() method to compare the actual value instead of the reference.
a.equals(b) throws an exception if they refer to instances of different classes.
It returns false in such a case.
a.equals(b) returns false if they refer to instances of different classes.


Equals method of a primitive wrapper class ( e.g. java.lang.Integer, Double, Float etc) are
1. symmetric => a.equals(b) returns same as b.equals(a)
2. transitive => if a.equals(b) and b.equals(c) return true, then a.equals(c) returns true.
3. reflexive => a.equals(a) return true.

For example, the following code for the equals method on Integer explains how it works:
public boolean equals(Object obj) {
   if (obj instanceof Integer) {
       return value == ((Integer)obj).intValue();
   }
   return false;
}
 */
