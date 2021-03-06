public class DataTypes3 {
    public static void main(String[] args) {
        int i = 1234567890;
        float f = i;
        System.out.println(i - (int)f);
    }
}
/*
It will print 0.
It will not print 0.
It will not compile.
It will throw an exception at runtime.
None of the above.


Actually it prints -46. This is because the information was lost during the conversion from type int to type float as
values of type float are not precise to nine significant digits.
Note: You are not required to know the number of significant digits that can be stored by a float for the exam. However,
it is good to know about loss of precision while using float and double.
 */