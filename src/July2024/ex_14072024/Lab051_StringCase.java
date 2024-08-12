package July2024.ex_14072024;

public class Lab051_StringCase {
    public static void main(String[] args) {
        String password  = "JavaLang@123";
        String pass_u = password.toLowerCase();
        System.out.println("Password is: " +password);
        System.out.println("Password in lower is: " +pass_u);
        // pass_u == password
        System.out.println(pass_u == password); //False both reference is different
        System.out.println(pass_u.equals(password)); //False both content is different
        System.out.println(pass_u.equalsIgnoreCase(password)); //True both content is same when case ignored
        //JavaLang@123 =  javalang@123  = JAVALANG@123 = JAvalaNG@123
    }
}