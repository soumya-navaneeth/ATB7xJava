package Aug2024;

public class Lab111_ParameterizedCons {
    public static void main(String[] args) {
        System.out.println("Default Constructor is called");
        ATBPerson p0 = new ATBPerson();// Default Constructor

        System.out.println("\nParameterized Constructors");
        ATBPerson p1 = new ATBPerson("Soumya"); // with 1 Parameter
        ATBPerson p2 = new ATBPerson("Swathi"); // with 1 Parameter
        ATBPerson p3 = new ATBPerson("Bhavani",976543210); // with 2 Parameters
        System.out.println("DC Person0 Name: " +p0.ATBname);
        System.out.println("\nPerson1 Details");
        System.out.println("Person1 Name: " +p1.ATBname);
        System.out.println("\nPerson2 Details");
        System.out.println("Person2 Name: " +p2.ATBname);
        System.out.println("Person2 Phone: " +p2.ATBphone);
        System.out.println("\nPerson3 Details");
        System.out.println("Person3 Name: " +p3.ATBname);
        System.out.println("Person3 Phone: " +p3.ATBphone);

    }


}
