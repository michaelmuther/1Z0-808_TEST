public class Exceptions10{
    public int luckyNumber(int seed){
        if(seed > 10) return seed%10;
        int x = 0;
        try{
            if(seed%2 == 0) throw new Exception("No Even no.");
            else return x;
        }
        catch(Exception e){
            return 3;
        }
        finally{
            return 7;
            // I thought this function would error out due to the position of the return statements; it does not, actually
        }
    }

    public static void main(String args[]){
        int amount = 100, seed = 6;
        switch( new Exceptions10().luckyNumber(6) ){
            case 3: amount = amount * 2;
            case 7: amount = amount * 2;
            case 6: amount = amount + amount;
            default :
        }
        System.out.println(amount);
    }
}
/*
Answered Incorrectly

You had to select 1 option(s)
It will not compile.
It will throw an exception at runtime.
800
200
400


When you pass 6 to luckyNumber(), if(seed%2 == 0) throw new Exception("No Even no."); is executed and the exception is
caught by the catch block where it tries to return 3; But as there is a finally associated with the try/catch block, it
is executed before anything is returned. Now, as finally has return 7;, this value supersedes 3.
In fact, this method will always return 7 if seed <= 10.

Now, in the switch there is no break statement. So both -
case 7: amount = amount * 2;
and
case 6: amount = amount + amount;
are executed. so the final amount becomes 400.
 */