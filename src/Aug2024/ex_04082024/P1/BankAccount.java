package Aug2024.ex_04082024.P1;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode; // Instance

    // DC
    BankAccount(){
        System.out.println("Default Constructor");
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";
        System.out.println("Bank Name: " + bankName);
        System.out.println("Bank Code: " + bankCode);
        System.out.println("Balance: " + balance);
    }

    // PC - 3 Argument
    BankAccount(String bName, int bBal, String bCode){
        this.bankName = bName; //this -> this is a reference variable that refers to the current object.
        this.balance = bBal;
        this.bankCode = bCode;
    }

    BankAccount(String bName, int Bbal){
        this.bankName = bName;
        this.balance = Bbal;

    }

    BankAccount(String bName){
        this.bankName = bName;
    }


    void printDetails(){
        System.out.println("Bank Code: " + bankCode);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Balance: " + balance);
    }
}
