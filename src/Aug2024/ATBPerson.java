package Aug2024;

public class ATBPerson {
    String ATBname;
    long ATBphone;

    // Default Constructor -> No Parameters
    ATBPerson() {
        System.out.println("Default Constructor: Object is created!");
    }

//Parameterized Constructor with one Parameter
    ATBPerson(String nameGiven){
        this.ATBname = nameGiven;        // This -> Which means current class
    }

// Parameterized Constructor with 2 Parameters
    ATBPerson(String nameGiven,long phoneNumber){
        this.ATBname = nameGiven;
        this.ATBphone = phoneNumber;
    }
}
