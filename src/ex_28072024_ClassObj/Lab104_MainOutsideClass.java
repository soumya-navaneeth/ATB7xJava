package ex_28072024_ClassObj;

public class Lab104_MainOutsideClass {
    public static void main(String[] args) {
//   This StudentClass is outside this Class
        StudentClass s1 = new StudentClass(); // creating an object of the class student using New keyword

//  Print the Values
        System.out.println("Before assigning values");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Section: " + s1.section);

//    assign the values to reference variable
        s1.id = 141;
        s1.name = "Soumya Class";
        s1.section = 'A';
        System.out.println("\nAfter assigning values");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Section: " + s1.section);
    }
}
