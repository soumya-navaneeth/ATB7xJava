package July2024.ex_28072024_ClassObj;

/*  Classes -> Blueprint/Template -> No memory allocated
    Objects -> Instance of class -> Memory allocated
    Objects has:
        - Attributes / properties -> 2 hand, eye color, node, mouth, height, wieght, body color, hair color
        - Behaviour / methods -> walk(), eat(), talk(), read(), sleep(), hear(). */

//  Object and Class Example: main within the class

//    Create a Class Student
    class Student {
    //   Defining fields/Variables/Data members
    int id;
    String name;
    char section;

    //creating main method inside the Student class
    public static void main(String[] args) {
        Student s1 = new Student(); // creating an object of the class student using New keyword
//  Print the Values
        System.out.println("Before assigning values");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Section: " + s1.section);

//    assign the values to reference variable
        s1.id = 101;
        s1.name = "Soumya";
        s1.section = 'A';
        System.out.println("\nAfter assigning values");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Section: " + s1.section);
    }
}

