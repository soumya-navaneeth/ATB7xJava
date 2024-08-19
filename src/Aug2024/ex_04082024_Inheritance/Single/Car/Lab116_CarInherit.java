package Aug2024.ex_04082024_Inheritance.Single.Car;

public class Lab116_CarInherit {
    /* Inheritance: mechanism in which one object acquires all the properties and behaviours of a parent object.
    Syntax: class Subclass-name extends Superclass-name
    {
       //methods and fields
    }
     */

    public static void main(String[] args) {
    /* Since 'Benz' subclass inherits all the members of 'Car' superclass, we are accessing the 'calculateSpeed()' method
    using subclass 'Benz' though the 'calculateSpeed()' method is declared in 'Car' superclass */

        //Accessing the instance variables declared in 'Benz' subclass
        System.out.println("The cost of Benz car is "+ BenzSubClass.cost);
        System.out.println("The brand of Benz car is "+ BenzSubClass.brand);

        //Calling the method 'printDistanceTime' which is created in 'Benz' subclass
        System.out.println("The speed of Benz car is "+ BenzSubClass.calculateSpeed(100, 2));
        BenzSubClass.printDistanceTime();

    }
}
