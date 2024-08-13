package July2024.ex_28072024_ClassObj;

public class Lab108_Bank {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.name = "SBI";
        bank2.name = "ICICI";

        System.out.println(bank1.name);
        System.out.println(bank2.name);
        System.out.println(bank1.balance);
        System.out.println(bank2.balance);

        bank2.balance = 100;
        bank1.balance = 200;
        System.out.println(bank2.balance);
        System.out.println(bank1.balance);
        bank1.addBalance();
        bank2.withDraw();

    }
}
