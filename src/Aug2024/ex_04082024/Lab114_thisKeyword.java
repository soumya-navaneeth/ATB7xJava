package Aug2024.ex_04082024;

public class Lab114_thisKeyword {
    public static void main(String[] args) {
/* 'this' is a reference variable that refers to the current object.
this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.
 */
        thisStudent s1=new thisStudent(111,"ankit",5000f);
        thisStudent s2=new thisStudent(112,"sumit",6500f);
        thisStudent s3=new thisStudent("Soumya",8500f);
        s1.display();
        s2.display();
        s3.display();



    }
}
