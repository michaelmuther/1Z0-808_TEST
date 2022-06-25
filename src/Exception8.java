class MyException extends Exception {}
public class Exception8{
    public static void main(String[] args){
        Exception8 tc = new Exception8();
        try{
            tc.m1();
        }
        catch (MyException e){
//            tc.m1(); // unhandled exception
        }
        finally{
            tc.m2();
        }
    }
    public void m1() throws MyException{
        throw new MyException();
    }
    public void m2() throws RuntimeException{
        throw new NullPointerException();
    }
}

/*
What is wrong with the following code?

class MyException extends Exception {}
public class TestClass{
   public static void main(String[] args){
      TestClass tc = new TestClass();
      try{
         tc.m1();
      }
      catch (MyException e){
         tc.m1();
      }
      finally{
         tc.m2();
      }
   }
   public void m1() throws MyException{
      throw new MyException();
   }
   public void m2() throws RuntimeException{
      throw new NullPointerException();
   }
}

Answered Incorrectly

You had to select 1 option(s)
It will not compile because you cannot throw an exception in finally block.
You can, but then you have to declare it in the method's throws clause.
It will not compile because you cannot throw an exception in catch block.
You can, but then you have to declare it in the method's throws clause.
It will not compile because NullPointerException cannot be created this way.
It does have a no args constructor.
It will not compile because of unhandled exception.
It will compile but will throw an exception when run.


The catch block is throwing a checked exception (i.e. non-RuntimeException) which must be handled by either a try catch block or declared in the throws clause of the enclosing method.
Note that finally is also throwing an exception here, but it is a RuntimeException so there is no need to handle it or declare it in the throws clause.

You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/7LaszpsS1Wc
 */
