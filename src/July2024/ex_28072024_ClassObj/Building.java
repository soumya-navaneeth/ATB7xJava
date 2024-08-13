package July2024.ex_28072024_ClassObj;

public class Building {
    String name;
    int floor;
    String city;

    void printdetails() {
        System.out.println("Name of the Builder: " + name);
        System.out.println("No. of floors: " + floor);
        System.out.println("Name of the city: " + city);
    }

    void useLift(){
        System.out.println("i am using lift");
    }

    void activities(){
        System.out.println("i am using activities");
    }

}

