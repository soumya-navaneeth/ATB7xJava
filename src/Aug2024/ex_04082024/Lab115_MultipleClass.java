package Aug2024.ex_04082024;

import Aug2024.ex_04082024.P2.BankAccount;

public class Lab115_MultipleClass {
    public static void main(String[] args) {

/* If the same class name is present in Multiple packages then, java will ask which one it should be using,
When user selects a class file from some other Folder/Package, then that Package is imported here.

For Ex: BankAccount is present in same Package as well as P1,P2. Now if user select the one from P2, then that
class is imported here
Syntax: import Aug2024.ex_04082024.P2.BankAccount;
 */
        BankAccount b1 = new BankAccount();

    }
}
