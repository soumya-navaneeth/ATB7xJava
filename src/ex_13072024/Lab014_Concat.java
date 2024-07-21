package ex_13072024;

public class Lab014_Concat {
    public static void main(String[] args) {
        int a = 10;
        int b= 34;
        int c= a+b;
//        System.out.println("a=10+b=34,Sum is:");
//        System.out.println(a+b);
        System.out.println("a=10+b=34,Sum is:" + c);

        String s1 = "Soumya";
        String s2 = "Navaneeth";
        System.out.println("s1=soumya+s2=Navaneeth,s1+s2 is: " +s1+s2); //'+' Concatenates 2 strings/chars
        System.out.println("\n");
        String s3 = "Dhanvi";
        int x = 50;
        int y = 100;
       System.out.println("x=50,y=100,s3=Dhanvi\n");
       System.out.print("x+y+s3: ");
       System.out.println(x+y+s3); // adds x+y
 //       System.out.println("x+y+s3: " + x+y+s3); // considers x+y as string
        System.out.print("s3+x+y: ");
        System.out.println(s3+x+y);
        System.out.print("x+s3+y: ");
        System.out.println(x+s3+y);
        System.out.print("x+y+s3+y+s3+x+y: ");
        System.out.println(x+y+s3+y+s3+x+y);
    }
}
