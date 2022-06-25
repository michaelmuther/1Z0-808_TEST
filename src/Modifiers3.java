class Data {
    int x = 0, y = 0;
    public Data(int x, int y){
        this.x = x; this.y = y;
    }
}
public class Modifiers3 {
    public static void main(String[] args) throws Exception {
        Data d = new Data(1, 1);
        d.x = 2;
        d.y = 2;
        System.out.println(d.x + " " + d.y);
        d.x += 1;
        d.y += 1;
        System.out.println(d.x + " " + d.y);
    }
}
/*
Which of the following options when applied individually will change the Data object currently referred to by the variable d to contain 2, 2 as values for its data fields?
Answered Correctly

You had to select 2 option(s)
Add the following two statements:
d.x = 2;
d.y = 2;
Add the following statement:
d = new Data(2, 2);
This will create a new Data object and will not change the original Data object referred to be d.
Add the following two statements:
d.x += 1;
d.y += 1;
Add the following statement:
d = d + 1;
This will not compile because Java does not allow operator overloading for user defined classes.
 */
