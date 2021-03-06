public class Inheritance12 {
}
/*
Where, in a constructor, can you place a call to a super class's constructor ?
Answered Correctly

You had to select 1 option(s)
Anywhere in the constructor's body. // FALSE

As the first statement in the constructor. // TRUE

Only as the first statement and it can be called just like any other method call i.e. ClassName( ... ). // FALSE
No. You have to do super( ...) instead of ClassName(...)

You can't call super class's constructor in a base class as constructors are not inherited. // FALSE
That constructors are not inherited is true but you can call them using super(...). You can call the super class's constructor only from a constructor and only as the first statement.

None of the above. // FALSE


A constructor of a class is meant to initialize the instance of that class. It is an opportunity for the programmer to make the instance ready for use by others. Therefore, when you create an object of a class using the new keyword, the JVM invokes that class's constructor as per the supplied arguments. It is so important that if you don't have any thing that you want to do to the instance and decide to not write a constructor, the compiler automatically creates one constructor for that class.

Remember that an instance of a class is also an instance of its super class. Therefore, the fields of its super class need to be initialized as well. Now, observe that a sub class is always aware of its super class and so it can make use of the fields of its super class (depending on accessibility) but a super class has no knowledge of its subclasses. Therefore, the fields defined by the super class must be initialized before the fields of the subclass can be initialized because a subclass constructor may utilize the fields of the super class. This means that a super class constructor must execute before a sub class constructor. This logic applies to all the super classes in the chain right up to java.lang.Object class, since Object class is the root class of all objects. Obviously then, the Object class's constructor must be the first one to execute.

The compiler ensures this order of execution of constructors by checking that each constructor of a class first calls either a constructor of its super class or another constructor of the same class. If a constructor of a class doesn't explicitly do that (i.e. it neither calls super class's constructor nor calls another one of its own constructors as the first thing), the compiler automatically inserts a call to the default no-args constructor of the super class. This is same as writing super(); as the first statement in the constructor of the class.

Now, what if the super class doesn't have a no-args constructor? Obviously, the automatic call to super(); inserted by the compiler will fail and therefore, the sub class code will fail to compile.
 */
