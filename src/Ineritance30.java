public class Ineritance30 {
}


class Base{
    private float f = 1.0f;
    void setF(float f1){ this.f = f1; }
}
class Base22 extends Base{
    private float f = 2.0f;
    //1
//    protected void setF(float f1){ this.f = 2*f1; } // this compiles as protected is less restrictive than default
//    protected is less restrictive than default, so it is valid.
//    public void setF(double f1){ this.f = (float) 2*f1; } // this is overloading, not overriding.
////    Since the parameter type is different, it is overloading not overriding.
//    public void setF(float f1){ this.f = 2*f1; } // public is less restrictive than default, this compiles
////    public is less restrictive than default, so it is valid.
//    private void setF(float f1){ this.f = 2*f1; } // private is more restrictive than default, does not compile.
////    private is more restrictive than default, so it is NOT valid.
//    float setF(float f1){ this.f = 2*f1; return f;} // return types much match to be an overload.
////return types must match.
}
