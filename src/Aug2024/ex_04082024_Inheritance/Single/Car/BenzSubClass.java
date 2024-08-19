package Aug2024.ex_04082024_Inheritance.Single.Car;

// Using 'extends' keyword to inherit the instance variables and methods of 'Car' superclass
public class BenzSubClass extends CarSuperClass
{
    // Declare an instance variable 'cost' as int type
    // This demonstrates that the subclass inherits superclass, but it has its own unique things like cost
    static int cost = 7000000;

    //Create an object 'brand' of 'String' class type
    static String brand = "Mercedes";

    /* Create a method to print the local variables declared in superclass without declaring them here again
    This demonstrates that the subclass can use the members of superclass i.e. distance and time
    without declaring them once again */

    static public void printDistanceTime()
    {
        System.out.println("Distance: "+distance);
        System.out.println("Time: "+time);
    }


}