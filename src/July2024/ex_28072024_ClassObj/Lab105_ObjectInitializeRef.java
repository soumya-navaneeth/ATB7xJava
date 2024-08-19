package July2024.ex_28072024_ClassObj;

public class Lab105_ObjectInitializeRef {
//    This is to show the Object initialization through Reference Variables
//  StudentClass used here
    public static void main(String[] args) {
        StudentClass s1 = new StudentClass(); // Hierarchical ref Variable s1 for the Object is created
        StudentClass s2 = new StudentClass(); // Hierarchical ref Variable s2 for the Object is created
        s1.id = 101;
        s1.name = "Soumya";
        s2.id = 102;
        s2.name = "Navaneeth";
        s2.section = 'A';
        System.out.println("Student 1 details: " +s1.id+" "+s1.name); //printing Student details with a white space
        System.out.println("Student 2 details: " +s2.id+" "+s2.name+" "+s2.section);
    }
}
