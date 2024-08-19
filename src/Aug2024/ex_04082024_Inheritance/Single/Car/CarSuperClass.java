package Aug2024.ex_04082024_Inheritance.Single.Car;

public class CarSuperClass {

    //Declare the instance variables 'distance', 'time' and 'speed' as double type
    static double distance;
    static double time;
    static double speed;

    /* Create a method 'calculateSpeed' which receives distance and speed as input and
    returns speed to the statement which called it */
    public static double calculateSpeed(double d, double t) {

        //Assign the parameter values received by the method to the local variables
        distance = d;
        time = t;

        //Calculate speed using the parameter values received by the method
        speed = distance / time;

        //Return the calculated speed to the statement that called this method
        return speed;

    }
}
