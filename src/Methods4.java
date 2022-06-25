public class Methods4 {
}
class Triangle{
    public int base;
    public int height;
//    private final double ANGLE; // if it is declared final, it must be explicitly initialized.
    private double ANGLE;

    public  void setAngle(double a){  ANGLE = a;  }
    // if the variable is final, it cannot be set after initialization.

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setAngle(90);
    }
}
/*
the value of ANGLE will not be set to 90 by the setAngle method. // FALSE
An exception will be thrown at run time. // FALSE
The code will work as expected setting the value of ANGLE to 90. // FALSE
The code will not compile. // TRUE


The given code has two problems:
1. If you declare a field to be final, it must be explicitly initialized by the time the creation of an object of the
class is complete. So you can either initialize it immediately:
private final double ANGLE = 0;
or you can initialize it in the constructor or an instance block.

2. Since ANGLE is final, you can't change its value once it is set. Therefore the setAngle method will also not compile.

You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/PmDT1EUYrPA
 */
