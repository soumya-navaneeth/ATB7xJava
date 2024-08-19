package Aug2024.ex_04082024;

public class thisStudent {
    int rollno;
    String name;
    float fee;
    thisStudent(int rollno,String name,float fee){
        rollno=rollno;
        name=name;
        fee=fee;
    }

    thisStudent(String name,float fee){
        this.rollno=rollno; //this.rollno implies the instance variable within this Class
        this.name=name;
        this.fee=fee;
    }



    void display(){System.out.println(rollno+" "+name+" "+fee);}
}
