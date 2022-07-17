public class Constructors4 {

}

class AAAAA{
    int i;
    public AAAAA(int x) { this.i = x; }
}
class BBBBB extends AAAAA{
    int j;
    public BBBBB(int x, int y) { super(x);  this.j = y; }

//    BBBBB( ) { } // does not work
//    BBBBB(int y ) { j = y; } // does not work
//    BBBBB(int y ) { super(y*2 ); j = y; } // works, calls super directly and is different from above BBBBB constructor
//    BBBBB(int y ) { i = y; j = y*2; } // does not work
    BBBBB(int z ) { this(z, z); } // this works. calls the BBBBB constructor above.

}