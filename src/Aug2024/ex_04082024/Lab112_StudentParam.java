package Aug2024.ex_04082024;

public class Lab112_StudentParam {
    public static void main(String[] args) {
        //creating objects and passing values
        ConsStudent s1 = new ConsStudent(111,"Dhyaan");
        ConsStudent s2 = new ConsStudent(112,"Daksh");
        ConsStudent s3 = new ConsStudent("Dhanvi");
        //calling method to display the values of object
        s1.display();
        s2.display();
        s3.display();

    }
}
